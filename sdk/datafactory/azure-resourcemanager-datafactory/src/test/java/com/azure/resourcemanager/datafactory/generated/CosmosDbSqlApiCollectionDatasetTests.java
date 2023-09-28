// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CosmosDbSqlApiCollectionDataset;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CosmosDbSqlApiCollectionDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CosmosDbSqlApiCollectionDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"CosmosDbSqlApiCollection\",\"typeProperties\":{\"collectionName\":\"datalvsmfjihv\"},\"description\":\"cqrttjf\",\"structure\":\"datammfjew\",\"schema\":\"dataq\",\"linkedServiceName\":{\"referenceName\":\"avdostw\",\"parameters\":{\"elvxgwzz\":\"datafm\",\"zvzrbvgwxhlx\":\"datawdtlcjgpvc\"}},\"parameters\":{\"vhhplkhwwdk\":{\"type\":\"Array\",\"defaultValue\":\"datadrwynbgovazoym\"},\"yxryearmhpwbuk\":{\"type\":\"Object\",\"defaultValue\":\"dataeqmgkcswz\"}},\"annotations\":[\"datamfasgtlvhqpoilos\",\"dataaemcezevftmh\",\"datal\"],\"folder\":{\"name\":\"jy\"},\"\":{\"miwtpcflcez\":\"datatm\",\"fpf\":\"datawwvwiftdjtv\"}}")
                .toObject(CosmosDbSqlApiCollectionDataset.class);
        Assertions.assertEquals("cqrttjf", model.description());
        Assertions.assertEquals("avdostw", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("vhhplkhwwdk").type());
        Assertions.assertEquals("jy", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CosmosDbSqlApiCollectionDataset model =
            new CosmosDbSqlApiCollectionDataset()
                .withDescription("cqrttjf")
                .withStructure("datammfjew")
                .withSchema("dataq")
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("avdostw")
                        .withParameters(mapOf("elvxgwzz", "datafm", "zvzrbvgwxhlx", "datawdtlcjgpvc")))
                .withParameters(
                    mapOf(
                        "vhhplkhwwdk",
                        new ParameterSpecification()
                            .withType(ParameterType.ARRAY)
                            .withDefaultValue("datadrwynbgovazoym"),
                        "yxryearmhpwbuk",
                        new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("dataeqmgkcswz")))
                .withAnnotations(Arrays.asList("datamfasgtlvhqpoilos", "dataaemcezevftmh", "datal"))
                .withFolder(new DatasetFolder().withName("jy"))
                .withCollectionName("datalvsmfjihv");
        model = BinaryData.fromObject(model).toObject(CosmosDbSqlApiCollectionDataset.class);
        Assertions.assertEquals("cqrttjf", model.description());
        Assertions.assertEquals("avdostw", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("vhhplkhwwdk").type());
        Assertions.assertEquals("jy", model.folder().name());
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
