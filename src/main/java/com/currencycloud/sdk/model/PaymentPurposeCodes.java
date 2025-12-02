
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Payment purpose codes.
 */
@JsonDeserialize(builder = PaymentPurposeCodes.Builder.class)
public final class PaymentPurposeCodes {
    /**
     * Two-letter country code for the country of the bank account.
     */
    private final Optional<String> bankAccountCountry;

    /**
     * Payment currency
     */
    private final Optional<String> currency;

    /**
     * Legal entity type - 'company' or 'individual'.
     */
    private final Optional<String> entityType;

    /**
     * Purpose code
     */
    private final Optional<String> purposeCode;

    /**
     * A description of the purpose code.
     */
    private final Optional<String> purposeDescription;


    private PaymentPurposeCodes(Builder builder) {
        this.bankAccountCountry = builder.bankAccountCountry;
        this.currency = builder.currency;
        this.entityType = builder.entityType;
        this.purposeCode = builder.purposeCode;
        this.purposeDescription = builder.purposeDescription;
    }

    /**
     * Retrieves value for `bankAccountCountry`
     * Two-letter country code for the country of the bank account.
     */
    @JsonProperty("bank_account_country")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBankAccountCountry() {
        return bankAccountCountry;
    }
    /**
     * Retrieves value for `currency`
     * Payment currency
     */
    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `entityType`
     * Legal entity type - 'company' or 'individual'.
     */
    @JsonProperty("entity_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getEntityType() {
        return entityType;
    }
    /**
     * Retrieves value for `purposeCode`
     * Purpose code
     */
    @JsonProperty("purpose_code")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPurposeCode() {
        return purposeCode;
    }
    /**
     * Retrieves value for `purposeDescription`
     * A description of the purpose code.
     */
    @JsonProperty("purpose_description")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPurposeDescription() {
        return purposeDescription;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof PaymentPurposeCodes && equalTo((PaymentPurposeCodes) other);
    }

    private boolean equalTo(PaymentPurposeCodes other) {
        return
            bankAccountCountry.equals(other.bankAccountCountry) &&

            currency.equals(other.currency) &&

            entityType.equals(other.entityType) &&

            purposeCode.equals(other.purposeCode) &&

            purposeDescription.equals(other.purposeDescription)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.bankAccountCountry,
                   this.currency,
                   this.entityType,
                   this.purposeCode,
                   this.purposeDescription
               );
    }

    @Override
    public String toString() {
        return "PaymentPurposeCodes{" +
               "bankAccountCountry=" + bankAccountCountry + ", " +
               "currency=" + currency + ", " +
               "entityType=" + entityType + ", " +
               "purposeCode=" + purposeCode + ", " +
               "purposeDescription=" + purposeDescription +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Two-letter country code for the country of the bank account.
         */
        private Optional<String> bankAccountCountry = Optional.empty();

        /**
         * Payment currency
         */
        private Optional<String> currency = Optional.empty();

        /**
         * Legal entity type - 'company' or 'individual'.
         */
        private Optional<String> entityType = Optional.empty();

        /**
         * Purpose code
         */
        private Optional<String> purposeCode = Optional.empty();

        /**
         * A description of the purpose code.
         */
        private Optional<String> purposeDescription = Optional.empty();


        private Builder() {}

        public Builder from(PaymentPurposeCodes other) {
            bankAccountCountry(other.getBankAccountCountry());
            currency(other.getCurrency());
            entityType(other.getEntityType());
            purposeCode(other.getPurposeCode());
            purposeDescription(other.getPurposeDescription());
            return this;
        }

        /**
         * Sets value for `bankAccountCountry`
         * Two-letter country code for the country of the bank account.
         */
        @JsonSetter("bank_account_country")
        public Builder bankAccountCountry(Optional<String> bankAccountCountry) {
            this.bankAccountCountry = bankAccountCountry;
            return this;
        }

        /**
         * Sets value for `bankAccountCountry`
         * Two-letter country code for the country of the bank account.
         */
        public Builder bankAccountCountry(String bankAccountCountry) {
            return this.bankAccountCountry(Optional.ofNullable(bankAccountCountry));
        }
        /**
         * Sets value for `currency`
         * Payment currency
         */
        @JsonSetter("currency")
        public Builder currency(Optional<String> currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Sets value for `currency`
         * Payment currency
         */
        public Builder currency(String currency) {
            return this.currency(Optional.ofNullable(currency));
        }
        /**
         * Sets value for `entityType`
         * Legal entity type - 'company' or 'individual'.
         */
        @JsonSetter("entity_type")
        public Builder entityType(Optional<String> entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * Sets value for `entityType`
         * Legal entity type - 'company' or 'individual'.
         */
        public Builder entityType(String entityType) {
            return this.entityType(Optional.ofNullable(entityType));
        }
        /**
         * Sets value for `purposeCode`
         * Purpose code
         */
        @JsonSetter("purpose_code")
        public Builder purposeCode(Optional<String> purposeCode) {
            this.purposeCode = purposeCode;
            return this;
        }

        /**
         * Sets value for `purposeCode`
         * Purpose code
         */
        public Builder purposeCode(String purposeCode) {
            return this.purposeCode(Optional.ofNullable(purposeCode));
        }
        /**
         * Sets value for `purposeDescription`
         * A description of the purpose code.
         */
        @JsonSetter("purpose_description")
        public Builder purposeDescription(Optional<String> purposeDescription) {
            this.purposeDescription = purposeDescription;
            return this;
        }

        /**
         * Sets value for `purposeDescription`
         * A description of the purpose code.
         */
        public Builder purposeDescription(String purposeDescription) {
            return this.purposeDescription(Optional.ofNullable(purposeDescription));
        }



        public PaymentPurposeCodes build() {
            return new PaymentPurposeCodes(this);
        }
    }

}



