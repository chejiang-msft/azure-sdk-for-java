// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageRcmEventDetails;

public final class InMageRcmEventDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InMageRcmEventDetails model =
            BinaryData
                .fromString(
                    "{\"instanceType\":\"InMageRcm\",\"protectedItemName\":\"wcnxtpzdlyseid\",\"vmName\":\"akatprytg\",\"latestAgentVersion\":\"zbqfdpfawrptvcsh\",\"jobId\":\"utzcttbqgdirda\",\"fabricName\":\"tzjgcfjfxtbwj\",\"applianceName\":\"rmuydgfttmdofg\",\"serverType\":\"agfuoftnxod\",\"componentDisplayName\":\"m\"}")
                .toObject(InMageRcmEventDetails.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InMageRcmEventDetails model = new InMageRcmEventDetails();
        model = BinaryData.fromObject(model).toObject(InMageRcmEventDetails.class);
    }
}
