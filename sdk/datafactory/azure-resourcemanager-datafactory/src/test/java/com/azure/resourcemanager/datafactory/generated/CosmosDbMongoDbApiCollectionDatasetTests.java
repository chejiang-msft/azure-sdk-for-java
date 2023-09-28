// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CosmosDbMongoDbApiCollectionDataset;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CosmosDbMongoDbApiCollectionDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CosmosDbMongoDbApiCollectionDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"CosmosDbMongoDbApiCollection\",\"typeProperties\":{\"collection\":\"datadwhslxebaj\"},\"description\":\"knmstbdoprwkamp\",\"structure\":\"datawpbldz\",\"schema\":\"dataudrcycm\",\"linkedServiceName\":{\"referenceName\":\"huzymhlhihqk\",\"parameters\":{\"aiildcpud\":\"datakmnbzko\",\"drobujnjgy\":\"datahquxsyjofpgv\",\"njgcp\":\"datauxmqxigidul\",\"ghxhkyqzjsdkpvn\":\"datakgrhnytslgsazuqz\"}},\"parameters\":{\"hflyuvbgtz\":{\"type\":\"Array\",\"defaultValue\":\"dataffxsfybntmveh\"}},\"annotations\":[\"dataweuydyb\",\"dataairvhpqsv\"],\"folder\":{\"name\":\"ogeatrcnqnvn\"},\"\":{\"iznzs\":\"datafcsjvjnk\"}}")
                .toObject(CosmosDbMongoDbApiCollectionDataset.class);
        Assertions.assertEquals("knmstbdoprwkamp", model.description());
        Assertions.assertEquals("huzymhlhihqk", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("hflyuvbgtz").type());
        Assertions.assertEquals("ogeatrcnqnvn", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CosmosDbMongoDbApiCollectionDataset model =
            new CosmosDbMongoDbApiCollectionDataset()
                .withDescription("knmstbdoprwkamp")
                .withStructure("datawpbldz")
                .withSchema("dataudrcycm")
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("huzymhlhihqk")
                        .withParameters(
                            mapOf(
                                "aiildcpud",
                                "datakmnbzko",
                                "drobujnjgy",
                                "datahquxsyjofpgv",
                                "njgcp",
                                "datauxmqxigidul",
                                "ghxhkyqzjsdkpvn",
                                "datakgrhnytslgsazuqz")))
                .withParameters(
                    mapOf(
                        "hflyuvbgtz",
                        new ParameterSpecification()
                            .withType(ParameterType.ARRAY)
                            .withDefaultValue("dataffxsfybntmveh")))
                .withAnnotations(Arrays.asList("dataweuydyb", "dataairvhpqsv"))
                .withFolder(new DatasetFolder().withName("ogeatrcnqnvn"))
                .withCollection("datadwhslxebaj");
        model = BinaryData.fromObject(model).toObject(CosmosDbMongoDbApiCollectionDataset.class);
        Assertions.assertEquals("knmstbdoprwkamp", model.description());
        Assertions.assertEquals("huzymhlhihqk", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("hflyuvbgtz").type());
        Assertions.assertEquals("ogeatrcnqnvn", model.folder().name());
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
