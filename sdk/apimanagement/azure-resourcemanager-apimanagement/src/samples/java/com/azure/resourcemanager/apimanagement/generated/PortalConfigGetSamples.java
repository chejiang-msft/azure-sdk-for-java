// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/** Samples for PortalConfig Get. */
public final class PortalConfigGetSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2022-08-01/examples/ApiManagementPortalConfig.json
     */
    /**
     * Sample code: ApiManagementPortalConfig.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementPortalConfig(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.portalConfigs().getWithResponse("rg1", "apimService1", "default", com.azure.core.util.Context.NONE);
    }
}
