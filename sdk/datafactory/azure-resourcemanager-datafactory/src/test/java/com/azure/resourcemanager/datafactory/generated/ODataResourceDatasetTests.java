// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ODataResourceDataset;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ODataResourceDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ODataResourceDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"ODataResource\",\"typeProperties\":{\"path\":\"dataicovj\"},\"description\":\"vwrmjx\",\"structure\":\"datauod\",\"schema\":\"dataczbassqfyylwpp\",\"linkedServiceName\":{\"referenceName\":\"ygkbzb\",\"parameters\":{\"pmhttuvsqjsrvjnq\":\"datasybxhqvov\",\"qbfkceincnrecjbi\":\"dataaqg\",\"sqsvzvmxtc\":\"datawevsfgdrmnszdosm\",\"hgsulwvgs\":\"dataghndae\"}},\"parameters\":{\"jjuzk\":{\"type\":\"Float\",\"defaultValue\":\"datav\"},\"vljlbzdlby\":{\"type\":\"Bool\",\"defaultValue\":\"dataciwuhyzekypy\"},\"ov\":{\"type\":\"String\",\"defaultValue\":\"dataxhpzy\"}},\"annotations\":[\"databhanz\"],\"folder\":{\"name\":\"fhsh\"},\"\":{\"zpbyfyvynpmggq\":\"dataahn\",\"izorbloejzs\":\"dataagenvqbugihcdvf\"}}")
                .toObject(ODataResourceDataset.class);
        Assertions.assertEquals("vwrmjx", model.description());
        Assertions.assertEquals("ygkbzb", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("jjuzk").type());
        Assertions.assertEquals("fhsh", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ODataResourceDataset model =
            new ODataResourceDataset()
                .withDescription("vwrmjx")
                .withStructure("datauod")
                .withSchema("dataczbassqfyylwpp")
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("ygkbzb")
                        .withParameters(
                            mapOf(
                                "pmhttuvsqjsrvjnq",
                                "datasybxhqvov",
                                "qbfkceincnrecjbi",
                                "dataaqg",
                                "sqsvzvmxtc",
                                "datawevsfgdrmnszdosm",
                                "hgsulwvgs",
                                "dataghndae")))
                .withParameters(
                    mapOf(
                        "jjuzk",
                        new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datav"),
                        "vljlbzdlby",
                        new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("dataciwuhyzekypy"),
                        "ov",
                        new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("dataxhpzy")))
                .withAnnotations(Arrays.asList("databhanz"))
                .withFolder(new DatasetFolder().withName("fhsh"))
                .withPath("dataicovj");
        model = BinaryData.fromObject(model).toObject(ODataResourceDataset.class);
        Assertions.assertEquals("vwrmjx", model.description());
        Assertions.assertEquals("ygkbzb", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("jjuzk").type());
        Assertions.assertEquals("fhsh", model.folder().name());
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
