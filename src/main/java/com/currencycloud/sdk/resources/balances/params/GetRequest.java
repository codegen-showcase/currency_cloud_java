
package com.currencycloud.sdk.resources.balances.params;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * GetRequest
 */
@JsonDeserialize(builder = GetRequest.Builder.class)
public final class GetRequest {
    /**
     * Three-letter ISO currency code.
     */
    private final String currency;

    /**
     * A contact UUID for the sub-account you're acting on behalf of.
     */
    private final Optional<String> onBehalfOf;


    private GetRequest(Builder builder) {
        this.currency = builder.currency;
        this.onBehalfOf = builder.onBehalfOf;
    }

    /**
     * Retrieves value for `currency`
     * Three-letter ISO currency code.
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

        return other instanceof GetRequest && equalTo((GetRequest) other);
    }

    private boolean equalTo(GetRequest other) {
        return
            currency.equals(other.currency) &&

            onBehalfOf.equals(other.onBehalfOf)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.currency,
                   this.onBehalfOf
               );
    }

    @Override
    public String toString() {
        return "GetRequest{" +
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
         * Three-letter ISO currency code.
         */
        private String currency = null;

        /**
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        private Optional<String> onBehalfOf = Optional.empty();


        private Builder() {}

        public Builder from(GetRequest other) {
            currency(other.getCurrency());
            onBehalfOf(other.getOnBehalfOf());
            return this;
        }

        /**
         * Sets value for `currency`
         * Three-letter ISO currency code.
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



        public GetRequest build() {
            if (currency == null) {
                throw new IllegalStateException("currency is required");
            }

            return new GetRequest(this);
        }
    }

}



