// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.models.ManagedIdentity;
import com.azure.resourcemanager.signalr.models.ManagedIdentityType;
import com.azure.resourcemanager.signalr.models.UserAssignedIdentityProperty;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ManagedIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedIdentity model =
            BinaryData
                .fromString(
                    "{\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"ttpkiwkkbnujrywv\":{\"principalId\":\"hixbjxyfwnyl\",\"clientId\":\"ool\"},\"cbihwqk\":{\"principalId\":\"lbfpncurd\",\"clientId\":\"wiithtywub\"},\"ctondz\":{\"principalId\":\"dntwjchrdgo\",\"clientId\":\"xum\"}},\"principalId\":\"uu\",\"tenantId\":\"dlwggytsbwtovv\"}")
                .toObject(ManagedIdentity.class);
        Assertions.assertEquals(ManagedIdentityType.SYSTEM_ASSIGNED, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedIdentity model =
            new ManagedIdentity()
                .withType(ManagedIdentityType.SYSTEM_ASSIGNED)
                .withUserAssignedIdentities(
                    mapOf(
                        "ttpkiwkkbnujrywv",
                        new UserAssignedIdentityProperty(),
                        "cbihwqk",
                        new UserAssignedIdentityProperty(),
                        "ctondz",
                        new UserAssignedIdentityProperty()));
        model = BinaryData.fromObject(model).toObject(ManagedIdentity.class);
        Assertions.assertEquals(ManagedIdentityType.SYSTEM_ASSIGNED, model.type());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
