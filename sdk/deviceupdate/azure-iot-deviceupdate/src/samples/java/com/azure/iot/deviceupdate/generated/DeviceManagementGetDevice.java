// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.iot.deviceupdate.generated;

import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.iot.deviceupdate.DeviceManagementClient;
import com.azure.iot.deviceupdate.DeviceManagementClientBuilder;
import com.azure.iot.deviceupdate.models.Device;

public class DeviceManagementGetDevice {
    public static void main(String[] args) {
        DeviceManagementClient deviceManagementClient
            = new DeviceManagementClientBuilder().credential(new DefaultAzureCredentialBuilder().build())
                .endpoint("contoso.api.adu.microsoft.com").instanceId("blue").buildClient();
        // BEGIN:com.azure.iot.deviceupdate.generated.getdevice.devicemanagementgetdevice
        Device response = deviceManagementClient.getDevice("deviceId");
        // END:com.azure.iot.deviceupdate.generated.getdevice.devicemanagementgetdevice
    }
}
