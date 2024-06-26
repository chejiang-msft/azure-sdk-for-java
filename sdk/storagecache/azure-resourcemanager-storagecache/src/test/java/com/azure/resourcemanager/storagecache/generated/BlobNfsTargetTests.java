// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.models.BlobNfsTarget;
import org.junit.jupiter.api.Assertions;

public final class BlobNfsTargetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BlobNfsTarget model = BinaryData
            .fromString(
                "{\"target\":\"c\",\"usageModel\":\"df\",\"verificationTimer\":125087632,\"writeBackTimer\":221603697}")
            .toObject(BlobNfsTarget.class);
        Assertions.assertEquals("c", model.target());
        Assertions.assertEquals("df", model.usageModel());
        Assertions.assertEquals(125087632, model.verificationTimer());
        Assertions.assertEquals(221603697, model.writeBackTimer());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BlobNfsTarget model = new BlobNfsTarget().withTarget("c").withUsageModel("df").withVerificationTimer(125087632)
            .withWriteBackTimer(221603697);
        model = BinaryData.fromObject(model).toObject(BlobNfsTarget.class);
        Assertions.assertEquals("c", model.target());
        Assertions.assertEquals("df", model.usageModel());
        Assertions.assertEquals(125087632, model.verificationTimer());
        Assertions.assertEquals(221603697, model.writeBackTimer());
    }
}
