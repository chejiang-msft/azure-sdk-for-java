// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.TargetComputeSizeInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ComputeSizeErrorDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TargetComputeSizeCollection;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TargetComputeSizeProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class TargetComputeSizeCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TargetComputeSizeCollection model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"id\":\"g\",\"name\":\"pnfqntcyp\",\"type\":\"jv\",\"properties\":{\"name\":\"mwks\",\"friendlyName\":\"rcizjxvyd\",\"cpuCoresCount\":1161175344,\"vCPUsAvailable\":1238865212,\"memoryInGB\":62.392147891228966,\"maxDataDiskCount\":733359450,\"maxNicsCount\":788840144,\"errors\":[{\"message\":\"umrtwnawjsl\",\"severity\":\"wkojgcyztsfmzn\"},{\"message\":\"eqphchqnrnr\",\"severity\":\"ehuwrykqgaifmvik\"},{\"message\":\"ydv\",\"severity\":\"bejdznxcv\"},{\"message\":\"rhnj\",\"severity\":\"olvtnovqfzge\"}],\"highIopsSupported\":\"dftuljltduce\",\"hyperVGenerations\":[\"mczuo\",\"ejwcwwqiok\",\"ssxmojms\",\"p\"]}},{\"id\":\"prvkwcfzqljyxgtc\",\"name\":\"eydbsd\",\"type\":\"m\",\"properties\":{\"name\":\"aehvbbxuri\",\"friendlyName\":\"tfnhtbaxkgxywr\",\"cpuCoresCount\":1619197472,\"vCPUsAvailable\":479149992,\"memoryInGB\":98.67117973109978,\"maxDataDiskCount\":309006078,\"maxNicsCount\":1167250360,\"errors\":[{\"message\":\"ruud\",\"severity\":\"zibt\"},{\"message\":\"stgktst\",\"severity\":\"xeclzedqbcvhzlhp\"}],\"highIopsSupported\":\"dqkdlwwqfbu\",\"hyperVGenerations\":[\"xtrqjfs\",\"lmbtxhwgfwsrt\"]}}],\"nextLink\":\"coezbrhubskh\"}")
                .toObject(TargetComputeSizeCollection.class);
        Assertions.assertEquals("g", model.value().get(0).id());
        Assertions.assertEquals("pnfqntcyp", model.value().get(0).name());
        Assertions.assertEquals("jv", model.value().get(0).type());
        Assertions.assertEquals("mwks", model.value().get(0).properties().name());
        Assertions.assertEquals("rcizjxvyd", model.value().get(0).properties().friendlyName());
        Assertions.assertEquals(1161175344, model.value().get(0).properties().cpuCoresCount());
        Assertions.assertEquals(62.392147891228966D, model.value().get(0).properties().memoryInGB());
        Assertions.assertEquals(733359450, model.value().get(0).properties().maxDataDiskCount());
        Assertions.assertEquals(788840144, model.value().get(0).properties().maxNicsCount());
        Assertions.assertEquals("umrtwnawjsl", model.value().get(0).properties().errors().get(0).message());
        Assertions.assertEquals("wkojgcyztsfmzn", model.value().get(0).properties().errors().get(0).severity());
        Assertions.assertEquals("dftuljltduce", model.value().get(0).properties().highIopsSupported());
        Assertions.assertEquals("mczuo", model.value().get(0).properties().hyperVGenerations().get(0));
        Assertions.assertEquals("coezbrhubskh", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TargetComputeSizeCollection model =
            new TargetComputeSizeCollection()
                .withValue(
                    Arrays
                        .asList(
                            new TargetComputeSizeInner()
                                .withId("g")
                                .withName("pnfqntcyp")
                                .withType("jv")
                                .withProperties(
                                    new TargetComputeSizeProperties()
                                        .withName("mwks")
                                        .withFriendlyName("rcizjxvyd")
                                        .withCpuCoresCount(1161175344)
                                        .withMemoryInGB(62.392147891228966D)
                                        .withMaxDataDiskCount(733359450)
                                        .withMaxNicsCount(788840144)
                                        .withErrors(
                                            Arrays
                                                .asList(
                                                    new ComputeSizeErrorDetails()
                                                        .withMessage("umrtwnawjsl")
                                                        .withSeverity("wkojgcyztsfmzn"),
                                                    new ComputeSizeErrorDetails()
                                                        .withMessage("eqphchqnrnr")
                                                        .withSeverity("ehuwrykqgaifmvik"),
                                                    new ComputeSizeErrorDetails()
                                                        .withMessage("ydv")
                                                        .withSeverity("bejdznxcv"),
                                                    new ComputeSizeErrorDetails()
                                                        .withMessage("rhnj")
                                                        .withSeverity("olvtnovqfzge")))
                                        .withHighIopsSupported("dftuljltduce")
                                        .withHyperVGenerations(Arrays.asList("mczuo", "ejwcwwqiok", "ssxmojms", "p"))),
                            new TargetComputeSizeInner()
                                .withId("prvkwcfzqljyxgtc")
                                .withName("eydbsd")
                                .withType("m")
                                .withProperties(
                                    new TargetComputeSizeProperties()
                                        .withName("aehvbbxuri")
                                        .withFriendlyName("tfnhtbaxkgxywr")
                                        .withCpuCoresCount(1619197472)
                                        .withMemoryInGB(98.67117973109978D)
                                        .withMaxDataDiskCount(309006078)
                                        .withMaxNicsCount(1167250360)
                                        .withErrors(
                                            Arrays
                                                .asList(
                                                    new ComputeSizeErrorDetails()
                                                        .withMessage("ruud")
                                                        .withSeverity("zibt"),
                                                    new ComputeSizeErrorDetails()
                                                        .withMessage("stgktst")
                                                        .withSeverity("xeclzedqbcvhzlhp")))
                                        .withHighIopsSupported("dqkdlwwqfbu")
                                        .withHyperVGenerations(Arrays.asList("xtrqjfs", "lmbtxhwgfwsrt")))))
                .withNextLink("coezbrhubskh");
        model = BinaryData.fromObject(model).toObject(TargetComputeSizeCollection.class);
        Assertions.assertEquals("g", model.value().get(0).id());
        Assertions.assertEquals("pnfqntcyp", model.value().get(0).name());
        Assertions.assertEquals("jv", model.value().get(0).type());
        Assertions.assertEquals("mwks", model.value().get(0).properties().name());
        Assertions.assertEquals("rcizjxvyd", model.value().get(0).properties().friendlyName());
        Assertions.assertEquals(1161175344, model.value().get(0).properties().cpuCoresCount());
        Assertions.assertEquals(62.392147891228966D, model.value().get(0).properties().memoryInGB());
        Assertions.assertEquals(733359450, model.value().get(0).properties().maxDataDiskCount());
        Assertions.assertEquals(788840144, model.value().get(0).properties().maxNicsCount());
        Assertions.assertEquals("umrtwnawjsl", model.value().get(0).properties().errors().get(0).message());
        Assertions.assertEquals("wkojgcyztsfmzn", model.value().get(0).properties().errors().get(0).severity());
        Assertions.assertEquals("dftuljltduce", model.value().get(0).properties().highIopsSupported());
        Assertions.assertEquals("mczuo", model.value().get(0).properties().hyperVGenerations().get(0));
        Assertions.assertEquals("coezbrhubskh", model.nextLink());
    }
}
