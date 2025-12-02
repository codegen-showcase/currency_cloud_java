
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Conversion Date change record
 */
@JsonDeserialize(builder = ConversionDateChange.Builder.class)
public final class ConversionDateChange {
    /**
     * The cost of changing the date of the conversion.
     */
    private final Optional<String> amount;

    /**
     * UUID of the Conversion.
     */
    private final Optional<String> conversionId;

    /**
     * The currency of the cost to change the conversion date. A three-letter ISO currency code.
     */
    private final Optional<String> currency;

    /**
     * The date and time of the date change or date change quote.
     */
    private final Optional<String> eventDateTime;

    /**
     * The new date the conversion will be made.
     */
    private final Optional<String> newConversionDate;

    /**
     * The new date and time by which funds need to be available to settle the trade.
     */
    private final Optional<String> newSettlementDate;

    /**
     * The previous date the conversion was to be made.
     */
    private final Optional<String> oldConversionDate;

    /**
     * The previous date and time by which funds needed to be available to settle the trade.
     */
    private final Optional<String> oldSettlementDate;


    private ConversionDateChange(Builder builder) {
        this.amount = builder.amount;
        this.conversionId = builder.conversionId;
        this.currency = builder.currency;
        this.eventDateTime = builder.eventDateTime;
        this.newConversionDate = builder.newConversionDate;
        this.newSettlementDate = builder.newSettlementDate;
        this.oldConversionDate = builder.oldConversionDate;
        this.oldSettlementDate = builder.oldSettlementDate;
    }

    /**
     * Retrieves value for `amount`
     * The cost of changing the date of the conversion.
     */
    @JsonProperty("amount")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAmount() {
        return amount;
    }
    /**
     * Retrieves value for `conversionId`
     * UUID of the Conversion.
     */
    @JsonProperty("conversion_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getConversionId() {
        return conversionId;
    }
    /**
     * Retrieves value for `currency`
     * The currency of the cost to change the conversion date. A three-letter ISO currency code.
     */
    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `eventDateTime`
     * The date and time of the date change or date change quote.
     */
    @JsonProperty("event_date_time")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getEventDateTime() {
        return eventDateTime;
    }
    /**
     * Retrieves value for `newConversionDate`
     * The new date the conversion will be made.
     */
    @JsonProperty("new_conversion_date")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getNewConversionDate() {
        return newConversionDate;
    }
    /**
     * Retrieves value for `newSettlementDate`
     * The new date and time by which funds need to be available to settle the trade.
     */
    @JsonProperty("new_settlement_date")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getNewSettlementDate() {
        return newSettlementDate;
    }
    /**
     * Retrieves value for `oldConversionDate`
     * The previous date the conversion was to be made.
     */
    @JsonProperty("old_conversion_date")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getOldConversionDate() {
        return oldConversionDate;
    }
    /**
     * Retrieves value for `oldSettlementDate`
     * The previous date and time by which funds needed to be available to settle the trade.
     */
    @JsonProperty("old_settlement_date")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getOldSettlementDate() {
        return oldSettlementDate;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof ConversionDateChange && equalTo((ConversionDateChange) other);
    }

