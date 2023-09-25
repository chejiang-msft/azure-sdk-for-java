// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.PauseReplicationInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.PauseReplicationInputProperties;
import org.junit.jupiter.api.Assertions;

public final class PauseReplicationInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PauseReplicationInput model =
            BinaryData
                .fromString("{\"properties\":{\"instanceType\":\"waboe\"}}")
                .toObject(PauseReplicationInput.class);
        Assertions.assertEquals("waboe", model.properties().instanceType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PauseReplicationInput model =
            new PauseReplicationInput().withProperties(new PauseReplicationInputProperties().withInstanceType("waboe"));
        model = BinaryData.fromObject(model).toObject(PauseReplicationInput.class);
        Assertions.assertEquals("waboe", model.properties().instanceType());
    }
}
