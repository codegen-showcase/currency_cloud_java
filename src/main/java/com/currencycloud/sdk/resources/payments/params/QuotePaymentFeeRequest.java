
package com.currencycloud.sdk.resources.payments.params;

import java.util.Objects;
import java.util.Optional;

import com.currencycloud.sdk.model.PaymentsQuotePaymentFeeChargeTypeEnum;
import com.currencycloud.sdk.model.PaymentsQuotePaymentFeePaymentTypeEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * QuotePaymentFeeRequest
 */
@JsonDeserialize(builder = QuotePaymentFeeRequest.Builder.class)
public final class QuotePaymentFeeRequest {
    /**
     * Currency of the payment.
     */
    private final String paymentCurrency;

    /**
     * Destination Country of the payment.
     */
    private final String paymentDestinationCountry;

    /**
     * Type of payment - priority(Swift) or regular(local).
     */
    private final PaymentsQuotePaymentFeePaymentTypeEnum paymentType;

    /**
     * Account UUID. If this is left empty, the account that is making the API call is used.
     */
    private final Optional<String> accountId;

    /**
     * Payment Charges type. if no value is provided the account's default value is used.
     */
    private final Optional<PaymentsQuotePaymentFeeChargeTypeEnum> chargeType;


    private QuotePaymentFeeRequest(Builder builder) {
        this.paymentCurrency = builder.paymentCurrency;
        this.paymentDestinationCountry = builder.paymentDestinationCountry;
        this.paymentType = builder.paymentType;
        this.accountId = builder.accountId;
        this.chargeType = builder.chargeType;
    }

    /**
     * Retrieves value for `paymentCurrency`
     * Currency of the payment.
     */
    @JsonProperty("payment_currency")
    public String getPaymentCurrency() {
        return paymentCurrency;
    }
    /**
     * Retrieves value for `paymentDestinationCountry`
     * Destination Country of the payment.
     */
    @JsonProperty("payment_destination_country")
    public String getPaymentDestinationCountry() {
        return paymentDestinationCountry;
    }
    /**
     * Retrieves value for `paymentType`
     * Type of payment - priority(Swift) or regular(local).
     */
    @JsonProperty("payment_type")
    public PaymentsQuotePaymentFeePaymentTypeEnum getPaymentType() {
        return paymentType;
    }
    /**
     * Retrieves value for `accountId`
     * Account UUID. If this is left empty, the account that is making the API call is used.
     */
    @JsonProperty("account_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAccountId() {
        return accountId;
    }
    /**
     * Retrieves value for `chargeType`
     * Payment Charges type. if no value is provided the account's default value is used.
     */
    @JsonProperty("charge_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<PaymentsQuotePaymentFeeChargeTypeEnum> getChargeType() {
        return chargeType;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof QuotePaymentFeeRequest && equalTo((QuotePaymentFeeRequest) other);
    }

    private boolean equalTo(QuotePaymentFeeRequest other) {
        return
            paymentCurrency.equals(other.paymentCurrency) &&

            paymentDestinationCountry.equals(other.paymentDestinationCountry) &&

            paymentType.equals(other.paymentType) &&

            accountId.equals(other.accountId) &&

            chargeType.equals(other.chargeType)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.paymentCurrency,
                   this.paymentDestinationCountry,
                   this.paymentType,
                   this.accountId,
                   this.chargeType
               );
    }

    @Override
    public String toString() {
        return "QuotePaymentFeeRequest{" +
               "paymentCurrency=" + paymentCurrency + ", " +
               "paymentDestinationCountry=" + paymentDestinationCountry + ", " +
               "paymentType=" + paymentType + ", " +
               "accountId=" + accountId + ", " +
               "chargeType=" + chargeType +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Currency of the payment.
         */
        private String paymentCurrency = null;

        /**
         * Destination Country of the payment.
         */
        private String paymentDestinationCountry = null;

        /**
         * Type of payment - priority(Swift) or regular(local).
         */
        private PaymentsQuotePaymentFeePaymentTypeEnum paymentType = null;

        /**
         * Account UUID. If this is left empty, the account that is making the API call is used.
         */
        private Optional<String> accountId = Optional.empty();

        /**
         * Payment Charges type. if no value is provided the account's default value is used.
         */
        private Optional<PaymentsQuotePaymentFeeChargeTypeEnum> chargeType = Optional.empty();


        private Builder() {}

        public Builder from(QuotePaymentFeeRequest other) {
            paymentCurrency(other.getPaymentCurrency());
            paymentDestinationCountry(other.getPaymentDestinationCountry());
            paymentType(other.getPaymentType());
            accountId(other.getAccountId());
            chargeType(other.getChargeType());
            return this;
        }

        /**
         * Sets value for `paymentCurrency`
         * Currency of the payment.
         */
        @JsonSetter("payment_currency")
        public Builder paymentCurrency(String paymentCurrency) {
            if (paymentCurrency == null) {
                throw new IllegalArgumentException("paymentCurrency cannot be null");
            }

            this.paymentCurrency = paymentCurrency;
            return this;
        }
        /**
         * Sets value for `paymentDestinationCountry`
         * Destination Country of the payment.
         */
        @JsonSetter("payment_destination_country")
        public Builder paymentDestinationCountry(String paymentDestinationCountry) {
            if (paymentDestinationCountry == null) {
                throw new IllegalArgumentException("paymentDestinationCountry cannot be null");
            }

            this.paymentDestinationCountry = paymentDestinationCountry;
            return this;
        }
        /**
         * Sets value for `paymentType`
         * Type of payment - priority(Swift) or regular(local).
         */
        @JsonSetter("payment_type")
        public Builder paymentType(PaymentsQuotePaymentFeePaymentTypeEnum paymentType) {
            if (paymentType == null) {
                throw new IllegalArgumentException("paymentType cannot be null");
            }

            this.paymentType = paymentType;
            return this;
        }
        /**
         * Sets value for `accountId`
         * Account UUID. If this is left empty, the account that is making the API call is used.
         */
        @JsonSetter("account_id")
        public Builder accountId(Optional<String> accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Sets value for `accountId`
         * Account UUID. If this is left empty, the account that is making the API call is used.
         */
        public Builder accountId(String accountId) {
            return this.accountId(Optional.ofNullable(accountId));
        }
        /**
         * Sets value for `chargeType`
         * Payment Charges type. if no value is provided the account's default value is used.
         */
        @JsonSetter("charge_type")
        public Builder chargeType(Optional<PaymentsQuotePaymentFeeChargeTypeEnum> chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * Sets value for `chargeType`
         * Payment Charges type. if no value is provided the account's default value is used.
         */
        public Builder chargeType(PaymentsQuotePaymentFeeChargeTypeEnum chargeType) {
            return this.chargeType(Optional.ofNullable(chargeType));
        }



        public QuotePaymentFeeRequest build() {
            if (paymentCurrency == null) {
                throw new IllegalStateException("paymentCurrency is required");
            }

            if (paymentDestinationCountry == null) {
                throw new IllegalStateException("paymentDestinationCountry is required");
            }

            if (paymentType == null) {
                throw new IllegalStateException("paymentType is required");
            }

            return new QuotePaymentFeeRequest(this);
        }
    }

}



