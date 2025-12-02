
package com.currencycloud.sdk.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * WithdrawalAccountsFindPullFundsBody
 */
@JsonDeserialize(builder = WithdrawalAccountsFindPullFundsBody.Builder.class)
public final class WithdrawalAccountsFindPullFundsBody {
    /**
     * The amount of funds to pull in USD.
     */
    private final Double amount;

    /**
     * The reference you want on the statement.
     */
    private final String reference;


    private WithdrawalAccountsFindPullFundsBody(Builder builder) {
        this.amount = builder.amount;
        this.reference = builder.reference;
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

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof WithdrawalAccountsFindPullFundsBody &&
               equalTo((WithdrawalAccountsFindPullFundsBody) other);
    }

    private boolean equalTo(WithdrawalAccountsFindPullFundsBody other) {
        return
            amount.equals(other.amount) &&

            reference.equals(other.reference)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.amount,
                   this.reference
               );
    }

    @Override
    public String toString() {
        return "WithdrawalAccountsFindPullFundsBody{" +
               "amount=" + amount + ", " +
               "reference=" + reference +
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


        private Builder() {}

        public Builder from(WithdrawalAccountsFindPullFundsBody other) {
            amount(other.getAmount());
            reference(other.getReference());
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



        public WithdrawalAccountsFindPullFundsBody build() {
            if (amount == null) {
                throw new IllegalStateException("amount is required");
            }

            if (reference == null) {
                throw new IllegalStateException("reference is required");
            }

            return new WithdrawalAccountsFindPullFundsBody(this);
        }
    }

}



