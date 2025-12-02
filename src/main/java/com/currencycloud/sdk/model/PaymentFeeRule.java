
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
 * Payment fee rule.
 */
@JsonDeserialize(builder = PaymentFeeRule.Builder.class)
public final class PaymentFeeRule {
    /**
     * The charge type the fee is applicable to.
     */
    private final String chargeType;

    /**
     * The fee amount.
     */
    private final String feeAmount;

    /**
     * The fee currency.
     */
    private final String feeCurrency;

    /**
     * The ID of payment level rule.
     */
    private final String paymentFeeId;

    /**
     * The name of payment level fee table.
     */
    private final String paymentFeeName;

    /**
     * The payment type the fee is applicable to, priority(Swift) or regular(local).
     */
    private final String paymentType;

    private final Map<String, Object> additionalProperties;


    private PaymentFeeRule(Builder builder) {
        this.chargeType = builder.chargeType;
        this.feeAmount = builder.feeAmount;
        this.feeCurrency = builder.feeCurrency;
        this.paymentFeeId = builder.paymentFeeId;
        this.paymentFeeName = builder.paymentFeeName;
        this.paymentType = builder.paymentType;
        this.additionalProperties = builder.additionalProperties;
    }

    /**
     * Retrieves value for `chargeType`
     * The charge type the fee is applicable to.
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
     * The fee currency.
     */
    @JsonProperty("fee_currency")
    public String getFeeCurrency() {
        return feeCurrency;
    }
    /**
     * Retrieves value for `paymentFeeId`
     * The ID of payment level rule.
     */
    @JsonProperty("payment_fee_id")
    public String getPaymentFeeId() {
        return paymentFeeId;
    }
    /**
     * Retrieves value for `paymentFeeName`
     * The name of payment level fee table.
     */
    @JsonProperty("payment_fee_name")
    public String getPaymentFeeName() {
        return paymentFeeName;
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

        return other instanceof PaymentFeeRule && equalTo((PaymentFeeRule) other);
    }

    private boolean equalTo(PaymentFeeRule other) {
        return
            chargeType.equals(other.chargeType) &&

            feeAmount.equals(other.feeAmount) &&

            feeCurrency.equals(other.feeCurrency) &&

            paymentFeeId.equals(other.paymentFeeId) &&

            paymentFeeName.equals(other.paymentFeeName) &&

            paymentType.equals(other.paymentType)
            &&
            additionalProperties.equals(other.additionalProperties)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.chargeType,
                   this.feeAmount,
                   this.feeCurrency,
                   this.paymentFeeId,
                   this.paymentFeeName,
                   this.paymentType
                   ,
                   this.additionalProperties
               );
    }

    @Override
    public String toString() {
        return "PaymentFeeRule{" +
               "chargeType=" + chargeType + ", " +
               "feeAmount=" + feeAmount + ", " +
               "feeCurrency=" + feeCurrency + ", " +
               "paymentFeeId=" + paymentFeeId + ", " +
               "paymentFeeName=" + paymentFeeName + ", " +
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
         * The charge type the fee is applicable to.
         */
        private String chargeType = null;

        /**
         * The fee amount.
         */
        private String feeAmount = null;

        /**
         * The fee currency.
         */
        private String feeCurrency = null;

        /**
         * The ID of payment level rule.
         */
        private String paymentFeeId = null;

        /**
         * The name of payment level fee table.
         */
        private String paymentFeeName = null;

        /**
         * The payment type the fee is applicable to, priority(Swift) or regular(local).
         */
        private String paymentType = null;

        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(PaymentFeeRule other) {
            chargeType(other.getChargeType());
            feeAmount(other.getFeeAmount());
            feeCurrency(other.getFeeCurrency());
            paymentFeeId(other.getPaymentFeeId());
            paymentFeeName(other.getPaymentFeeName());
            paymentType(other.getPaymentType());
            additionalProperties(other.getAdditionalProperties());
            return this;
        }

        /**
         * Sets value for `chargeType`
         * The charge type the fee is applicable to.
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
         * The fee currency.
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
         * Sets value for `paymentFeeId`
         * The ID of payment level rule.
         */
        @JsonSetter("payment_fee_id")
        public Builder paymentFeeId(String paymentFeeId) {
            if (paymentFeeId == null) {
                throw new IllegalArgumentException("paymentFeeId cannot be null");
            }

            this.paymentFeeId = paymentFeeId;
            return this;
        }
        /**
         * Sets value for `paymentFeeName`
         * The name of payment level fee table.
         */
        @JsonSetter("payment_fee_name")
        public Builder paymentFeeName(String paymentFeeName) {
            if (paymentFeeName == null) {
                throw new IllegalArgumentException("paymentFeeName cannot be null");
            }

            this.paymentFeeName = paymentFeeName;
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



        public PaymentFeeRule build() {
            if (chargeType == null) {
                throw new IllegalStateException("chargeType is required");
            }

            if (feeAmount == null) {
                throw new IllegalStateException("feeAmount is required");
            }

            if (feeCurrency == null) {
                throw new IllegalStateException("feeCurrency is required");
            }

            if (paymentFeeId == null) {
                throw new IllegalStateException("paymentFeeId is required");
            }

            if (paymentFeeName == null) {
                throw new IllegalStateException("paymentFeeName is required");
            }

            if (paymentType == null) {
                throw new IllegalStateException("paymentType is required");
            }

            return new PaymentFeeRule(this);
        }
    }

}



