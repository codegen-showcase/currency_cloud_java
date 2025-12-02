
package com.currencycloud.sdk.resources.withdrawalaccounts.find.params;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * PullFundsRequest
 */
@JsonDeserialize(builder = PullFundsRequest.Builder.class)
public final class PullFundsRequest {
    /**
     * The amount of funds to pull in USD.
     */
    private final Double amount;

    /**
     * The reference you want on the statement.
     */
    private final String reference;

    /**
     * The withdrawal account ID you want to pull the funds from. The funds will be pulled into the account ID related to this withdrawal account.
     */
    private final String withdrawalAccountId;


    private PullFundsRequest(Builder builder) {
        this.amount = builder.amount;
        this.reference = builder.reference;
        this.withdrawalAccountId = builder.withdrawalAccountId;
    }

    /**
     * Retrieves value for `amount`
     * The amount of funds to pull in USD.
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }
    /**
     * Retrieves value for `reference`
     * The reference you want on the statement.
     */
    @JsonProperty("reference")
    public String getReference() {
        return reference;
    }
    /**
     * Retrieves value for `withdrawalAccountId`
     * The withdrawal account ID you want to pull the funds from. The funds will be pulled into the account ID related to this withdrawal account.
     */
    @JsonProperty("withdrawal_account_id")
    public String getWithdrawalAccountId() {
        return withdrawalAccountId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof PullFundsRequest && equalTo((PullFundsRequest) other);
    }

    private boolean equalTo(PullFundsRequest other) {
        return
            amount.equals(other.amount) &&

            reference.equals(other.reference) &&

            withdrawalAccountId.equals(other.withdrawalAccountId)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.amount,
                   this.reference,
                   this.withdrawalAccountId
               );
    }

    @Override
    public String toString() {
        return "PullFundsRequest{" +
               "amount=" + amount + ", " +
               "reference=" + reference + ", " +
               "withdrawalAccountId=" + withdrawalAccountId +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * The amount of funds to pull in USD.
         */
        private Double amount = null;

        /**
         * The reference you want on the statement.
         */
        private String reference = null;

        /**
         * The withdrawal account ID you want to pull the funds from. The funds will be pulled into the account ID related to this withdrawal account.
         */
        private String withdrawalAccountId = null;


        private Builder() {}

        public Builder from(PullFundsRequest other) {
            amount(other.getAmount());
            reference(other.getReference());
            withdrawalAccountId(other.getWithdrawalAccountId());
            return this;
        }

        /**
         * Sets value for `amount`
         * The amount of funds to pull in USD.
         */
        @JsonSetter("amount")
        public Builder amount(Double amount) {
            if (amount == null) {
                throw new IllegalArgumentException("amount cannot be null");
            }

            this.amount = amount;
            return this;
        }
        /**
         * Sets value for `reference`
         * The reference you want on the statement.
         */
        @JsonSetter("reference")
        public Builder reference(String reference) {
            if (reference == null) {
                throw new IllegalArgumentException("reference cannot be null");
            }

            this.reference = reference;
            return this;
        }
        /**
         * Sets value for `withdrawalAccountId`
         * The withdrawal account ID you want to pull the funds from. The funds will be pulled into the account ID related to this withdrawal account.
         */
        @JsonSetter("withdrawal_account_id")
        public Builder withdrawalAccountId(String withdrawalAccountId) {
            if (withdrawalAccountId == null) {
                throw new IllegalArgumentException("withdrawalAccountId cannot be null");
            }

            this.withdrawalAccountId = withdrawalAccountId;
            return this;
        }



        public PullFundsRequest build() {
            if (amount == null) {
                throw new IllegalStateException("amount is required");
            }

            if (reference == null) {
                throw new IllegalStateException("reference is required");
            }

            if (withdrawalAccountId == null) {
                throw new IllegalStateException("withdrawalAccountId is required");
            }

            return new PullFundsRequest(this);
        }
    }

}



