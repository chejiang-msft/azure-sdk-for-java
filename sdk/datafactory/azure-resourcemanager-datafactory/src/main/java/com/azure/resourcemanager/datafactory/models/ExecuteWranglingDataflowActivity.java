// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.ExecutePowerQueryActivityTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Execute power query activity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ExecuteWranglingDataflow")
@Fluent
public final class ExecuteWranglingDataflowActivity extends Activity {
    /*
     * Execute power query activity properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private ExecutePowerQueryActivityTypeProperties innerTypeProperties = new ExecutePowerQueryActivityTypeProperties();

    /*
     * Activity policy.
     */
    @JsonProperty(value = "policy")
    private ActivityPolicy policy;

    /** Creates an instance of ExecuteWranglingDataflowActivity class. */
    public ExecuteWranglingDataflowActivity() {
    }

    /**
     * Get the innerTypeProperties property: Execute power query activity properties.
     *
     * @return the innerTypeProperties value.
     */
    private ExecutePowerQueryActivityTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * Get the policy property: Activity policy.
     *
     * @return the policy value.
     */
    public ActivityPolicy policy() {
        return this.policy;
    }

    /**
     * Set the policy property: Activity policy.
     *
     * @param policy the policy value to set.
     * @return the ExecuteWranglingDataflowActivity object itself.
     */
    public ExecuteWranglingDataflowActivity withPolicy(ActivityPolicy policy) {
        this.policy = policy;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecuteWranglingDataflowActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecuteWranglingDataflowActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecuteWranglingDataflowActivity withState(ActivityState state) {
        super.withState(state);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecuteWranglingDataflowActivity withOnInactiveMarkAs(ActivityOnInactiveMarkAs onInactiveMarkAs) {
        super.withOnInactiveMarkAs(onInactiveMarkAs);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecuteWranglingDataflowActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecuteWranglingDataflowActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Get the sinks property: (Deprecated. Please use Queries). List of Power Query activity sinks mapped to a
     * queryName.
     *
     * @return the sinks value.
     */
    public Map<String, PowerQuerySink> sinks() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().sinks();
    }

    /**
     * Set the sinks property: (Deprecated. Please use Queries). List of Power Query activity sinks mapped to a
     * queryName.
     *
     * @param sinks the sinks value to set.
     * @return the ExecuteWranglingDataflowActivity object itself.
     */
    public ExecuteWranglingDataflowActivity withSinks(Map<String, PowerQuerySink> sinks) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecutePowerQueryActivityTypeProperties();
        }
        this.innerTypeProperties().withSinks(sinks);
        return this;
    }

