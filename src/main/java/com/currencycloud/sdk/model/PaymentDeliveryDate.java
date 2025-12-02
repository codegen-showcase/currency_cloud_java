
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
 * Payment Delivery Date
 */
@JsonDeserialize(builder = PaymentDeliveryDate.Builder.class)
public final class PaymentDeliveryDate {
    /**
     * Country in which the beneficiary's bank account is held. Two-letter ISO country code.
     */
    private final String bankCountry;

    /**
     * The 3-letter ISO code for the currency of the payment.
     */
    private final String currency;

    /**
     * Calculated cut-off date and time.
     */
    private final String paymentCutoffTime;

    /**
     * The date when the payment will be released.
     */
    private final String paymentDate;

    /**
     * Date that we expect the payment to be delivered and available in the beneficiary bank account.
     */
    private final String paymentDeliveryDate;

    /**
     * Type of payment - priority (Swift) or regular (local).
     */
    private final String paymentType;

    private final Map<String, Object> additionalProperties;


    private PaymentDeliveryDate(Builder builder) {
        this.bankCountry = builder.bankCountry;
        this.currency = builder.currency;
        this.paymentCutoffTime = builder.paymentCutoffTime;
        this.paymentDate = builder.paymentDate;
        this.paymentDeliveryDate = builder.paymentDeliveryDate;
        this.paymentType = builder.paymentType;
        this.additionalProperties = builder.additionalProperties;
    }

    /**
     * Retrieves value for `bankCountry`
     * Country in which the beneficiary's bank account is held. Two-letter ISO country code.
     */
    @JsonProperty("bank_country")
    public String getBankCountry() {
        return bankCountry;
    }
    /**
     * Retrieves value for `currency`
     * The 3-letter ISO code for the currency of the payment.
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `paymentCutoffTime`
     * Calculated cut-off date and time.
     */
    @JsonProperty("payment_cutoff_time")
    public String getPaymentCutoffTime() {
        return paymentCutoffTime;
    }
    /**
     * Retrieves value for `paymentDate`
     * The date when the payment will be released.
     */
    @JsonProperty("payment_date")
    public String getPaymentDate() {
        return paymentDate;
    }
    /**
     * Retrieves value for `paymentDeliveryDate`
     * Date that we expect the payment to be delivered and available in the beneficiary bank account.
     */
    @JsonProperty("payment_delivery_date")
    public String getPaymentDeliveryDate() {
        return paymentDeliveryDate;
    }
    /**
     * Retrieves value for `paymentType`
     * Type of payment - priority (Swift) or regular (local).
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

        return other instanceof PaymentDeliveryDate && equalTo((PaymentDeliveryDate) other);
    }

    private boolean equalTo(PaymentDeliveryDate other) {
        return
            bankCountry.equals(other.bankCountry) &&

            currency.equals(other.currency) &&

            paymentCutoffTime.equals(other.paymentCutoffTime) &&

            paymentDate.equals(other.paymentDate) &&

            paymentDeliveryDate.equals(other.paymentDeliveryDate) &&

            paymentType.equals(other.paymentType)
            &&
            additionalProperties.equals(other.additionalProperties)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.bankCountry,
                   this.currency,
                   this.paymentCutoffTime,
                   this.paymentDate,
                   this.paymentDeliveryDate,
                   this.paymentType
                   ,
                   this.additionalProperties
               );
    }

    @Override
    public String toString() {
        return "PaymentDeliveryDate{" +
               "bankCountry=" + bankCountry + ", " +
               "currency=" + currency + ", " +
               "paymentCutoffTime=" + paymentCutoffTime + ", " +
               "paymentDate=" + paymentDate + ", " +
               "paymentDeliveryDate=" + paymentDeliveryDate + ", " +
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
         * Country in which the beneficiary's bank account is held. Two-letter ISO country code.
         */
        private String bankCountry = null;

        /**
         * The 3-letter ISO code for the currency of the payment.
         */
        private String currency = null;

        /**
         * Calculated cut-off date and time.
         */
        private String paymentCutoffTime = null;

        /**
         * The date when the payment will be released.
         */
        private String paymentDate = null;

        /**
         * Date that we expect the payment to be delivered and available in the beneficiary bank account.
         */
        private String paymentDeliveryDate = null;

        /**
         * Type of payment - priority (Swift) or regular (local).
         */
        private String paymentType = null;

        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(PaymentDeliveryDate other) {
            bankCountry(other.getBankCountry());
            currency(other.getCurrency());
            paymentCutoffTime(other.getPaymentCutoffTime());
            paymentDate(other.getPaymentDate());
            paymentDeliveryDate(other.getPaymentDeliveryDate());
            paymentType(other.getPaymentType());
            additionalProperties(other.getAdditionalProperties());
            return this;
        }

        /**
         * Sets value for `bankCountry`
         * Country in which the beneficiary's bank account is held. Two-letter ISO country code.
         */
        @JsonSetter("bank_country")
        public Builder bankCountry(String bankCountry) {
            if (bankCountry == null) {
                throw new IllegalArgumentException("bankCountry cannot be null");
            }

            this.bankCountry = bankCountry;
            return this;
        }
        /**
         * Sets value for `currency`
         * The 3-letter ISO code for the currency of the payment.
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
         * Sets value for `paymentCutoffTime`
         * Calculated cut-off date and time.
         */
        @JsonSetter("payment_cutoff_time")
        public Builder paymentCutoffTime(String paymentCutoffTime) {
            if (paymentCutoffTime == null) {
                throw new IllegalArgumentException("paymentCutoffTime cannot be null");
            }

            this.paymentCutoffTime = paymentCutoffTime;
            return this;
        }
        /**
         * Sets value for `paymentDate`
         * The date when the payment will be released.
         */
        @JsonSetter("payment_date")
        public Builder paymentDate(String paymentDate) {
            if (paymentDate == null) {
                throw new IllegalArgumentException("paymentDate cannot be null");
            }

            this.paymentDate = paymentDate;
            return this;
        }
        /**
         * Sets value for `paymentDeliveryDate`
         * Date that we expect the payment to be delivered and available in the beneficiary bank account.
         */
        @JsonSetter("payment_delivery_date")
        public Builder paymentDeliveryDate(String paymentDeliveryDate) {
            if (paymentDeliveryDate == null) {
                throw new IllegalArgumentException("paymentDeliveryDate cannot be null");
            }

            this.paymentDeliveryDate = paymentDeliveryDate;
            return this;
        }
        /**
         * Sets value for `paymentType`
         * Type of payment - priority (Swift) or regular (local).
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



        public PaymentDeliveryDate build() {
            if (bankCountry == null) {
                throw new IllegalStateException("bankCountry is required");
            }

            if (currency == null) {
                throw new IllegalStateException("currency is required");
            }

            if (paymentCutoffTime == null) {
                throw new IllegalStateException("paymentCutoffTime is required");
            }

            if (paymentDate == null) {
                throw new IllegalStateException("paymentDate is required");
            }

            if (paymentDeliveryDate == null) {
                throw new IllegalStateException("paymentDeliveryDate is required");
            }

            if (paymentType == null) {
                throw new IllegalStateException("paymentType is required");
            }

            return new PaymentDeliveryDate(this);
        }
    }

}



