// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.PipelineResourceInner;
import com.azure.resourcemanager.datafactory.models.Activity;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.PipelineElapsedTimeMetricPolicy;
import com.azure.resourcemanager.datafactory.models.PipelineFolder;
import com.azure.resourcemanager.datafactory.models.PipelineListResponse;
import com.azure.resourcemanager.datafactory.models.PipelinePolicy;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import com.azure.resourcemanager.datafactory.models.VariableSpecification;
import com.azure.resourcemanager.datafactory.models.VariableType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PipelineListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PipelineListResponse model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"description\":\"xrbuukzclew\",\"activities\":[{\"type\":\"Activity\",\"name\":\"lw\",\"description\":\"ztzp\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Skipped\",\"dependsOn\":[{\"activity\":\"yfzqwhxxbu\",\"dependencyConditions\":[]},{\"activity\":\"qa\",\"dependencyConditions\":[]},{\"activity\":\"zfeqztppri\",\"dependencyConditions\":[]},{\"activity\":\"lxorjaltolmncws\",\"dependencyConditions\":[]}],\"userProperties\":[{\"name\":\"wcsdbnwdcfhucq\",\"value\":\"datapfuvglsbjjca\"},{\"name\":\"vxb\",\"value\":\"datat\"},{\"name\":\"udutnco\",\"value\":\"datamr\"},{\"name\":\"xqtvcofu\",\"value\":\"dataf\"}],\"\":{\"bgdknnqv\":\"datagj\",\"sgsahmkycgr\":\"dataaznqntoru\",\"s\":\"datauwjuetaeburuvdmo\",\"tpuqujmq\":\"datazlxwabmqoefkifr\"}},{\"type\":\"Activity\",\"name\":\"gkfbtndoaong\",\"description\":\"cn\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Failed\",\"dependsOn\":[{\"activity\":\"ed\",\"dependencyConditions\":[]}],\"userProperties\":[{\"name\":\"waezkojvd\",\"value\":\"datapzfoqoui\"}],\"\":{\"p\":\"dataxarzgszufoxciq\",\"xkhnzbonlwnto\":\"datadoamciodhkha\",\"zcmrvexztvb\":\"datagokdwbwhks\",\"lmnguxaw\":\"dataqgsfraoyzkoow\"}}],\"parameters\":{\"bykutw\":{\"type\":\"Int\",\"defaultValue\":\"datayuuximerqfobwyzn\"},\"sd\":{\"type\":\"Float\",\"defaultValue\":\"datapagmhrskdsnf\"},\"zev\":{\"type\":\"String\",\"defaultValue\":\"datagtdlmk\"},\"ejdcngqqmoakuf\":{\"type\":\"String\",\"defaultValue\":\"dataewpusdsttwvogvb\"}},\"variables\":{\"grtwae\":{\"type\":\"Array\",\"defaultValue\":\"datawr\"},\"inrfdwoyu\":{\"type\":\"String\",\"defaultValue\":\"datazkopb\"},\"mzqhoftrmaequi\":{\"type\":\"Bool\",\"defaultValue\":\"dataiuiefozbhdmsm\"}},\"concurrency\":1964875083,\"annotations\":[\"dataslfaoqzpiyyl\",\"dataalnswhccsphk\",\"dataivwitqscywugg\",\"dataoluhczbwemh\"],\"runDimensions\":{\"wmsweypqwd\":\"datasbrgz\",\"mkttlstvlzywem\":\"dataggicccnxqhue\",\"lusiy\":\"datazrncsdt\"},\"folder\":{\"name\":\"fgytguslfeadcyg\"},\"policy\":{\"elapsedTimeMetric\":{\"duration\":\"datahejhzisx\"}}},\"name\":\"pelol\",\"type\":\"vk\",\"etag\":\"pqvujzraehtwdwrf\",\"\":{\"cdl\":\"dataiby\"},\"id\":\"shfwpracstwity\"}],\"nextLink\":\"evxccedcp\"}")
                .toObject(PipelineListResponse.class);
        Assertions.assertEquals("shfwpracstwity", model.value().get(0).id());
        Assertions.assertEquals("xrbuukzclew", model.value().get(0).description());
        Assertions.assertEquals("lw", model.value().get(0).activities().get(0).name());
        Assertions.assertEquals("ztzp", model.value().get(0).activities().get(0).description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.value().get(0).activities().get(0).state());
        Assertions
            .assertEquals(
                ActivityOnInactiveMarkAs.SKIPPED, model.value().get(0).activities().get(0).onInactiveMarkAs());
        Assertions.assertEquals("yfzqwhxxbu", model.value().get(0).activities().get(0).dependsOn().get(0).activity());
        Assertions
            .assertEquals("wcsdbnwdcfhucq", model.value().get(0).activities().get(0).userProperties().get(0).name());
        Assertions.assertEquals(ParameterType.INT, model.value().get(0).parameters().get("bykutw").type());
        Assertions.assertEquals(VariableType.ARRAY, model.value().get(0).variables().get("grtwae").type());
        Assertions.assertEquals(1964875083, model.value().get(0).concurrency());
        Assertions.assertEquals("fgytguslfeadcyg", model.value().get(0).folder().name());
        Assertions.assertEquals("evxccedcp", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PipelineListResponse model =
            new PipelineListResponse()
                .withValue(
                    Arrays
                        .asList(
                            new PipelineResourceInner()
                                .withId("shfwpracstwity")
                                .withDescription("xrbuukzclew")
                                .withActivities(
                                    Arrays
                                        .asList(
                                            new Activity()
                                                .withName("lw")
                                                .withDescription("ztzp")
                                                .withState(ActivityState.ACTIVE)
                                                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SKIPPED)
                                                .withDependsOn(
                                                    Arrays
                                                        .asList(
                                                            new ActivityDependency()
                                                                .withActivity("yfzqwhxxbu")
                                                                .withDependencyConditions(Arrays.asList())
                                                                .withAdditionalProperties(mapOf()),
                                                            new ActivityDependency()
                                                                .withActivity("qa")
                                                                .withDependencyConditions(Arrays.asList())
                                                                .withAdditionalProperties(mapOf()),
                                                            new ActivityDependency()
                                                                .withActivity("zfeqztppri")
                                                                .withDependencyConditions(Arrays.asList())
                                                                .withAdditionalProperties(mapOf()),
                                                            new ActivityDependency()
                                                                .withActivity("lxorjaltolmncws")
                                                                .withDependencyConditions(Arrays.asList())
                                                                .withAdditionalProperties(mapOf())))
                                                .withUserProperties(
                                                    Arrays
                                                        .asList(
                                                            new UserProperty()
                                                                .withName("wcsdbnwdcfhucq")
                                                                .withValue("datapfuvglsbjjca"),
                                                            new UserProperty().withName("vxb").withValue("datat"),
                                                            new UserProperty().withName("udutnco").withValue("datamr"),
                                                            new UserProperty().withName("xqtvcofu").withValue("dataf")))
                                                .withAdditionalProperties(mapOf("type", "Activity")),
                                            new Activity()
                                                .withName("gkfbtndoaong")
                                                .withDescription("cn")
                                                .withState(ActivityState.INACTIVE)
                                                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.FAILED)
                                                .withDependsOn(
                                                    Arrays
                                                        .asList(
                                                            new ActivityDependency()
                                                                .withActivity("ed")
                                                                .withDependencyConditions(Arrays.asList())
                                                                .withAdditionalProperties(mapOf())))
                                                .withUserProperties(
                                                    Arrays
                                                        .asList(
                                                            new UserProperty()
                                                                .withName("waezkojvd")
                                                                .withValue("datapzfoqoui")))
                                                .withAdditionalProperties(mapOf("type", "Activity"))))
                                .withParameters(
                                    mapOf(
                                        "bykutw",
                                        new ParameterSpecification()
                                            .withType(ParameterType.INT)
                                            .withDefaultValue("datayuuximerqfobwyzn"),
                                        "sd",
                                        new ParameterSpecification()
                                            .withType(ParameterType.FLOAT)
                                            .withDefaultValue("datapagmhrskdsnf"),
                                        "zev",
                                        new ParameterSpecification()
                                            .withType(ParameterType.STRING)
                                            .withDefaultValue("datagtdlmk"),
                                        "ejdcngqqmoakuf",
                                        new ParameterSpecification()
                                            .withType(ParameterType.STRING)
                                            .withDefaultValue("dataewpusdsttwvogvb")))
                                .withVariables(
                                    mapOf(
                                        "grtwae",
                                        new VariableSpecification()
                                            .withType(VariableType.ARRAY)
                                            .withDefaultValue("datawr"),
                                        "inrfdwoyu",
                                        new VariableSpecification()
                                            .withType(VariableType.STRING)
                                            .withDefaultValue("datazkopb"),
                                        "mzqhoftrmaequi",
                                        new VariableSpecification()
                                            .withType(VariableType.BOOL)
                                            .withDefaultValue("dataiuiefozbhdmsm")))
                                .withConcurrency(1964875083)
                                .withAnnotations(
                                    Arrays
                                        .asList(
                                            "dataslfaoqzpiyyl",
                                            "dataalnswhccsphk",
                                            "dataivwitqscywugg",
                                            "dataoluhczbwemh"))
                                .withRunDimensions(
                                    mapOf(
                                        "wmsweypqwd",
                                        "datasbrgz",
                                        "mkttlstvlzywem",
                                        "dataggicccnxqhue",
                                        "lusiy",
                                        "datazrncsdt"))
                                .withFolder(new PipelineFolder().withName("fgytguslfeadcyg"))
                                .withPolicy(
                                    new PipelinePolicy()
                                        .withElapsedTimeMetric(
                                            new PipelineElapsedTimeMetricPolicy().withDuration("datahejhzisx")))
                                .withAdditionalProperties(
                                    mapOf("name", "pelol", "etag", "pqvujzraehtwdwrf", "type", "vk"))))
                .withNextLink("evxccedcp");
        model = BinaryData.fromObject(model).toObject(PipelineListResponse.class);
        Assertions.assertEquals("shfwpracstwity", model.value().get(0).id());
        Assertions.assertEquals("xrbuukzclew", model.value().get(0).description());
        Assertions.assertEquals("lw", model.value().get(0).activities().get(0).name());
        Assertions.assertEquals("ztzp", model.value().get(0).activities().get(0).description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.value().get(0).activities().get(0).state());
        Assertions
            .assertEquals(
                ActivityOnInactiveMarkAs.SKIPPED, model.value().get(0).activities().get(0).onInactiveMarkAs());
        Assertions.assertEquals("yfzqwhxxbu", model.value().get(0).activities().get(0).dependsOn().get(0).activity());
        Assertions
            .assertEquals("wcsdbnwdcfhucq", model.value().get(0).activities().get(0).userProperties().get(0).name());
        Assertions.assertEquals(ParameterType.INT, model.value().get(0).parameters().get("bykutw").type());
        Assertions.assertEquals(VariableType.ARRAY, model.value().get(0).variables().get("grtwae").type());
        Assertions.assertEquals(1964875083, model.value().get(0).concurrency());
        Assertions.assertEquals("fgytguslfeadcyg", model.value().get(0).folder().name());
        Assertions.assertEquals("evxccedcp", model.nextLink());
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