    /**
     * Get the queries property: List of mapping for Power Query mashup query to sink dataset(s).
     *
     * @return the queries value.
     */
    public List<PowerQuerySinkMapping> queries() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().queries();
    }

    /**
     * Set the queries property: List of mapping for Power Query mashup query to sink dataset(s).
     *
     * @param queries the queries value to set.
     * @return the ExecuteWranglingDataflowActivity object itself.
     */
    public ExecuteWranglingDataflowActivity withQueries(List<PowerQuerySinkMapping> queries) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecutePowerQueryActivityTypeProperties();
        }
        this.innerTypeProperties().withQueries(queries);
        return this;
    }

    /**
     * Get the dataFlow property: Data flow reference.
     *
     * @return the dataFlow value.
     */
    public DataFlowReference dataFlow() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().dataFlow();
    }

    /**
     * Set the dataFlow property: Data flow reference.
     *
     * @param dataFlow the dataFlow value to set.
     * @return the ExecuteWranglingDataflowActivity object itself.
     */
    public ExecuteWranglingDataflowActivity withDataFlow(DataFlowReference dataFlow) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecutePowerQueryActivityTypeProperties();
        }
        this.innerTypeProperties().withDataFlow(dataFlow);
        return this;
    }

    /**
     * Get the staging property: Staging info for execute data flow activity.
     *
     * @return the staging value.
     */
    public DataFlowStagingInfo staging() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().staging();
    }

    /**
     * Set the staging property: Staging info for execute data flow activity.
     *
     * @param staging the staging value to set.
     * @return the ExecuteWranglingDataflowActivity object itself.
     */
    public ExecuteWranglingDataflowActivity withStaging(DataFlowStagingInfo staging) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecutePowerQueryActivityTypeProperties();
        }
        this.innerTypeProperties().withStaging(staging);
        return this;
    }

    /**
     * Get the integrationRuntime property: The integration runtime reference.
     *
     * @return the integrationRuntime value.
     */
    public IntegrationRuntimeReference integrationRuntime() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().integrationRuntime();
    }

    /**
     * Set the integrationRuntime property: The integration runtime reference.
     *
     * @param integrationRuntime the integrationRuntime value to set.
     * @return the ExecuteWranglingDataflowActivity object itself.
     */
    public ExecuteWranglingDataflowActivity withIntegrationRuntime(IntegrationRuntimeReference integrationRuntime) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecutePowerQueryActivityTypeProperties();
        }
        this.innerTypeProperties().withIntegrationRuntime(integrationRuntime);
        return this;
    }

    /**
     * Get the compute property: Compute properties for data flow activity.
     *
     * @return the compute value.
     */
    public ExecuteDataFlowActivityTypePropertiesCompute compute() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().compute();
    }

    /**
     * Set the compute property: Compute properties for data flow activity.
     *
     * @param compute the compute value to set.
     * @return the ExecuteWranglingDataflowActivity object itself.
     */
    public ExecuteWranglingDataflowActivity withCompute(ExecuteDataFlowActivityTypePropertiesCompute compute) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecutePowerQueryActivityTypeProperties();
        }
        this.innerTypeProperties().withCompute(compute);
        return this;
    }

    /**
     * Get the traceLevel property: Trace level setting used for data flow monitoring output. Supported values are:
     * 'coarse', 'fine', and 'none'. Type: string (or Expression with resultType string).
     *
     * @return the traceLevel value.
     */
    public Object traceLevel() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().traceLevel();
    }

    /**
     * Set the traceLevel property: Trace level setting used for data flow monitoring output. Supported values are:
     * 'coarse', 'fine', and 'none'. Type: string (or Expression with resultType string).
     *
     * @param traceLevel the traceLevel value to set.
     * @return the ExecuteWranglingDataflowActivity object itself.
     */
    public ExecuteWranglingDataflowActivity withTraceLevel(Object traceLevel) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecutePowerQueryActivityTypeProperties();
        }
        this.innerTypeProperties().withTraceLevel(traceLevel);
        return this;
    }

    /**
     * Get the continueOnError property: Continue on error setting used for data flow execution. Enables processing to
     * continue if a sink fails. Type: boolean (or Expression with resultType boolean).
     *
     * @return the continueOnError value.
     */
    public Object continueOnError() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().continueOnError();
    }

    /**
     * Set the continueOnError property: Continue on error setting used for data flow execution. Enables processing to
     * continue if a sink fails. Type: boolean (or Expression with resultType boolean).
     *
     * @param continueOnError the continueOnError value to set.
     * @return the ExecuteWranglingDataflowActivity object itself.
     */
    public ExecuteWranglingDataflowActivity withContinueOnError(Object continueOnError) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecutePowerQueryActivityTypeProperties();
        }
        this.innerTypeProperties().withContinueOnError(continueOnError);
        return this;
    }

    /**
     * Get the runConcurrently property: Concurrent run setting used for data flow execution. Allows sinks with the same
     * save order to be processed concurrently. Type: boolean (or Expression with resultType boolean).
     *
     * @return the runConcurrently value.
     */
    public Object runConcurrently() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().runConcurrently();
    }

    /**
     * Set the runConcurrently property: Concurrent run setting used for data flow execution. Allows sinks with the same
     * save order to be processed concurrently. Type: boolean (or Expression with resultType boolean).
     *
     * @param runConcurrently the runConcurrently value to set.
     * @return the ExecuteWranglingDataflowActivity object itself.
     */
    public ExecuteWranglingDataflowActivity withRunConcurrently(Object runConcurrently) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecutePowerQueryActivityTypeProperties();
        }
        this.innerTypeProperties().withRunConcurrently(runConcurrently);
        return this;
    }

    /**
     * Get the sourceStagingConcurrency property: Specify number of parallel staging for sources applicable to the sink.
     * Type: integer (or Expression with resultType integer).
     *
     * @return the sourceStagingConcurrency value.
     */
    public Object sourceStagingConcurrency() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().sourceStagingConcurrency();
    }

    /**
     * Set the sourceStagingConcurrency property: Specify number of parallel staging for sources applicable to the sink.
     * Type: integer (or Expression with resultType integer).
     *
     * @param sourceStagingConcurrency the sourceStagingConcurrency value to set.
     * @return the ExecuteWranglingDataflowActivity object itself.
     */
    public ExecuteWranglingDataflowActivity withSourceStagingConcurrency(Object sourceStagingConcurrency) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecutePowerQueryActivityTypeProperties();
        }
        this.innerTypeProperties().withSourceStagingConcurrency(sourceStagingConcurrency);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model ExecuteWranglingDataflowActivity"));
        } else {
            innerTypeProperties().validate();
        }
        if (policy() != null) {
            policy().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExecuteWranglingDataflowActivity.class);
}
