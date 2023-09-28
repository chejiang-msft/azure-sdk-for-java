// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.GlobalParameterResourceInner;
import com.azure.resourcemanager.datafactory.models.GlobalParameterSpecification;
import com.azure.resourcemanager.datafactory.models.GlobalParameterType;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class GlobalParameterResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GlobalParameterResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"xcptsoqfyiaseqc\":{\"type\":\"Object\",\"value\":\"databxcea\"},\"mvanbwzo\":{\"type\":\"Array\",\"value\":\"datarttzrazisgykiu\"},\"mdptys\":{\"type\":\"String\",\"value\":\"datanrxxbsojklin\"}},\"name\":\"qsgnzxojpsl\",\"type\":\"jgpliuf\",\"etag\":\"woyxqvapcohhou\",\"id\":\"pqojxcx\"}")
                .toObject(GlobalParameterResourceInner.class);
        Assertions.assertEquals("pqojxcx", model.id());
        Assertions.assertEquals(GlobalParameterType.OBJECT, model.properties().get("xcptsoqfyiaseqc").type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GlobalParameterResourceInner model =
            new GlobalParameterResourceInner()
                .withId("pqojxcx")
                .withProperties(
                    mapOf(
                        "xcptsoqfyiaseqc",
                        new GlobalParameterSpecification().withType(GlobalParameterType.OBJECT).withValue("databxcea"),
                        "mvanbwzo",
                        new GlobalParameterSpecification()
                            .withType(GlobalParameterType.ARRAY)
                            .withValue("datarttzrazisgykiu"),
                        "mdptys",
                        new GlobalParameterSpecification()
                            .withType(GlobalParameterType.STRING)
                            .withValue("datanrxxbsojklin")));
        model = BinaryData.fromObject(model).toObject(GlobalParameterResourceInner.class);
        Assertions.assertEquals("pqojxcx", model.id());
        Assertions.assertEquals(GlobalParameterType.OBJECT, model.properties().get("xcptsoqfyiaseqc").type());
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
