// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.signalr.models.ShareablePrivateLinkResourceProperties;
import com.azure.resourcemanager.signalr.models.ShareablePrivateLinkResourceType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"groupId\":\"luiqtqzfavyvnqq\",\"requiredMembers\":[\"ryeu\",\"yjkqabqgzslesjcb\"],\"requiredZoneNames\":[\"n\",\"tiewdj\",\"vbquwr\"],\"shareablePrivateLinkResourceTypes\":[{\"name\":\"agohbuff\",\"properties\":{\"description\":\"qem\",\"groupId\":\"hmxtdr\",\"type\":\"utacoe\"}},{\"name\":\"vewzcj\",\"properties\":{\"description\":\"wcpmguaadraufac\",\"groupId\":\"ahzovajjziuxxp\",\"type\":\"neekulfg\"}},{\"name\":\"qubkw\",\"properties\":{\"description\":\"nrdsutujbazpjuoh\",\"groupId\":\"nyfln\",\"type\":\"wmd\"}},{\"name\":\"wpklvxw\",\"properties\":{\"description\":\"dxpgpqchiszepnnb\",\"groupId\":\"rxgibbd\",\"type\":\"confozauors\"}}]},\"id\":\"kokwbqplhlvnu\",\"name\":\"epzl\",\"type\":\"phwzsoldweyuqdu\"}")
                .toObject(PrivateLinkResourceInner.class);
        Assertions.assertEquals("luiqtqzfavyvnqq", model.groupId());
        Assertions.assertEquals("ryeu", model.requiredMembers().get(0));
        Assertions.assertEquals("n", model.requiredZoneNames().get(0));
        Assertions.assertEquals("agohbuff", model.shareablePrivateLinkResourceTypes().get(0).name());
        Assertions.assertEquals("qem", model.shareablePrivateLinkResourceTypes().get(0).properties().description());
        Assertions.assertEquals("hmxtdr", model.shareablePrivateLinkResourceTypes().get(0).properties().groupId());
        Assertions.assertEquals("utacoe", model.shareablePrivateLinkResourceTypes().get(0).properties().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkResourceInner model =
            new PrivateLinkResourceInner()
                .withGroupId("luiqtqzfavyvnqq")
                .withRequiredMembers(Arrays.asList("ryeu", "yjkqabqgzslesjcb"))
                .withRequiredZoneNames(Arrays.asList("n", "tiewdj", "vbquwr"))
                .withShareablePrivateLinkResourceTypes(
                    Arrays
                        .asList(
                            new ShareablePrivateLinkResourceType()
                                .withName("agohbuff")
                                .withProperties(
                                    new ShareablePrivateLinkResourceProperties()
                                        .withDescription("qem")
                                        .withGroupId("hmxtdr")
                                        .withType("utacoe")),
                            new ShareablePrivateLinkResourceType()
                                .withName("vewzcj")
                                .withProperties(
                                    new ShareablePrivateLinkResourceProperties()
                                        .withDescription("wcpmguaadraufac")
                                        .withGroupId("ahzovajjziuxxp")
                                        .withType("neekulfg")),
                            new ShareablePrivateLinkResourceType()
                                .withName("qubkw")
                                .withProperties(
                                    new ShareablePrivateLinkResourceProperties()
                                        .withDescription("nrdsutujbazpjuoh")
                                        .withGroupId("nyfln")
                                        .withType("wmd")),
                            new ShareablePrivateLinkResourceType()
                                .withName("wpklvxw")
                                .withProperties(
                                    new ShareablePrivateLinkResourceProperties()
                                        .withDescription("dxpgpqchiszepnnb")
                                        .withGroupId("rxgibbd")
                                        .withType("confozauors"))));
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourceInner.class);
        Assertions.assertEquals("luiqtqzfavyvnqq", model.groupId());
        Assertions.assertEquals("ryeu", model.requiredMembers().get(0));
        Assertions.assertEquals("n", model.requiredZoneNames().get(0));
        Assertions.assertEquals("agohbuff", model.shareablePrivateLinkResourceTypes().get(0).name());
        Assertions.assertEquals("qem", model.shareablePrivateLinkResourceTypes().get(0).properties().description());
        Assertions.assertEquals("hmxtdr", model.shareablePrivateLinkResourceTypes().get(0).properties().groupId());
        Assertions.assertEquals("utacoe", model.shareablePrivateLinkResourceTypes().get(0).properties().type());
    }
}
