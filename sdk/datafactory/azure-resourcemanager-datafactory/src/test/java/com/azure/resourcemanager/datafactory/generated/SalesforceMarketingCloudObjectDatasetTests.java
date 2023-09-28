// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SalesforceMarketingCloudObjectDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SalesforceMarketingCloudObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SalesforceMarketingCloudObjectDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"SalesforceMarketingCloudObject\",\"typeProperties\":{\"tableName\":\"dataktwomlpczlqboomz\"},\"description\":\"rolhsfddk\",\"structure\":\"datavevwxmnbw\",\"schema\":\"dataa\",\"linkedServiceName\":{\"referenceName\":\"xgnpyhtu\",\"parameters\":{\"aokex\":\"datapqild\"}},\"parameters\":{\"gtz\":{\"type\":\"String\",\"defaultValue\":\"datatkqjarlazb\"},\"oujfgtgxuupczegq\":{\"type\":\"Object\",\"defaultValue\":\"datatrm\"}},\"annotations\":[\"datadvssvg\",\"dataoggkztzttjnknpb\",\"datagzkuobclobn\",\"dataqe\"],\"folder\":{\"name\":\"liqlyugp\"},\"\":{\"yiqywlpxmli\":\"datazjmkffeonmnvmu\",\"ekbirhyvsyuv\":\"datatdegcrunbkilxs\",\"gio\":\"dataiemorszffiukltr\"}}")
                .toObject(SalesforceMarketingCloudObjectDataset.class);
        Assertions.assertEquals("rolhsfddk", model.description());
        Assertions.assertEquals("xgnpyhtu", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("gtz").type());
        Assertions.assertEquals("liqlyugp", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SalesforceMarketingCloudObjectDataset model =
            new SalesforceMarketingCloudObjectDataset()
                .withDescription("rolhsfddk")
                .withStructure("datavevwxmnbw")
                .withSchema("dataa")
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("xgnpyhtu")
                        .withParameters(mapOf("aokex", "datapqild")))
                .withParameters(
                    mapOf(
                        "gtz",
                        new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("datatkqjarlazb"),
                        "oujfgtgxuupczegq",
                        new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("datatrm")))
                .withAnnotations(Arrays.asList("datadvssvg", "dataoggkztzttjnknpb", "datagzkuobclobn", "dataqe"))
                .withFolder(new DatasetFolder().withName("liqlyugp"))
                .withTableName("dataktwomlpczlqboomz");
        model = BinaryData.fromObject(model).toObject(SalesforceMarketingCloudObjectDataset.class);
        Assertions.assertEquals("rolhsfddk", model.description());
        Assertions.assertEquals("xgnpyhtu", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("gtz").type());
        Assertions.assertEquals("liqlyugp", model.folder().name());
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
