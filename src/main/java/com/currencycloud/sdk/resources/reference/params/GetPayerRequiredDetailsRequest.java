
package com.currencycloud.sdk.resources.reference.params;

import java.util.Objects;
import java.util.Optional;

import com.currencycloud.sdk.model.ReferenceGetPayerRequiredDetailsPayerEntityTypeEnum;
import com.currencycloud.sdk.model.ReferenceGetPayerRequiredDetailsPaymentTypeEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * GetPayerRequiredDetailsRequest
 */
@JsonDeserialize(builder = GetPayerRequiredDetailsRequest.Builder.class)
public final class GetPayerRequiredDetailsRequest {
    /**
     * Two-letter ISO country code.
     */
    private final String payerCountry;

    /**
     * Three-letter ISO 4217 currency code.
     */
    private final Optional<String> currency;

    /**
     * Legal entity type - company or individual.
     */
    private final Optional<ReferenceGetPayerRequiredDetailsPayerEntityTypeEnum> payerEntityType;

    /**
     * Currencycloud supports two types of payments: "priority" (Swift), made using the Swift network; and "regular" (local), made using the local bank network.
     */
    private final Optional<ReferenceGetPayerRequiredDetailsPaymentTypeEnum> paymentType;


    private GetPayerRequiredDetailsRequest(Builder builder) {
        this.payerCountry = builder.payerCountry;
        this.currency = builder.currency;
        this.payerEntityType = builder.payerEntityType;
        this.paymentType = builder.paymentType;
    }

    /**
     * Retrieves value for `payerCountry`
     * Two-letter ISO country code.
     */
    @JsonProperty("payer_country")
    public String getPayerCountry() {
        return payerCountry;
    }
    /**
     * Retrieves value for `currency`
     * Three-letter ISO 4217 currency code.
     */
    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `payerEntityType`
     * Legal entity type - company or individual.
     */
    @JsonProperty("payer_entity_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<ReferenceGetPayerRequiredDetailsPayerEntityTypeEnum> getPayerEntityType() {
        return payerEntityType;
    }
    /**
     * Retrieves value for `paymentType`
     * Currencycloud supports two types of payments: "priority" (Swift), made using the Swift network; and "regular" (local), made using the local bank network.
     */
    @JsonProperty("payment_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<ReferenceGetPayerRequiredDetailsPaymentTypeEnum> getPaymentType() {
        return paymentType;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof GetPayerRequiredDetailsRequest &&
               equalTo((GetPayerRequiredDetailsRequest) other);
    }

    private boolean equalTo(GetPayerRequiredDetailsRequest other) {
        return
            payerCountry.equals(other.payerCountry) &&

            currency.equals(other.currency) &&

            payerEntityType.equals(other.payerEntityType) &&

            paymentType.equals(other.paymentType)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.payerCountry,
                   this.currency,
                   this.payerEntityType,
                   this.paymentType
               );
    }

    @Override
    public String toString() {
        return "GetPayerRequiredDetailsRequest{" +
               "payerCountry=" + payerCountry + ", " +
               "currency=" + currency + ", " +
               "payerEntityType=" + payerEntityType + ", " +
               "paymentType=" + paymentType +
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
        private String payerCountry = null;

        /**
         * Three-letter ISO 4217 currency code.
         */
        private Optional<String> currency = Optional.empty();

        /**
         * Legal entity type - company or individual.
         */
        private Optional<ReferenceGetPayerRequiredDetailsPayerEntityTypeEnum> payerEntityType =
            Optional.empty();

        /**
         * Currencycloud supports two types of payments: "priority" (Swift), made using the Swift network; and "regular" (local), made using the local bank network.
         */
        private Optional<ReferenceGetPayerRequiredDetailsPaymentTypeEnum> paymentType = Optional.empty();


        private Builder() {}

        public Builder from(GetPayerRequiredDetailsRequest other) {
            payerCountry(other.getPayerCountry());
            currency(other.getCurrency());
            payerEntityType(other.getPayerEntityType());
            paymentType(other.getPaymentType());
            return this;
        }

        /**
         * Sets value for `payerCountry`
         * Two-letter ISO country code.
         */
        @JsonSetter("payer_country")
        public Builder payerCountry(String payerCountry) {
            if (payerCountry == null) {
                throw new IllegalArgumentException("payerCountry cannot be null");
            }

            this.payerCountry = payerCountry;
            return this;
        }
        /**
         * Sets value for `currency`
         * Three-letter ISO 4217 currency code.
         */
        @JsonSetter("currency")
        public Builder currency(Optional<String> currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Sets value for `currency`
         * Three-letter ISO 4217 currency code.
         */
        public Builder currency(String currency) {
            return this.currency(Optional.ofNullable(currency));
        }
        /**
         * Sets value for `payerEntityType`
         * Legal entity type - company or individual.
         */
        @JsonSetter("payer_entity_type")
        public Builder payerEntityType(Optional<ReferenceGetPayerRequiredDetailsPayerEntityTypeEnum>
                                       payerEntityType) {
            this.payerEntityType = payerEntityType;
            return this;
        }

        /**
         * Sets value for `payerEntityType`
         * Legal entity type - company or individual.
         */
        public Builder payerEntityType(ReferenceGetPayerRequiredDetailsPayerEntityTypeEnum
                                       payerEntityType) {
            return this.payerEntityType(Optional.ofNullable(payerEntityType));
        }
        /**
         * Sets value for `paymentType`
         * Currencycloud supports two types of payments: "priority" (Swift), made using the Swift network; and "regular" (local), made using the local bank network.
         */
        @JsonSetter("payment_type")
        public Builder paymentType(Optional<ReferenceGetPayerRequiredDetailsPaymentTypeEnum> paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * Sets value for `paymentType`
         * Currencycloud supports two types of payments: "priority" (Swift), made using the Swift network; and "regular" (local), made using the local bank network.
         */
        public Builder paymentType(ReferenceGetPayerRequiredDetailsPaymentTypeEnum paymentType) {
            return this.paymentType(Optional.ofNullable(paymentType));
        }



        public GetPayerRequiredDetailsRequest build() {
            if (payerCountry == null) {
                throw new IllegalStateException("payerCountry is required");
            }

            return new GetPayerRequiredDetailsRequest(this);
        }
    }

}



