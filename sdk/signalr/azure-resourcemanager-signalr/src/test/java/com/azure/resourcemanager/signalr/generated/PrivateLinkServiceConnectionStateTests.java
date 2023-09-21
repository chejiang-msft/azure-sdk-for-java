// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.signalr.models.PrivateLinkServiceConnectionStatus;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkServiceConnectionStateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkServiceConnectionState model =
            BinaryData
                .fromString(
                    "{\"status\":\"Rejected\",\"description\":\"tlhflsjcdhszf\",\"actionsRequired\":\"fbgofeljagrqmqh\"}")
                .toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.REJECTED, model.status());
        Assertions.assertEquals("tlhflsjcdhszf", model.description());
        Assertions.assertEquals("fbgofeljagrqmqh", model.actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkServiceConnectionState model =
            new PrivateLinkServiceConnectionState()
                .withStatus(PrivateLinkServiceConnectionStatus.REJECTED)
                .withDescription("tlhflsjcdhszf")
                .withActionsRequired("fbgofeljagrqmqh");
        model = BinaryData.fromObject(model).toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.REJECTED, model.status());
        Assertions.assertEquals("tlhflsjcdhszf", model.description());
        Assertions.assertEquals("fbgofeljagrqmqh", model.actionsRequired());
    }
}
