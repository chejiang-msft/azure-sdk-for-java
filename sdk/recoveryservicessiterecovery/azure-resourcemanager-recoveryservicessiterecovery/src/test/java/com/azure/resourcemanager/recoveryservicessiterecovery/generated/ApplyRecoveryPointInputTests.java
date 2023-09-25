// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ApplyRecoveryPointInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ApplyRecoveryPointInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ApplyRecoveryPointProviderSpecificInput;
import org.junit.jupiter.api.Assertions;

public final class ApplyRecoveryPointInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplyRecoveryPointInput model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"recoveryPointId\":\"nrojlpijnkr\",\"providerSpecificDetails\":{\"instanceType\":\"ApplyRecoveryPointProviderSpecificInput\"}}}")
                .toObject(ApplyRecoveryPointInput.class);
        Assertions.assertEquals("nrojlpijnkr", model.properties().recoveryPointId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplyRecoveryPointInput model =
            new ApplyRecoveryPointInput()
                .withProperties(
                    new ApplyRecoveryPointInputProperties()
                        .withRecoveryPointId("nrojlpijnkr")
                        .withProviderSpecificDetails(new ApplyRecoveryPointProviderSpecificInput()));
        model = BinaryData.fromObject(model).toObject(ApplyRecoveryPointInput.class);
        Assertions.assertEquals("nrojlpijnkr", model.properties().recoveryPointId());
    }
}
