// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CouchbaseSource;
import org.junit.jupiter.api.Test;

public final class CouchbaseSourceTests {
    @Test
    public void testDeserialize() {
        CouchbaseSource model =
            BinaryData.fromString("{\"type\":\"CouchbaseSource\",\"\":{}}").toObject(CouchbaseSource.class);
    }

    @Test
    public void testSerialize() {
        CouchbaseSource model = new CouchbaseSource();
        model = BinaryData.fromObject(model).toObject(CouchbaseSource.class);
    }
}