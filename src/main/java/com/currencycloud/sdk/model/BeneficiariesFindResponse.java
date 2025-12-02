
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
 * BeneficiariesFindResponse
 */
@JsonDeserialize(builder = BeneficiariesFindResponse.Builder.class)
public final class BeneficiariesFindResponse {
    private final Optional<List<Beneficiary>> beneficiaries;

    /**
     * Pagination.
     */
    private final Optional<Pagination> pagination;


    private BeneficiariesFindResponse(Builder builder) {
        this.beneficiaries = builder.beneficiaries;
        this.pagination = builder.pagination;
    }

    /**
     * Retrieves value for `beneficiaries`
     */
    @JsonProperty("beneficiaries")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<Beneficiary>> getBeneficiaries() {
        return beneficiaries;
    }
    /**
     * Retrieves value for `pagination`
     * Pagination.
     */
    @JsonProperty("pagination")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Pagination> getPagination() {
        return pagination;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof BeneficiariesFindResponse && equalTo((BeneficiariesFindResponse) other);
    }

    private boolean equalTo(BeneficiariesFindResponse other) {
        return
            beneficiaries.equals(other.beneficiaries) &&

            pagination.equals(other.pagination)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.beneficiaries,
                   this.pagination
               );
    }

    @Override
    public String toString() {
        return "BeneficiariesFindResponse{" +
               "beneficiaries=" + beneficiaries + ", " +
               "pagination=" + pagination +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<List<Beneficiary>> beneficiaries = Optional.empty();

        /**
         * Pagination.
         */
        private Optional<Pagination> pagination = Optional.empty();


        private Builder() {}

        public Builder from(BeneficiariesFindResponse other) {
            beneficiaries(other.getBeneficiaries());
            pagination(other.getPagination());
            return this;
        }

        /**
         * Sets value for `beneficiaries`
         */
        @JsonSetter("beneficiaries")
        public Builder beneficiaries(Optional<List<Beneficiary>> beneficiaries) {
            this.beneficiaries = beneficiaries;
            return this;
        }

        /**
         * Sets value for `beneficiaries`
         */
        public Builder beneficiaries(List<Beneficiary> beneficiaries) {
            return this.beneficiaries(Optional.ofNullable(beneficiaries));
        }
        /**
         * Sets value for `pagination`
         * Pagination.
         */
        @JsonSetter("pagination")
        public Builder pagination(Optional<Pagination> pagination) {
            this.pagination = pagination;
            return this;
        }

        /**
         * Sets value for `pagination`
         * Pagination.
         */
        public Builder pagination(Pagination pagination) {
            return this.pagination(Optional.ofNullable(pagination));
        }



        public BeneficiariesFindResponse build() {
            return new BeneficiariesFindResponse(this);
        }
    }

}



