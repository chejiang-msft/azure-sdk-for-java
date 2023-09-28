// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CompressionReadSettings;
import com.azure.resourcemanager.datafactory.models.JsonReadSettings;
import com.azure.resourcemanager.datafactory.models.JsonSource;
import com.azure.resourcemanager.datafactory.models.StoreReadSettings;
import java.util.HashMap;
import java.util.Map;

public final class JsonSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JsonSource model =
            BinaryData
                .fromString(
                    "{\"type\":\"JsonSource\",\"storeSettings\":{\"type\":\"StoreReadSettings\",\"maxConcurrentConnections\":\"datatclmbkpqj\",\"disableMetricsCollection\":\"datatymfnojjhtnn\",\"\":{\"xytrafettwytavp\":\"dataqgovvivl\",\"nhhvp\":\"datailgyqluolgspyqsa\"}},\"formatSettings\":{\"type\":\"JsonReadSettings\",\"compressionProperties\":{\"type\":\"CompressionReadSettings\",\"\":{\"oujtcp\":\"datarqviyfksegwezgf\",\"y\":\"datatdz\",\"jckakikkkajmnvb\":\"datagzba\",\"yco\":\"datagmnkrq\"}},\"\":{\"klqr\":\"datakxx\",\"daypx\":\"databcgsa\"}},\"additionalColumns\":\"dataedftkigmj\",\"sourceRetryCount\":\"datattvzyvzixmu\",\"sourceRetryWait\":\"dataidivbbrtzf\",\"maxConcurrentConnections\":\"dataqntnoegxoqpucli\",\"disableMetricsCollection\":\"datatwdaiexi\",\"\":{\"oukaffzzf\":\"dataygi\",\"orvigrxmptu\":\"dataivfiypfvwyzjsi\",\"bpqghxdp\":\"datade\"}}")
                .toObject(JsonSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JsonSource model =
            new JsonSource()
                .withSourceRetryCount("datattvzyvzixmu")
                .withSourceRetryWait("dataidivbbrtzf")
                .withMaxConcurrentConnections("dataqntnoegxoqpucli")
                .withDisableMetricsCollection("datatwdaiexi")
                .withStoreSettings(
                    new StoreReadSettings()
                        .withMaxConcurrentConnections("datatclmbkpqj")
                        .withDisableMetricsCollection("datatymfnojjhtnn")
                        .withAdditionalProperties(mapOf("type", "StoreReadSettings")))
                .withFormatSettings(
                    new JsonReadSettings()
                        .withCompressionProperties(
                            new CompressionReadSettings()
                                .withAdditionalProperties(mapOf("type", "CompressionReadSettings"))))
                .withAdditionalColumns("dataedftkigmj");
        model = BinaryData.fromObject(model).toObject(JsonSource.class);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
