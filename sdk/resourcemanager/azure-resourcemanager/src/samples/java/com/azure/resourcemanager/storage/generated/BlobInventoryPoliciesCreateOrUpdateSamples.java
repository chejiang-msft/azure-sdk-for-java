// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

import com.azure.resourcemanager.storage.fluent.models.BlobInventoryPolicyInner;
import com.azure.resourcemanager.storage.models.BlobInventoryCreationTime;
import com.azure.resourcemanager.storage.models.BlobInventoryPolicyDefinition;
import com.azure.resourcemanager.storage.models.BlobInventoryPolicyFilter;
import com.azure.resourcemanager.storage.models.BlobInventoryPolicyName;
import com.azure.resourcemanager.storage.models.BlobInventoryPolicyRule;
import com.azure.resourcemanager.storage.models.BlobInventoryPolicySchema;
import com.azure.resourcemanager.storage.models.Format;
import com.azure.resourcemanager.storage.models.InventoryRuleType;
import com.azure.resourcemanager.storage.models.ObjectType;
import com.azure.resourcemanager.storage.models.Schedule;
import java.util.Arrays;

/** Samples for BlobInventoryPolicies CreateOrUpdate. */
public final class BlobInventoryPoliciesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2023-01-01/examples/StorageAccountSetBlobInventoryPolicyIncludeDeleteAndNewSchemaForNonHnsAccount.json
     */
    /**
     * Sample code: StorageAccountSetBlobInventoryPolicyIncludeDeleteAndNewSchemaForNonHnsAccount.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void storageAccountSetBlobInventoryPolicyIncludeDeleteAndNewSchemaForNonHnsAccount(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .storageAccounts()
            .manager()
            .serviceClient()
            .getBlobInventoryPolicies()
            .createOrUpdateWithResponse(
                "res7687",
                "sto9699",
                BlobInventoryPolicyName.DEFAULT,
                new BlobInventoryPolicyInner()
                    .withPolicy(
                        new BlobInventoryPolicySchema()
                            .withEnabled(true)
                            .withType(InventoryRuleType.INVENTORY)
                            .withRules(
                                Arrays
                                    .asList(
                                        new BlobInventoryPolicyRule()
                                            .withEnabled(true)
                                            .withName("inventoryPolicyRule1")
                                            .withDestination("container1")
                                            .withDefinition(
                                                new BlobInventoryPolicyDefinition()
                                                    .withFilters(
                                                        new BlobInventoryPolicyFilter()
                                                            .withPrefixMatch(
                                                                Arrays.asList("inventoryprefix1", "inventoryprefix2"))
                                                            .withExcludePrefix(
                                                                Arrays.asList("excludeprefix1", "excludeprefix2"))
                                                            .withBlobTypes(
                                                                Arrays.asList("blockBlob", "appendBlob", "pageBlob"))
                                                            .withIncludeBlobVersions(true)
                                                            .withIncludeSnapshots(true)
                                                            .withIncludeDeleted(true))
                                                    .withFormat(Format.CSV)
                                                    .withSchedule(Schedule.DAILY)
                                                    .withObjectType(ObjectType.BLOB)
                                                    .withSchemaFields(
                                                        Arrays
                                                            .asList(
                                                                "Name",
                                                                "Creation-Time",
                                                                "Last-Modified",
                                                                "Content-Length",
                                                                "Content-MD5",
                                                                "BlobType",
                                                                "AccessTier",
                                                                "AccessTierChangeTime",
                                                                "Snapshot",
                                                                "VersionId",
                                                                "IsCurrentVersion",
                                                                "Tags",
                                                                "ContentType",
                                                                "ContentEncoding",
                                                                "ContentLanguage",
                                                                "ContentCRC64",
                                                                "CacheControl",
                                                                "Metadata",
                                                                "Deleted",
                                                                "RemainingRetentionDays"))),
                                        new BlobInventoryPolicyRule()
                                            .withEnabled(true)
                                            .withName("inventoryPolicyRule2")
                                            .withDestination("container2")
                                            .withDefinition(
                                                new BlobInventoryPolicyDefinition()
                                                    .withFormat(Format.PARQUET)
                                                    .withSchedule(Schedule.WEEKLY)
                                                    .withObjectType(ObjectType.CONTAINER)
                                                    .withSchemaFields(
                                                        Arrays
                                                            .asList(
                                                                "Name",
                                                                "Last-Modified",
                                                                "Metadata",
                                                                "LeaseStatus",
                                                                "LeaseState",
                                                                "LeaseDuration",
                                                                "PublicAccess",
                                                                "HasImmutabilityPolicy",
                                                                "HasLegalHold",
                                                                "Etag",
                                                                "DefaultEncryptionScope",
                                                                "DenyEncryptionScopeOverride",
                                                                "ImmutableStorageWithVersioningEnabled",
                                                                "Deleted",
                                                                "Version",
                                                                "DeletedTime",
                                                                "RemainingRetentionDays")))))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2023-01-01/examples/StorageAccountSetBlobInventoryPolicy.json
     */
    /**
     * Sample code: StorageAccountSetBlobInventoryPolicy.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void storageAccountSetBlobInventoryPolicy(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .storageAccounts()
            .manager()
            .serviceClient()
            .getBlobInventoryPolicies()
            .createOrUpdateWithResponse(
                "res7687",
                "sto9699",
                BlobInventoryPolicyName.DEFAULT,
                new BlobInventoryPolicyInner()
                    .withPolicy(
                        new BlobInventoryPolicySchema()
                            .withEnabled(true)
                            .withType(InventoryRuleType.INVENTORY)
                            .withRules(
                                Arrays
                                    .asList(
                                        new BlobInventoryPolicyRule()
                                            .withEnabled(true)
                                            .withName("inventoryPolicyRule1")
                                            .withDestination("container1")
                                            .withDefinition(
                                                new BlobInventoryPolicyDefinition()
                                                    .withFilters(
                                                        new BlobInventoryPolicyFilter()
                                                            .withPrefixMatch(
                                                                Arrays.asList("inventoryprefix1", "inventoryprefix2"))
                                                            .withBlobTypes(
                                                                Arrays.asList("blockBlob", "appendBlob", "pageBlob"))
                                                            .withIncludeBlobVersions(true)
                                                            .withIncludeSnapshots(true)
                                                            .withCreationTime(
                                                                new BlobInventoryCreationTime().withLastNDays(1000)))
                                                    .withFormat(Format.CSV)
                                                    .withSchedule(Schedule.DAILY)
                                                    .withObjectType(ObjectType.BLOB)
                                                    .withSchemaFields(
                                                        Arrays
                                                            .asList(
                                                                "Name",
                                                                "Creation-Time",
                                                                "Last-Modified",
                                                                "Content-Length",
                                                                "Content-MD5",
                                                                "BlobType",
                                                                "AccessTier",
                                                                "AccessTierChangeTime",
                                                                "Snapshot",
                                                                "VersionId",
                                                                "IsCurrentVersion",
                                                                "Metadata"))),
                                        new BlobInventoryPolicyRule()
                                            .withEnabled(true)
                                            .withName("inventoryPolicyRule2")
                                            .withDestination("container2")
                                            .withDefinition(
                                                new BlobInventoryPolicyDefinition()
                                                    .withFormat(Format.PARQUET)
                                                    .withSchedule(Schedule.WEEKLY)
                                                    .withObjectType(ObjectType.CONTAINER)
                                                    .withSchemaFields(
                                                        Arrays
                                                            .asList(
                                                                "Name",
                                                                "Last-Modified",
                                                                "Metadata",
                                                                "LeaseStatus",
                                                                "LeaseState",
                                                                "LeaseDuration",
                                                                "PublicAccess",
                                                                "HasImmutabilityPolicy",
                                                                "HasLegalHold")))))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2023-01-01/examples/StorageAccountSetBlobInventoryPolicyIncludeDeleteAndNewSchemaForHnsAccount.json
     */
    /**
     * Sample code: StorageAccountSetBlobInventoryPolicyIncludeDeleteAndNewSchemaForHnsAccount.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void storageAccountSetBlobInventoryPolicyIncludeDeleteAndNewSchemaForHnsAccount(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .storageAccounts()
            .manager()
            .serviceClient()
            .getBlobInventoryPolicies()
            .createOrUpdateWithResponse(
                "res7687",
                "sto9699",
                BlobInventoryPolicyName.DEFAULT,
                new BlobInventoryPolicyInner()
                    .withPolicy(
                        new BlobInventoryPolicySchema()
                            .withEnabled(true)
                            .withType(InventoryRuleType.INVENTORY)
                            .withRules(
                                Arrays
                                    .asList(
                                        new BlobInventoryPolicyRule()
                                            .withEnabled(true)
                                            .withName("inventoryPolicyRule1")
                                            .withDestination("container1")
                                            .withDefinition(
                                                new BlobInventoryPolicyDefinition()
                                                    .withFilters(
                                                        new BlobInventoryPolicyFilter()
                                                            .withPrefixMatch(
                                                                Arrays.asList("inventoryprefix1", "inventoryprefix2"))
                                                            .withExcludePrefix(
                                                                Arrays.asList("excludeprefix1", "excludeprefix2"))
                                                            .withBlobTypes(
                                                                Arrays.asList("blockBlob", "appendBlob", "pageBlob"))
                                                            .withIncludeBlobVersions(true)
                                                            .withIncludeSnapshots(true)
                                                            .withIncludeDeleted(true))
                                                    .withFormat(Format.CSV)
                                                    .withSchedule(Schedule.DAILY)
                                                    .withObjectType(ObjectType.BLOB)
                                                    .withSchemaFields(
                                                        Arrays
                                                            .asList(
                                                                "Name",
                                                                "Creation-Time",
                                                                "Last-Modified",
                                                                "Content-Length",
                                                                "Content-MD5",
                                                                "BlobType",
                                                                "AccessTier",
                                                                "AccessTierChangeTime",
                                                                "Snapshot",
                                                                "VersionId",
                                                                "IsCurrentVersion",
                                                                "ContentType",
                                                                "ContentEncoding",
                                                                "ContentLanguage",
                                                                "ContentCRC64",
                                                                "CacheControl",
                                                                "Metadata",
                                                                "DeletionId",
                                                                "Deleted",
                                                                "DeletedTime",
                                                                "RemainingRetentionDays"))),
                                        new BlobInventoryPolicyRule()
                                            .withEnabled(true)
                                            .withName("inventoryPolicyRule2")
                                            .withDestination("container2")
                                            .withDefinition(
                                                new BlobInventoryPolicyDefinition()
                                                    .withFormat(Format.PARQUET)
                                                    .withSchedule(Schedule.WEEKLY)
                                                    .withObjectType(ObjectType.CONTAINER)
                                                    .withSchemaFields(
                                                        Arrays
                                                            .asList(
                                                                "Name",
                                                                "Last-Modified",
                                                                "Metadata",
                                                                "LeaseStatus",
                                                                "LeaseState",
                                                                "LeaseDuration",
                                                                "PublicAccess",
                                                                "HasImmutabilityPolicy",
                                                                "HasLegalHold",
                                                                "Etag",
                                                                "DefaultEncryptionScope",
                                                                "DenyEncryptionScopeOverride",
                                                                "ImmutableStorageWithVersioningEnabled",
                                                                "Deleted",
                                                                "Version",
                                                                "DeletedTime",
                                                                "RemainingRetentionDays")))))),
                com.azure.core.util.Context.NONE);
    }
}
