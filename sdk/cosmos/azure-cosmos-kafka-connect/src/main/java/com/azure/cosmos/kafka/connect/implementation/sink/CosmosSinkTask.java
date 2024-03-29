// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.kafka.connect.implementation.sink;

import com.azure.cosmos.CosmosAsyncClient;
import com.azure.cosmos.CosmosAsyncContainer;
import com.azure.cosmos.implementation.apachecommons.lang.StringUtils;
import com.azure.cosmos.kafka.connect.implementation.CosmosClientStore;
import com.azure.cosmos.kafka.connect.implementation.KafkaCosmosConstants;
import org.apache.kafka.connect.sink.SinkRecord;
import org.apache.kafka.connect.sink.SinkTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CosmosSinkTask extends SinkTask {
    private static final Logger LOGGER = LoggerFactory.getLogger(CosmosSinkTask.class);
    private CosmosSinkTaskConfig sinkTaskConfig;
    private CosmosAsyncClient cosmosClient;
    private SinkRecordTransformer sinkRecordTransformer;
    private IWriter cosmosWriter;

    @Override
    public String version() {
        return KafkaCosmosConstants.CURRENT_VERSION;
    }

    @Override
    public void start(Map<String, String> props) {
        LOGGER.info("Starting the kafka cosmos sink task");
        this.sinkTaskConfig = new CosmosSinkTaskConfig(props);
        this.cosmosClient = CosmosClientStore.getCosmosClient(this.sinkTaskConfig.getAccountConfig());
        this.sinkRecordTransformer = new SinkRecordTransformer(this.sinkTaskConfig);

        if (this.sinkTaskConfig.getWriteConfig().isBulkEnabled()) {
            this.cosmosWriter =
                new KafkaCosmosBulkWriter(this.sinkTaskConfig.getWriteConfig(), this.context.errantRecordReporter());
        } else {
            this.cosmosWriter =
                new KafkaCosmosPointWriter(this.sinkTaskConfig.getWriteConfig(), context.errantRecordReporter());
        }

        // TODO[public preview]: in V1, it will create the database if does not exists, but why?
    }

    @Override
    public void put(Collection<SinkRecord> records) {
        if (records == null || records.isEmpty()) {
            LOGGER.debug("No records to be written");
            return;
        }

        LOGGER.debug("Sending {} records to be written", records.size());

        // group by container
        Map<String, List<SinkRecord>> recordsByContainer =
            records.stream().collect(
                    Collectors.groupingBy(
                            record -> this.sinkTaskConfig
                                        .getContainersConfig()
                                        .getTopicToContainerMap()
                                        .getOrDefault(record.topic(), StringUtils.EMPTY)));

        if (recordsByContainer.containsKey(StringUtils.EMPTY)) {
            throw new IllegalStateException("There is no container defined for topics " + recordsByContainer.get(StringUtils.EMPTY));
        }

        for (Map.Entry<String, List<SinkRecord>> entry : recordsByContainer.entrySet()) {
            String containerName = entry.getKey();
            CosmosAsyncContainer container =
                this.cosmosClient
                    .getDatabase(this.sinkTaskConfig.getContainersConfig().getDatabaseName())
                    .getContainer(containerName);

            // transform sink records, for example populating id
            List<SinkRecord> transformedRecords = sinkRecordTransformer.transform(containerName, entry.getValue());
            this.cosmosWriter.write(container, transformedRecords);
        }
    }

    @Override
    public void stop() {
        LOGGER.info("Stopping Kafka CosmosDB sink task");
        if (this.cosmosClient != null) {
            this.cosmosClient.close();
        }
    }
}
