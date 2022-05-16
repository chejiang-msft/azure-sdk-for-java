// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ResourceGuardProxyBaseResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.ResourceGuardProxyBase;
import com.azure.resourcemanager.recoveryservicesbackup.models.ResourceGuardProxyBaseResource;
import com.azure.resourcemanager.recoveryservicesbackup.models.UnlockDeleteRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.UnlockDeleteResponse;
import java.util.Collections;
import java.util.Map;

public final class ResourceGuardProxyBaseResourceImpl
    implements ResourceGuardProxyBaseResource,
        ResourceGuardProxyBaseResource.Definition,
        ResourceGuardProxyBaseResource.Update {
    private ResourceGuardProxyBaseResourceInner innerObject;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ResourceGuardProxyBase properties() {
        return this.innerModel().properties();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ResourceGuardProxyBaseResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }

    private String vaultName;

    private String resourceGroupName;

    private String resourceGuardProxyName;

    public ResourceGuardProxyBaseResourceImpl withExistingVault(String vaultName, String resourceGroupName) {
        this.vaultName = vaultName;
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ResourceGuardProxyBaseResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getResourceGuardProxyOperations()
                .putWithResponse(vaultName, resourceGroupName, resourceGuardProxyName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ResourceGuardProxyBaseResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getResourceGuardProxyOperations()
                .putWithResponse(vaultName, resourceGroupName, resourceGuardProxyName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ResourceGuardProxyBaseResourceImpl(
        String name, com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerObject = new ResourceGuardProxyBaseResourceInner();
        this.serviceManager = serviceManager;
        this.resourceGuardProxyName = name;
    }

    public ResourceGuardProxyBaseResourceImpl update() {
        return this;
    }

    public ResourceGuardProxyBaseResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getResourceGuardProxyOperations()
                .putWithResponse(vaultName, resourceGroupName, resourceGuardProxyName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ResourceGuardProxyBaseResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getResourceGuardProxyOperations()
                .putWithResponse(vaultName, resourceGroupName, resourceGuardProxyName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ResourceGuardProxyBaseResourceImpl(
        ResourceGuardProxyBaseResourceInner innerObject,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.vaultName = Utils.getValueFromIdByName(innerObject.id(), "vaults");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourceGuardProxyName = Utils.getValueFromIdByName(innerObject.id(), "backupResourceGuardProxies");
    }

    public ResourceGuardProxyBaseResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getResourceGuardProxyOperations()
                .getWithResponse(vaultName, resourceGroupName, resourceGuardProxyName, Context.NONE)
                .getValue();
        return this;
    }

    public ResourceGuardProxyBaseResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getResourceGuardProxyOperations()
                .getWithResponse(vaultName, resourceGroupName, resourceGuardProxyName, context)
                .getValue();
        return this;
    }

    public UnlockDeleteResponse unlockDelete(UnlockDeleteRequest parameters) {
        return serviceManager
            .resourceGuardProxyOperations()
            .unlockDelete(vaultName, resourceGroupName, resourceGuardProxyName, parameters);
    }

    public Response<UnlockDeleteResponse> unlockDeleteWithResponse(UnlockDeleteRequest parameters, Context context) {
        return serviceManager
            .resourceGuardProxyOperations()
            .unlockDeleteWithResponse(vaultName, resourceGroupName, resourceGuardProxyName, parameters, context);
    }

    public ResourceGuardProxyBaseResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ResourceGuardProxyBaseResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ResourceGuardProxyBaseResourceImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public ResourceGuardProxyBaseResourceImpl withProperties(ResourceGuardProxyBase properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public ResourceGuardProxyBaseResourceImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }
}
