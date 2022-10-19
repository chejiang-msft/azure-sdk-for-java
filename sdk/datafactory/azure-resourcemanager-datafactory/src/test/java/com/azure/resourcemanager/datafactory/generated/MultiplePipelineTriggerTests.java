// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.MultiplePipelineTrigger;
import com.azure.resourcemanager.datafactory.models.PipelineReference;
import com.azure.resourcemanager.datafactory.models.TriggerPipelineReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MultiplePipelineTriggerTests {
    @Test
    public void testDeserialize() {
        MultiplePipelineTrigger model =
            BinaryData
                .fromString(
                    "{\"type\":\"MultiplePipelineTrigger\",\"pipelines\":[{\"pipelineReference\":{\"referenceName\":\"svepfbh\",\"name\":\"ebe\"},\"parameters\":{}},{\"pipelineReference\":{\"referenceName\":\"jeknfqnw\",\"name\":\"qxowkdn\"},\"parameters\":{}}],\"description\":\"krhwieh\",\"runtimeState\":\"Started\",\"annotations\":[],\"\":{}}")
                .toObject(MultiplePipelineTrigger.class);
        Assertions.assertEquals("krhwieh", model.description());
        Assertions.assertEquals("svepfbh", model.pipelines().get(0).pipelineReference().referenceName());
        Assertions.assertEquals("ebe", model.pipelines().get(0).pipelineReference().name());
    }

    @Test
    public void testSerialize() {
        MultiplePipelineTrigger model =
            new MultiplePipelineTrigger()
                .withDescription("krhwieh")
                .withAnnotations(Arrays.asList())
                .withPipelines(
                    Arrays
                        .asList(
                            new TriggerPipelineReference()
                                .withPipelineReference(
                                    new PipelineReference().withReferenceName("svepfbh").withName("ebe"))
                                .withParameters(mapOf()),
                            new TriggerPipelineReference()
                                .withPipelineReference(
                                    new PipelineReference().withReferenceName("jeknfqnw").withName("qxowkdn"))
                                .withParameters(mapOf())));
        model = BinaryData.fromObject(model).toObject(MultiplePipelineTrigger.class);
        Assertions.assertEquals("krhwieh", model.description());
        Assertions.assertEquals("svepfbh", model.pipelines().get(0).pipelineReference().referenceName());
        Assertions.assertEquals("ebe", model.pipelines().get(0).pipelineReference().name());
    }

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