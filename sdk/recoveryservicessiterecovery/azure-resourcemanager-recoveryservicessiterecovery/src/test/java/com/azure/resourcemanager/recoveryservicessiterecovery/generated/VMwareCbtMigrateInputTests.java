// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.VMwareCbtMigrateInput;
import org.junit.jupiter.api.Assertions;

public final class VMwareCbtMigrateInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VMwareCbtMigrateInput model =
            BinaryData
                .fromString(
                    "{\"instanceType\":\"VMwareCbt\",\"performShutdown\":\"ara\",\"osUpgradeVersion\":\"wuasnjeglhtrx\"}")
                .toObject(VMwareCbtMigrateInput.class);
        Assertions.assertEquals("ara", model.performShutdown());
        Assertions.assertEquals("wuasnjeglhtrx", model.osUpgradeVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VMwareCbtMigrateInput model =
            new VMwareCbtMigrateInput().withPerformShutdown("ara").withOsUpgradeVersion("wuasnjeglhtrx");
        model = BinaryData.fromObject(model).toObject(VMwareCbtMigrateInput.class);
        Assertions.assertEquals("ara", model.performShutdown());
        Assertions.assertEquals("wuasnjeglhtrx", model.osUpgradeVersion());
    }
}
