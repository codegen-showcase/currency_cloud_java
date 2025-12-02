
package com.currencycloud.sdk.resources.reference.params;

import java.util.Objects;
import java.util.Optional;

import com.currencycloud.sdk.model.ReferenceGetPaymentPurposeCodesEntityTypeEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * GetPaymentPurposeCodesRequest
 */
@JsonDeserialize(builder = GetPaymentPurposeCodesRequest.Builder.class)
public final class GetPaymentPurposeCodesRequest {
    /**
     * Two-letter ISO country code of the bank account.
     */
    private final String bankAccountCountry;

    /**
     * Three-letter ISO currency code for the currency in which payment will be made. No purpose codes will be returned if an invalid currency code is given.
     */
    private final String currency;

    /**
     * Legal entity type - company or individual.
     */
    private final Optional<ReferenceGetPaymentPurposeCodesEntityTypeEnum> entityType;


    private GetPaymentPurposeCodesRequest(Builder builder) {
        this.bankAccountCountry = builder.bankAccountCountry;
        this.currency = builder.currency;
        this.entityType = builder.entityType;
    }

    /**
     * Retrieves value for `bankAccountCountry`
     * Two-letter ISO country code of the bank account.
     */
    @JsonProperty("bank_account_country")
    public String getBankAccountCountry() {
        return bankAccountCountry;
    }
    /**
     * Retrieves value for `currency`
     * Three-letter ISO currency code for the currency in which payment will be made. No purpose codes will be returned if an invalid currency code is given.
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `entityType`
     * Legal entity type - company or individual.
     */
    @JsonProperty("entity_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<ReferenceGetPaymentPurposeCodesEntityTypeEnum> getEntityType() {
        return entityType;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof GetPaymentPurposeCodesRequest &&
               equalTo((GetPaymentPurposeCodesRequest) other);
    }

    private boolean equalTo(GetPaymentPurposeCodesRequest other) {
        return
            bankAccountCountry.equals(other.bankAccountCountry) &&

            currency.equals(other.currency) &&

            entityType.equals(other.entityType)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.bankAccountCountry,
                   this.currency,
                   this.entityType
               );
    }

    @Override
    public String toString() {
        return "GetPaymentPurposeCodesRequest{" +
               "bankAccountCountry=" + bankAccountCountry + ", " +
               "currency=" + currency + ", " +
               "entityType=" + entityType +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Two-letter ISO country code of the bank account.
         */
        private String bankAccountCountry = null;

        /**
         * Three-letter ISO currency code for the currency in which payment will be made. No purpose codes will be returned if an invalid currency code is given.
         */
        private String currency = null;

        /**
         * Legal entity type - company or individual.
         */
        private Optional<ReferenceGetPaymentPurposeCodesEntityTypeEnum> entityType = Optional.empty();


        private Builder() {}

        public Builder from(GetPaymentPurposeCodesRequest other) {
            bankAccountCountry(other.getBankAccountCountry());
            currency(other.getCurrency());
            entityType(other.getEntityType());
            return this;
        }

        /**
         * Sets value for `bankAccountCountry`
         * Two-letter ISO country code of the bank account.
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
         * Sets value for `currency`
         * Three-letter ISO currency code for the currency in which payment will be made. No purpose codes will be returned if an invalid currency code is given.
         */
        @JsonSetter("currency")
        public Builder currency(String currency) {
            if (currency == null) {
                throw new IllegalArgumentException("currency cannot be null");
            }

            this.currency = currency;
            return this;
        }
        /**
         * Sets value for `entityType`
         * Legal entity type - company or individual.
         */
        @JsonSetter("entity_type")
        public Builder entityType(Optional<ReferenceGetPaymentPurposeCodesEntityTypeEnum> entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * Sets value for `entityType`
         * Legal entity type - company or individual.
         */
        public Builder entityType(ReferenceGetPaymentPurposeCodesEntityTypeEnum entityType) {
            return this.entityType(Optional.ofNullable(entityType));
        }



        public GetPaymentPurposeCodesRequest build() {
            if (bankAccountCountry == null) {
                throw new IllegalStateException("bankAccountCountry is required");
            }

            if (currency == null) {
                throw new IllegalStateException("currency is required");
            }

            return new GetPaymentPurposeCodesRequest(this);
        }
    }

}



