
package com.currencycloud.sdk.resources.payments.params;

import java.util.Objects;

import com.currencycloud.sdk.model.PaymentsGetDeliveryDatePaymentTypeEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * GetDeliveryDateRequest
 */
@JsonDeserialize(builder = GetDeliveryDateRequest.Builder.class)
public final class GetDeliveryDateRequest {
    /**
     * The two-letter ISO code of the country where the payment is sent.
     */
    private final String bankCountry;

    /**
     * The three-letter ISO code of the currency of the payment.
     */
    private final String currency;

    /**
     * The date when the payment will be released. Any valid ISO 8601 format, e.g. "2023-12-31".
     */
    private final String paymentDate;

    /**
     * Currencycloud supports two types of payments: "priority", made using the Swift network; and "regular", made using the local bank network.
     */
    private final PaymentsGetDeliveryDatePaymentTypeEnum paymentType;


    private GetDeliveryDateRequest(Builder builder) {
        this.bankCountry = builder.bankCountry;
        this.currency = builder.currency;
        this.paymentDate = builder.paymentDate;
        this.paymentType = builder.paymentType;
    }

    /**
     * Retrieves value for `bankCountry`
     * The two-letter ISO code of the country where the payment is sent.
     */
    @JsonProperty("bank_country")
    public String getBankCountry() {
        return bankCountry;
    }
    /**
     * Retrieves value for `currency`
     * The three-letter ISO code of the currency of the payment.
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `paymentDate`
     * The date when the payment will be released. Any valid ISO 8601 format, e.g. "2023-12-31".
     */
    @JsonProperty("payment_date")
    public String getPaymentDate() {
        return paymentDate;
    }
    /**
     * Retrieves value for `paymentType`
     * Currencycloud supports two types of payments: "priority", made using the Swift network; and "regular", made using the local bank network.
     */
    @JsonProperty("payment_type")
    public PaymentsGetDeliveryDatePaymentTypeEnum getPaymentType() {
        return paymentType;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof GetDeliveryDateRequest && equalTo((GetDeliveryDateRequest) other);
    }

    private boolean equalTo(GetDeliveryDateRequest other) {
        return
            bankCountry.equals(other.bankCountry) &&

            currency.equals(other.currency) &&

            paymentDate.equals(other.paymentDate) &&

            paymentType.equals(other.paymentType)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.bankCountry,
                   this.currency,
                   this.paymentDate,
                   this.paymentType
               );
    }

    @Override
    public String toString() {
        return "GetDeliveryDateRequest{" +
               "bankCountry=" + bankCountry + ", " +
               "currency=" + currency + ", " +
               "paymentDate=" + paymentDate + ", " +
               "paymentType=" + paymentType +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * The two-letter ISO code of the country where the payment is sent.
         */
        private String bankCountry = null;

        /**
         * The three-letter ISO code of the currency of the payment.
         */
        private String currency = null;

        /**
         * The date when the payment will be released. Any valid ISO 8601 format, e.g. "2023-12-31".
         */
        private String paymentDate = null;

        /**
         * Currencycloud supports two types of payments: "priority", made using the Swift network; and "regular", made using the local bank network.
         */
        private PaymentsGetDeliveryDatePaymentTypeEnum paymentType = null;


        private Builder() {}

        public Builder from(GetDeliveryDateRequest other) {
            bankCountry(other.getBankCountry());
            currency(other.getCurrency());
            paymentDate(other.getPaymentDate());
            paymentType(other.getPaymentType());
            return this;
        }

        /**
         * Sets value for `bankCountry`
         * The two-letter ISO code of the country where the payment is sent.
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
         * The three-letter ISO code of the currency of the payment.
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
         * Sets value for `paymentDate`
         * The date when the payment will be released. Any valid ISO 8601 format, e.g. "2023-12-31".
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
         * Sets value for `paymentType`
         * Currencycloud supports two types of payments: "priority", made using the Swift network; and "regular", made using the local bank network.
         */
        @JsonSetter("payment_type")
        public Builder paymentType(PaymentsGetDeliveryDatePaymentTypeEnum paymentType) {
            if (paymentType == null) {
                throw new IllegalArgumentException("paymentType cannot be null");
            }

            this.paymentType = paymentType;
            return this;
        }



        public GetDeliveryDateRequest build() {
            if (bankCountry == null) {
                throw new IllegalStateException("bankCountry is required");
            }

            if (currency == null) {
                throw new IllegalStateException("currency is required");
            }

            if (paymentDate == null) {
                throw new IllegalStateException("paymentDate is required");
            }

            if (paymentType == null) {
                throw new IllegalStateException("paymentType is required");
            }

            return new GetDeliveryDateRequest(this);
        }
    }

}



