// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.iot.deviceupdate.TestData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class DeviceManagementListBestUpdatesForDeviceClassSubgroupTests extends DeviceUpdateClientTestBase {
    @Test
    public void testDeviceManagementListBestUpdatesForDeviceClassSubgroupTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                deviceManagementClient.getBestUpdatesForDeviceClassSubgroupWithResponse(
                    TestData.DEVICE_GROUP, TestData.DEVICE_CLASS_ID, requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"deviceClassId\":\"deviceClassId\",\"deviceCount\":100,\"groupId\":\"group1\",\"update\":{\"friendlyName\":\"July 2022 Update\",\"updateId\":{\"name\":\"name\",\"provider\":\"provider\",\"version\":\"1.0.0.0\"}}}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
