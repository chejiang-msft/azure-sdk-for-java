// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managedapplications.models.GenericResource;
import com.azure.resourcemanager.managedapplications.models.Sku;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class GenericResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GenericResource model =
            BinaryData
                .fromString(
                    "{\"managedBy\":\"kwy\",\"sku\":{\"name\":\"gfgibm\",\"tier\":\"gakeqsr\",\"size\":\"bzqqedqytbciq\",\"family\":\"uflmm\",\"model\":\"zsm\",\"capacity\":269319267},\"location\":\"lougpbkw\",\"tags\":{\"umkdosvqwhbmd\":\"tduqktapspwgcuer\",\"bhtqqrolfpfpsa\":\"bbjfddgmbmbexp\",\"jgzjaoyfhrtx\":\"gbquxigj\",\"fqawrlyxw\":\"lnerkujysvleju\"},\"id\":\"kcprbnw\",\"name\":\"xgjvtbv\",\"type\":\"ysszdnrujqguh\"}")
                .toObject(GenericResource.class);
        Assertions.assertEquals("lougpbkw", model.location());
        Assertions.assertEquals("tduqktapspwgcuer", model.tags().get("umkdosvqwhbmd"));
        Assertions.assertEquals("kwy", model.managedBy());
        Assertions.assertEquals("gfgibm", model.sku().name());
        Assertions.assertEquals("gakeqsr", model.sku().tier());
        Assertions.assertEquals("bzqqedqytbciq", model.sku().size());
        Assertions.assertEquals("uflmm", model.sku().family());
        Assertions.assertEquals("zsm", model.sku().model());
        Assertions.assertEquals(269319267, model.sku().capacity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GenericResource model =
            new GenericResource()
                .withLocation("lougpbkw")
                .withTags(
                    mapOf(
                        "umkdosvqwhbmd",
                        "tduqktapspwgcuer",
                        "bhtqqrolfpfpsa",
                        "bbjfddgmbmbexp",
                        "jgzjaoyfhrtx",
                        "gbquxigj",
                        "fqawrlyxw",
                        "lnerkujysvleju"))
                .withManagedBy("kwy")
                .withSku(
                    new Sku()
                        .withName("gfgibm")
                        .withTier("gakeqsr")
                        .withSize("bzqqedqytbciq")
                        .withFamily("uflmm")
                        .withModel("zsm")
                        .withCapacity(269319267));
        model = BinaryData.fromObject(model).toObject(GenericResource.class);
        Assertions.assertEquals("lougpbkw", model.location());
        Assertions.assertEquals("tduqktapspwgcuer", model.tags().get("umkdosvqwhbmd"));
        Assertions.assertEquals("kwy", model.managedBy());
        Assertions.assertEquals("gfgibm", model.sku().name());
        Assertions.assertEquals("gakeqsr", model.sku().tier());
        Assertions.assertEquals("bzqqedqytbciq", model.sku().size());
        Assertions.assertEquals("uflmm", model.sku().family());
        Assertions.assertEquals("zsm", model.sku().model());
        Assertions.assertEquals(269319267, model.sku().capacity());
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
