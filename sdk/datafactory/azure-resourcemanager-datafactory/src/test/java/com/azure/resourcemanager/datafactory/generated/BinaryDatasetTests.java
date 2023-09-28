// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.BinaryDataset;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.DatasetLocation;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BinaryDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BinaryDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"Binary\",\"typeProperties\":{\"location\":{\"type\":\"DatasetLocation\",\"folderPath\":\"datapujzfl\",\"fileName\":\"datadsgxcelujiswlluu\",\"\":{\"fxzf\":\"datafw\",\"eupcknecexkgrv\":\"datau\",\"yt\":\"datapsjdmng\",\"yxcnwawox\":\"datapdz\"}},\"compression\":{\"type\":\"datazbejqfbifop\",\"level\":\"dataxdwdrpazqjkrfm\",\"\":{\"gp\":\"datatfcuuugtj\",\"nnzm\":\"dataayiawohfm\",\"idzr\":\"datacjjkmqenh\",\"lo\":\"datavs\"}}},\"description\":\"vslvivqsuvwten\",\"structure\":\"datapijpkhc\",\"schema\":\"dataaqxukuicjufte\",\"linkedServiceName\":{\"referenceName\":\"iooanduewfhv\",\"parameters\":{\"gvzua\":\"datahxzubfjzabbw\",\"gavkmv\":\"dataxcdckixspsa\",\"kpzjbyetjxryopt\":\"dataxzerej\",\"z\":\"dataeitwhlbecgi\"}},\"parameters\":{\"hspbo\":{\"type\":\"String\",\"defaultValue\":\"datarrabovrwwxywp\"},\"skpeswyhhmifjua\":{\"type\":\"String\",\"defaultValue\":\"datafp\"},\"cmlae\":{\"type\":\"Array\",\"defaultValue\":\"datawvcmmpeglyuq\"},\"rorh\":{\"type\":\"Bool\",\"defaultValue\":\"databqufpnezsjzayml\"}},\"annotations\":[\"datazmsimehtcu\",\"datawdhtqqhyhnimxtn\",\"dataugisnomwnwngho\"],\"folder\":{\"name\":\"keyymicjixxfs\"},\"\":{\"veywetkrhlolmcn\":\"datartnuguefxxijteb\",\"npetlrnrde\":\"dataepfgsvbbvaqdl\",\"vxehuekdxljzvdo\":\"dataaw\"}}")
                .toObject(BinaryDataset.class);
        Assertions.assertEquals("vslvivqsuvwten", model.description());
        Assertions.assertEquals("iooanduewfhv", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("hspbo").type());
        Assertions.assertEquals("keyymicjixxfs", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BinaryDataset model =
            new BinaryDataset()
                .withDescription("vslvivqsuvwten")
                .withStructure("datapijpkhc")
                .withSchema("dataaqxukuicjufte")
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("iooanduewfhv")
                        .withParameters(
                            mapOf(
                                "gvzua",
                                "datahxzubfjzabbw",
                                "gavkmv",
                                "dataxcdckixspsa",
                                "kpzjbyetjxryopt",
                                "dataxzerej",
                                "z",
                                "dataeitwhlbecgi")))
                .withParameters(
                    mapOf(
                        "hspbo",
                        new ParameterSpecification()
                            .withType(ParameterType.STRING)
                            .withDefaultValue("datarrabovrwwxywp"),
                        "skpeswyhhmifjua",
                        new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("datafp"),
                        "cmlae",
                        new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("datawvcmmpeglyuq"),
                        "rorh",
                        new ParameterSpecification()
                            .withType(ParameterType.BOOL)
                            .withDefaultValue("databqufpnezsjzayml")))
                .withAnnotations(Arrays.asList("datazmsimehtcu", "datawdhtqqhyhnimxtn", "dataugisnomwnwngho"))
                .withFolder(new DatasetFolder().withName("keyymicjixxfs"))
                .withLocation(
                    new DatasetLocation()
                        .withFolderPath("datapujzfl")
                        .withFileName("datadsgxcelujiswlluu")
                        .withAdditionalProperties(mapOf("type", "DatasetLocation")))
                .withCompression(
                    new DatasetCompression()
                        .withType("datazbejqfbifop")
                        .withLevel("dataxdwdrpazqjkrfm")
                        .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(BinaryDataset.class);
        Assertions.assertEquals("vslvivqsuvwten", model.description());
        Assertions.assertEquals("iooanduewfhv", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("hspbo").type());
        Assertions.assertEquals("keyymicjixxfs", model.folder().name());
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
