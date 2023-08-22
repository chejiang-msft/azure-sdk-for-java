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

public final class DeviceUpdateListUpdatesTests extends DeviceUpdateClientTestBase {
    @Test
    @Disabled
    public void testDeviceUpdateListUpdatesTests() {
        RequestOptions requestOptions = new RequestOptions();
        PagedIterable<BinaryData> response = deviceUpdateClient.listUpdates(requestOptions);
        Assertions.assertEquals(200, response.iterableByPage().iterator().next().getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"description\":\"Example update.\",\"compatibility\":[{\"deviceManufacturer\":\"Microsoft\",\"deviceModel\":\"Toaster\"}],\"createdDateTime\":\"2019-09-12T00:00:00.0000000+00:00\",\"etag\":\"\\\"3fed3378-0c67-47d2-b796-296962c66cbb\\\"\",\"importedDateTime\":\"2020-04-22T21:01:43.8408797+00:00\",\"instructions\":{\"steps\":[{\"description\":\"pre-install script\",\"files\":[\"configure.sh\"],\"handler\":\"microsoft/script:1\",\"handlerProperties\":{\"arguments\":\"--pre-install\"}},{\"type\":\"reference\",\"updateId\":{\"name\":\"sensor\",\"provider\":\"microsoft\",\"version\":\"1.0\"}}]},\"manifestVersion\":\"5.0\",\"updateId\":{\"name\":\"adu\",\"provider\":\"microsoft\",\"version\":\"1.0.0.0\"}}")
                        .toObject(Object.class),
                response.iterator().next().toObject(Object.class));
    }
}
