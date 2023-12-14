// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * The DataFeedDetailPatch model.
 */
@Fluent
public class DataFeedDetailPatch implements JsonSerializable<DataFeedDetailPatch> {
    /*
     * data feed name
     */
    private String dataFeedName;

    /*
     * data feed description
     */
    private String dataFeedDescription;

    /*
     * user-defined timestamp column. if timestampColumn is null, start time of every time slice will be used as
     * default value.
     */
    private String timestampColumn;

    /*
     * ingestion start time
     */
    private OffsetDateTime dataStartFrom;

    /*
     * the time that the beginning of data ingestion task will delay for every data slice according to this offset.
     */
    private Long startOffsetInSeconds;

    /*
     * the max concurrency of data ingestion queries against user data source. 0 means no limitation.
     */
    private Integer maxConcurrency;

    /*
     * the min retry interval for failed data ingestion tasks.
     */
    private Long minRetryIntervalInSeconds;

    /*
     * stop retry data ingestion after the data slice first schedule time in seconds.
     */
    private Long stopRetryAfterInSeconds;

    /*
     * mark if the data feed need rollup
     */
    private NeedRollupEnum needRollup;

    /*
     * roll up method
     */
    private RollUpMethod rollUpMethod;

    /*
     * roll up columns
     */
    private List<String> rollUpColumns;

    /*
     * the identification value for the row of calculated all-up value.
     */
    private String allUpIdentification;

    /*
     * the type of fill missing point for anomaly detection
     */
    private FillMissingPointType fillMissingPointType;

    /*
     * the value of fill missing point for anomaly detection
     */
    private Double fillMissingPointValue;

    /*
     * data feed access mode, default is Private
     */
    private ViewMode viewMode;

    /*
     * data feed administrator
     */
    private List<String> admins;

    /*
     * data feed viewer
     */
    private List<String> viewers;

    /*
     * data feed status
     */
    private EntityStatus status;

    /*
     * action link for alert
     */
    private String actionLinkTemplate;

    /*
     * authentication type for corresponding data source
     */
    private AuthenticationTypeEnum authenticationType;

    /*
     * The credential entity id
     */
    private String credentialId;

    /**
     * Creates an instance of DataFeedDetailPatch class.
     */
    public DataFeedDetailPatch() {
    }

    /**
     * Get the dataFeedName property: data feed name.
     * 
     * @return the dataFeedName value.
     */
    public String getDataFeedName() {
        return this.dataFeedName;
    }

    /**
     * Set the dataFeedName property: data feed name.
     * 
     * @param dataFeedName the dataFeedName value to set.
     * @return the DataFeedDetailPatch object itself.
     */
    public DataFeedDetailPatch setDataFeedName(String dataFeedName) {
        this.dataFeedName = dataFeedName;
        return this;
    }

    /**
     * Get the dataFeedDescription property: data feed description.
     * 
     * @return the dataFeedDescription value.
     */
    public String getDataFeedDescription() {
        return this.dataFeedDescription;
    }

    /**
     * Set the dataFeedDescription property: data feed description.
     * 
     * @param dataFeedDescription the dataFeedDescription value to set.
     * @return the DataFeedDetailPatch object itself.
     */
    public DataFeedDetailPatch setDataFeedDescription(String dataFeedDescription) {
        this.dataFeedDescription = dataFeedDescription;
        return this;
    }

    /**
     * Get the timestampColumn property: user-defined timestamp column. if timestampColumn is null, start time of every
     * time slice will be used as default value.
     * 
     * @return the timestampColumn value.
     */
    public String getTimestampColumn() {
        return this.timestampColumn;
    }

    /**
     * Set the timestampColumn property: user-defined timestamp column. if timestampColumn is null, start time of every
     * time slice will be used as default value.
     * 
     * @param timestampColumn the timestampColumn value to set.
     * @return the DataFeedDetailPatch object itself.
     */
    public DataFeedDetailPatch setTimestampColumn(String timestampColumn) {
        this.timestampColumn = timestampColumn;
        return this;
    }

    /**
     * Get the dataStartFrom property: ingestion start time.
     * 
     * @return the dataStartFrom value.
     */
    public OffsetDateTime getDataStartFrom() {
        return this.dataStartFrom;
    }

    /**
     * Set the dataStartFrom property: ingestion start time.
     * 
     * @param dataStartFrom the dataStartFrom value to set.
     * @return the DataFeedDetailPatch object itself.
     */
    public DataFeedDetailPatch setDataStartFrom(OffsetDateTime dataStartFrom) {
        this.dataStartFrom = dataStartFrom;
        return this;
    }

