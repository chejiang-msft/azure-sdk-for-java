// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TestMigrateInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TestMigrateProviderSpecificInput;

public final class TestMigrateInputPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TestMigrateInputProperties model = BinaryData
            .fromString("{\"providerSpecificDetails\":{\"instanceType\":\"TestMigrateProviderSpecificInput\"}}")
            .toObject(TestMigrateInputProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TestMigrateInputProperties model
            = new TestMigrateInputProperties().withProviderSpecificDetails(new TestMigrateProviderSpecificInput());
        model = BinaryData.fromObject(model).toObject(TestMigrateInputProperties.class);
    }
}
