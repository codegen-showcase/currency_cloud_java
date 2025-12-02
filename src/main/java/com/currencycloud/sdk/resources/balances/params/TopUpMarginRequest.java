
package com.currencycloud.sdk.resources.balances.params;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * TopUpMarginRequest
 */
@JsonDeserialize(builder = TopUpMarginRequest.Builder.class)
public final class TopUpMarginRequest {
    /**
     * Amount to top up.
     */
    private final String amount;

    /**
     * Three-letter ISO currency code for the currency to top up.
     */
    private final String currency;

    /**
     * A contact UUID for the sub-account you're acting on behalf of.
     */
    private final Optional<String> onBehalfOf;


    private TopUpMarginRequest(Builder builder) {
        this.amount = builder.amount;
        this.currency = builder.currency;
        this.onBehalfOf = builder.onBehalfOf;
    }

    /**
     * Retrieves value for `amount`
     * Amount to top up.
     */
    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }
    /**
     * Retrieves value for `currency`
     * Three-letter ISO currency code for the currency to top up.
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `onBehalfOf`
     * A contact UUID for the sub-account you're acting on behalf of.
     */
    @JsonProperty("on_behalf_of")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getOnBehalfOf() {
        return onBehalfOf;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof TopUpMarginRequest && equalTo((TopUpMarginRequest) other);
    }

    private boolean equalTo(TopUpMarginRequest other) {
        return
            amount.equals(other.amount) &&

            currency.equals(other.currency) &&

            onBehalfOf.equals(other.onBehalfOf)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.amount,
                   this.currency,
                   this.onBehalfOf
               );
    }

    @Override
    public String toString() {
        return "TopUpMarginRequest{" +
               "amount=" + amount + ", " +
               "currency=" + currency + ", " +
               "onBehalfOf=" + onBehalfOf +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Amount to top up.
         */
        private String amount = null;

        /**
         * Three-letter ISO currency code for the currency to top up.
         */
        private String currency = null;

        /**
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        private Optional<String> onBehalfOf = Optional.empty();


        private Builder() {}

        public Builder from(TopUpMarginRequest other) {
            amount(other.getAmount());
            currency(other.getCurrency());
            onBehalfOf(other.getOnBehalfOf());
            return this;
        }

        /**
         * Sets value for `amount`
         * Amount to top up.
         */
        @JsonSetter("amount")
        public Builder amount(String amount) {
            if (amount == null) {
                throw new IllegalArgumentException("amount cannot be null");
            }

            this.amount = amount;
            return this;
        }
        /**
         * Sets value for `currency`
         * Three-letter ISO currency code for the currency to top up.
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
         * Sets value for `onBehalfOf`
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        @JsonSetter("on_behalf_of")
        public Builder onBehalfOf(Optional<String> onBehalfOf) {
            this.onBehalfOf = onBehalfOf;
            return this;
        }

        /**
         * Sets value for `onBehalfOf`
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        public Builder onBehalfOf(String onBehalfOf) {
            return this.onBehalfOf(Optional.ofNullable(onBehalfOf));
        }



        public TopUpMarginRequest build() {
            if (amount == null) {
                throw new IllegalStateException("amount is required");
            }

            if (currency == null) {
                throw new IllegalStateException("currency is required");
            }

            return new TopUpMarginRequest(this);
        }
    }

}