    /**
     * Get the startOffsetInSeconds property: the time that the beginning of data ingestion task will delay for every
     * data slice according to this offset.
     * 
     * @return the startOffsetInSeconds value.
     */
    public Long getStartOffsetInSeconds() {
        return this.startOffsetInSeconds;
    }

    /**
     * Set the startOffsetInSeconds property: the time that the beginning of data ingestion task will delay for every
     * data slice according to this offset.
     * 
     * @param startOffsetInSeconds the startOffsetInSeconds value to set.
     * @return the DataFeedDetailPatch object itself.
     */
    public DataFeedDetailPatch setStartOffsetInSeconds(Long startOffsetInSeconds) {
        this.startOffsetInSeconds = startOffsetInSeconds;
        return this;
    }

    /**
     * Get the maxConcurrency property: the max concurrency of data ingestion queries against user data source. 0 means
     * no limitation.
     * 
     * @return the maxConcurrency value.
     */
    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * Set the maxConcurrency property: the max concurrency of data ingestion queries against user data source. 0 means
     * no limitation.
     * 
     * @param maxConcurrency the maxConcurrency value to set.
     * @return the DataFeedDetailPatch object itself.
     */
    public DataFeedDetailPatch setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * Get the minRetryIntervalInSeconds property: the min retry interval for failed data ingestion tasks.
     * 
     * @return the minRetryIntervalInSeconds value.
     */
    public Long getMinRetryIntervalInSeconds() {
        return this.minRetryIntervalInSeconds;
    }

    /**
     * Set the minRetryIntervalInSeconds property: the min retry interval for failed data ingestion tasks.
     * 
     * @param minRetryIntervalInSeconds the minRetryIntervalInSeconds value to set.
     * @return the DataFeedDetailPatch object itself.
     */
    public DataFeedDetailPatch setMinRetryIntervalInSeconds(Long minRetryIntervalInSeconds) {
        this.minRetryIntervalInSeconds = minRetryIntervalInSeconds;
        return this;
    }

    /**
     * Get the stopRetryAfterInSeconds property: stop retry data ingestion after the data slice first schedule time in
     * seconds.
     * 
     * @return the stopRetryAfterInSeconds value.
     */
    public Long getStopRetryAfterInSeconds() {
        return this.stopRetryAfterInSeconds;
    }

    /**
     * Set the stopRetryAfterInSeconds property: stop retry data ingestion after the data slice first schedule time in
     * seconds.
     * 
     * @param stopRetryAfterInSeconds the stopRetryAfterInSeconds value to set.
     * @return the DataFeedDetailPatch object itself.
     */
    public DataFeedDetailPatch setStopRetryAfterInSeconds(Long stopRetryAfterInSeconds) {
        this.stopRetryAfterInSeconds = stopRetryAfterInSeconds;
        return this;
    }

    /**
     * Get the needRollup property: mark if the data feed need rollup.
     * 
     * @return the needRollup value.
     */
    public NeedRollupEnum getNeedRollup() {
        return this.needRollup;
    }

    /**
     * Set the needRollup property: mark if the data feed need rollup.
     * 
     * @param needRollup the needRollup value to set.
     * @return the DataFeedDetailPatch object itself.
     */
    public DataFeedDetailPatch setNeedRollup(NeedRollupEnum needRollup) {
        this.needRollup = needRollup;
        return this;
    }

    /**
     * Get the rollUpMethod property: roll up method.
     * 
     * @return the rollUpMethod value.
     */
    public RollUpMethod getRollUpMethod() {
        return this.rollUpMethod;
    }

    /**
     * Set the rollUpMethod property: roll up method.
     * 
     * @param rollUpMethod the rollUpMethod value to set.
     * @return the DataFeedDetailPatch object itself.
     */
    public DataFeedDetailPatch setRollUpMethod(RollUpMethod rollUpMethod) {
        this.rollUpMethod = rollUpMethod;
        return this;
    }

    /**
     * Get the rollUpColumns property: roll up columns.
     * 
     * @return the rollUpColumns value.
     */
    public List<String> getRollUpColumns() {
        return this.rollUpColumns;
    }

    /**
     * Set the rollUpColumns property: roll up columns.
     * 
     * @param rollUpColumns the rollUpColumns value to set.
     * @return the DataFeedDetailPatch object itself.
     */
    public DataFeedDetailPatch setRollUpColumns(List<String> rollUpColumns) {
        this.rollUpColumns = rollUpColumns;
        return this;
    }

    /**
     * Get the allUpIdentification property: the identification value for the row of calculated all-up value.
     * 
     * @return the allUpIdentification value.
     */
    public String getAllUpIdentification() {
        return this.allUpIdentification;
    }

