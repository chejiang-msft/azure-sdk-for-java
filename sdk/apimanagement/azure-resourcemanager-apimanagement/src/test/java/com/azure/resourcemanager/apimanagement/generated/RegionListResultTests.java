// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.RegionContractInner;
import com.azure.resourcemanager.apimanagement.models.RegionListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RegionListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RegionListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"igi\",\"isMasterRegion\":false,\"isDeleted\":true},{\"name\":\"lkq\",\"isMasterRegion\":true,\"isDeleted\":false},{\"name\":\"nmbzmecuy\",\"isMasterRegion\":true,\"isDeleted\":true}],\"count\":3305169102907443602,\"nextLink\":\"spzvrietvfphmd\"}")
                .toObject(RegionListResult.class);
        Assertions.assertEquals(false, model.value().get(0).isMasterRegion());
        Assertions.assertEquals(true, model.value().get(0).isDeleted());
        Assertions.assertEquals(3305169102907443602L, model.count());
        Assertions.assertEquals("spzvrietvfphmd", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RegionListResult model =
            new RegionListResult()
                .withValue(
                    Arrays
                        .asList(
                            new RegionContractInner().withIsMasterRegion(false).withIsDeleted(true),
                            new RegionContractInner().withIsMasterRegion(true).withIsDeleted(false),
                            new RegionContractInner().withIsMasterRegion(true).withIsDeleted(true)))
                .withCount(3305169102907443602L)
                .withNextLink("spzvrietvfphmd");
        model = BinaryData.fromObject(model).toObject(RegionListResult.class);
        Assertions.assertEquals(false, model.value().get(0).isMasterRegion());
        Assertions.assertEquals(true, model.value().get(0).isDeleted());
        Assertions.assertEquals(3305169102907443602L, model.count());
        Assertions.assertEquals("spzvrietvfphmd", model.nextLink());
    }
}
