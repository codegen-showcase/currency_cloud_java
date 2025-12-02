
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Cancelled Conversion
 */
@JsonDeserialize(builder = ConversionCancellation.Builder.class)
public final class ConversionCancellation {
    /**
     * UUID of the Account that the Conversion belongs to.
     */
    private final Optional<String> accountId;

    /**
     * The amount of the profit or loss.
     */
    private final Optional<String> amount;

    /**
     * UUID of the Contact that performed the action that generated profit or loss.
     */
    private final Optional<String> contactId;

    /**
     * UUID of the Conversion.
     */
    private final Optional<String> conversionId;

    /**
     * Three-letter ISO currency code for the currency the amount is shown in.
     */
    private final Optional<String> currency;

    /**
     * The account_id of the trade's account.
     */
    private final Optional<String> eventAccountId;

    /**
     * The contact_id of the trade's contact.
     */
    private final Optional<String> eventContactId;

    /**
     * The date and time of the quote.
     */
    private final Optional<String> eventDateTime;

    /**
     * The type of event (e.g. cancellation).
     */
    private final Optional<String> eventType;

    /**
     * Additional information regarding the event.
     */
    private final Optional<String> notes;


    private ConversionCancellation(Builder builder) {
        this.accountId = builder.accountId;
        this.amount = builder.amount;
        this.contactId = builder.contactId;
        this.conversionId = builder.conversionId;
        this.currency = builder.currency;
        this.eventAccountId = builder.eventAccountId;
        this.eventContactId = builder.eventContactId;
        this.eventDateTime = builder.eventDateTime;
        this.eventType = builder.eventType;
        this.notes = builder.notes;
    }

    /**
     * Retrieves value for `accountId`
     * UUID of the Account that the Conversion belongs to.
     */
    @JsonProperty("account_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAccountId() {
        return accountId;
    }
    /**
     * Retrieves value for `amount`
     * The amount of the profit or loss.
     */
    @JsonProperty("amount")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAmount() {
        return amount;
    }
    /**
     * Retrieves value for `contactId`
     * UUID of the Contact that performed the action that generated profit or loss.
     */
    @JsonProperty("contact_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getContactId() {
        return contactId;
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
     * Three-letter ISO currency code for the currency the amount is shown in.
     */
    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `eventAccountId`
     * The account_id of the trade's account.
     */
    @JsonProperty("event_account_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getEventAccountId() {
        return eventAccountId;
    }
    /**
     * Retrieves value for `eventContactId`
     * The contact_id of the trade's contact.
     */
    @JsonProperty("event_contact_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getEventContactId() {
        return eventContactId;
    }
    /**
     * Retrieves value for `eventDateTime`
     * The date and time of the quote.
     */
    @JsonProperty("event_date_time")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getEventDateTime() {
        return eventDateTime;
    }
    /**
     * Retrieves value for `eventType`
     * The type of event (e.g. cancellation).
     */
    @JsonProperty("event_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getEventType() {
        return eventType;
    }
    /**
     * Retrieves value for `notes`
     * Additional information regarding the event.
     */
    @JsonProperty("notes")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getNotes() {
        return notes;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof ConversionCancellation && equalTo((ConversionCancellation) other);
    }

    private boolean equalTo(ConversionCancellation other) {
        return
            accountId.equals(other.accountId) &&

            amount.equals(other.amount) &&

            contactId.equals(other.contactId) &&

            conversionId.equals(other.conversionId) &&

            currency.equals(other.currency) &&

            eventAccountId.equals(other.eventAccountId) &&

            eventContactId.equals(other.eventContactId) &&

            eventDateTime.equals(other.eventDateTime) &&

            eventType.equals(other.eventType) &&

            notes.equals(other.notes)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountId,
                   this.amount,
                   this.contactId,
                   this.conversionId,
                   this.currency,
                   this.eventAccountId,
                   this.eventContactId,
                   this.eventDateTime,
                   this.eventType,
                   this.notes
               );
    }

