
package com.currencycloud.sdk.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * PaymentsAssignPaymentFeeBody
 */
@JsonDeserialize(builder = PaymentsAssignPaymentFeeBody.Builder.class)
public final class PaymentsAssignPaymentFeeBody {
    /**
     * ID of the account to which the payment fee will be assigned.
     */
    private final String accountId;

    /**
     * ID of the payment fee entity that will be assigned to the account.
     */
    private final String paymentFeeId;


    private PaymentsAssignPaymentFeeBody(Builder builder) {
        this.accountId = builder.accountId;
        this.paymentFeeId = builder.paymentFeeId;
    }

    /**
     * Retrieves value for `accountId`
     * ID of the account to which the payment fee will be assigned.
     */
    @JsonProperty("account_id")
    public String getAccountId() {
        return accountId;
    }
    /**
     * Retrieves value for `paymentFeeId`
     * ID of the payment fee entity that will be assigned to the account.
     */
    @JsonProperty("payment_fee_id")
    public String getPaymentFeeId() {
        return paymentFeeId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof PaymentsAssignPaymentFeeBody &&
               equalTo((PaymentsAssignPaymentFeeBody) other);
    }

    private boolean equalTo(PaymentsAssignPaymentFeeBody other) {
        return
            accountId.equals(other.accountId) &&

            paymentFeeId.equals(other.paymentFeeId)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountId,
                   this.paymentFeeId
               );
    }

    @Override
    public String toString() {
        return "PaymentsAssignPaymentFeeBody{" +
               "accountId=" + accountId + ", " +
               "paymentFeeId=" + paymentFeeId +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * ID of the account to which the payment fee will be assigned.
         */
        private String accountId = null;

        /**
         * ID of the payment fee entity that will be assigned to the account.
         */
        private String paymentFeeId = null;


        private Builder() {}

        public Builder from(PaymentsAssignPaymentFeeBody other) {
            accountId(other.getAccountId());
            paymentFeeId(other.getPaymentFeeId());
            return this;
        }

        /**
         * Sets value for `accountId`
         * ID of the account to which the payment fee will be assigned.
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
         * Sets value for `paymentFeeId`
         * ID of the payment fee entity that will be assigned to the account.
         */
        @JsonSetter("payment_fee_id")
        public Builder paymentFeeId(String paymentFeeId) {
            if (paymentFeeId == null) {
                throw new IllegalArgumentException("paymentFeeId cannot be null");
            }

            this.paymentFeeId = paymentFeeId;
            return this;
        }



        public PaymentsAssignPaymentFeeBody build() {
            if (accountId == null) {
                throw new IllegalStateException("accountId is required");
            }

            if (paymentFeeId == null) {
                throw new IllegalStateException("paymentFeeId is required");
            }

            return new PaymentsAssignPaymentFeeBody(this);
        }
    }

}



