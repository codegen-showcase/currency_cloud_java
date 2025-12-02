
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Transaction.
 */
@JsonDeserialize(builder = Transaction.Builder.class)
public final class Transaction {
    /**
     * Account ID
     */
    private final Optional<String> accountId;

    /**
     * The action that triggered the transaction.
     */
    private final Optional<TransactionActionEnum> action;

    /**
     * Transaction amount
     */
    private final Optional<String> amount;

    /**
     * Balance amount
     */
    private final Optional<String> balanceAmount;

    /**
     * Balance ID
     */
    private final Optional<String> balanceId;

    /**
     * Date the transaction record was last updated.
     */
    private final Optional<String> completedAt;

    /**
     * Date the transaction record was created.
     */
    private final Optional<String> createdAt;

    /**
     * Three-letter ISO currency code.
     */
    private final Optional<String> currency;

    /**
     * Transaction ID
     */
    private final Optional<String> id;

    /**
     * Reason
     */
    private final Optional<String> reason;

    private final Optional<String> relatedEntityId;

    /**
     * Releated entity short reference.
     */
    private final Optional<String> relatedEntityShortReference;

    /**
     * The related entity type.
     */
    private final Optional<TransactionRelatedEntityTypeEnum> relatedEntityType;

    /**
     * Settlement date
     */
    private final Optional<String> settlesAt;

    /**
     * Transaction status
     */
    private final Optional<TransactionStatusEnum> status;

    /**
     * Type (debit or credit).
     */
    private final Optional<TransactionTypeEnum> type;

    private final Optional<String> updatedAt;


    private Transaction(Builder builder) {
        this.accountId = builder.accountId;
        this.action = builder.action;
        this.amount = builder.amount;
        this.balanceAmount = builder.balanceAmount;
        this.balanceId = builder.balanceId;
        this.completedAt = builder.completedAt;
        this.createdAt = builder.createdAt;
        this.currency = builder.currency;
        this.id = builder.id;
        this.reason = builder.reason;
        this.relatedEntityId = builder.relatedEntityId;
        this.relatedEntityShortReference = builder.relatedEntityShortReference;
        this.relatedEntityType = builder.relatedEntityType;
        this.settlesAt = builder.settlesAt;
        this.status = builder.status;
        this.type = builder.type;
        this.updatedAt = builder.updatedAt;
    }

    /**
     * Retrieves value for `accountId`
     * Account ID
     */
    @JsonProperty("account_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAccountId() {
        return accountId;
    }
    /**
     * Retrieves value for `action`
     * The action that triggered the transaction.
     */
    @JsonProperty("action")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<TransactionActionEnum> getAction() {
        return action;
    }
    /**
     * Retrieves value for `amount`
     * Transaction amount
     */
    @JsonProperty("amount")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAmount() {
        return amount;
    }
    /**
     * Retrieves value for `balanceAmount`
     * Balance amount
     */
    @JsonProperty("balance_amount")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBalanceAmount() {
        return balanceAmount;
    }
    /**
     * Retrieves value for `balanceId`
     * Balance ID
     */
    @JsonProperty("balance_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBalanceId() {
        return balanceId;
    }
    /**
     * Retrieves value for `completedAt`
     * Date the transaction record was last updated.
     */
    @JsonProperty("completed_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCompletedAt() {
        return completedAt;
    }
    /**
     * Retrieves value for `createdAt`
     * Date the transaction record was created.
     */
    @JsonProperty("created_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatedAt() {
        return createdAt;
    }
    /**
     * Retrieves value for `currency`
     * Three-letter ISO currency code.
     */
    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `id`
     * Transaction ID
     */
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getId() {
        return id;
    }
    /**
     * Retrieves value for `reason`
     * Reason
     */
    @JsonProperty("reason")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getReason() {
        return reason;
    }
    /**
     * Retrieves value for `relatedEntityId`
     */
    @JsonProperty("related_entity_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getRelatedEntityId() {
        return relatedEntityId;
    }
    /**
     * Retrieves value for `relatedEntityShortReference`
     * Releated entity short reference.
     */
    @JsonProperty("related_entity_short_reference")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getRelatedEntityShortReference() {
        return relatedEntityShortReference;
    }
    /**
     * Retrieves value for `relatedEntityType`
     * The related entity type.
     */
    @JsonProperty("related_entity_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<TransactionRelatedEntityTypeEnum> getRelatedEntityType() {
        return relatedEntityType;
    }
    /**
     * Retrieves value for `settlesAt`
     * Settlement date
     */
    @JsonProperty("settles_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSettlesAt() {
        return settlesAt;
    }
    /**
     * Retrieves value for `status`
     * Transaction status
     */
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<TransactionStatusEnum> getStatus() {
        return status;
    }
    /**
     * Retrieves value for `type`
     * Type (debit or credit).
     */
    @JsonProperty("type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<TransactionTypeEnum> getType() {
        return type;
    }
    /**
     * Retrieves value for `updatedAt`
     */
    @JsonProperty("updated_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof Transaction && equalTo((Transaction) other);
    }