    /**
     * Set the allUpIdentification property: the identification value for the row of calculated all-up value.
     * 
     * @param allUpIdentification the allUpIdentification value to set.
     * @return the DataFeedDetailPatch object itself.
     */
    public DataFeedDetailPatch setAllUpIdentification(String allUpIdentification) {
        this.allUpIdentification = allUpIdentification;
        return this;
    }

    /**
     * Get the fillMissingPointType property: the type of fill missing point for anomaly detection.
     * 
     * @return the fillMissingPointType value.
     */
    public FillMissingPointType getFillMissingPointType() {
        return this.fillMissingPointType;
    }

    /**
     * Set the fillMissingPointType property: the type of fill missing point for anomaly detection.
     * 
     * @param fillMissingPointType the fillMissingPointType value to set.
     * @return the DataFeedDetailPatch object itself.
     */
    public DataFeedDetailPatch setFillMissingPointType(FillMissingPointType fillMissingPointType) {
        this.fillMissingPointType = fillMissingPointType;
        return this;
    }

    /**
     * Get the fillMissingPointValue property: the value of fill missing point for anomaly detection.
     * 
     * @return the fillMissingPointValue value.
     */
    public Double getFillMissingPointValue() {
        return this.fillMissingPointValue;
    }

    /**
     * Set the fillMissingPointValue property: the value of fill missing point for anomaly detection.
     * 
     * @param fillMissingPointValue the fillMissingPointValue value to set.
     * @return the DataFeedDetailPatch object itself.
     */
    public DataFeedDetailPatch setFillMissingPointValue(Double fillMissingPointValue) {
        this.fillMissingPointValue = fillMissingPointValue;
        return this;
    }

    /**
     * Get the viewMode property: data feed access mode, default is Private.
     * 
     * @return the viewMode value.
     */
    public ViewMode getViewMode() {
        return this.viewMode;
    }

    /**
     * Set the viewMode property: data feed access mode, default is Private.
     * 
     * @param viewMode the viewMode value to set.
     * @return the DataFeedDetailPatch object itself.
     */
    public DataFeedDetailPatch setViewMode(ViewMode viewMode) {
        this.viewMode = viewMode;
        return this;
    }

    /**
     * Get the admins property: data feed administrator.
     * 
     * @return the admins value.
     */
    public List<String> getAdmins() {
        return this.admins;
    }

    /**
     * Set the admins property: data feed administrator.
     * 
     * @param admins the admins value to set.
     * @return the DataFeedDetailPatch object itself.
     */
    public DataFeedDetailPatch setAdmins(List<String> admins) {
        this.admins = admins;
        return this;
    }

    /**
     * Get the viewers property: data feed viewer.
     * 
     * @return the viewers value.
     */
    public List<String> getViewers() {
        return this.viewers;
    }

    /**
     * Set the viewers property: data feed viewer.
     * 
     * @param viewers the viewers value to set.
     * @return the DataFeedDetailPatch object itself.
     */
    public DataFeedDetailPatch setViewers(List<String> viewers) {
        this.viewers = viewers;
        return this;
    }

