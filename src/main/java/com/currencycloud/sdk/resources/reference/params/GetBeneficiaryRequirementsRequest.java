
package com.currencycloud.sdk.resources.reference.params;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * GetBeneficiaryRequirementsRequest
 */
@JsonDeserialize(builder = GetBeneficiaryRequirementsRequest.Builder.class)
public final class GetBeneficiaryRequirementsRequest {
    /**
     * Two-letter ISO country code.
     */
    private final String bankAccountCountry;

    /**
     * Two-letter ISO country code. If the beneficiary is a company, this is the country in which the company is registered. If the beneficiary is an individual, this is the country in which they are based.
     */
    private final String beneficiaryCountry;

    /**
     * Currency in which money is held in the beneficiary's bank account. Three-letter ISO currency code.
     */
    private final String currency;


    private GetBeneficiaryRequirementsRequest(Builder builder) {
        this.bankAccountCountry = builder.bankAccountCountry;
        this.beneficiaryCountry = builder.beneficiaryCountry;
        this.currency = builder.currency;
    }

    /**
     * Retrieves value for `bankAccountCountry`
     * Two-letter ISO country code.
     */
    @JsonProperty("bank_account_country")
    public String getBankAccountCountry() {
        return bankAccountCountry;
    }
    /**
     * Retrieves value for `beneficiaryCountry`
     * Two-letter ISO country code. If the beneficiary is a company, this is the country in which the company is registered. If the beneficiary is an individual, this is the country in which they are based.
     */
    @JsonProperty("beneficiary_country")
    public String getBeneficiaryCountry() {
        return beneficiaryCountry;
    }
    /**
     * Retrieves value for `currency`
     * Currency in which money is held in the beneficiary's bank account. Three-letter ISO currency code.
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof GetBeneficiaryRequirementsRequest &&
               equalTo((GetBeneficiaryRequirementsRequest) other);
    }

    private boolean equalTo(GetBeneficiaryRequirementsRequest other) {
        return
            bankAccountCountry.equals(other.bankAccountCountry) &&

            beneficiaryCountry.equals(other.beneficiaryCountry) &&

            currency.equals(other.currency)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.bankAccountCountry,
                   this.beneficiaryCountry,
                   this.currency
               );
    }

    @Override
    public String toString() {
        return "GetBeneficiaryRequirementsRequest{" +
               "bankAccountCountry=" + bankAccountCountry + ", " +
               "beneficiaryCountry=" + beneficiaryCountry + ", " +
               "currency=" + currency +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Two-letter ISO country code.
         */
        private String bankAccountCountry = null;

        /**
         * Two-letter ISO country code. If the beneficiary is a company, this is the country in which the company is registered. If the beneficiary is an individual, this is the country in which they are based.
         */
        private String beneficiaryCountry = null;

        /**
         * Currency in which money is held in the beneficiary's bank account. Three-letter ISO currency code.
         */
        private String currency = null;


        private Builder() {}

        public Builder from(GetBeneficiaryRequirementsRequest other) {
            bankAccountCountry(other.getBankAccountCountry());
            beneficiaryCountry(other.getBeneficiaryCountry());
            currency(other.getCurrency());
            return this;
        }

        /**
         * Sets value for `bankAccountCountry`
         * Two-letter ISO country code.
         */
        @JsonSetter("bank_account_country")
        public Builder bankAccountCountry(String bankAccountCountry) {
            if (bankAccountCountry == null) {
                throw new IllegalArgumentException("bankAccountCountry cannot be null");
            }

            this.bankAccountCountry = bankAccountCountry;
            return this;
        }
        /**
         * Sets value for `beneficiaryCountry`
         * Two-letter ISO country code. If the beneficiary is a company, this is the country in which the company is registered. If the beneficiary is an individual, this is the country in which they are based.
         */
        @JsonSetter("beneficiary_country")
        public Builder beneficiaryCountry(String beneficiaryCountry) {
            if (beneficiaryCountry == null) {
                throw new IllegalArgumentException("beneficiaryCountry cannot be null");
            }

            this.beneficiaryCountry = beneficiaryCountry;
            return this;
        }
        /**
         * Sets value for `currency`
         * Currency in which money is held in the beneficiary's bank account. Three-letter ISO currency code.
         */
        @JsonSetter("currency")
        public Builder currency(String currency) {
            if (currency == null) {
                throw new IllegalArgumentException("currency cannot be null");
            }

            this.currency = currency;
            return this;
        }



        public GetBeneficiaryRequirementsRequest build() {
            if (bankAccountCountry == null) {
                throw new IllegalStateException("bankAccountCountry is required");
            }

            if (beneficiaryCountry == null) {
                throw new IllegalStateException("beneficiaryCountry is required");
            }

            if (currency == null) {
                throw new IllegalStateException("currency is required");
            }

            return new GetBeneficiaryRequirementsRequest(this);
        }
    }

}



