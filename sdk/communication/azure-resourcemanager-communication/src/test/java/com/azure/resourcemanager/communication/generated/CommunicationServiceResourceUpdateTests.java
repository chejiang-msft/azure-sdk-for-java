// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.communication.models.CommunicationServiceResourceUpdate;
import com.azure.resourcemanager.communication.models.ManagedServiceIdentity;
import com.azure.resourcemanager.communication.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.communication.models.UserAssignedIdentity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CommunicationServiceResourceUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CommunicationServiceResourceUpdate model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"linkedDomains\":[\"jvtbvpyss\",\"dnrujqguhmuouqfp\"]},\"identity\":{\"principalId\":\"20621513-db88-4b7f-a7ee-abec1fd88523\",\"tenantId\":\"3ae1224e-91c7-46a3-a17f-686d13f9768b\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"tnwu\":{\"principalId\":\"f3402b40-b15e-4336-9c50-6d601822fea6\",\"clientId\":\"802ef009-31dd-4797-bd29-4abe2b1cb140\"}}},\"tags\":{\"x\":\"a\",\"hr\":\"fizuckyf\"}}")
                .toObject(CommunicationServiceResourceUpdate.class);
        Assertions.assertEquals("a", model.tags().get("x"));
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals("jvtbvpyss", model.linkedDomains().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CommunicationServiceResourceUpdate model =
            new CommunicationServiceResourceUpdate()
                .withTags(mapOf("x", "a", "hr", "fizuckyf"))
                .withIdentity(
                    new ManagedServiceIdentity()
                        .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED)
                        .withUserAssignedIdentities(mapOf("tnwu", new UserAssignedIdentity())))
                .withLinkedDomains(Arrays.asList("jvtbvpyss", "dnrujqguhmuouqfp"));
        model = BinaryData.fromObject(model).toObject(CommunicationServiceResourceUpdate.class);
        Assertions.assertEquals("a", model.tags().get("x"));
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals("jvtbvpyss", model.linkedDomains().get(0));
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
