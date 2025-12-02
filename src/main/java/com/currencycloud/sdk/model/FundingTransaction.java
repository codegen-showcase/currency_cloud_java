
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * The transaction information.
 */
@JsonDeserialize(builder = FundingTransaction.Builder.class)
public final class FundingTransaction {
    /**
     * Any additional information.
     */
    private final Optional<String> additionalInformation;

    /**
     * The transaction amount.
     */
    private final Optional<String> amount;

    /**
     * The completed date in ISO-8601 format.
     */
    private final Optional<String> completedAt;

    /**
     * The created at date in ISO-8601 format.
     */
    private final Optional<String> createdAt;

    /**
     * The three-letter currency code.
     */
    private final Optional<String> currency;

    /**
     * The Related Entity UUID (related_entity_id) for the transaction.
     */
    private final Optional<String> id;

    /**
     * The transaction rail.
     */
    private final Optional<String> rail;

    /**
     * The transaction receiving account IBAN.
     */
    private final Optional<String> receivingAccountIban;

    /**
     * The transaction receiving account number.
     */
    private final Optional<String> receivingAccountNumber;

    /**
     * The routing code.
     */
    private final Optional<String> receivingAccountRoutingCode;

    /**
     * The sender information
     */
    private final Optional<SenderInformation> sender;

    /**
     * The last time the transaction was updated in ISO-8601 format.
     */
    private final Optional<String> updatedAt;

    /**
     * The value date in ISO-8601 format.
     */
    private final Optional<String> valueDate;


    private FundingTransaction(Builder builder) {
        this.additionalInformation = builder.additionalInformation;
        this.amount = builder.amount;
        this.completedAt = builder.completedAt;
        this.createdAt = builder.createdAt;
        this.currency = builder.currency;
        this.id = builder.id;
        this.rail = builder.rail;
        this.receivingAccountIban = builder.receivingAccountIban;
        this.receivingAccountNumber = builder.receivingAccountNumber;
        this.receivingAccountRoutingCode = builder.receivingAccountRoutingCode;
        this.sender = builder.sender;
        this.updatedAt = builder.updatedAt;
        this.valueDate = builder.valueDate;
    }

    /**
     * Retrieves value for `additionalInformation`
     * Any additional information.
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
     * Retrieves value for `completedAt`
     * The completed date in ISO-8601 format.
     */
    @JsonProperty("completed_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCompletedAt() {
        return completedAt;
    }
    /**
     * Retrieves value for `createdAt`
     * The created at date in ISO-8601 format.
     */
    @JsonProperty("created_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatedAt() {
        return createdAt;
    }
    /**
     * Retrieves value for `currency`
     * The three-letter currency code.
     */
    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `id`
     * The Related Entity UUID (related_entity_id) for the transaction.
     */
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getId() {
        return id;
    }
    /**
     * Retrieves value for `rail`
     * The transaction rail.
     */
    @JsonProperty("rail")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getRail() {
        return rail;
    }
    /**
     * Retrieves value for `receivingAccountIban`
     * The transaction receiving account IBAN.
     */
    @JsonProperty("receiving_account_iban")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getReceivingAccountIban() {
        return receivingAccountIban;
    }
    /**
     * Retrieves value for `receivingAccountNumber`
     * The transaction receiving account number.
     */
    @JsonProperty("receiving_account_number")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getReceivingAccountNumber() {
        return receivingAccountNumber;
    }
    /**
     * Retrieves value for `receivingAccountRoutingCode`
     * The routing code.
     */
    @JsonProperty("receiving_account_routing_code")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getReceivingAccountRoutingCode() {
        return receivingAccountRoutingCode;
    }
    /**
     * Retrieves value for `sender`
     * The sender information
     */
    @JsonProperty("sender")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<SenderInformation> getSender() {
        return sender;
    }
    /**
     * Retrieves value for `updatedAt`
     * The last time the transaction was updated in ISO-8601 format.
     */
    @JsonProperty("updated_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUpdatedAt() {
        return updatedAt;
    }
    /**
     * Retrieves value for `valueDate`
     * The value date in ISO-8601 format.
     */
    @JsonProperty("value_date")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getValueDate() {
        return valueDate;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof FundingTransaction && equalTo((FundingTransaction) other);
    }

