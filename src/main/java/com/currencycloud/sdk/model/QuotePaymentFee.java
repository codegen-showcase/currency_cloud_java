
package com.currencycloud.sdk.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Quote payment fee.
 */
@JsonDeserialize(builder = QuotePaymentFee.Builder.class)
public final class QuotePaymentFee {
    /**
     * Tha account Id.
     */
    private final String accountId;

    /**
     * The charge type the fee is applicable.
     */
    private final String chargeType;

    /**
     * The fee amount.
     */
    private final String feeAmount;

    /**
     * Three-letter ISO currency code for the fee's currency.
     */
    private final String feeCurrency;

    /**
     * Three letter ISO code for the currency of the payment.
     */
    private final String paymentCurrency;

    /**
     * Two-letter ISO country code for the payment's destination country.
     */
    private final String paymentDestinationCountry;

    /**
     * The payment type the fee is applicable to, priority(Swift) or regular(local).
     */
    private final String paymentType;

    private final Map<String, Object> additionalProperties;


    private QuotePaymentFee(Builder builder) {
        this.accountId = builder.accountId;
        this.chargeType = builder.chargeType;
        this.feeAmount = builder.feeAmount;
        this.feeCurrency = builder.feeCurrency;
        this.paymentCurrency = builder.paymentCurrency;
        this.paymentDestinationCountry = builder.paymentDestinationCountry;
        this.paymentType = builder.paymentType;
        this.additionalProperties = builder.additionalProperties;
    }

