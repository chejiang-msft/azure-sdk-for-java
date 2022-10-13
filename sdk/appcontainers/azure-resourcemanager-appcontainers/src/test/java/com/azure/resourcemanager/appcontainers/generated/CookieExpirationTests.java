// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.CookieExpiration;
import com.azure.resourcemanager.appcontainers.models.CookieExpirationConvention;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CookieExpirationTests {
    @Test
    public void testDeserialize() {
        CookieExpiration model =
            BinaryData
                .fromString("{\"convention\":\"IdentityProviderDerived\",\"timeToExpiration\":\"cftadeh\"}")
                .toObject(CookieExpiration.class);
        Assertions.assertEquals(CookieExpirationConvention.IDENTITY_PROVIDER_DERIVED, model.convention());
        Assertions.assertEquals("cftadeh", model.timeToExpiration());
    }

    @Test
    public void testSerialize() {
        CookieExpiration model =
            new CookieExpiration()
                .withConvention(CookieExpirationConvention.IDENTITY_PROVIDER_DERIVED)
                .withTimeToExpiration("cftadeh");
        model = BinaryData.fromObject(model).toObject(CookieExpiration.class);
        Assertions.assertEquals(CookieExpirationConvention.IDENTITY_PROVIDER_DERIVED, model.convention());
        Assertions.assertEquals("cftadeh", model.timeToExpiration());
    }
}