    private boolean equalTo(Transaction other) {
        return
            accountId.equals(other.accountId) &&

            action.equals(other.action) &&

            amount.equals(other.amount) &&

            balanceAmount.equals(other.balanceAmount) &&

            balanceId.equals(other.balanceId) &&

            completedAt.equals(other.completedAt) &&

            createdAt.equals(other.createdAt) &&

            currency.equals(other.currency) &&

            id.equals(other.id) &&

            reason.equals(other.reason) &&

            relatedEntityId.equals(other.relatedEntityId) &&

            relatedEntityShortReference.equals(other.relatedEntityShortReference) &&

            relatedEntityType.equals(other.relatedEntityType) &&

            settlesAt.equals(other.settlesAt) &&

            status.equals(other.status) &&

            type.equals(other.type) &&

            updatedAt.equals(other.updatedAt)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountId,
                   this.action,
                   this.amount,
                   this.balanceAmount,
                   this.balanceId,
                   this.completedAt,
                   this.createdAt,
                   this.currency,
                   this.id,
                   this.reason,
                   this.relatedEntityId,
                   this.relatedEntityShortReference,
                   this.relatedEntityType,
                   this.settlesAt,
                   this.status,
                   this.type,
                   this.updatedAt
               );
    }

    @Override
    public String toString() {
        return "Transaction{" +
               "accountId=" + accountId + ", " +
               "action=" + action + ", " +
               "amount=" + amount + ", " +
               "balanceAmount=" + balanceAmount + ", " +
               "balanceId=" + balanceId + ", " +
               "completedAt=" + completedAt + ", " +
               "createdAt=" + createdAt + ", " +
               "currency=" + currency + ", " +
               "id=" + id + ", " +
               "reason=" + reason + ", " +
               "relatedEntityId=" + relatedEntityId + ", " +
               "relatedEntityShortReference=" + relatedEntityShortReference + ", " +
               "relatedEntityType=" + relatedEntityType + ", " +
               "settlesAt=" + settlesAt + ", " +
               "status=" + status + ", " +
               "type=" + type + ", " +
               "updatedAt=" + updatedAt +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Account ID
         */
        private Optional<String> accountId = Optional.empty();

        /**
         * The action that triggered the transaction.
         */
        private Optional<TransactionActionEnum> action = Optional.empty();

        /**
         * Transaction amount
         */
        private Optional<String> amount = Optional.empty();

        /**
         * Balance amount
         */
        private Optional<String> balanceAmount = Optional.empty();

        /**
         * Balance ID
         */
        private Optional<String> balanceId = Optional.empty();

        /**
         * Date the transaction record was last updated.
         */
        private Optional<String> completedAt = Optional.empty();

        /**
         * Date the transaction record was created.
         */
        private Optional<String> createdAt = Optional.empty();

        /**
         * Three-letter ISO currency code.
         */
        private Optional<String> currency = Optional.empty();

        /**
         * Transaction ID
         */
        private Optional<String> id = Optional.empty();

        /**
         * Reason
         */
        private Optional<String> reason = Optional.empty();

        private Optional<String> relatedEntityId = Optional.empty();

        /**
         * Releated entity short reference.
         */
        private Optional<String> relatedEntityShortReference = Optional.empty();

        /**
         * The related entity type.
         */
        private Optional<TransactionRelatedEntityTypeEnum> relatedEntityType = Optional.empty();

        /**
         * Settlement date
         */
        private Optional<String> settlesAt = Optional.empty();

        /**
         * Transaction status
         */
        private Optional<TransactionStatusEnum> status = Optional.empty();

        /**
         * Type (debit or credit).
         */
        private Optional<TransactionTypeEnum> type = Optional.empty();

        private Optional<String> updatedAt = Optional.empty();


        private Builder() {}

        public Builder from(Transaction other) {
            accountId(other.getAccountId());
            action(other.getAction());
            amount(other.getAmount());
            balanceAmount(other.getBalanceAmount());
            balanceId(other.getBalanceId());
            completedAt(other.getCompletedAt());
            createdAt(other.getCreatedAt());
            currency(other.getCurrency());
            id(other.getId());
            reason(other.getReason());
            relatedEntityId(other.getRelatedEntityId());
            relatedEntityShortReference(other.getRelatedEntityShortReference());
            relatedEntityType(other.getRelatedEntityType());
            settlesAt(other.getSettlesAt());
            status(other.getStatus());
            type(other.getType());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        /**
         * Sets value for `accountId`
         * Account ID
         */
        @JsonSetter("account_id")
        public Builder accountId(Optional<String> accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Sets value for `accountId`
         * Account ID
         */
        public Builder accountId(String accountId) {
            return this.accountId(Optional.ofNullable(accountId));
        }
        /**
         * Sets value for `action`
         * The action that triggered the transaction.
         */
        @JsonSetter("action")
        public Builder action(Optional<TransactionActionEnum> action) {
            this.action = action;
            return this;
        }

        /**
         * Sets value for `action`
         * The action that triggered the transaction.
         */
        public Builder action(TransactionActionEnum action) {
            return this.action(Optional.ofNullable(action));
        }
        /**
         * Sets value for `amount`
         * Transaction amount
         */
        @JsonSetter("amount")
        public Builder amount(Optional<String> amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Sets value for `amount`
         * Transaction amount
         */
        public Builder amount(String amount) {
            return this.amount(Optional.ofNullable(amount));
        }
        /**
         * Sets value for `balanceAmount`
         * Balance amount
         */
        @JsonSetter("balance_amount")
        public Builder balanceAmount(Optional<String> balanceAmount) {
            this.balanceAmount = balanceAmount;
            return this;
        }

        /**
         * Sets value for `balanceAmount`
         * Balance amount
         */
        public Builder balanceAmount(String balanceAmount) {
            return this.balanceAmount(Optional.ofNullable(balanceAmount));
        }
        /**
         * Sets value for `balanceId`
         * Balance ID
         */
        @JsonSetter("balance_id")
        public Builder balanceId(Optional<String> balanceId) {
            this.balanceId = balanceId;
            return this;
        }

        /**
         * Sets value for `balanceId`
         * Balance ID
         */
        public Builder balanceId(String balanceId) {
            return this.balanceId(Optional.ofNullable(balanceId));
        }
        /**
         * Sets value for `completedAt`
         * Date the transaction record was last updated.
         */
        @JsonSetter("completed_at")
        public Builder completedAt(Optional<String> completedAt) {
            this.completedAt = completedAt;
            return this;
        }

        /**
         * Sets value for `completedAt`
         * Date the transaction record was last updated.
         */
        public Builder completedAt(String completedAt) {
            return this.completedAt(Optional.ofNullable(completedAt));
        }
        /**
         * Sets value for `createdAt`
         * Date the transaction record was created.
         */
        @JsonSetter("created_at")
        public Builder createdAt(Optional<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Sets value for `createdAt`
         * Date the transaction record was created.
         */
        public Builder createdAt(String createdAt) {
            return this.createdAt(Optional.ofNullable(createdAt));
        }
        /**
         * Sets value for `currency`
         * Three-letter ISO currency code.
         */
        @JsonSetter("currency")
        public Builder currency(Optional<String> currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Sets value for `currency`
         * Three-letter ISO currency code.
         */
        public Builder currency(String currency) {
            return this.currency(Optional.ofNullable(currency));
        }
        /**
         * Sets value for `id`
         * Transaction ID
         */
        @JsonSetter("id")
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        /**
         * Sets value for `id`
         * Transaction ID
         */
        public Builder id(String id) {
            return this.id(Optional.ofNullable(id));
        }
        /**
         * Sets value for `reason`
         * Reason
         */
        @JsonSetter("reason")
        public Builder reason(Optional<String> reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Sets value for `reason`
         * Reason
         */
        public Builder reason(String reason) {
            return this.reason(Optional.ofNullable(reason));
        }
        /**
         * Sets value for `relatedEntityId`
         */
        @JsonSetter("related_entity_id")
        public Builder relatedEntityId(Optional<String> relatedEntityId) {
            this.relatedEntityId = relatedEntityId;
            return this;
        }

        /**
         * Sets value for `relatedEntityId`
         */
        public Builder relatedEntityId(String relatedEntityId) {
            return this.relatedEntityId(Optional.ofNullable(relatedEntityId));
        }
        /**
         * Sets value for `relatedEntityShortReference`
         * Releated entity short reference.
         */
        @JsonSetter("related_entity_short_reference")
        public Builder relatedEntityShortReference(Optional<String> relatedEntityShortReference) {
            this.relatedEntityShortReference = relatedEntityShortReference;
            return this;
        }

        /**
         * Sets value for `relatedEntityShortReference`
         * Releated entity short reference.
         */
        public Builder relatedEntityShortReference(String relatedEntityShortReference) {
            return this.relatedEntityShortReference(Optional.ofNullable(relatedEntityShortReference));
        }
        /**
         * Sets value for `relatedEntityType`
         * The related entity type.
         */
        @JsonSetter("related_entity_type")
        public Builder relatedEntityType(Optional<TransactionRelatedEntityTypeEnum> relatedEntityType) {
            this.relatedEntityType = relatedEntityType;
            return this;
        }

        /**
         * Sets value for `relatedEntityType`
         * The related entity type.
         */
        public Builder relatedEntityType(TransactionRelatedEntityTypeEnum relatedEntityType) {
            return this.relatedEntityType(Optional.ofNullable(relatedEntityType));
        }
        /**
         * Sets value for `settlesAt`
         * Settlement date
         */
        @JsonSetter("settles_at")
        public Builder settlesAt(Optional<String> settlesAt) {
            this.settlesAt = settlesAt;
            return this;
        }

        /**
         * Sets value for `settlesAt`
         * Settlement date
         */
        public Builder settlesAt(String settlesAt) {
            return this.settlesAt(Optional.ofNullable(settlesAt));
        }
        /**
         * Sets value for `status`
         * Transaction status
         */
        @JsonSetter("status")
        public Builder status(Optional<TransactionStatusEnum> status) {
            this.status = status;
            return this;
        }

        /**
         * Sets value for `status`
         * Transaction status
         */
        public Builder status(TransactionStatusEnum status) {
            return this.status(Optional.ofNullable(status));
        }
        /**
         * Sets value for `type`
         * Type (debit or credit).
         */
        @JsonSetter("type")
        public Builder type(Optional<TransactionTypeEnum> type) {
            this.type = type;
            return this;
        }

        /**
         * Sets value for `type`
         * Type (debit or credit).
         */
        public Builder type(TransactionTypeEnum type) {
            return this.type(Optional.ofNullable(type));
        }
        /**
         * Sets value for `updatedAt`
         */
        @JsonSetter("updated_at")
        public Builder updatedAt(Optional<String> updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Sets value for `updatedAt`
         */
        public Builder updatedAt(String updatedAt) {
            return this.updatedAt(Optional.ofNullable(updatedAt));
        }



        public Transaction build() {
            return new Transaction(this);
        }
    }

}



