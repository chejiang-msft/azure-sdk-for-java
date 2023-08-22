// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class DeviceManagementGetGroupUpdateComplianceTests extends DeviceUpdateClientTestBase {
    @Test
    @Disabled
    public void testDeviceManagementGetGroupUpdateComplianceTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                deviceManagementClient.getDeviceClassSubgroupWithResponse("group1", "deviceClassId", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"createdDateTime\":\"2020-07-01T12:13:14.0000000Z\",\"deploymentId\":\"MyDeployment\",\"deviceClassId\":\"DeviceClassId\",\"deviceCount\":149,\"groupId\":\"group1\"}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
