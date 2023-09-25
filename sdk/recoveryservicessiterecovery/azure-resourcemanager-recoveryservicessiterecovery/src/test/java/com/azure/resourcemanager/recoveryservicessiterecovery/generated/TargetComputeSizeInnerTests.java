// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.TargetComputeSizeInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ComputeSizeErrorDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TargetComputeSizeProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class TargetComputeSizeInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TargetComputeSizeInner model =
            BinaryData
                .fromString(
                    "{\"id\":\"ygo\",\"name\":\"kkqfqjbvle\",\"type\":\"fmluiqtqzfavyvn\",\"properties\":{\"name\":\"bar\",\"friendlyName\":\"uayjkqa\",\"cpuCoresCount\":2002865497,\"vCPUsAvailable\":1085196762,\"memoryInGB\":51.89952430089579,\"maxDataDiskCount\":1318524891,\"maxNicsCount\":813046030,\"errors\":[{\"message\":\"ntiew\",\"severity\":\"cv\"},{\"message\":\"uwrbehwagoh\",\"severity\":\"f\"},{\"message\":\"mrqemvvhmx\",\"severity\":\"rjfut\"}],\"highIopsSupported\":\"oe\",\"hyperVGenerations\":[\"ewzcjznmwcp\",\"guaadraufactkahz\"]}}")
                .toObject(TargetComputeSizeInner.class);
        Assertions.assertEquals("ygo", model.id());
        Assertions.assertEquals("kkqfqjbvle", model.name());
        Assertions.assertEquals("fmluiqtqzfavyvn", model.type());
        Assertions.assertEquals("bar", model.properties().name());
        Assertions.assertEquals("uayjkqa", model.properties().friendlyName());
        Assertions.assertEquals(2002865497, model.properties().cpuCoresCount());
        Assertions.assertEquals(51.89952430089579D, model.properties().memoryInGB());
        Assertions.assertEquals(1318524891, model.properties().maxDataDiskCount());
        Assertions.assertEquals(813046030, model.properties().maxNicsCount());
        Assertions.assertEquals("ntiew", model.properties().errors().get(0).message());
        Assertions.assertEquals("cv", model.properties().errors().get(0).severity());
        Assertions.assertEquals("oe", model.properties().highIopsSupported());
        Assertions.assertEquals("ewzcjznmwcp", model.properties().hyperVGenerations().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TargetComputeSizeInner model =
            new TargetComputeSizeInner()
                .withId("ygo")
                .withName("kkqfqjbvle")
                .withType("fmluiqtqzfavyvn")
                .withProperties(
                    new TargetComputeSizeProperties()
                        .withName("bar")
                        .withFriendlyName("uayjkqa")
                        .withCpuCoresCount(2002865497)
                        .withMemoryInGB(51.89952430089579D)
                        .withMaxDataDiskCount(1318524891)
                        .withMaxNicsCount(813046030)
                        .withErrors(
                            Arrays
                                .asList(
                                    new ComputeSizeErrorDetails().withMessage("ntiew").withSeverity("cv"),
                                    new ComputeSizeErrorDetails().withMessage("uwrbehwagoh").withSeverity("f"),
                                    new ComputeSizeErrorDetails().withMessage("mrqemvvhmx").withSeverity("rjfut")))
                        .withHighIopsSupported("oe")
                        .withHyperVGenerations(Arrays.asList("ewzcjznmwcp", "guaadraufactkahz")));
        model = BinaryData.fromObject(model).toObject(TargetComputeSizeInner.class);
        Assertions.assertEquals("ygo", model.id());
        Assertions.assertEquals("kkqfqjbvle", model.name());
        Assertions.assertEquals("fmluiqtqzfavyvn", model.type());
        Assertions.assertEquals("bar", model.properties().name());
        Assertions.assertEquals("uayjkqa", model.properties().friendlyName());
        Assertions.assertEquals(2002865497, model.properties().cpuCoresCount());
        Assertions.assertEquals(51.89952430089579D, model.properties().memoryInGB());
        Assertions.assertEquals(1318524891, model.properties().maxDataDiskCount());
        Assertions.assertEquals(813046030, model.properties().maxNicsCount());
        Assertions.assertEquals("ntiew", model.properties().errors().get(0).message());
        Assertions.assertEquals("cv", model.properties().errors().get(0).severity());
        Assertions.assertEquals("oe", model.properties().highIopsSupported());
        Assertions.assertEquals("ewzcjznmwcp", model.properties().hyperVGenerations().get(0));
    }
}
