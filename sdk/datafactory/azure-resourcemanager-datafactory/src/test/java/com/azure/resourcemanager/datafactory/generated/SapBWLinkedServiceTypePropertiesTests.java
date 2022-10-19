// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.SapBWLinkedServiceTypeProperties;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import org.junit.jupiter.api.Test;

public final class SapBWLinkedServiceTypePropertiesTests {
    @Test
    public void testDeserialize() {
        SapBWLinkedServiceTypeProperties model =
            BinaryData
                .fromString("{\"password\":{\"type\":\"SecretBase\"}}")
                .toObject(SapBWLinkedServiceTypeProperties.class);
    }

    @Test
    public void testSerialize() {
        SapBWLinkedServiceTypeProperties model = new SapBWLinkedServiceTypeProperties().withPassword(new SecretBase());
        model = BinaryData.fromObject(model).toObject(SapBWLinkedServiceTypeProperties.class);
    }
}