
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Sender
 */
@JsonDeserialize(builder = Sender.Builder.class)
public final class Sender {
    /**
     * Any additional information for the transaction, e.g. addtional sender details or transaction and client references.
     */
    private final Optional<String> additionalInformation;

    /**
     * The transaction amount.
     */
    private final Optional<String> amount;

    /**
     * The transaction date and time of creation.
     */
    private final Optional<String> createdAt;

    /**
     * Three-letter ISO currency code for the transaction's currency.
     */
    private final Optional<String> currency;

    /**
     * The unique UUID for the Sender.
     */
    private final Optional<String> id;

    /**
     * The IBAN number for the account that received the funds.
     */
    private final Optional<String> receivingAccountIban;

    /**
     * The account number that received the funds.
     */
    private final Optional<String> receivingAccountNumber;

    /**
     * Sender details - the format is "sender":"name; address; country; account_number or iban; bic; routing_code"
     */
    private final Optional<String> sender;

    /**
     * The transaction date and time of the last update.
     */
    private final Optional<String> updatedAt;

    /**
     * The transaction value date.
     */
    private final Optional<String> valueDate;


    private Sender(Builder builder) {
        this.additionalInformation = builder.additionalInformation;
        this.amount = builder.amount;
        this.createdAt = builder.createdAt;
        this.currency = builder.currency;
        this.id = builder.id;
        this.receivingAccountIban = builder.receivingAccountIban;
        this.receivingAccountNumber = builder.receivingAccountNumber;
        this.sender = builder.sender;
        this.updatedAt = builder.updatedAt;
        this.valueDate = builder.valueDate;
    }

    /**
     * Retrieves value for `additionalInformation`
     * Any additional information for the transaction, e.g. addtional sender details or transaction and client references.
     */
    @JsonProperty("additional_information")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAdditionalInformation() {
        return additionalInformation;
    }
    /**
     * Retrieves value for `amount`
     * The transaction amount.
     */
    @JsonProperty("amount")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAmount() {
        return amount;
    }
    /**
     * Retrieves value for `createdAt`
     * The transaction date and time of creation.
     */
    @JsonProperty("created_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatedAt() {
        return createdAt;
    }
    /**
     * Retrieves value for `currency`
     * Three-letter ISO currency code for the transaction's currency.
     */
    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `id`
     * The unique UUID for the Sender.
     */
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getId() {
        return id;
    }
    /**
     * Retrieves value for `receivingAccountIban`
     * The IBAN number for the account that received the funds.
     */
    @JsonProperty("receiving_account_iban")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getReceivingAccountIban() {
        return receivingAccountIban;
    }
    /**
     * Retrieves value for `receivingAccountNumber`
     * The account number that received the funds.
     */
    @JsonProperty("receiving_account_number")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getReceivingAccountNumber() {
        return receivingAccountNumber;
    }
    /**
     * Retrieves value for `sender`
     * Sender details - the format is "sender":"name; address; country; account_number or iban; bic; routing_code"
     */
    @JsonProperty("sender")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSender() {
        return sender;
    }
    /**
     * Retrieves value for `updatedAt`
     * The transaction date and time of the last update.
     */
    @JsonProperty("updated_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUpdatedAt() {
        return updatedAt;
    }
    /**
     * Retrieves value for `valueDate`
     * The transaction value date.
     */
    @JsonProperty("value_date")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getValueDate() {
        return valueDate;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof Sender && equalTo((Sender) other);
    }

