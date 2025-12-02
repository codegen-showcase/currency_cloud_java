
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Projected cost to cancel a conversion.
 */
@JsonDeserialize(builder = ConversionCancellationQuote.Builder.class)
public final class ConversionCancellationQuote {
    /**
     * The cost to cancel the conversion.
     */
    private final Optional<String> amount;

    /**
     * The currency of the cost to cancel the conversio - a three-letter ISO currency code.
     */
    private final Optional<String> currency;

    /**
     * The date and time of the conversion cancellation quote.
     */
    private final Optional<String> eventDateTime;


    private ConversionCancellationQuote(Builder builder) {
        this.amount = builder.amount;
        this.currency = builder.currency;
        this.eventDateTime = builder.eventDateTime;
    }

    /**
     * Retrieves value for `amount`
     * The cost to cancel the conversion.
     */
    @JsonProperty("amount")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAmount() {
        return amount;
    }
    /**
     * Retrieves value for `currency`
     * The currency of the cost to cancel the conversio - a three-letter ISO currency code.
     */
    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `eventDateTime`
     * The date and time of the conversion cancellation quote.
     */
    @JsonProperty("event_date_time")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getEventDateTime() {
        return eventDateTime;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof ConversionCancellationQuote && equalTo((ConversionCancellationQuote) other);
    }

    private boolean equalTo(ConversionCancellationQuote other) {
        return
            amount.equals(other.amount) &&

            currency.equals(other.currency) &&

            eventDateTime.equals(other.eventDateTime)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.amount,
                   this.currency,
                   this.eventDateTime
               );
    }

    @Override
    public String toString() {
        return "ConversionCancellationQuote{" +
               "amount=" + amount + ", " +
               "currency=" + currency + ", " +
               "eventDateTime=" + eventDateTime +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * The cost to cancel the conversion.
         */
        private Optional<String> amount = Optional.empty();

        /**
         * The currency of the cost to cancel the conversio - a three-letter ISO currency code.
         */
        private Optional<String> currency = Optional.empty();

        /**
         * The date and time of the conversion cancellation quote.
         */
        private Optional<String> eventDateTime = Optional.empty();


        private Builder() {}

        public Builder from(ConversionCancellationQuote other) {
            amount(other.getAmount());
            currency(other.getCurrency());
            eventDateTime(other.getEventDateTime());
            return this;
        }

        /**
         * Sets value for `amount`
         * The cost to cancel the conversion.
         */
        @JsonSetter("amount")
        public Builder amount(Optional<String> amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Sets value for `amount`
         * The cost to cancel the conversion.
         */
        public Builder amount(String amount) {
            return this.amount(Optional.ofNullable(amount));
        }
        /**
         * Sets value for `currency`
         * The currency of the cost to cancel the conversio - a three-letter ISO currency code.
         */
        @JsonSetter("currency")
        public Builder currency(Optional<String> currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Sets value for `currency`
         * The currency of the cost to cancel the conversio - a three-letter ISO currency code.
         */
        public Builder currency(String currency) {
            return this.currency(Optional.ofNullable(currency));
        }
        /**
         * Sets value for `eventDateTime`
         * The date and time of the conversion cancellation quote.
         */
        @JsonSetter("event_date_time")
        public Builder eventDateTime(Optional<String> eventDateTime) {
            this.eventDateTime = eventDateTime;
            return this;
        }

        /**
         * Sets value for `eventDateTime`
         * The date and time of the conversion cancellation quote.
         */
        public Builder eventDateTime(String eventDateTime) {
            return this.eventDateTime(Optional.ofNullable(eventDateTime));
        }



        public ConversionCancellationQuote build() {
            return new ConversionCancellationQuote(this);
        }
    }

}