    private boolean equalTo(FundingTransaction other) {
        return
            additionalInformation.equals(other.additionalInformation) &&

            amount.equals(other.amount) &&

            completedAt.equals(other.completedAt) &&

            createdAt.equals(other.createdAt) &&

            currency.equals(other.currency) &&

            id.equals(other.id) &&

            rail.equals(other.rail) &&

            receivingAccountIban.equals(other.receivingAccountIban) &&

            receivingAccountNumber.equals(other.receivingAccountNumber) &&

            receivingAccountRoutingCode.equals(other.receivingAccountRoutingCode) &&

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
                   this.completedAt,
                   this.createdAt,
                   this.currency,
                   this.id,
                   this.rail,
                   this.receivingAccountIban,
                   this.receivingAccountNumber,
                   this.receivingAccountRoutingCode,
                   this.sender,
                   this.updatedAt,
                   this.valueDate
               );
    }

    @Override
    public String toString() {
        return "FundingTransaction{" +
               "additionalInformation=" + additionalInformation + ", " +
               "amount=" + amount + ", " +
               "completedAt=" + completedAt + ", " +
               "createdAt=" + createdAt + ", " +
               "currency=" + currency + ", " +
               "id=" + id + ", " +
               "rail=" + rail + ", " +
               "receivingAccountIban=" + receivingAccountIban + ", " +
               "receivingAccountNumber=" + receivingAccountNumber + ", " +
               "receivingAccountRoutingCode=" + receivingAccountRoutingCode + ", " +
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
         * Any additional information.
         */
        private Optional<String> additionalInformation = Optional.empty();

        /**
         * The transaction amount.
         */
        private Optional<String> amount = Optional.empty();

        /**
         * The completed date in ISO-8601 format.
         */
        private Optional<String> completedAt = Optional.empty();

        /**
         * The created at date in ISO-8601 format.
         */
        private Optional<String> createdAt = Optional.empty();

        /**
         * The three-letter currency code.
         */
        private Optional<String> currency = Optional.empty();

        /**
         * The Related Entity UUID (related_entity_id) for the transaction.
         */
        private Optional<String> id = Optional.empty();

        /**
         * The transaction rail.
         */
        private Optional<String> rail = Optional.empty();

        /**
         * The transaction receiving account IBAN.
         */
        private Optional<String> receivingAccountIban = Optional.empty();

        /**
         * The transaction receiving account number.
         */
        private Optional<String> receivingAccountNumber = Optional.empty();

        /**
         * The routing code.
         */
        private Optional<String> receivingAccountRoutingCode = Optional.empty();

        /**
         * The sender information
         */
        private Optional<SenderInformation> sender = Optional.empty();

        /**
         * The last time the transaction was updated in ISO-8601 format.
         */
        private Optional<String> updatedAt = Optional.empty();

        /**
         * The value date in ISO-8601 format.
         */
        private Optional<String> valueDate = Optional.empty();


        private Builder() {}

        public Builder from(FundingTransaction other) {
            additionalInformation(other.getAdditionalInformation());
            amount(other.getAmount());
            completedAt(other.getCompletedAt());
            createdAt(other.getCreatedAt());
            currency(other.getCurrency());
            id(other.getId());
            rail(other.getRail());
            receivingAccountIban(other.getReceivingAccountIban());
            receivingAccountNumber(other.getReceivingAccountNumber());
            receivingAccountRoutingCode(other.getReceivingAccountRoutingCode());
            sender(other.getSender());
            updatedAt(other.getUpdatedAt());
            valueDate(other.getValueDate());
            return this;
        }

        /**
         * Sets value for `additionalInformation`
         * Any additional information.
         */
        @JsonSetter("additional_information")
        public Builder additionalInformation(Optional<String> additionalInformation) {
            this.additionalInformation = additionalInformation;
            return this;
        }

        /**
         * Sets value for `additionalInformation`
         * Any additional information.
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
         * Sets value for `completedAt`
         * The completed date in ISO-8601 format.
         */
        @JsonSetter("completed_at")
        public Builder completedAt(Optional<String> completedAt) {
            this.completedAt = completedAt;
            return this;
        }

        /**
         * Sets value for `completedAt`
         * The completed date in ISO-8601 format.
         */
        public Builder completedAt(String completedAt) {
            return this.completedAt(Optional.ofNullable(completedAt));
        }
        /**
         * Sets value for `createdAt`
         * The created at date in ISO-8601 format.
         */
        @JsonSetter("created_at")
        public Builder createdAt(Optional<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Sets value for `createdAt`
         * The created at date in ISO-8601 format.
         */
        public Builder createdAt(String createdAt) {
            return this.createdAt(Optional.ofNullable(createdAt));
        }
        /**
         * Sets value for `currency`
         * The three-letter currency code.
         */
        @JsonSetter("currency")
        public Builder currency(Optional<String> currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Sets value for `currency`
         * The three-letter currency code.
         */
        public Builder currency(String currency) {
            return this.currency(Optional.ofNullable(currency));
        }
        /**
         * Sets value for `id`
         * The Related Entity UUID (related_entity_id) for the transaction.
         */
        @JsonSetter("id")
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        /**
         * Sets value for `id`
         * The Related Entity UUID (related_entity_id) for the transaction.
         */
        public Builder id(String id) {
            return this.id(Optional.ofNullable(id));
        }
        /**
         * Sets value for `rail`
         * The transaction rail.
         */
        @JsonSetter("rail")
        public Builder rail(Optional<String> rail) {
            this.rail = rail;
            return this;
        }

        /**
         * Sets value for `rail`
         * The transaction rail.
         */
        public Builder rail(String rail) {
            return this.rail(Optional.ofNullable(rail));
        }
        /**
         * Sets value for `receivingAccountIban`
         * The transaction receiving account IBAN.
         */
        @JsonSetter("receiving_account_iban")
        public Builder receivingAccountIban(Optional<String> receivingAccountIban) {
            this.receivingAccountIban = receivingAccountIban;
            return this;
        }

        /**
         * Sets value for `receivingAccountIban`
         * The transaction receiving account IBAN.
         */
        public Builder receivingAccountIban(String receivingAccountIban) {
            return this.receivingAccountIban(Optional.ofNullable(receivingAccountIban));
        }
        /**
         * Sets value for `receivingAccountNumber`
         * The transaction receiving account number.
         */
        @JsonSetter("receiving_account_number")
        public Builder receivingAccountNumber(Optional<String> receivingAccountNumber) {
            this.receivingAccountNumber = receivingAccountNumber;
            return this;
        }

        /**
         * Sets value for `receivingAccountNumber`
         * The transaction receiving account number.
         */
        public Builder receivingAccountNumber(String receivingAccountNumber) {
            return this.receivingAccountNumber(Optional.ofNullable(receivingAccountNumber));
        }
        /**
         * Sets value for `receivingAccountRoutingCode`
         * The routing code.
         */
        @JsonSetter("receiving_account_routing_code")
        public Builder receivingAccountRoutingCode(Optional<String> receivingAccountRoutingCode) {
            this.receivingAccountRoutingCode = receivingAccountRoutingCode;
            return this;
        }

        /**
         * Sets value for `receivingAccountRoutingCode`
         * The routing code.
         */
        public Builder receivingAccountRoutingCode(String receivingAccountRoutingCode) {
            return this.receivingAccountRoutingCode(Optional.ofNullable(receivingAccountRoutingCode));
        }
        /**
         * Sets value for `sender`
         * The sender information
         */
        @JsonSetter("sender")
        public Builder sender(Optional<SenderInformation> sender) {
            this.sender = sender;
            return this;
        }

        /**
         * Sets value for `sender`
         * The sender information
         */
        public Builder sender(SenderInformation sender) {
            return this.sender(Optional.ofNullable(sender));
        }
        /**
         * Sets value for `updatedAt`
         * The last time the transaction was updated in ISO-8601 format.
         */
        @JsonSetter("updated_at")
        public Builder updatedAt(Optional<String> updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Sets value for `updatedAt`
         * The last time the transaction was updated in ISO-8601 format.
         */
        public Builder updatedAt(String updatedAt) {
            return this.updatedAt(Optional.ofNullable(updatedAt));
        }
        /**
         * Sets value for `valueDate`
         * The value date in ISO-8601 format.
         */
        @JsonSetter("value_date")
        public Builder valueDate(Optional<String> valueDate) {
            this.valueDate = valueDate;
            return this;
        }

        /**
         * Sets value for `valueDate`
         * The value date in ISO-8601 format.
         */
        public Builder valueDate(String valueDate) {
            return this.valueDate(Optional.ofNullable(valueDate));
        }



        public FundingTransaction build() {
            return new FundingTransaction(this);
        }
    }

}



