// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Objects;

/** Use custom models to classify text into single label taxonomy. */
@Fluent
public final class CustomSingleLabelClassificationLROTask extends AnalyzeTextLROTask {
    /*
     * Supported parameters for a Custom Single Classification task.
     */
    private CustomSingleLabelClassificationTaskParameters parameters;

    /** Creates an instance of CustomSingleLabelClassificationLROTask class. */
    public CustomSingleLabelClassificationLROTask() {}

    /**
     * Get the parameters property: Supported parameters for a Custom Single Classification task.
     *
     * @return the parameters value.
     */
    public CustomSingleLabelClassificationTaskParameters getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Supported parameters for a Custom Single Classification task.
     *
     * @param parameters the parameters value to set.
     * @return the CustomSingleLabelClassificationLROTask object itself.
     */
    public CustomSingleLabelClassificationLROTask setParameters(
            CustomSingleLabelClassificationTaskParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomSingleLabelClassificationLROTask setTaskName(String taskName) {
        super.setTaskName(taskName);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField(
                "kind", Objects.toString(AnalyzeTextLROTaskKind.CUSTOM_SINGLE_LABEL_CLASSIFICATION, null));
        jsonWriter.writeStringField("taskName", getTaskName());
        jsonWriter.writeJsonField("parameters", this.parameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CustomSingleLabelClassificationLROTask from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CustomSingleLabelClassificationLROTask if the JsonReader was pointing to an instance of
     *     it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing the polymorphic discriminator.
     * @throws IOException If an error occurs while reading the CustomSingleLabelClassificationLROTask.
     */
    public static CustomSingleLabelClassificationLROTask fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    CustomSingleLabelClassificationLROTask deserializedCustomSingleLabelClassificationLROTask =
                            new CustomSingleLabelClassificationLROTask();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("kind".equals(fieldName)) {
                            String kind = reader.getString();
                            if (!"CustomSingleLabelClassification".equals(kind)) {
                                throw new IllegalStateException(
                                        "'kind' was expected to be non-null and equal to 'CustomSingleLabelClassification'. The found 'kind' was '"
                                                + kind
                                                + "'.");
                            }
                        } else if ("taskName".equals(fieldName)) {
                            deserializedCustomSingleLabelClassificationLROTask.setTaskName(reader.getString());
                        } else if ("parameters".equals(fieldName)) {
                            deserializedCustomSingleLabelClassificationLROTask.parameters =
                                    CustomSingleLabelClassificationTaskParameters.fromJson(reader);
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedCustomSingleLabelClassificationLROTask;
                });
    }
}
