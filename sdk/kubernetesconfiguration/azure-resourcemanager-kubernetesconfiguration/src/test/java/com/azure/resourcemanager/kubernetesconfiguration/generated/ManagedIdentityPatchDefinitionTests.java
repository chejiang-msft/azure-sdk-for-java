// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kubernetesconfiguration.models.ManagedIdentityPatchDefinition;
import org.junit.jupiter.api.Assertions;

public final class ManagedIdentityPatchDefinitionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedIdentityPatchDefinition model =
            BinaryData.fromString("{\"clientId\":\"ljyoxgvcltb\"}").toObject(ManagedIdentityPatchDefinition.class);
        Assertions.assertEquals("ljyoxgvcltb", model.clientId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedIdentityPatchDefinition model = new ManagedIdentityPatchDefinition().withClientId("ljyoxgvcltb");
        model = BinaryData.fromObject(model).toObject(ManagedIdentityPatchDefinition.class);
        Assertions.assertEquals("ljyoxgvcltb", model.clientId());
    }
}
