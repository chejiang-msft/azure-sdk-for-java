// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.apimanagement.fluent.ApiExportsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.ApiExportResultInner;
import com.azure.resourcemanager.apimanagement.models.ExportApi;
import com.azure.resourcemanager.apimanagement.models.ExportFormat;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ApiExportsClient. */
public final class ApiExportsClientImpl implements ApiExportsClient {
    /** The proxy service used to perform REST calls. */
    private final ApiExportsService service;

    /** The service client containing this operation class. */
    private final ApiManagementClientImpl client;

    /**
     * Initializes an instance of ApiExportsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ApiExportsClientImpl(ApiManagementClientImpl client) {
        this.service =
            RestProxy.create(ApiExportsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ApiManagementClientApiExports to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ApiManagementClientA")
    public interface ApiExportsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/apis/{apiId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ApiExportResultInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serviceName") String serviceName,
            @PathParam("apiId") String apiId,
            @QueryParam("format") ExportFormat format,
            @QueryParam("export") ExportApi export,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the details of the API specified by its identifier in the format specified to the Storage Blob with SAS Key
     * valid for 5 minutes.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param format Format in which to export the Api Details to the Storage Blob with Sas Key valid for 5 minutes.
     * @param export Query parameter required to export the API details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the API specified by its identifier in the format specified to the Storage Blob with SAS
     *     Key valid for 5 minutes along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ApiExportResultInner>> getWithResponseAsync(
        String resourceGroupName, String serviceName, String apiId, ExportFormat format, ExportApi export) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (apiId == null) {
            return Mono.error(new IllegalArgumentException("Parameter apiId is required and cannot be null."));
        }
        if (format == null) {
            return Mono.error(new IllegalArgumentException("Parameter format is required and cannot be null."));
        }
        if (export == null) {
            return Mono.error(new IllegalArgumentException("Parameter export is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serviceName,
                            apiId,
                            format,
                            export,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the details of the API specified by its identifier in the format specified to the Storage Blob with SAS Key
     * valid for 5 minutes.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param format Format in which to export the Api Details to the Storage Blob with Sas Key valid for 5 minutes.
     * @param export Query parameter required to export the API details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the API specified by its identifier in the format specified to the Storage Blob with SAS
     *     Key valid for 5 minutes along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ApiExportResultInner>> getWithResponseAsync(
        String resourceGroupName,
        String serviceName,
        String apiId,
        ExportFormat format,
        ExportApi export,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (apiId == null) {
            return Mono.error(new IllegalArgumentException("Parameter apiId is required and cannot be null."));
        }
        if (format == null) {
            return Mono.error(new IllegalArgumentException("Parameter format is required and cannot be null."));
        }
        if (export == null) {
            return Mono.error(new IllegalArgumentException("Parameter export is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                resourceGroupName,
                serviceName,
                apiId,
                format,
                export,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Gets the details of the API specified by its identifier in the format specified to the Storage Blob with SAS Key
     * valid for 5 minutes.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param format Format in which to export the Api Details to the Storage Blob with Sas Key valid for 5 minutes.
     * @param export Query parameter required to export the API details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the API specified by its identifier in the format specified to the Storage Blob with SAS
     *     Key valid for 5 minutes on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ApiExportResultInner> getAsync(
        String resourceGroupName, String serviceName, String apiId, ExportFormat format, ExportApi export) {
        return getWithResponseAsync(resourceGroupName, serviceName, apiId, format, export)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the details of the API specified by its identifier in the format specified to the Storage Blob with SAS Key
     * valid for 5 minutes.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param format Format in which to export the Api Details to the Storage Blob with Sas Key valid for 5 minutes.
     * @param export Query parameter required to export the API details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the API specified by its identifier in the format specified to the Storage Blob with SAS
     *     Key valid for 5 minutes along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApiExportResultInner> getWithResponse(
        String resourceGroupName,
        String serviceName,
        String apiId,
        ExportFormat format,
        ExportApi export,
        Context context) {
        return getWithResponseAsync(resourceGroupName, serviceName, apiId, format, export, context).block();
    }

    /**
     * Gets the details of the API specified by its identifier in the format specified to the Storage Blob with SAS Key
     * valid for 5 minutes.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param format Format in which to export the Api Details to the Storage Blob with Sas Key valid for 5 minutes.
     * @param export Query parameter required to export the API details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the API specified by its identifier in the format specified to the Storage Blob with SAS
     *     Key valid for 5 minutes.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiExportResultInner get(
        String resourceGroupName, String serviceName, String apiId, ExportFormat format, ExportApi export) {
        return getWithResponse(resourceGroupName, serviceName, apiId, format, export, Context.NONE).getValue();
    }
}