    @Override
    public String toString() {
        return "ConversionCancellation{" +
               "accountId=" + accountId + ", " +
               "amount=" + amount + ", " +
               "contactId=" + contactId + ", " +
               "conversionId=" + conversionId + ", " +
               "currency=" + currency + ", " +
               "eventAccountId=" + eventAccountId + ", " +
               "eventContactId=" + eventContactId + ", " +
               "eventDateTime=" + eventDateTime + ", " +
               "eventType=" + eventType + ", " +
               "notes=" + notes +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * UUID of the Account that the Conversion belongs to.
         */
        private Optional<String> accountId = Optional.empty();

        /**
         * The amount of the profit or loss.
         */
        private Optional<String> amount = Optional.empty();

        /**
         * UUID of the Contact that performed the action that generated profit or loss.
         */
        private Optional<String> contactId = Optional.empty();

        /**
         * UUID of the Conversion.
         */
        private Optional<String> conversionId = Optional.empty();

        /**
         * Three-letter ISO currency code for the currency the amount is shown in.
         */
        private Optional<String> currency = Optional.empty();

        /**
         * The account_id of the trade's account.
         */
        private Optional<String> eventAccountId = Optional.empty();

        /**
         * The contact_id of the trade's contact.
         */
        private Optional<String> eventContactId = Optional.empty();

        /**
         * The date and time of the quote.
         */
        private Optional<String> eventDateTime = Optional.empty();

        /**
         * The type of event (e.g. cancellation).
         */
        private Optional<String> eventType = Optional.empty();

        /**
         * Additional information regarding the event.
         */
        private Optional<String> notes = Optional.empty();


        private Builder() {}

        public Builder from(ConversionCancellation other) {
            accountId(other.getAccountId());
            amount(other.getAmount());
            contactId(other.getContactId());
            conversionId(other.getConversionId());
            currency(other.getCurrency());
            eventAccountId(other.getEventAccountId());
            eventContactId(other.getEventContactId());
            eventDateTime(other.getEventDateTime());
            eventType(other.getEventType());
            notes(other.getNotes());
            return this;
        }

        /**
         * Sets value for `accountId`
         * UUID of the Account that the Conversion belongs to.
         */
        @JsonSetter("account_id")
        public Builder accountId(Optional<String> accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Sets value for `accountId`
         * UUID of the Account that the Conversion belongs to.
         */
        public Builder accountId(String accountId) {
            return this.accountId(Optional.ofNullable(accountId));
        }
        /**
         * Sets value for `amount`
         * The amount of the profit or loss.
         */
        @JsonSetter("amount")
        public Builder amount(Optional<String> amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Sets value for `amount`
         * The amount of the profit or loss.
         */
        public Builder amount(String amount) {
            return this.amount(Optional.ofNullable(amount));
        }
        /**
         * Sets value for `contactId`
         * UUID of the Contact that performed the action that generated profit or loss.
         */
        @JsonSetter("contact_id")
        public Builder contactId(Optional<String> contactId) {
            this.contactId = contactId;
            return this;
        }

        /**
         * Sets value for `contactId`
         * UUID of the Contact that performed the action that generated profit or loss.
         */
        public Builder contactId(String contactId) {
            return this.contactId(Optional.ofNullable(contactId));
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
         * Three-letter ISO currency code for the currency the amount is shown in.
         */
        @JsonSetter("currency")
        public Builder currency(Optional<String> currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Sets value for `currency`
         * Three-letter ISO currency code for the currency the amount is shown in.
         */
        public Builder currency(String currency) {
            return this.currency(Optional.ofNullable(currency));
        }
        /**
         * Sets value for `eventAccountId`
         * The account_id of the trade's account.
         */
        @JsonSetter("event_account_id")
        public Builder eventAccountId(Optional<String> eventAccountId) {
            this.eventAccountId = eventAccountId;
            return this;
        }

        /**
         * Sets value for `eventAccountId`
         * The account_id of the trade's account.
         */
        public Builder eventAccountId(String eventAccountId) {
            return this.eventAccountId(Optional.ofNullable(eventAccountId));
        }
        /**
         * Sets value for `eventContactId`
         * The contact_id of the trade's contact.
         */
        @JsonSetter("event_contact_id")
        public Builder eventContactId(Optional<String> eventContactId) {
            this.eventContactId = eventContactId;
            return this;
        }

        /**
         * Sets value for `eventContactId`
         * The contact_id of the trade's contact.
         */
        public Builder eventContactId(String eventContactId) {
            return this.eventContactId(Optional.ofNullable(eventContactId));
        }
        /**
         * Sets value for `eventDateTime`
         * The date and time of the quote.
         */
        @JsonSetter("event_date_time")
        public Builder eventDateTime(Optional<String> eventDateTime) {
            this.eventDateTime = eventDateTime;
            return this;
        }

        /**
         * Sets value for `eventDateTime`
         * The date and time of the quote.
         */
        public Builder eventDateTime(String eventDateTime) {
            return this.eventDateTime(Optional.ofNullable(eventDateTime));
        }
        /**
         * Sets value for `eventType`
         * The type of event (e.g. cancellation).
         */
        @JsonSetter("event_type")
        public Builder eventType(Optional<String> eventType) {
            this.eventType = eventType;
            return this;
        }

        /**
         * Sets value for `eventType`
         * The type of event (e.g. cancellation).
         */
        public Builder eventType(String eventType) {
            return this.eventType(Optional.ofNullable(eventType));
        }
        /**
         * Sets value for `notes`
         * Additional information regarding the event.
         */
        @JsonSetter("notes")
        public Builder notes(Optional<String> notes) {
            this.notes = notes;
            return this;
        }

        /**
         * Sets value for `notes`
         * Additional information regarding the event.
         */
        public Builder notes(String notes) {
            return this.notes(Optional.ofNullable(notes));
        }



        public ConversionCancellation build() {
            return new ConversionCancellation(this);
        }
    }

}



