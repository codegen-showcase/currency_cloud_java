
package com.currencycloud.sdk.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * ConversionsSplitBody
 */
@JsonDeserialize(builder = ConversionsSplitBody.Builder.class)
public final class ConversionsSplitBody {
    /**
     * The amount at which to split this conversion.
     */
    private final String amount;


    private ConversionsSplitBody(Builder builder) {
        this.amount = builder.amount;
    }

    /**
     * Retrieves value for `amount`
     * The amount at which to split this conversion.
     */
    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof ConversionsSplitBody && equalTo((ConversionsSplitBody) other);
    }

    private boolean equalTo(ConversionsSplitBody other) {
        return
            amount.equals(other.amount)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.amount
               );
    }

    @Override
    public String toString() {
        return "ConversionsSplitBody{" +
               "amount=" + amount +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * The amount at which to split this conversion.
         */
        private String amount = null;


        private Builder() {}

        public Builder from(ConversionsSplitBody other) {
            amount(other.getAmount());
            return this;
        }

        /**
         * Sets value for `amount`
         * The amount at which to split this conversion.
         */
        @JsonSetter("amount")
        public Builder amount(String amount) {
            if (amount == null) {
                throw new IllegalArgumentException("amount cannot be null");
            }

            this.amount = amount;
            return this;
        }



        public ConversionsSplitBody build() {
            if (amount == null) {
                throw new IllegalStateException("amount is required");
            }

            return new ConversionsSplitBody(this);
        }
    }

}



