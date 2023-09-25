// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.A2ATestFailoverInput;
import org.junit.jupiter.api.Assertions;

public final class A2ATestFailoverInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        A2ATestFailoverInput model =
            BinaryData
                .fromString(
                    "{\"instanceType\":\"A2A\",\"recoveryPointId\":\"omeikjcl\",\"cloudServiceCreationOption\":\"acnmwpfsuqtaaz\"}")
                .toObject(A2ATestFailoverInput.class);
        Assertions.assertEquals("omeikjcl", model.recoveryPointId());
        Assertions.assertEquals("acnmwpfsuqtaaz", model.cloudServiceCreationOption());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        A2ATestFailoverInput model =
            new A2ATestFailoverInput().withRecoveryPointId("omeikjcl").withCloudServiceCreationOption("acnmwpfsuqtaaz");
        model = BinaryData.fromObject(model).toObject(A2ATestFailoverInput.class);
        Assertions.assertEquals("omeikjcl", model.recoveryPointId());
        Assertions.assertEquals("acnmwpfsuqtaaz", model.cloudServiceCreationOption());
    }
}
