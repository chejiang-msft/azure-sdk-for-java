// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.Activity;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.Expression;
import com.azure.resourcemanager.datafactory.models.UntilActivity;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class UntilActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UntilActivity model =
            BinaryData
                .fromString(
                    "{\"type\":\"Until\",\"typeProperties\":{\"expression\":{\"value\":\"vyeckbudepulbxgd\"},\"timeout\":\"datahywmezoiywm\",\"activities\":[{\"type\":\"Activity\",\"name\":\"aicfkkcpkvujwfyv\",\"description\":\"vnbbeysef\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Failed\",\"dependsOn\":[{\"activity\":\"xfiveuqgptzx\",\"dependencyConditions\":[\"Skipped\",\"Completed\",\"Skipped\"],\"\":{\"az\":\"datargtoq\"}}],\"userProperties\":[{\"name\":\"jhua\",\"value\":\"dataiitxyebi\"}],\"\":{\"bwdu\":\"dataehhkcutxmqvbh\",\"k\":\"datavkrskqgokhpzvph\"}},{\"type\":\"Activity\",\"name\":\"fcxvfurkdhopz\",\"description\":\"hrfwchim\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Failed\",\"dependsOn\":[{\"activity\":\"zkwdexldocq\",\"dependencyConditions\":[\"Completed\",\"Succeeded\",\"Completed\",\"Failed\"],\"\":{\"qwfuavofeouucg\":\"dataiexmfeechltxa\"}},{\"activity\":\"i\",\"dependencyConditions\":[\"Completed\",\"Skipped\",\"Succeeded\"],\"\":{\"imenjhtwkn\":\"datasegdjqnochnmxbhg\",\"pz\":\"datazcwjaqyvnol\"}},{\"activity\":\"m\",\"dependencyConditions\":[\"Failed\"],\"\":{\"iffzpkrno\":\"dataquiqkuxajl\",\"ircwbnmai\":\"dataexfyk\"}}],\"userProperties\":[{\"name\":\"oir\",\"value\":\"datangmmv\"},{\"name\":\"rxoidmnsmd\",\"value\":\"datam\"},{\"name\":\"kjlhkcogxrs\",\"value\":\"datayfiochfx\"}],\"\":{\"eudhvszwgmpzbx\":\"dataybjynzo\",\"ushzfnlqnr\":\"datafmhypwglkvspbd\",\"g\":\"datasmrvpswe\"}},{\"type\":\"Activity\",\"name\":\"awhzdh\",\"description\":\"kudlilkwjzmyv\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Succeeded\",\"dependsOn\":[{\"activity\":\"f\",\"dependencyConditions\":[\"Failed\",\"Completed\",\"Skipped\"],\"\":{\"grub\":\"dataokp\",\"hdkx\":\"datazgz\"}},{\"activity\":\"hlinjerkdurch\",\"dependencyConditions\":[\"Failed\",\"Completed\"],\"\":{\"hluoyr\":\"datasvosvqj\",\"hzpwsadwsent\":\"datahqq\"}},{\"activity\":\"cdzyvxwnmiumduw\",\"dependencyConditions\":[\"Skipped\"],\"\":{\"wfbgkyonadtywzrn\":\"datauvxmrbbgl\",\"dadfyg\":\"dataiktokiptx\"}},{\"activity\":\"bcfpri\",\"dependencyConditions\":[\"Completed\",\"Succeeded\",\"Succeeded\",\"Failed\"],\"\":{\"nnolrs\":\"datahxe\",\"uotexlpqydgfzet\":\"dataxtsywrmmhaxmo\"}}],\"userProperties\":[{\"name\":\"mnseigoalxwuq\",\"value\":\"dataczrskdovgkpq\"},{\"name\":\"zrxhghsmlxogim\",\"value\":\"datahxyx\"},{\"name\":\"lxawixdcy\",\"value\":\"datadqamiy\"}],\"\":{\"zco\":\"datazlbcamdzoauvwjkg\",\"aqxztywzaq\":\"datawcnnzacqludq\",\"zlzpowsefpg\":\"datafqtstmyfebb\",\"pzbsytwt\":\"dataw\"}}]},\"name\":\"vcdtsvgyzmafq\",\"description\":\"wupuubyvwejy\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Succeeded\",\"dependsOn\":[{\"activity\":\"hrxoekyf\",\"dependencyConditions\":[\"Completed\",\"Completed\"],\"\":{\"jxjaaocjlwco\":\"datapdgnsmhrpzbyudko\",\"vmzxrhve\":\"datawcrextdymkzbliu\",\"guvqghuehgcqhlfq\":\"datangzjxjbklta\",\"r\":\"datamjldeluqqnf\"}}],\"userProperties\":[{\"name\":\"luomaltvvp\",\"value\":\"datadhtdapkdahyn\"},{\"name\":\"tixrkjogyqrmt\",\"value\":\"dataiclsxuibyfylhf\"}],\"\":{\"cwuz\":\"dataauqylmlunquvlva\",\"gynqedn\":\"datalx\",\"qcxzdlfs\":\"dataidacskul\"}}")
                .toObject(UntilActivity.class);
        Assertions.assertEquals("vcdtsvgyzmafq", model.name());
        Assertions.assertEquals("wupuubyvwejy", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.onInactiveMarkAs());
        Assertions.assertEquals("hrxoekyf", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("luomaltvvp", model.userProperties().get(0).name());
        Assertions.assertEquals("vyeckbudepulbxgd", model.expression().value());
        Assertions.assertEquals("aicfkkcpkvujwfyv", model.activities().get(0).name());
        Assertions.assertEquals("vnbbeysef", model.activities().get(0).description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.activities().get(0).state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.activities().get(0).onInactiveMarkAs());
        Assertions.assertEquals("xfiveuqgptzx", model.activities().get(0).dependsOn().get(0).activity());
        Assertions
            .assertEquals(
                DependencyCondition.SKIPPED,
                model.activities().get(0).dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("jhua", model.activities().get(0).userProperties().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UntilActivity model =
            new UntilActivity()
                .withName("vcdtsvgyzmafq")
                .withDescription("wupuubyvwejy")
                .withState(ActivityState.ACTIVE)
                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SUCCEEDED)
                .withDependsOn(
                    Arrays
                        .asList(
                            new ActivityDependency()
                                .withActivity("hrxoekyf")
                                .withDependencyConditions(
                                    Arrays.asList(DependencyCondition.COMPLETED, DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf())))
                .withUserProperties(
                    Arrays
                        .asList(
                            new UserProperty().withName("luomaltvvp").withValue("datadhtdapkdahyn"),
                            new UserProperty().withName("tixrkjogyqrmt").withValue("dataiclsxuibyfylhf")))
                .withExpression(new Expression().withValue("vyeckbudepulbxgd"))
                .withTimeout("datahywmezoiywm")
                .withActivities(
                    Arrays
                        .asList(
                            new Activity()
                                .withName("aicfkkcpkvujwfyv")
                                .withDescription("vnbbeysef")
                                .withState(ActivityState.ACTIVE)
                                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.FAILED)
                                .withDependsOn(
                                    Arrays
                                        .asList(
                                            new ActivityDependency()
                                                .withActivity("xfiveuqgptzx")
                                                .withDependencyConditions(
                                                    Arrays
                                                        .asList(
                                                            DependencyCondition.SKIPPED,
                                                            DependencyCondition.COMPLETED,
                                                            DependencyCondition.SKIPPED))
                                                .withAdditionalProperties(mapOf())))
                                .withUserProperties(
                                    Arrays.asList(new UserProperty().withName("jhua").withValue("dataiitxyebi")))
                                .withAdditionalProperties(mapOf("type", "Activity")),
                            new Activity()
                                .withName("fcxvfurkdhopz")
                                .withDescription("hrfwchim")
                                .withState(ActivityState.ACTIVE)
                                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.FAILED)
                                .withDependsOn(
                                    Arrays
                                        .asList(
                                            new ActivityDependency()
                                                .withActivity("zkwdexldocq")
                                                .withDependencyConditions(
                                                    Arrays
                                                        .asList(
                                                            DependencyCondition.COMPLETED,
                                                            DependencyCondition.SUCCEEDED,
                                                            DependencyCondition.COMPLETED,
                                                            DependencyCondition.FAILED))
                                                .withAdditionalProperties(mapOf()),
                                            new ActivityDependency()
                                                .withActivity("i")
                                                .withDependencyConditions(
                                                    Arrays
                                                        .asList(
                                                            DependencyCondition.COMPLETED,
                                                            DependencyCondition.SKIPPED,
                                                            DependencyCondition.SUCCEEDED))
                                                .withAdditionalProperties(mapOf()),
                                            new ActivityDependency()
                                                .withActivity("m")
                                                .withDependencyConditions(Arrays.asList(DependencyCondition.FAILED))
                                                .withAdditionalProperties(mapOf())))
                                .withUserProperties(
                                    Arrays
                                        .asList(
                                            new UserProperty().withName("oir").withValue("datangmmv"),
                                            new UserProperty().withName("rxoidmnsmd").withValue("datam"),
                                            new UserProperty().withName("kjlhkcogxrs").withValue("datayfiochfx")))
                                .withAdditionalProperties(mapOf("type", "Activity")),
                            new Activity()
                                .withName("awhzdh")
                                .withDescription("kudlilkwjzmyv")
                                .withState(ActivityState.ACTIVE)
                                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SUCCEEDED)
                                .withDependsOn(
                                    Arrays
                                        .asList(
                                            new ActivityDependency()
                                                .withActivity("f")
                                                .withDependencyConditions(
                                                    Arrays
                                                        .asList(
                                                            DependencyCondition.FAILED,
                                                            DependencyCondition.COMPLETED,
                                                            DependencyCondition.SKIPPED))
                                                .withAdditionalProperties(mapOf()),
                                            new ActivityDependency()
                                                .withActivity("hlinjerkdurch")
                                                .withDependencyConditions(
                                                    Arrays
                                                        .asList(
                                                            DependencyCondition.FAILED, DependencyCondition.COMPLETED))
                                                .withAdditionalProperties(mapOf()),
                                            new ActivityDependency()
                                                .withActivity("cdzyvxwnmiumduw")
                                                .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED))
                                                .withAdditionalProperties(mapOf()),
                                            new ActivityDependency()
                                                .withActivity("bcfpri")
                                                .withDependencyConditions(
                                                    Arrays
                                                        .asList(
                                                            DependencyCondition.COMPLETED,
                                                            DependencyCondition.SUCCEEDED,
                                                            DependencyCondition.SUCCEEDED,
                                                            DependencyCondition.FAILED))
                                                .withAdditionalProperties(mapOf())))
                                .withUserProperties(
                                    Arrays
                                        .asList(
                                            new UserProperty().withName("mnseigoalxwuq").withValue("dataczrskdovgkpq"),
                                            new UserProperty().withName("zrxhghsmlxogim").withValue("datahxyx"),
                                            new UserProperty().withName("lxawixdcy").withValue("datadqamiy")))
                                .withAdditionalProperties(mapOf("type", "Activity"))));
        model = BinaryData.fromObject(model).toObject(UntilActivity.class);
        Assertions.assertEquals("vcdtsvgyzmafq", model.name());
        Assertions.assertEquals("wupuubyvwejy", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.onInactiveMarkAs());
        Assertions.assertEquals("hrxoekyf", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("luomaltvvp", model.userProperties().get(0).name());
        Assertions.assertEquals("vyeckbudepulbxgd", model.expression().value());
        Assertions.assertEquals("aicfkkcpkvujwfyv", model.activities().get(0).name());
        Assertions.assertEquals("vnbbeysef", model.activities().get(0).description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.activities().get(0).state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.activities().get(0).onInactiveMarkAs());
        Assertions.assertEquals("xfiveuqgptzx", model.activities().get(0).dependsOn().get(0).activity());
        Assertions
            .assertEquals(
                DependencyCondition.SKIPPED,
                model.activities().get(0).dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("jhua", model.activities().get(0).userProperties().get(0).name());
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