    private boolean equalTo(Sender other) {
        return
            additionalInformation.equals(other.additionalInformation) &&

            amount.equals(other.amount) &&

            createdAt.equals(other.createdAt) &&

            currency.equals(other.currency) &&

            id.equals(other.id) &&

            receivingAccountIban.equals(other.receivingAccountIban) &&

            receivingAccountNumber.equals(other.receivingAccountNumber) &&

            sender.equals(other.sender) &&

            updatedAt.equals(other.updatedAt) &&

            valueDate.equals(other.valueDate)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.additionalInformation,
                   this.amount,
                   this.createdAt,
                   this.currency,
                   this.id,
                   this.receivingAccountIban,
                   this.receivingAccountNumber,
                   this.sender,
                   this.updatedAt,
                   this.valueDate
               );
    }

    @Override
    public String toString() {
        return "Sender{" +
               "additionalInformation=" + additionalInformation + ", " +
               "amount=" + amount + ", " +
               "createdAt=" + createdAt + ", " +
               "currency=" + currency + ", " +
               "id=" + id + ", " +
               "receivingAccountIban=" + receivingAccountIban + ", " +
               "receivingAccountNumber=" + receivingAccountNumber + ", " +
               "sender=" + sender + ", " +
               "updatedAt=" + updatedAt + ", " +
               "valueDate=" + valueDate +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Any additional information for the transaction, e.g. addtional sender details or transaction and client references.
         */
        private Optional<String> additionalInformation = Optional.empty();

        /**
         * The transaction amount.
         */
        private Optional<String> amount = Optional.empty();

        /**
         * The transaction date and time of creation.
         */
        private Optional<String> createdAt = Optional.empty();

        /**
         * Three-letter ISO currency code for the transaction's currency.
         */
        private Optional<String> currency = Optional.empty();

        /**
         * The unique UUID for the Sender.
         */
        private Optional<String> id = Optional.empty();

        /**
         * The IBAN number for the account that received the funds.
         */
        private Optional<String> receivingAccountIban = Optional.empty();

        /**
         * The account number that received the funds.
         */
        private Optional<String> receivingAccountNumber = Optional.empty();

        /**
         * Sender details - the format is "sender":"name; address; country; account_number or iban; bic; routing_code"
         */
        private Optional<String> sender = Optional.empty();

        /**
         * The transaction date and time of the last update.
         */
        private Optional<String> updatedAt = Optional.empty();

        /**
         * The transaction value date.
         */
        private Optional<String> valueDate = Optional.empty();


        private Builder() {}

        public Builder from(Sender other) {
            additionalInformation(other.getAdditionalInformation());
            amount(other.getAmount());
            createdAt(other.getCreatedAt());
            currency(other.getCurrency());
            id(other.getId());
            receivingAccountIban(other.getReceivingAccountIban());
            receivingAccountNumber(other.getReceivingAccountNumber());
            sender(other.getSender());
            updatedAt(other.getUpdatedAt());
            valueDate(other.getValueDate());
            return this;
        }

        /**
         * Sets value for `additionalInformation`
         * Any additional information for the transaction, e.g. addtional sender details or transaction and client references.
         */
        @JsonSetter("additional_information")
        public Builder additionalInformation(Optional<String> additionalInformation) {
            this.additionalInformation = additionalInformation;
            return this;
        }

        /**
         * Sets value for `additionalInformation`
         * Any additional information for the transaction, e.g. addtional sender details or transaction and client references.
         */
        public Builder additionalInformation(String additionalInformation) {
            return this.additionalInformation(Optional.ofNullable(additionalInformation));
        }
        /**
         * Sets value for `amount`
         * The transaction amount.
         */
        @JsonSetter("amount")
        public Builder amount(Optional<String> amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Sets value for `amount`
         * The transaction amount.
         */
        public Builder amount(String amount) {
            return this.amount(Optional.ofNullable(amount));
        }
        /**
         * Sets value for `createdAt`
         * The transaction date and time of creation.
         */
        @JsonSetter("created_at")
        public Builder createdAt(Optional<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Sets value for `createdAt`
         * The transaction date and time of creation.
         */
        public Builder createdAt(String createdAt) {
            return this.createdAt(Optional.ofNullable(createdAt));
        }
        /**
         * Sets value for `currency`
         * Three-letter ISO currency code for the transaction's currency.
         */
        @JsonSetter("currency")
        public Builder currency(Optional<String> currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Sets value for `currency`
         * Three-letter ISO currency code for the transaction's currency.
         */
        public Builder currency(String currency) {
            return this.currency(Optional.ofNullable(currency));
        }
        /**
         * Sets value for `id`
         * The unique UUID for the Sender.
         */
        @JsonSetter("id")
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        /**
         * Sets value for `id`
         * The unique UUID for the Sender.
         */
        public Builder id(String id) {
            return this.id(Optional.ofNullable(id));
        }
        /**
         * Sets value for `receivingAccountIban`
         * The IBAN number for the account that received the funds.
         */
        @JsonSetter("receiving_account_iban")
        public Builder receivingAccountIban(Optional<String> receivingAccountIban) {
            this.receivingAccountIban = receivingAccountIban;
            return this;
        }

        /**
         * Sets value for `receivingAccountIban`
         * The IBAN number for the account that received the funds.
         */
        public Builder receivingAccountIban(String receivingAccountIban) {
            return this.receivingAccountIban(Optional.ofNullable(receivingAccountIban));
        }
        /**
         * Sets value for `receivingAccountNumber`
         * The account number that received the funds.
         */
        @JsonSetter("receiving_account_number")
        public Builder receivingAccountNumber(Optional<String> receivingAccountNumber) {
            this.receivingAccountNumber = receivingAccountNumber;
            return this;
        }

        /**
         * Sets value for `receivingAccountNumber`
         * The account number that received the funds.
         */
        public Builder receivingAccountNumber(String receivingAccountNumber) {
            return this.receivingAccountNumber(Optional.ofNullable(receivingAccountNumber));
        }
        /**
         * Sets value for `sender`
         * Sender details - the format is "sender":"name; address; country; account_number or iban; bic; routing_code"
         */
        @JsonSetter("sender")
        public Builder sender(Optional<String> sender) {
            this.sender = sender;
            return this;
        }

        /**
         * Sets value for `sender`
         * Sender details - the format is "sender":"name; address; country; account_number or iban; bic; routing_code"
         */
        public Builder sender(String sender) {
            return this.sender(Optional.ofNullable(sender));
        }
        /**
         * Sets value for `updatedAt`
         * The transaction date and time of the last update.
         */
        @JsonSetter("updated_at")
        public Builder updatedAt(Optional<String> updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Sets value for `updatedAt`
         * The transaction date and time of the last update.
         */
        public Builder updatedAt(String updatedAt) {
            return this.updatedAt(Optional.ofNullable(updatedAt));
        }
        /**
         * Sets value for `valueDate`
         * The transaction value date.
         */
        @JsonSetter("value_date")
        public Builder valueDate(Optional<String> valueDate) {
            this.valueDate = valueDate;
            return this;
        }

        /**
         * Sets value for `valueDate`
         * The transaction value date.
         */
        public Builder valueDate(String valueDate) {
            return this.valueDate(Optional.ofNullable(valueDate));
        }



        public Sender build() {
            return new Sender(this);
        }
    }

}



