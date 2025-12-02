
package com.currencycloud.sdk.model;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * ReferenceGetBeneficiaryRequirementsResponse
 */
@JsonDeserialize(builder = ReferenceGetBeneficiaryRequirementsResponse.Builder.class)
public final class ReferenceGetBeneficiaryRequirementsResponse {
    private final Optional<List<BeneficiaryRequirements>> details;


    private ReferenceGetBeneficiaryRequirementsResponse(Builder builder) {
        this.details = builder.details;
    }

    /**
     * Retrieves value for `details`
     */
    @JsonProperty("details")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<BeneficiaryRequirements>> getDetails() {
        return details;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof ReferenceGetBeneficiaryRequirementsResponse &&
               equalTo((ReferenceGetBeneficiaryRequirementsResponse) other);
    }

    private boolean equalTo(ReferenceGetBeneficiaryRequirementsResponse other) {
        return
            details.equals(other.details)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.details
               );
    }

    @Override
    public String toString() {
        return "ReferenceGetBeneficiaryRequirementsResponse{" +
               "details=" + details +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<List<BeneficiaryRequirements>> details = Optional.empty();


        private Builder() {}

        public Builder from(ReferenceGetBeneficiaryRequirementsResponse other) {
            details(other.getDetails());
            return this;
        }

        /**
         * Sets value for `details`
         */
        @JsonSetter("details")
        public Builder details(Optional<List<BeneficiaryRequirements>> details) {
            this.details = details;
            return this;
        }

        /**
         * Sets value for `details`
         */
        public Builder details(List<BeneficiaryRequirements> details) {
            return this.details(Optional.ofNullable(details));
        }



        public ReferenceGetBeneficiaryRequirementsResponse build() {
            return new ReferenceGetBeneficiaryRequirementsResponse(this);
        }
    }

}