    /**
     * Get the status property: data feed status.
     * 
     * @return the status value.
     */
    public EntityStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: data feed status.
     * 
     * @param status the status value to set.
     * @return the DataFeedDetailPatch object itself.
     */
    public DataFeedDetailPatch setStatus(EntityStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the actionLinkTemplate property: action link for alert.
     * 
     * @return the actionLinkTemplate value.
     */
    public String getActionLinkTemplate() {
        return this.actionLinkTemplate;
    }

    /**
     * Set the actionLinkTemplate property: action link for alert.
     * 
     * @param actionLinkTemplate the actionLinkTemplate value to set.
     * @return the DataFeedDetailPatch object itself.
     */
    public DataFeedDetailPatch setActionLinkTemplate(String actionLinkTemplate) {
        this.actionLinkTemplate = actionLinkTemplate;
        return this;
    }

    /**
     * Get the authenticationType property: authentication type for corresponding data source.
     * 
     * @return the authenticationType value.
     */
    public AuthenticationTypeEnum getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: authentication type for corresponding data source.
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the DataFeedDetailPatch object itself.
     */
    public DataFeedDetailPatch setAuthenticationType(AuthenticationTypeEnum authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the credentialId property: The credential entity id.
     * 
     * @return the credentialId value.
     */
    public String getCredentialId() {
        return this.credentialId;
    }

    /**
     * Set the credentialId property: The credential entity id.
     * 
     * @param credentialId the credentialId value to set.
     * @return the DataFeedDetailPatch object itself.
     */
    public DataFeedDetailPatch setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("dataFeedName", this.dataFeedName);
        jsonWriter.writeStringField("dataFeedDescription", this.dataFeedDescription);
        jsonWriter.writeStringField("timestampColumn", this.timestampColumn);
        jsonWriter.writeStringField("dataStartFrom", Objects.toString(this.dataStartFrom, null));
        jsonWriter.writeNumberField("startOffsetInSeconds", this.startOffsetInSeconds);
        jsonWriter.writeNumberField("maxConcurrency", this.maxConcurrency);
        jsonWriter.writeNumberField("minRetryIntervalInSeconds", this.minRetryIntervalInSeconds);
        jsonWriter.writeNumberField("stopRetryAfterInSeconds", this.stopRetryAfterInSeconds);
        jsonWriter.writeStringField("needRollup", Objects.toString(this.needRollup, null));
        jsonWriter.writeStringField("rollUpMethod", Objects.toString(this.rollUpMethod, null));
        jsonWriter.writeArrayField("rollUpColumns", this.rollUpColumns,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("allUpIdentification", this.allUpIdentification);
        jsonWriter.writeStringField("fillMissingPointType", Objects.toString(this.fillMissingPointType, null));
        jsonWriter.writeNumberField("fillMissingPointValue", this.fillMissingPointValue);
        jsonWriter.writeStringField("viewMode", Objects.toString(this.viewMode, null));
        jsonWriter.writeArrayField("admins", this.admins, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("viewers", this.viewers, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("status", Objects.toString(this.status, null));
        jsonWriter.writeStringField("actionLinkTemplate", this.actionLinkTemplate);
        jsonWriter.writeStringField("authenticationType", Objects.toString(this.authenticationType, null));
        jsonWriter.writeStringField("credentialId", this.credentialId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataFeedDetailPatch from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataFeedDetailPatch if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing the polymorphic discriminator.
     * @throws IOException If an error occurs while reading the DataFeedDetailPatch.
     */
    public static DataFeedDetailPatch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            JsonReader readerToUse = reader.bufferObject();

            readerToUse.nextToken(); // Prepare for reading
            while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = readerToUse.getFieldName();
                readerToUse.nextToken();
                if ("dataSourceType".equals(fieldName)) {
                    discriminatorValue = readerToUse.getString();
                    break;
                } else {
                    readerToUse.skipChildren();
                }
            }

            if (discriminatorValue != null) {
                readerToUse = readerToUse.reset();
            }
            // Use the discriminator value to determine which subtype should be deserialized.
            if ("AzureApplicationInsights".equals(discriminatorValue)) {
                return AzureApplicationInsightsDataFeedPatch.fromJson(readerToUse);
            } else if ("AzureBlob".equals(discriminatorValue)) {
                return AzureBlobDataFeedPatch.fromJson(readerToUse);
            } else if ("AzureCosmosDB".equals(discriminatorValue)) {
                return AzureCosmosDBDataFeedPatch.fromJson(readerToUse);
            } else if ("AzureDataExplorer".equals(discriminatorValue)) {
                return AzureDataExplorerDataFeedPatch.fromJson(readerToUse);
            } else if ("AzureDataLakeStorageGen2".equals(discriminatorValue)) {
                return AzureDataLakeStorageGen2DataFeedPatch.fromJson(readerToUse);
            } else if ("AzureEventHubs".equals(discriminatorValue)) {
                return AzureEventHubsDataFeedPatch.fromJson(readerToUse);
            } else if ("AzureLogAnalytics".equals(discriminatorValue)) {
                return AzureLogAnalyticsDataFeedPatch.fromJson(readerToUse);
            } else if ("AzureTable".equals(discriminatorValue)) {
                return AzureTableDataFeedPatch.fromJson(readerToUse);
            } else if ("InfluxDB".equals(discriminatorValue)) {
                return InfluxDBDataFeedPatch.fromJson(readerToUse);
            } else if ("MySql".equals(discriminatorValue)) {
                return MySqlDataFeedPatch.fromJson(readerToUse);
            } else if ("PostgreSql".equals(discriminatorValue)) {
                return PostgreSqlDataFeedPatch.fromJson(readerToUse);
            } else if ("SqlServer".equals(discriminatorValue)) {
                return SQLServerDataFeedPatch.fromJson(readerToUse);
            } else if ("MongoDB".equals(discriminatorValue)) {
                return MongoDBDataFeedPatch.fromJson(readerToUse);
            } else {
                throw new IllegalStateException(
                    "Discriminator field 'dataSourceType' didn't match one of the expected values 'AzureApplicationInsights', 'AzureBlob', 'AzureCosmosDB', 'AzureDataExplorer', 'AzureDataLakeStorageGen2', 'AzureEventHubs', 'AzureLogAnalytics', 'AzureTable', 'InfluxDB', 'MySql', 'PostgreSql', 'SqlServer', or 'MongoDB'. It was: '"
                        + discriminatorValue + "'.");
            }
        });
    }
}
