// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.Trigger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TriggerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Trigger model =
            BinaryData
                .fromString(
                    "{\"type\":\"Trigger\",\"description\":\"rtalmet\",\"runtimeState\":\"Started\",\"annotations\":[\"dataslqxi\",\"datahrmooi\",\"dataqseypxiutcxa\",\"datazhyrpeto\"],\"\":{\"rqnkkzjcjbtr\":\"datajoxslhvnhla\",\"eitpkxztmo\":\"dataaehvvibrxjjstoq\"}}")
                .toObject(Trigger.class);
        Assertions.assertEquals("rtalmet", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Trigger model =
            new Trigger()
                .withDescription("rtalmet")
                .withAnnotations(Arrays.asList("dataslqxi", "datahrmooi", "dataqseypxiutcxa", "datazhyrpeto"))
                .withAdditionalProperties(mapOf("type", "Trigger", "runtimeState", "Started"));
        model = BinaryData.fromObject(model).toObject(Trigger.class);
        Assertions.assertEquals("rtalmet", model.description());
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
