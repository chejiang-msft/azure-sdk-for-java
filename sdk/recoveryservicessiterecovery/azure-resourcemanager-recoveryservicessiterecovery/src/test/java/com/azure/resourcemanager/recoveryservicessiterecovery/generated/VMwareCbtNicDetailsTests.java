// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.EthernetAddressType;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.VMwareCbtNicDetails;
import org.junit.jupiter.api.Assertions;

public final class VMwareCbtNicDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VMwareCbtNicDetails model =
            BinaryData
                .fromString(
                    "{\"nicId\":\"ylcvwbzmfx\",\"isPrimaryNic\":\"ymfjxl\",\"sourceIPAddress\":\"ywqnpfyd\",\"sourceIPAddressType\":\"Static\",\"sourceNetworkId\":\"cnyxbyx\",\"targetIPAddress\":\"hmqyncgaullfstyy\",\"targetIPAddressType\":\"Dynamic\",\"targetSubnetName\":\"ulmwqgmhmqmiwx\",\"testNetworkId\":\"v\",\"testSubnetName\":\"ucqfgufjnbxwbm\",\"testIPAddress\":\"ukin\",\"testIPAddressType\":\"Dynamic\",\"targetNicName\":\"gde\",\"isSelectedForMigration\":\"kzou\"}")
                .toObject(VMwareCbtNicDetails.class);
        Assertions.assertEquals("ymfjxl", model.isPrimaryNic());
        Assertions.assertEquals("hmqyncgaullfstyy", model.targetIpAddress());
        Assertions.assertEquals(EthernetAddressType.DYNAMIC, model.targetIpAddressType());
        Assertions.assertEquals("ulmwqgmhmqmiwx", model.targetSubnetName());
        Assertions.assertEquals("v", model.testNetworkId());
        Assertions.assertEquals("ucqfgufjnbxwbm", model.testSubnetName());
        Assertions.assertEquals("ukin", model.testIpAddress());
        Assertions.assertEquals(EthernetAddressType.DYNAMIC, model.testIpAddressType());
        Assertions.assertEquals("gde", model.targetNicName());
        Assertions.assertEquals("kzou", model.isSelectedForMigration());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VMwareCbtNicDetails model =
            new VMwareCbtNicDetails()
                .withIsPrimaryNic("ymfjxl")
                .withTargetIpAddress("hmqyncgaullfstyy")
                .withTargetIpAddressType(EthernetAddressType.DYNAMIC)
                .withTargetSubnetName("ulmwqgmhmqmiwx")
                .withTestNetworkId("v")
                .withTestSubnetName("ucqfgufjnbxwbm")
                .withTestIpAddress("ukin")
                .withTestIpAddressType(EthernetAddressType.DYNAMIC)
                .withTargetNicName("gde")
                .withIsSelectedForMigration("kzou");
        model = BinaryData.fromObject(model).toObject(VMwareCbtNicDetails.class);
        Assertions.assertEquals("ymfjxl", model.isPrimaryNic());
        Assertions.assertEquals("hmqyncgaullfstyy", model.targetIpAddress());
        Assertions.assertEquals(EthernetAddressType.DYNAMIC, model.targetIpAddressType());
        Assertions.assertEquals("ulmwqgmhmqmiwx", model.targetSubnetName());
        Assertions.assertEquals("v", model.testNetworkId());
        Assertions.assertEquals("ucqfgufjnbxwbm", model.testSubnetName());
        Assertions.assertEquals("ukin", model.testIpAddress());
        Assertions.assertEquals(EthernetAddressType.DYNAMIC, model.testIpAddressType());
        Assertions.assertEquals("gde", model.targetNicName());
        Assertions.assertEquals("kzou", model.isSelectedForMigration());
    }
}
