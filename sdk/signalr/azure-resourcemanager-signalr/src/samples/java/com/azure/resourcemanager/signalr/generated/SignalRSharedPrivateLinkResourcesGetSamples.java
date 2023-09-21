// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

/** Samples for SignalRSharedPrivateLinkResources Get. */
public final class SignalRSharedPrivateLinkResourcesGetSamples {
    /*
     * x-ms-original-file: specification/signalr/resource-manager/Microsoft.SignalRService/preview/2023-06-01-preview/examples/SignalRSharedPrivateLinkResources_Get.json
     */
    /**
     * Sample code: SignalRSharedPrivateLinkResources_Get.
     *
     * @param manager Entry point to SignalRManager.
     */
    public static void signalRSharedPrivateLinkResourcesGet(com.azure.resourcemanager.signalr.SignalRManager manager) {
        manager
            .signalRSharedPrivateLinkResources()
            .getWithResponse("upstream", "myResourceGroup", "mySignalRService", com.azure.core.util.Context.NONE);
    }
}
