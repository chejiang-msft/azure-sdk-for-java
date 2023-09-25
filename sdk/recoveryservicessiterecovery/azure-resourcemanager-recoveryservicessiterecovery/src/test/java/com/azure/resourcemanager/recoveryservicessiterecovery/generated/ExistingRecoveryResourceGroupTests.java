// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ExistingRecoveryResourceGroup;
import org.junit.jupiter.api.Assertions;

public final class ExistingRecoveryResourceGroupTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExistingRecoveryResourceGroup model =
            BinaryData
                .fromString("{\"resourceType\":\"Existing\",\"recoveryResourceGroupId\":\"svvoqsbpkflanfk\"}")
                .toObject(ExistingRecoveryResourceGroup.class);
        Assertions.assertEquals("svvoqsbpkflanfk", model.recoveryResourceGroupId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExistingRecoveryResourceGroup model =
            new ExistingRecoveryResourceGroup().withRecoveryResourceGroupId("svvoqsbpkflanfk");
        model = BinaryData.fromObject(model).toObject(ExistingRecoveryResourceGroup.class);
        Assertions.assertEquals("svvoqsbpkflanfk", model.recoveryResourceGroupId());
    }
}