    private boolean equalTo(ConversionDateChange other) {
        return
            amount.equals(other.amount) &&

            conversionId.equals(other.conversionId) &&

            currency.equals(other.currency) &&

            eventDateTime.equals(other.eventDateTime) &&

            newConversionDate.equals(other.newConversionDate) &&

            newSettlementDate.equals(other.newSettlementDate) &&

            oldConversionDate.equals(other.oldConversionDate) &&

            oldSettlementDate.equals(other.oldSettlementDate)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.amount,
                   this.conversionId,
                   this.currency,
                   this.eventDateTime,
                   this.newConversionDate,
                   this.newSettlementDate,
                   this.oldConversionDate,
                   this.oldSettlementDate
               );
    }

    @Override
    public String toString() {
        return "ConversionDateChange{" +
               "amount=" + amount + ", " +
               "conversionId=" + conversionId + ", " +
               "currency=" + currency + ", " +
               "eventDateTime=" + eventDateTime + ", " +
               "newConversionDate=" + newConversionDate + ", " +
               "newSettlementDate=" + newSettlementDate + ", " +
               "oldConversionDate=" + oldConversionDate + ", " +
               "oldSettlementDate=" + oldSettlementDate +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * The cost of changing the date of the conversion.
         */
        private Optional<String> amount = Optional.empty();

        /**
         * UUID of the Conversion.
         */
        private Optional<String> conversionId = Optional.empty();

        /**
         * The currency of the cost to change the conversion date. A three-letter ISO currency code.
         */
        private Optional<String> currency = Optional.empty();

        /**
         * The date and time of the date change or date change quote.
         */
        private Optional<String> eventDateTime = Optional.empty();

        /**
         * The new date the conversion will be made.
         */
        private Optional<String> newConversionDate = Optional.empty();

        /**
         * The new date and time by which funds need to be available to settle the trade.
         */
        private Optional<String> newSettlementDate = Optional.empty();

        /**
         * The previous date the conversion was to be made.
         */
        private Optional<String> oldConversionDate = Optional.empty();

        /**
         * The previous date and time by which funds needed to be available to settle the trade.
         */
        private Optional<String> oldSettlementDate = Optional.empty();


        private Builder() {}

        public Builder from(ConversionDateChange other) {
            amount(other.getAmount());
            conversionId(other.getConversionId());
            currency(other.getCurrency());
            eventDateTime(other.getEventDateTime());
            newConversionDate(other.getNewConversionDate());
            newSettlementDate(other.getNewSettlementDate());
            oldConversionDate(other.getOldConversionDate());
            oldSettlementDate(other.getOldSettlementDate());
            return this;
        }

        /**
         * Sets value for `amount`
         * The cost of changing the date of the conversion.
         */
        @JsonSetter("amount")
        public Builder amount(Optional<String> amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Sets value for `amount`
         * The cost of changing the date of the conversion.
         */
        public Builder amount(String amount) {
            return this.amount(Optional.ofNullable(amount));
        }
        /**
         * Sets value for `conversionId`
         * UUID of the Conversion.
         */
        @JsonSetter("conversion_id")
        public Builder conversionId(Optional<String> conversionId) {
            this.conversionId = conversionId;
            return this;
        }

        /**
         * Sets value for `conversionId`
         * UUID of the Conversion.
         */
        public Builder conversionId(String conversionId) {
            return this.conversionId(Optional.ofNullable(conversionId));
        }
        /**
         * Sets value for `currency`
         * The currency of the cost to change the conversion date. A three-letter ISO currency code.
         */
        @JsonSetter("currency")
        public Builder currency(Optional<String> currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Sets value for `currency`
         * The currency of the cost to change the conversion date. A three-letter ISO currency code.
         */
        public Builder currency(String currency) {
            return this.currency(Optional.ofNullable(currency));
        }
        /**
         * Sets value for `eventDateTime`
         * The date and time of the date change or date change quote.
         */
        @JsonSetter("event_date_time")
        public Builder eventDateTime(Optional<String> eventDateTime) {
            this.eventDateTime = eventDateTime;
            return this;
        }

        /**
         * Sets value for `eventDateTime`
         * The date and time of the date change or date change quote.
         */
        public Builder eventDateTime(String eventDateTime) {
            return this.eventDateTime(Optional.ofNullable(eventDateTime));
        }
        /**
         * Sets value for `newConversionDate`
         * The new date the conversion will be made.
         */
        @JsonSetter("new_conversion_date")
        public Builder newConversionDate(Optional<String> newConversionDate) {
            this.newConversionDate = newConversionDate;
            return this;
        }

        /**
         * Sets value for `newConversionDate`
         * The new date the conversion will be made.
         */
        public Builder newConversionDate(String newConversionDate) {
            return this.newConversionDate(Optional.ofNullable(newConversionDate));
        }
        /**
         * Sets value for `newSettlementDate`
         * The new date and time by which funds need to be available to settle the trade.
         */
        @JsonSetter("new_settlement_date")
        public Builder newSettlementDate(Optional<String> newSettlementDate) {
            this.newSettlementDate = newSettlementDate;
            return this;
        }

        /**
         * Sets value for `newSettlementDate`
         * The new date and time by which funds need to be available to settle the trade.
         */
        public Builder newSettlementDate(String newSettlementDate) {
            return this.newSettlementDate(Optional.ofNullable(newSettlementDate));
        }
        /**
         * Sets value for `oldConversionDate`
         * The previous date the conversion was to be made.
         */
        @JsonSetter("old_conversion_date")
        public Builder oldConversionDate(Optional<String> oldConversionDate) {
            this.oldConversionDate = oldConversionDate;
            return this;
        }

        /**
         * Sets value for `oldConversionDate`
         * The previous date the conversion was to be made.
         */
        public Builder oldConversionDate(String oldConversionDate) {
            return this.oldConversionDate(Optional.ofNullable(oldConversionDate));
        }
        /**
         * Sets value for `oldSettlementDate`
         * The previous date and time by which funds needed to be available to settle the trade.
         */
        @JsonSetter("old_settlement_date")
        public Builder oldSettlementDate(Optional<String> oldSettlementDate) {
            this.oldSettlementDate = oldSettlementDate;
            return this;
        }

        /**
         * Sets value for `oldSettlementDate`
         * The previous date and time by which funds needed to be available to settle the trade.
         */
        public Builder oldSettlementDate(String oldSettlementDate) {
            return this.oldSettlementDate(Optional.ofNullable(oldSettlementDate));
        }



        public ConversionDateChange build() {
            return new ConversionDateChange(this);
        }
    }

}



