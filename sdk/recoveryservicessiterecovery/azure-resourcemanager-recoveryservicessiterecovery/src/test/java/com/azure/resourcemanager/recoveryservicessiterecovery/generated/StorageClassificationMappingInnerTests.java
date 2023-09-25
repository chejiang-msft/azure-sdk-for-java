// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.StorageClassificationMappingInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.StorageClassificationMappingProperties;
import org.junit.jupiter.api.Assertions;

public final class StorageClassificationMappingInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageClassificationMappingInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"targetStorageClassificationId\":\"cf\"},\"location\":\"rxgkne\",\"id\":\"vyi\",\"name\":\"zqodfvpgshox\",\"type\":\"sgbpfgzdjtx\"}")
                .toObject(StorageClassificationMappingInner.class);
        Assertions.assertEquals("cf", model.properties().targetStorageClassificationId());
        Assertions.assertEquals("rxgkne", model.location());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageClassificationMappingInner model =
            new StorageClassificationMappingInner()
                .withProperties(new StorageClassificationMappingProperties().withTargetStorageClassificationId("cf"))
                .withLocation("rxgkne");
        model = BinaryData.fromObject(model).toObject(StorageClassificationMappingInner.class);
        Assertions.assertEquals("cf", model.properties().targetStorageClassificationId());
        Assertions.assertEquals("rxgkne", model.location());
    }
}
