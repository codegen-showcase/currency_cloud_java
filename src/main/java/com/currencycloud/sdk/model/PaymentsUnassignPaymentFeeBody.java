
package com.currencycloud.sdk.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * PaymentsUnassignPaymentFeeBody
 */
@JsonDeserialize(builder = PaymentsUnassignPaymentFeeBody.Builder.class)
public final class PaymentsUnassignPaymentFeeBody {
    /**
     * Sub-account UUID for which the payment level fee will be un-assigned.
     */
    private final String accountId;


    private PaymentsUnassignPaymentFeeBody(Builder builder) {
        this.accountId = builder.accountId;
    }

    /**
     * Retrieves value for `accountId`
     * Sub-account UUID for which the payment level fee will be un-assigned.
     */
    @JsonProperty("account_id")
    public String getAccountId() {
        return accountId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof PaymentsUnassignPaymentFeeBody &&
               equalTo((PaymentsUnassignPaymentFeeBody) other);
    }

    private boolean equalTo(PaymentsUnassignPaymentFeeBody other) {
        return
            accountId.equals(other.accountId)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountId
               );
    }

    @Override
    public String toString() {
        return "PaymentsUnassignPaymentFeeBody{" +
               "accountId=" + accountId +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Sub-account UUID for which the payment level fee will be un-assigned.
         */
        private String accountId = null;


        private Builder() {}

        public Builder from(PaymentsUnassignPaymentFeeBody other) {
            accountId(other.getAccountId());
            return this;
        }

        /**
         * Sets value for `accountId`
         * Sub-account UUID for which the payment level fee will be un-assigned.
         */
        @JsonSetter("account_id")
        public Builder accountId(String accountId) {
            if (accountId == null) {
                throw new IllegalArgumentException("accountId cannot be null");
            }

            this.accountId = accountId;
            return this;
        }



        public PaymentsUnassignPaymentFeeBody build() {
            if (accountId == null) {
                throw new IllegalStateException("accountId is required");
            }

            return new PaymentsUnassignPaymentFeeBody(this);
        }
    }

}



