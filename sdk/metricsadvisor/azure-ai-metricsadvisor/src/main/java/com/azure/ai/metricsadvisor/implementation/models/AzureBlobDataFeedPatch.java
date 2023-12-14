// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * The AzureBlobDataFeedPatch model.
 */
@Fluent
public final class AzureBlobDataFeedPatch extends DataFeedDetailPatch {
    /*
     * The dataSourceParameter property.
     */
    private AzureBlobParameterPatch dataSourceParameter;

    /**
     * Creates an instance of AzureBlobDataFeedPatch class.
     */
    public AzureBlobDataFeedPatch() {
    }

    /**
     * Get the dataSourceParameter property: The dataSourceParameter property.
     * 
     * @return the dataSourceParameter value.
     */
    public AzureBlobParameterPatch getDataSourceParameter() {
        return this.dataSourceParameter;
    }

    /**
     * Set the dataSourceParameter property: The dataSourceParameter property.
     * 
     * @param dataSourceParameter the dataSourceParameter value to set.
     * @return the AzureBlobDataFeedPatch object itself.
     */
    public AzureBlobDataFeedPatch setDataSourceParameter(AzureBlobParameterPatch dataSourceParameter) {
        this.dataSourceParameter = dataSourceParameter;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataFeedPatch setDataFeedName(String dataFeedName) {
        super.setDataFeedName(dataFeedName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataFeedPatch setDataFeedDescription(String dataFeedDescription) {
        super.setDataFeedDescription(dataFeedDescription);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataFeedPatch setTimestampColumn(String timestampColumn) {
        super.setTimestampColumn(timestampColumn);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataFeedPatch setDataStartFrom(OffsetDateTime dataStartFrom) {
        super.setDataStartFrom(dataStartFrom);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataFeedPatch setStartOffsetInSeconds(Long startOffsetInSeconds) {
        super.setStartOffsetInSeconds(startOffsetInSeconds);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataFeedPatch setMaxConcurrency(Integer maxConcurrency) {
        super.setMaxConcurrency(maxConcurrency);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataFeedPatch setMinRetryIntervalInSeconds(Long minRetryIntervalInSeconds) {
        super.setMinRetryIntervalInSeconds(minRetryIntervalInSeconds);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataFeedPatch setStopRetryAfterInSeconds(Long stopRetryAfterInSeconds) {
        super.setStopRetryAfterInSeconds(stopRetryAfterInSeconds);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataFeedPatch setNeedRollup(NeedRollupEnum needRollup) {
        super.setNeedRollup(needRollup);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataFeedPatch setRollUpMethod(RollUpMethod rollUpMethod) {
        super.setRollUpMethod(rollUpMethod);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataFeedPatch setRollUpColumns(List<String> rollUpColumns) {
        super.setRollUpColumns(rollUpColumns);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataFeedPatch setAllUpIdentification(String allUpIdentification) {
        super.setAllUpIdentification(allUpIdentification);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataFeedPatch setFillMissingPointType(FillMissingPointType fillMissingPointType) {
        super.setFillMissingPointType(fillMissingPointType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataFeedPatch setFillMissingPointValue(Double fillMissingPointValue) {
        super.setFillMissingPointValue(fillMissingPointValue);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataFeedPatch setViewMode(ViewMode viewMode) {
        super.setViewMode(viewMode);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataFeedPatch setAdmins(List<String> admins) {
        super.setAdmins(admins);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataFeedPatch setViewers(List<String> viewers) {
        super.setViewers(viewers);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataFeedPatch setStatus(EntityStatus status) {
        super.setStatus(status);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataFeedPatch setActionLinkTemplate(String actionLinkTemplate) {
        super.setActionLinkTemplate(actionLinkTemplate);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataFeedPatch setAuthenticationType(AuthenticationTypeEnum authenticationType) {
        super.setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataFeedPatch setCredentialId(String credentialId) {
        super.setCredentialId(credentialId);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("dataSourceType", Objects.toString(DataSourceType.AZURE_BLOB, null));
        jsonWriter.writeStringField("dataFeedName", getDataFeedName());
        jsonWriter.writeStringField("dataFeedDescription", getDataFeedDescription());
        jsonWriter.writeStringField("timestampColumn", getTimestampColumn());
        jsonWriter.writeStringField("dataStartFrom", Objects.toString(getDataStartFrom(), null));
        jsonWriter.writeNumberField("startOffsetInSeconds", getStartOffsetInSeconds());
        jsonWriter.writeNumberField("maxConcurrency", getMaxConcurrency());
        jsonWriter.writeNumberField("minRetryIntervalInSeconds", getMinRetryIntervalInSeconds());
        jsonWriter.writeNumberField("stopRetryAfterInSeconds", getStopRetryAfterInSeconds());
        jsonWriter.writeStringField("needRollup", Objects.toString(getNeedRollup(), null));
        jsonWriter.writeStringField("rollUpMethod", Objects.toString(getRollUpMethod(), null));
        jsonWriter.writeArrayField("rollUpColumns", getRollUpColumns(),
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("allUpIdentification", getAllUpIdentification());
        jsonWriter.writeStringField("fillMissingPointType", Objects.toString(getFillMissingPointType(), null));
        jsonWriter.writeNumberField("fillMissingPointValue", getFillMissingPointValue());
        jsonWriter.writeStringField("viewMode", Objects.toString(getViewMode(), null));
        jsonWriter.writeArrayField("admins", getAdmins(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("viewers", getViewers(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("status", Objects.toString(getStatus(), null));
        jsonWriter.writeStringField("actionLinkTemplate", getActionLinkTemplate());
        jsonWriter.writeStringField("authenticationType", Objects.toString(getAuthenticationType(), null));
        jsonWriter.writeStringField("credentialId", getCredentialId());
        jsonWriter.writeJsonField("dataSourceParameter", this.dataSourceParameter);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureBlobDataFeedPatch from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureBlobDataFeedPatch if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing the polymorphic discriminator.
     * @throws IOException If an error occurs while reading the AzureBlobDataFeedPatch.
     */
    public static AzureBlobDataFeedPatch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureBlobDataFeedPatch deserializedAzureBlobDataFeedPatch = new AzureBlobDataFeedPatch();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dataSourceType".equals(fieldName)) {
                    String dataSourceType = reader.getString();
                    if (!"AzureBlob".equals(dataSourceType)) {
                        throw new IllegalStateException(
                            "'dataSourceType' was expected to be non-null and equal to 'AzureBlob'. The found 'dataSourceType' was '"
                                + dataSourceType + "'.");
                    }
                } else if ("dataFeedName".equals(fieldName)) {
                    deserializedAzureBlobDataFeedPatch.setDataFeedName(reader.getString());
                } else if ("dataFeedDescription".equals(fieldName)) {
                    deserializedAzureBlobDataFeedPatch.setDataFeedDescription(reader.getString());
                } else if ("timestampColumn".equals(fieldName)) {
                    deserializedAzureBlobDataFeedPatch.setTimestampColumn(reader.getString());
                } else if ("dataStartFrom".equals(fieldName)) {
                    deserializedAzureBlobDataFeedPatch.setDataStartFrom(
                        reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString())));
                } else if ("startOffsetInSeconds".equals(fieldName)) {
                    deserializedAzureBlobDataFeedPatch.setStartOffsetInSeconds(reader.getNullable(JsonReader::getLong));
                } else if ("maxConcurrency".equals(fieldName)) {
                    deserializedAzureBlobDataFeedPatch.setMaxConcurrency(reader.getNullable(JsonReader::getInt));
                } else if ("minRetryIntervalInSeconds".equals(fieldName)) {
                    deserializedAzureBlobDataFeedPatch
                        .setMinRetryIntervalInSeconds(reader.getNullable(JsonReader::getLong));
                } else if ("stopRetryAfterInSeconds".equals(fieldName)) {
                    deserializedAzureBlobDataFeedPatch
                        .setStopRetryAfterInSeconds(reader.getNullable(JsonReader::getLong));
                } else if ("needRollup".equals(fieldName)) {
                    deserializedAzureBlobDataFeedPatch.setNeedRollup(NeedRollupEnum.fromString(reader.getString()));
                } else if ("rollUpMethod".equals(fieldName)) {
                    deserializedAzureBlobDataFeedPatch.setRollUpMethod(RollUpMethod.fromString(reader.getString()));
                } else if ("rollUpColumns".equals(fieldName)) {
                    List<String> rollUpColumns = reader.readArray(reader1 -> reader1.getString());
                    deserializedAzureBlobDataFeedPatch.setRollUpColumns(rollUpColumns);
                } else if ("allUpIdentification".equals(fieldName)) {
                    deserializedAzureBlobDataFeedPatch.setAllUpIdentification(reader.getString());
                } else if ("fillMissingPointType".equals(fieldName)) {
                    deserializedAzureBlobDataFeedPatch
                        .setFillMissingPointType(FillMissingPointType.fromString(reader.getString()));
                } else if ("fillMissingPointValue".equals(fieldName)) {
                    deserializedAzureBlobDataFeedPatch
                        .setFillMissingPointValue(reader.getNullable(JsonReader::getDouble));
                } else if ("viewMode".equals(fieldName)) {
                    deserializedAzureBlobDataFeedPatch.setViewMode(ViewMode.fromString(reader.getString()));
                } else if ("admins".equals(fieldName)) {
                    List<String> admins = reader.readArray(reader1 -> reader1.getString());
                    deserializedAzureBlobDataFeedPatch.setAdmins(admins);
                } else if ("viewers".equals(fieldName)) {
                    List<String> viewers = reader.readArray(reader1 -> reader1.getString());
                    deserializedAzureBlobDataFeedPatch.setViewers(viewers);
                } else if ("status".equals(fieldName)) {
                    deserializedAzureBlobDataFeedPatch.setStatus(EntityStatus.fromString(reader.getString()));
                } else if ("actionLinkTemplate".equals(fieldName)) {
                    deserializedAzureBlobDataFeedPatch.setActionLinkTemplate(reader.getString());
                } else if ("authenticationType".equals(fieldName)) {
                    deserializedAzureBlobDataFeedPatch
                        .setAuthenticationType(AuthenticationTypeEnum.fromString(reader.getString()));
                } else if ("credentialId".equals(fieldName)) {
                    deserializedAzureBlobDataFeedPatch.setCredentialId(reader.getString());
                } else if ("dataSourceParameter".equals(fieldName)) {
                    deserializedAzureBlobDataFeedPatch.dataSourceParameter = AzureBlobParameterPatch.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureBlobDataFeedPatch;
        });
    }
}
