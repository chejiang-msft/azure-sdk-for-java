// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.health.insights.clinicalmatching.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Trial data which is of interest to the potential participant. */
@Fluent
public final class ClinicalTrialMetadata {
    /*
     * Phases which are relevant for the clinical trial.
     * Each clinical trial can be in a certain phase or in multiple phases.
     */
    @JsonProperty(value = "phases")
    private List<ClinicalTrialPhase> phases;

    /*
     * Possible study types of a clinical trial.
     */
    @JsonProperty(value = "studyType")
    private ClinicalTrialStudyType studyType;

    /*
     * Possible recruitment status of a clinical trial.
     */
    @JsonProperty(value = "recruitmentStatus")
    private ClinicalTrialRecruitmentStatus recruitmentStatus;

    /*
     * Medical conditions and their synonyms which are relevant for the clinical trial, given as strings.
     */
    @JsonProperty(value = "conditions", required = true)
    private List<String> conditions;

    /*
     * Sponsors/collaborators involved with the trial.
     */
    @JsonProperty(value = "sponsors")
    private List<String> sponsors;

    /*
     * Contact details of the trial administrators, for patients that want to participate in the trial.
     */
    @JsonProperty(value = "contacts")
    private List<ContactDetails> contacts;

    /*
     * Research facilities where the clinical trial is conducted.
     */
    @JsonProperty(value = "facilities")
    private List<ClinicalTrialResearchFacility> facilities;

    /**
     * Creates an instance of ClinicalTrialMetadata class.
     *
     * @param conditions the conditions value to set.
     */
    @JsonCreator
    public ClinicalTrialMetadata(@JsonProperty(value = "conditions", required = true) List<String> conditions) {
        this.conditions = conditions;
    }

    /**
     * Get the phases property: Phases which are relevant for the clinical trial. Each clinical trial can be in a
     * certain phase or in multiple phases.
     *
     * @return the phases value.
     */
    public List<ClinicalTrialPhase> getPhases() {
        return this.phases;
    }

    /**
     * Set the phases property: Phases which are relevant for the clinical trial. Each clinical trial can be in a
     * certain phase or in multiple phases.
     *
     * @param phases the phases value to set.
     * @return the ClinicalTrialMetadata object itself.
     */
    public ClinicalTrialMetadata setPhases(List<ClinicalTrialPhase> phases) {
        this.phases = phases;
        return this;
    }

    /**
     * Get the studyType property: Possible study types of a clinical trial.
     *
     * @return the studyType value.
     */
    public ClinicalTrialStudyType getStudyType() {
        return this.studyType;
    }

    /**
     * Set the studyType property: Possible study types of a clinical trial.
     *
     * @param studyType the studyType value to set.
     * @return the ClinicalTrialMetadata object itself.
     */
    public ClinicalTrialMetadata setStudyType(ClinicalTrialStudyType studyType) {
        this.studyType = studyType;
        return this;
    }

    /**
     * Get the recruitmentStatus property: Possible recruitment status of a clinical trial.
     *
     * @return the recruitmentStatus value.
     */
    public ClinicalTrialRecruitmentStatus getRecruitmentStatus() {
        return this.recruitmentStatus;
    }

    /**
     * Set the recruitmentStatus property: Possible recruitment status of a clinical trial.
     *
     * @param recruitmentStatus the recruitmentStatus value to set.
     * @return the ClinicalTrialMetadata object itself.
     */
    public ClinicalTrialMetadata setRecruitmentStatus(ClinicalTrialRecruitmentStatus recruitmentStatus) {
        this.recruitmentStatus = recruitmentStatus;
        return this;
    }

    /**
     * Get the conditions property: Medical conditions and their synonyms which are relevant for the clinical trial,
     * given as strings.
     *
     * @return the conditions value.
     */
    public List<String> getConditions() {
        return this.conditions;
    }

    /**
     * Get the sponsors property: Sponsors/collaborators involved with the trial.
     *
     * @return the sponsors value.
     */
    public List<String> getSponsors() {
        return this.sponsors;
    }

    /**
     * Set the sponsors property: Sponsors/collaborators involved with the trial.
     *
     * @param sponsors the sponsors value to set.
     * @return the ClinicalTrialMetadata object itself.
     */
    public ClinicalTrialMetadata setSponsors(List<String> sponsors) {
        this.sponsors = sponsors;
        return this;
    }

    /**
     * Get the contacts property: Contact details of the trial administrators, for patients that want to participate in
     * the trial.
     *
     * @return the contacts value.
     */
    public List<ContactDetails> getContacts() {
        return this.contacts;
    }

    /**
     * Set the contacts property: Contact details of the trial administrators, for patients that want to participate in
     * the trial.
     *
     * @param contacts the contacts value to set.
     * @return the ClinicalTrialMetadata object itself.
     */
    public ClinicalTrialMetadata setContacts(List<ContactDetails> contacts) {
        this.contacts = contacts;
        return this;
    }

    /**
     * Get the facilities property: Research facilities where the clinical trial is conducted.
     *
     * @return the facilities value.
     */
    public List<ClinicalTrialResearchFacility> getFacilities() {
        return this.facilities;
    }

    /**
     * Set the facilities property: Research facilities where the clinical trial is conducted.
     *
     * @param facilities the facilities value to set.
     * @return the ClinicalTrialMetadata object itself.
     */
    public ClinicalTrialMetadata setFacilities(List<ClinicalTrialResearchFacility> facilities) {
        this.facilities = facilities;
        return this;
    }
}
