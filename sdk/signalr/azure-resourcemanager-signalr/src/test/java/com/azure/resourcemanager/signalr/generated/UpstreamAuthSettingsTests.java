// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.models.ManagedIdentitySettings;
import com.azure.resourcemanager.signalr.models.UpstreamAuthSettings;
import com.azure.resourcemanager.signalr.models.UpstreamAuthType;
import org.junit.jupiter.api.Assertions;

public final class UpstreamAuthSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpstreamAuthSettings model =
            BinaryData
                .fromString("{\"type\":\"ManagedIdentity\",\"managedIdentity\":{\"resource\":\"envrkpyouaibrebq\"}}")
                .toObject(UpstreamAuthSettings.class);
        Assertions.assertEquals(UpstreamAuthType.MANAGED_IDENTITY, model.type());
        Assertions.assertEquals("envrkpyouaibrebq", model.managedIdentity().resource());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpstreamAuthSettings model =
            new UpstreamAuthSettings()
                .withType(UpstreamAuthType.MANAGED_IDENTITY)
                .withManagedIdentity(new ManagedIdentitySettings().withResource("envrkpyouaibrebq"));
        model = BinaryData.fromObject(model).toObject(UpstreamAuthSettings.class);
        Assertions.assertEquals(UpstreamAuthType.MANAGED_IDENTITY, model.type());
        Assertions.assertEquals("envrkpyouaibrebq", model.managedIdentity().resource());
    }
}
