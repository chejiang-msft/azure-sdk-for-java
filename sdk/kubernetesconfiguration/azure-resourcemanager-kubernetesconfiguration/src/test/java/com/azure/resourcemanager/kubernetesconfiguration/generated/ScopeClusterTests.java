// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kubernetesconfiguration.models.ScopeCluster;
import org.junit.jupiter.api.Assertions;

public final class ScopeClusterTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScopeCluster model = BinaryData.fromString("{\"releaseNamespace\":\"rkxvdum\"}").toObject(ScopeCluster.class);
        Assertions.assertEquals("rkxvdum", model.releaseNamespace());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScopeCluster model = new ScopeCluster().withReleaseNamespace("rkxvdum");
        model = BinaryData.fromObject(model).toObject(ScopeCluster.class);
        Assertions.assertEquals("rkxvdum", model.releaseNamespace());
    }
}
