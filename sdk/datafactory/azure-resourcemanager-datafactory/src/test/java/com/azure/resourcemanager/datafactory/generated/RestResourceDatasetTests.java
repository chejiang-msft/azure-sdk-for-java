// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.RestResourceDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class RestResourceDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RestResourceDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"RestResource\",\"typeProperties\":{\"relativeUrl\":\"dataiarz\",\"requestMethod\":\"datadqseypdlmajpuy\",\"requestBody\":\"dataa\",\"additionalHeaders\":{\"uvmsie\":\"datazgccyn\",\"parxtzayq\":\"dataedmmvoneeyr\"},\"paginationRules\":{\"z\":\"dataigeblsp\",\"eozbj\":\"datassiwwv\"}},\"description\":\"qpizdnuehxw\",\"structure\":\"datassjdywbnklg\",\"schema\":\"dataxa\",\"linkedServiceName\":{\"referenceName\":\"tsawv\",\"parameters\":{\"jrmplzmsl\":\"datampt\",\"vrrllfswarmyb\":\"databnknyfuysj\"}},\"parameters\":{\"cbfnxiajuv\":{\"type\":\"Float\",\"defaultValue\":\"datageysyqnipehfw\"},\"zguaxfhvjixgofqd\":{\"type\":\"Bool\",\"defaultValue\":\"datafjisosfzlnraxnf\"},\"uvrqpbxdoicqp\":{\"type\":\"Array\",\"defaultValue\":\"datajmi\"}},\"annotations\":[\"datalydp\"],\"folder\":{\"name\":\"nsbmzjritukoym\"},\"\":{\"ndu\":\"dataexmizzjxwjoqfzw\"}}")
                .toObject(RestResourceDataset.class);
        Assertions.assertEquals("qpizdnuehxw", model.description());
        Assertions.assertEquals("tsawv", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("cbfnxiajuv").type());
        Assertions.assertEquals("nsbmzjritukoym", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RestResourceDataset model =
            new RestResourceDataset()
                .withDescription("qpizdnuehxw")
                .withStructure("datassjdywbnklg")
                .withSchema("dataxa")
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("tsawv")
                        .withParameters(mapOf("jrmplzmsl", "datampt", "vrrllfswarmyb", "databnknyfuysj")))
                .withParameters(
                    mapOf(
                        "cbfnxiajuv",
                        new ParameterSpecification()
                            .withType(ParameterType.FLOAT)
                            .withDefaultValue("datageysyqnipehfw"),
                        "zguaxfhvjixgofqd",
                        new ParameterSpecification()
                            .withType(ParameterType.BOOL)
                            .withDefaultValue("datafjisosfzlnraxnf"),
                        "uvrqpbxdoicqp",
                        new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("datajmi")))
                .withAnnotations(Arrays.asList("datalydp"))
                .withFolder(new DatasetFolder().withName("nsbmzjritukoym"))
                .withRelativeUrl("dataiarz")
                .withRequestMethod("datadqseypdlmajpuy")
                .withRequestBody("dataa")
                .withAdditionalHeaders(mapOf("uvmsie", "datazgccyn", "parxtzayq", "dataedmmvoneeyr"))
                .withPaginationRules(mapOf("z", "dataigeblsp", "eozbj", "datassiwwv"));
        model = BinaryData.fromObject(model).toObject(RestResourceDataset.class);
        Assertions.assertEquals("qpizdnuehxw", model.description());
        Assertions.assertEquals("tsawv", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("cbfnxiajuv").type());
        Assertions.assertEquals("nsbmzjritukoym", model.folder().name());
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
