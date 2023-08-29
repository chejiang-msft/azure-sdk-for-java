// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.AuthorizationLoginResponseContractInner;
import org.junit.jupiter.api.Assertions;

public final class AuthorizationLoginResponseContractInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AuthorizationLoginResponseContractInner model =
            BinaryData.fromString("{\"loginLink\":\"dt\"}").toObject(AuthorizationLoginResponseContractInner.class);
        Assertions.assertEquals("dt", model.loginLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AuthorizationLoginResponseContractInner model =
            new AuthorizationLoginResponseContractInner().withLoginLink("dt");
        model = BinaryData.fromObject(model).toObject(AuthorizationLoginResponseContractInner.class);
        Assertions.assertEquals("dt", model.loginLink());
    }
}
