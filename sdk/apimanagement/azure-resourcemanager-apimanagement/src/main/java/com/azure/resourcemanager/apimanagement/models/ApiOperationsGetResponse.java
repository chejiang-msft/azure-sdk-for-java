// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.apimanagement.fluent.models.OperationContractInner;

/** Contains all response data for the get operation. */
public final class ApiOperationsGetResponse extends ResponseBase<ApiOperationsGetHeaders, OperationContractInner> {
    /**
     * Creates an instance of ApiOperationsGetResponse.
     *
     * @param request the request which resulted in this ApiOperationsGetResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ApiOperationsGetResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        OperationContractInner value,
        ApiOperationsGetHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * Gets the deserialized response body.
     *
     * @return the deserialized response body.
     */
    @Override
    public OperationContractInner getValue() {
        return super.getValue();
    }
}