    /**
     * Retrieves value for `accountId`
     * Tha account Id.
     */
    @JsonProperty("account_id")
    public String getAccountId() {
        return accountId;
    }
    /**
     * Retrieves value for `chargeType`
     * The charge type the fee is applicable.
     */
    @JsonProperty("charge_type")
    public String getChargeType() {
        return chargeType;
    }
    /**
     * Retrieves value for `feeAmount`
     * The fee amount.
     */
    @JsonProperty("fee_amount")
    public String getFeeAmount() {
        return feeAmount;
    }
    /**
     * Retrieves value for `feeCurrency`
     * Three-letter ISO currency code for the fee's currency.
     */
    @JsonProperty("fee_currency")
    public String getFeeCurrency() {
        return feeCurrency;
    }
    /**
     * Retrieves value for `paymentCurrency`
     * Three letter ISO code for the currency of the payment.
     */
    @JsonProperty("payment_currency")
    public String getPaymentCurrency() {
        return paymentCurrency;
    }
    /**
     * Retrieves value for `paymentDestinationCountry`
     * Two-letter ISO country code for the payment's destination country.
     */
    @JsonProperty("payment_destination_country")
    public String getPaymentDestinationCountry() {
        return paymentDestinationCountry;
    }
    /**
     * Retrieves value for `paymentType`
     * The payment type the fee is applicable to, priority(Swift) or regular(local).
     */
    @JsonProperty("payment_type")
    public String getPaymentType() {
        return paymentType;
    }
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof QuotePaymentFee && equalTo((QuotePaymentFee) other);
    }

    private boolean equalTo(QuotePaymentFee other) {
        return
            accountId.equals(other.accountId) &&

            chargeType.equals(other.chargeType) &&

            feeAmount.equals(other.feeAmount) &&

            feeCurrency.equals(other.feeCurrency) &&

            paymentCurrency.equals(other.paymentCurrency) &&

            paymentDestinationCountry.equals(other.paymentDestinationCountry) &&

            paymentType.equals(other.paymentType)
            &&
            additionalProperties.equals(other.additionalProperties)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountId,
                   this.chargeType,
                   this.feeAmount,
                   this.feeCurrency,
                   this.paymentCurrency,
                   this.paymentDestinationCountry,
                   this.paymentType
                   ,
                   this.additionalProperties
               );
    }

    @Override
    public String toString() {
        return "QuotePaymentFee{" +
               "accountId=" + accountId + ", " +
               "chargeType=" + chargeType + ", " +
               "feeAmount=" + feeAmount + ", " +
               "feeCurrency=" + feeCurrency + ", " +
               "paymentCurrency=" + paymentCurrency + ", " +
               "paymentDestinationCountry=" + paymentDestinationCountry + ", " +
               "paymentType=" + paymentType +
               ", additionalProperties=" + additionalProperties +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Tha account Id.
         */
        private String accountId = null;

        /**
         * The charge type the fee is applicable.
         */
        private String chargeType = null;

        /**
         * The fee amount.
         */
        private String feeAmount = null;

        /**
         * Three-letter ISO currency code for the fee's currency.
         */
        private String feeCurrency = null;

        /**
         * Three letter ISO code for the currency of the payment.
         */
        private String paymentCurrency = null;

        /**
         * Two-letter ISO country code for the payment's destination country.
         */
        private String paymentDestinationCountry = null;

        /**
         * The payment type the fee is applicable to, priority(Swift) or regular(local).
         */
        private String paymentType = null;

        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(QuotePaymentFee other) {
            accountId(other.getAccountId());
            chargeType(other.getChargeType());
            feeAmount(other.getFeeAmount());
            feeCurrency(other.getFeeCurrency());
            paymentCurrency(other.getPaymentCurrency());
            paymentDestinationCountry(other.getPaymentDestinationCountry());
            paymentType(other.getPaymentType());
            additionalProperties(other.getAdditionalProperties());
            return this;
        }

        /**
         * Sets value for `accountId`
         * Tha account Id.
         */
        @JsonSetter("account_id")
        public Builder accountId(String accountId) {
            if (accountId == null) {
                throw new IllegalArgumentException("accountId cannot be null");
            }

            this.accountId = accountId;
            return this;
        }
        /**
         * Sets value for `chargeType`
         * The charge type the fee is applicable.
         */
        @JsonSetter("charge_type")
        public Builder chargeType(String chargeType) {
            if (chargeType == null) {
                throw new IllegalArgumentException("chargeType cannot be null");
            }

            this.chargeType = chargeType;
            return this;
        }
        /**
         * Sets value for `feeAmount`
         * The fee amount.
         */
        @JsonSetter("fee_amount")
        public Builder feeAmount(String feeAmount) {
            if (feeAmount == null) {
                throw new IllegalArgumentException("feeAmount cannot be null");
            }

            this.feeAmount = feeAmount;
            return this;
        }
        /**
         * Sets value for `feeCurrency`
         * Three-letter ISO currency code for the fee's currency.
         */
        @JsonSetter("fee_currency")
        public Builder feeCurrency(String feeCurrency) {
            if (feeCurrency == null) {
                throw new IllegalArgumentException("feeCurrency cannot be null");
            }

            this.feeCurrency = feeCurrency;
            return this;
        }
        /**
         * Sets value for `paymentCurrency`
         * Three letter ISO code for the currency of the payment.
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
         * Two-letter ISO country code for the payment's destination country.
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
         * The payment type the fee is applicable to, priority(Swift) or regular(local).
         */
        @JsonSetter("payment_type")
        public Builder paymentType(String paymentType) {
            if (paymentType == null) {
                throw new IllegalArgumentException("paymentType cannot be null");
            }

            this.paymentType = paymentType;
            return this;
        }

        @JsonAnySetter
        public Builder additionalProperty(String key, Object value) {
            this.additionalProperties.put(key, value);
            return this;
        }

        public Builder additionalProperties(Map<String, Object> additionalProperties) {
            this.additionalProperties.putAll(additionalProperties);
            return this;
        }



        public QuotePaymentFee build() {
            if (accountId == null) {
                throw new IllegalStateException("accountId is required");
            }

            if (chargeType == null) {
                throw new IllegalStateException("chargeType is required");
            }

            if (feeAmount == null) {
                throw new IllegalStateException("feeAmount is required");
            }

            if (feeCurrency == null) {
                throw new IllegalStateException("feeCurrency is required");
            }

            if (paymentCurrency == null) {
                throw new IllegalStateException("paymentCurrency is required");
            }

            if (paymentDestinationCountry == null) {
                throw new IllegalStateException("paymentDestinationCountry is required");
            }

            if (paymentType == null) {
                throw new IllegalStateException("paymentType is required");
            }

            return new QuotePaymentFee(this);
        }
    }

}



