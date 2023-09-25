// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.AgentDiskDetails;

public final class AgentDiskDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AgentDiskDetails model =
            BinaryData
                .fromString(
                    "{\"diskId\":\"nxakckyw\",\"diskName\":\"x\",\"isOSDisk\":\"abjkdtfohfao\",\"capacityInBytes\":5659515679437313606,\"lunId\":1355433605}")
                .toObject(AgentDiskDetails.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AgentDiskDetails model = new AgentDiskDetails();
        model = BinaryData.fromObject(model).toObject(AgentDiskDetails.class);
    }
}
