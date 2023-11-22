// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.iot.deviceupdate.generated;

import com.azure.core.http.rest.PagedIterable;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.iot.deviceupdate.DeviceUpdateClient;
import com.azure.iot.deviceupdate.DeviceUpdateClientBuilder;

public class DeviceUpdateListNames {
    public static void main(String[] args) {
        DeviceUpdateClient deviceUpdateClient
            = new DeviceUpdateClientBuilder().credential(new DefaultAzureCredentialBuilder().build())
                .endpoint("contoso.api.adu.microsoft.com").instanceId("blue").buildClient();
        // BEGIN:com.azure.iot.deviceupdate.generated.listnames.deviceupdatelistnames
        PagedIterable<String> response = deviceUpdateClient.listNames("microsoft");
        // END:com.azure.iot.deviceupdate.generated.listnames.deviceupdatelistnames
    }
}
