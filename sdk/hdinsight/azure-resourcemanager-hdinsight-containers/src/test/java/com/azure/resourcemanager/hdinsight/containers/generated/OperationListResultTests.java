// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.OperationListResult;

public final class OperationListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"qztpp\",\"isDataAction\":false,\"display\":{\"provider\":\"or\",\"resource\":\"lt\",\"operation\":\"mncwsobqwcsdb\",\"description\":\"dcfhucqdpf\"},\"origin\":\"system\",\"actionType\":\"Internal\"},{\"name\":\"jjcanvxbvtv\",\"isDataAction\":false,\"display\":{\"provider\":\"cormr\",\"resource\":\"qtvcofudflvkgj\",\"operation\":\"gdknnqv\",\"description\":\"znqntoru\"},\"origin\":\"user,system\",\"actionType\":\"Internal\"},{\"name\":\"mkycgra\",\"isDataAction\":true,\"display\":{\"provider\":\"taeburuvdm\",\"resource\":\"s\",\"operation\":\"l\",\"description\":\"ab\"},\"origin\":\"user\",\"actionType\":\"Internal\"}],\"nextLink\":\"ifrvtpu\"}")
                .toObject(OperationListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationListResult model = new OperationListResult();
        model = BinaryData.fromObject(model).toObject(OperationListResult.class);
    }
}
