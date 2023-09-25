// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.CreateProtectionIntentProviderSpecificDetails;

public final class CreateProtectionIntentProviderSpecificDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CreateProtectionIntentProviderSpecificDetails model =
            BinaryData
                .fromString("{\"instanceType\":\"CreateProtectionIntentProviderSpecificDetails\"}")
                .toObject(CreateProtectionIntentProviderSpecificDetails.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CreateProtectionIntentProviderSpecificDetails model = new CreateProtectionIntentProviderSpecificDetails();
        model = BinaryData.fromObject(model).toObject(CreateProtectionIntentProviderSpecificDetails.class);
    }
}
