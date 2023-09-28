// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.TeradataTableDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TeradataTableDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TeradataTableDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"TeradataTable\",\"typeProperties\":{\"database\":\"databxjblajybdnb\",\"table\":\"datasbtoisazdjmo\"},\"description\":\"vpz\",\"structure\":\"datanywxuy\",\"schema\":\"datafj\",\"linkedServiceName\":{\"referenceName\":\"mgwtmszcfyzqp\",\"parameters\":{\"gihlnzffewvqky\":\"dataegfurdpagknxmaov\"}},\"parameters\":{\"abhgclejqzhpvh\":{\"type\":\"Bool\",\"defaultValue\":\"dataipqxxsdyafwtydsm\"},\"eullgfyog\":{\"type\":\"String\",\"defaultValue\":\"dataadj\"},\"mwdz\":{\"type\":\"Int\",\"defaultValue\":\"datacjpvqerqxk\"},\"x\":{\"type\":\"SecureString\",\"defaultValue\":\"datahcu\"}},\"annotations\":[\"datawwvmbjec\",\"datawlbg\",\"datankfrwxo\"],\"folder\":{\"name\":\"dsnjzpchiypb\"},\"\":{\"iktqozewbrsrj\":\"datai\",\"qbjxgjwsrerukbuu\":\"datagkbrauxboufqn\",\"wkwkjxlaacedikqe\":\"datari\"}}")
                .toObject(TeradataTableDataset.class);
        Assertions.assertEquals("vpz", model.description());
        Assertions.assertEquals("mgwtmszcfyzqp", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("abhgclejqzhpvh").type());
        Assertions.assertEquals("dsnjzpchiypb", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TeradataTableDataset model =
            new TeradataTableDataset()
                .withDescription("vpz")
                .withStructure("datanywxuy")
                .withSchema("datafj")
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("mgwtmszcfyzqp")
                        .withParameters(mapOf("gihlnzffewvqky", "dataegfurdpagknxmaov")))
                .withParameters(
                    mapOf(
                        "abhgclejqzhpvh",
                        new ParameterSpecification()
                            .withType(ParameterType.BOOL)
                            .withDefaultValue("dataipqxxsdyafwtydsm"),
                        "eullgfyog",
                        new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("dataadj"),
                        "mwdz",
                        new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("datacjpvqerqxk"),
                        "x",
                        new ParameterSpecification().withType(ParameterType.SECURE_STRING).withDefaultValue("datahcu")))
                .withAnnotations(Arrays.asList("datawwvmbjec", "datawlbg", "datankfrwxo"))
                .withFolder(new DatasetFolder().withName("dsnjzpchiypb"))
                .withDatabase("databxjblajybdnb")
                .withTable("datasbtoisazdjmo");
        model = BinaryData.fromObject(model).toObject(TeradataTableDataset.class);
        Assertions.assertEquals("vpz", model.description());
        Assertions.assertEquals("mgwtmszcfyzqp", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("abhgclejqzhpvh").type());
        Assertions.assertEquals("dsnjzpchiypb", model.folder().name());
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
