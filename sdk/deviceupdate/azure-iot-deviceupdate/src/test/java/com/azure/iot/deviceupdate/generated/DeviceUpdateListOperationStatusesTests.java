// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate.generated;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class DeviceUpdateListOperationStatusesTests extends DeviceUpdateClientTestBase {
    @Test
    @Disabled
    public void testDeviceUpdateListOperationStatusesTests() {
        RequestOptions requestOptions = new RequestOptions();
        PagedIterable<BinaryData> response = deviceUpdateClient.listOperationStatuses(requestOptions);
        Assertions.assertEquals(200, response.iterableByPage().iterator().next().getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"operationId\":\"e4491c54-916f-443d-9094-bcca546ace2f\",\"createdDateTime\":\"2020-04-22T21:00:53.2548897+00:00\",\"etag\":\"\\\"a0f7b6f2-3f6c-4eb6-8a59-2f5411c23888\\\"\",\"lastActionDateTime\":\"2020-04-22T21:01:43.9401420+00:00\",\"resourceLocation\":\"/deviceUpdate/blue/updates/providers/microsoft/names/adu/versions/1.0.0.0?api-version=2022-10-01\",\"status\":\"Succeeded\",\"traceId\":\"2b881ef9deaf5d45b0a716ca5b4145ec\",\"update\":{\"friendlyName\":\"Microsoft ADU v1\",\"updateId\":{\"name\":\"adu\",\"provider\":\"microsoft\",\"version\":\"1.0.0.0\"}}}")
                        .toObject(Object.class),
                response.iterator().next().toObject(Object.class));
    }
}
