// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/** Samples for Issue ListByService. */
public final class IssueListByServiceSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2022-08-01/examples/ApiManagementListIssues.json
     */
    /**
     * Sample code: ApiManagementListIssues.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListIssues(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.issues().listByService("rg1", "apimService1", null, null, null, com.azure.core.util.Context.NONE);
    }
}
