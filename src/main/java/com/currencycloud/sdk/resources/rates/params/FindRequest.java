
package com.currencycloud.sdk.resources.rates.params;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * FindRequest
 */
@JsonDeserialize(builder = FindRequest.Builder.class)
public final class FindRequest {
    /**
     * Concatenated string of the two currencies traded, e.g. "USDEUR". More than one pair can be entered, separated by a comma e.g. "EURGBP,GBPUSD,EURUSD".
     */
    private final String currencyPair;

    /**
     * Ignore the validation of currency pairs.
     */
    private final Optional<Boolean> ignoreInvalidPairs;

    /**
     * A contact UUID for the sub-account you're acting on behalf of.
     */
    private final Optional<String> onBehalfOf;


    private FindRequest(Builder builder) {
        this.currencyPair = builder.currencyPair;
        this.ignoreInvalidPairs = builder.ignoreInvalidPairs;
        this.onBehalfOf = builder.onBehalfOf;
    }

    /**
     * Retrieves value for `currencyPair`
     * Concatenated string of the two currencies traded, e.g. "USDEUR". More than one pair can be entered, separated by a comma e.g. "EURGBP,GBPUSD,EURUSD".
     */
    @JsonProperty("currency_pair")
    public String getCurrencyPair() {
        return currencyPair;
    }
    /**
     * Retrieves value for `ignoreInvalidPairs`
     * Ignore the validation of currency pairs.
     */
    @JsonProperty("ignore_invalid_pairs")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getIgnoreInvalidPairs() {
        return ignoreInvalidPairs;
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

        return other instanceof FindRequest && equalTo((FindRequest) other);
    }

    private boolean equalTo(FindRequest other) {
        return
            currencyPair.equals(other.currencyPair) &&

            ignoreInvalidPairs.equals(other.ignoreInvalidPairs) &&

            onBehalfOf.equals(other.onBehalfOf)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.currencyPair,
                   this.ignoreInvalidPairs,
                   this.onBehalfOf
               );
    }

    @Override
    public String toString() {
        return "FindRequest{" +
               "currencyPair=" + currencyPair + ", " +
               "ignoreInvalidPairs=" + ignoreInvalidPairs + ", " +
               "onBehalfOf=" + onBehalfOf +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Concatenated string of the two currencies traded, e.g. "USDEUR". More than one pair can be entered, separated by a comma e.g. "EURGBP,GBPUSD,EURUSD".
         */
        private String currencyPair = null;

        /**
         * Ignore the validation of currency pairs.
         */
        private Optional<Boolean> ignoreInvalidPairs = Optional.empty();

        /**
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        private Optional<String> onBehalfOf = Optional.empty();


        private Builder() {}

        public Builder from(FindRequest other) {
            currencyPair(other.getCurrencyPair());
            ignoreInvalidPairs(other.getIgnoreInvalidPairs());
            onBehalfOf(other.getOnBehalfOf());
            return this;
        }

        /**
         * Sets value for `currencyPair`
         * Concatenated string of the two currencies traded, e.g. "USDEUR". More than one pair can be entered, separated by a comma e.g. "EURGBP,GBPUSD,EURUSD".
         */
        @JsonSetter("currency_pair")
        public Builder currencyPair(String currencyPair) {
            if (currencyPair == null) {
                throw new IllegalArgumentException("currencyPair cannot be null");
            }

            this.currencyPair = currencyPair;
            return this;
        }
        /**
         * Sets value for `ignoreInvalidPairs`
         * Ignore the validation of currency pairs.
         */
        @JsonSetter("ignore_invalid_pairs")
        public Builder ignoreInvalidPairs(Optional<Boolean> ignoreInvalidPairs) {
            this.ignoreInvalidPairs = ignoreInvalidPairs;
            return this;
        }

        /**
         * Sets value for `ignoreInvalidPairs`
         * Ignore the validation of currency pairs.
         */
        public Builder ignoreInvalidPairs(Boolean ignoreInvalidPairs) {
            return this.ignoreInvalidPairs(Optional.ofNullable(ignoreInvalidPairs));
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



        public FindRequest build() {
            if (currencyPair == null) {
                throw new IllegalStateException("currencyPair is required");
            }

            return new FindRequest(this);
        }
    }

}



