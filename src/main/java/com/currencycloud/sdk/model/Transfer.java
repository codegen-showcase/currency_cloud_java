
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Transfer
 */
@JsonDeserialize(builder = Transfer.Builder.class)
public final class Transfer {
    /**
     * Transfer amount
     */
    private final Optional<String> amount;

    /**
     * Date/time the transfer was completed.
     */
    private final Optional<String> completedAt;

    /**
     * Date/time the transfer was created.
     */
    private final Optional<String> createdAt;

    /**
     * Account UUID of transfer instructor.
     */
    private final Optional<String> creatorAccountId;

    /**
     * Contact UUID of transfer instructor.
     */
    private final Optional<String> creatorContactId;

    /**
     * Three-letter ISO currency code.
     */
    private final Optional<String> currency;

    /**
     * Account UUID of the receiving account.
     */
    private final Optional<String> destinationAccountId;

    /**
     * Transfer UUID
     */
    private final Optional<String> id;

    /**
     * Reason for the transfer.
     */
    private final Optional<String> reason;

    /**
     * Short reference code.
     */
    private final Optional<String> shortReference;

    /**
     * Account UUID of the paying account.
     */
    private final Optional<String> sourceAccountId;

    /**
     * Status of the transfer - completed, pending or cancelled.
     */
    private final Optional<String> status;

    /**
     * The user-generated idempotency key given to the transfer.
     */
    private final Optional<String> uniqueRequestId;

    /**
     * Date/time the transfer was last updated.
     */
    private final Optional<String> updatedAt;


    private Transfer(Builder builder) {
        this.amount = builder.amount;
        this.completedAt = builder.completedAt;
        this.createdAt = builder.createdAt;
        this.creatorAccountId = builder.creatorAccountId;
        this.creatorContactId = builder.creatorContactId;
        this.currency = builder.currency;
        this.destinationAccountId = builder.destinationAccountId;
        this.id = builder.id;
        this.reason = builder.reason;
        this.shortReference = builder.shortReference;
        this.sourceAccountId = builder.sourceAccountId;
        this.status = builder.status;
        this.uniqueRequestId = builder.uniqueRequestId;
        this.updatedAt = builder.updatedAt;
    }

    /**
     * Retrieves value for `amount`
     * Transfer amount
     */
    @JsonProperty("amount")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAmount() {
        return amount;
    }
    /**
     * Retrieves value for `completedAt`
     * Date/time the transfer was completed.
     */
    @JsonProperty("completed_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCompletedAt() {
        return completedAt;
    }
    /**
     * Retrieves value for `createdAt`
     * Date/time the transfer was created.
     */
    @JsonProperty("created_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatedAt() {
        return createdAt;
    }
    /**
     * Retrieves value for `creatorAccountId`
     * Account UUID of transfer instructor.
     */
    @JsonProperty("creator_account_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatorAccountId() {
        return creatorAccountId;
    }
    /**
     * Retrieves value for `creatorContactId`
     * Contact UUID of transfer instructor.
     */
    @JsonProperty("creator_contact_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatorContactId() {
        return creatorContactId;
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
     * Retrieves value for `destinationAccountId`
     * Account UUID of the receiving account.
     */
    @JsonProperty("destination_account_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getDestinationAccountId() {
        return destinationAccountId;
    }
    /**
     * Retrieves value for `id`
     * Transfer UUID
     */
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getId() {
        return id;
    }
    /**
     * Retrieves value for `reason`
     * Reason for the transfer.
     */
    @JsonProperty("reason")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getReason() {
        return reason;
    }
    /**
     * Retrieves value for `shortReference`
     * Short reference code.
     */
    @JsonProperty("short_reference")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getShortReference() {
        return shortReference;
    }
    /**
     * Retrieves value for `sourceAccountId`
     * Account UUID of the paying account.
     */
    @JsonProperty("source_account_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSourceAccountId() {
        return sourceAccountId;
    }
    /**
     * Retrieves value for `status`
     * Status of the transfer - completed, pending or cancelled.
     */
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getStatus() {
        return status;
    }
    /**
     * Retrieves value for `uniqueRequestId`
     * The user-generated idempotency key given to the transfer.
     */
    @JsonProperty("unique_request_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUniqueRequestId() {
        return uniqueRequestId;
    }
    /**
     * Retrieves value for `updatedAt`
     * Date/time the transfer was last updated.
     */
    @JsonProperty("updated_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof Transfer && equalTo((Transfer) other);
    }

    private boolean equalTo(Transfer other) {
        return
            amount.equals(other.amount) &&

            completedAt.equals(other.completedAt) &&

            createdAt.equals(other.createdAt) &&

            creatorAccountId.equals(other.creatorAccountId) &&

            creatorContactId.equals(other.creatorContactId) &&

            currency.equals(other.currency) &&

            destinationAccountId.equals(other.destinationAccountId) &&

            id.equals(other.id) &&

            reason.equals(other.reason) &&

            shortReference.equals(other.shortReference) &&

            sourceAccountId.equals(other.sourceAccountId) &&

            status.equals(other.status) &&

            uniqueRequestId.equals(other.uniqueRequestId) &&

            updatedAt.equals(other.updatedAt)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.amount,
                   this.completedAt,
                   this.createdAt,
                   this.creatorAccountId,
                   this.creatorContactId,
                   this.currency,
                   this.destinationAccountId,
                   this.id,
                   this.reason,
                   this.shortReference,
                   this.sourceAccountId,
                   this.status,
                   this.uniqueRequestId,
                   this.updatedAt
               );
    }

    @Override
    public String toString() {
        return "Transfer{" +
               "amount=" + amount + ", " +
               "completedAt=" + completedAt + ", " +
               "createdAt=" + createdAt + ", " +
               "creatorAccountId=" + creatorAccountId + ", " +
               "creatorContactId=" + creatorContactId + ", " +
               "currency=" + currency + ", " +
               "destinationAccountId=" + destinationAccountId + ", " +
               "id=" + id + ", " +
               "reason=" + reason + ", " +
               "shortReference=" + shortReference + ", " +
               "sourceAccountId=" + sourceAccountId + ", " +
               "status=" + status + ", " +
               "uniqueRequestId=" + uniqueRequestId + ", " +
               "updatedAt=" + updatedAt +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Transfer amount
         */
        private Optional<String> amount = Optional.empty();

        /**
         * Date/time the transfer was completed.
         */
        private Optional<String> completedAt = Optional.empty();

        /**
         * Date/time the transfer was created.
         */
        private Optional<String> createdAt = Optional.empty();

        /**
         * Account UUID of transfer instructor.
         */
        private Optional<String> creatorAccountId = Optional.empty();

        /**
         * Contact UUID of transfer instructor.
         */
        private Optional<String> creatorContactId = Optional.empty();

        /**
         * Three-letter ISO currency code.
         */
        private Optional<String> currency = Optional.empty();

        /**
         * Account UUID of the receiving account.
         */
        private Optional<String> destinationAccountId = Optional.empty();

        /**
         * Transfer UUID
         */
        private Optional<String> id = Optional.empty();

        /**
         * Reason for the transfer.
         */
        private Optional<String> reason = Optional.empty();

        /**
         * Short reference code.
         */
        private Optional<String> shortReference = Optional.empty();

        /**
         * Account UUID of the paying account.
         */
        private Optional<String> sourceAccountId = Optional.empty();

        /**
         * Status of the transfer - completed, pending or cancelled.
         */
        private Optional<String> status = Optional.empty();

        /**
         * The user-generated idempotency key given to the transfer.
         */
        private Optional<String> uniqueRequestId = Optional.empty();

        /**
         * Date/time the transfer was last updated.
         */
        private Optional<String> updatedAt = Optional.empty();


        private Builder() {}

        public Builder from(Transfer other) {
            amount(other.getAmount());
            completedAt(other.getCompletedAt());
            createdAt(other.getCreatedAt());
            creatorAccountId(other.getCreatorAccountId());
            creatorContactId(other.getCreatorContactId());
            currency(other.getCurrency());
            destinationAccountId(other.getDestinationAccountId());
            id(other.getId());
            reason(other.getReason());
            shortReference(other.getShortReference());
            sourceAccountId(other.getSourceAccountId());
            status(other.getStatus());
            uniqueRequestId(other.getUniqueRequestId());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        /**
         * Sets value for `amount`
         * Transfer amount
         */
        @JsonSetter("amount")
        public Builder amount(Optional<String> amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Sets value for `amount`
         * Transfer amount
         */
        public Builder amount(String amount) {
            return this.amount(Optional.ofNullable(amount));
        }
        /**
         * Sets value for `completedAt`
         * Date/time the transfer was completed.
         */
        @JsonSetter("completed_at")
        public Builder completedAt(Optional<String> completedAt) {
            this.completedAt = completedAt;
            return this;
        }

        /**
         * Sets value for `completedAt`
         * Date/time the transfer was completed.
         */
        public Builder completedAt(String completedAt) {
            return this.completedAt(Optional.ofNullable(completedAt));
        }
        /**
         * Sets value for `createdAt`
         * Date/time the transfer was created.
         */
        @JsonSetter("created_at")
        public Builder createdAt(Optional<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Sets value for `createdAt`
         * Date/time the transfer was created.
         */
        public Builder createdAt(String createdAt) {
            return this.createdAt(Optional.ofNullable(createdAt));
        }
        /**
         * Sets value for `creatorAccountId`
         * Account UUID of transfer instructor.
         */
        @JsonSetter("creator_account_id")
        public Builder creatorAccountId(Optional<String> creatorAccountId) {
            this.creatorAccountId = creatorAccountId;
            return this;
        }

        /**
         * Sets value for `creatorAccountId`
         * Account UUID of transfer instructor.
         */
        public Builder creatorAccountId(String creatorAccountId) {
            return this.creatorAccountId(Optional.ofNullable(creatorAccountId));
        }
        /**
         * Sets value for `creatorContactId`
         * Contact UUID of transfer instructor.
         */
        @JsonSetter("creator_contact_id")
        public Builder creatorContactId(Optional<String> creatorContactId) {
            this.creatorContactId = creatorContactId;
            return this;
        }

        /**
         * Sets value for `creatorContactId`
         * Contact UUID of transfer instructor.
         */
        public Builder creatorContactId(String creatorContactId) {
            return this.creatorContactId(Optional.ofNullable(creatorContactId));
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
         * Sets value for `destinationAccountId`
         * Account UUID of the receiving account.
         */
        @JsonSetter("destination_account_id")
        public Builder destinationAccountId(Optional<String> destinationAccountId) {
            this.destinationAccountId = destinationAccountId;
            return this;
        }

        /**
         * Sets value for `destinationAccountId`
         * Account UUID of the receiving account.
         */
        public Builder destinationAccountId(String destinationAccountId) {
            return this.destinationAccountId(Optional.ofNullable(destinationAccountId));
        }
        /**
         * Sets value for `id`
         * Transfer UUID
         */
        @JsonSetter("id")
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        /**
         * Sets value for `id`
         * Transfer UUID
         */
        public Builder id(String id) {
            return this.id(Optional.ofNullable(id));
        }
        /**
         * Sets value for `reason`
         * Reason for the transfer.
         */
        @JsonSetter("reason")
        public Builder reason(Optional<String> reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Sets value for `reason`
         * Reason for the transfer.
         */
        public Builder reason(String reason) {
            return this.reason(Optional.ofNullable(reason));
        }
        /**
         * Sets value for `shortReference`
         * Short reference code.
         */
        @JsonSetter("short_reference")
        public Builder shortReference(Optional<String> shortReference) {
            this.shortReference = shortReference;
            return this;
        }

        /**
         * Sets value for `shortReference`
         * Short reference code.
         */
        public Builder shortReference(String shortReference) {
            return this.shortReference(Optional.ofNullable(shortReference));
        }
        /**
         * Sets value for `sourceAccountId`
         * Account UUID of the paying account.
         */
        @JsonSetter("source_account_id")
        public Builder sourceAccountId(Optional<String> sourceAccountId) {
            this.sourceAccountId = sourceAccountId;
            return this;
        }

        /**
         * Sets value for `sourceAccountId`
         * Account UUID of the paying account.
         */
        public Builder sourceAccountId(String sourceAccountId) {
            return this.sourceAccountId(Optional.ofNullable(sourceAccountId));
        }
        /**
         * Sets value for `status`
         * Status of the transfer - completed, pending or cancelled.
         */
        @JsonSetter("status")
        public Builder status(Optional<String> status) {
            this.status = status;
            return this;
        }

        /**
         * Sets value for `status`
         * Status of the transfer - completed, pending or cancelled.
         */
        public Builder status(String status) {
            return this.status(Optional.ofNullable(status));
        }
        /**
         * Sets value for `uniqueRequestId`
         * The user-generated idempotency key given to the transfer.
         */
        @JsonSetter("unique_request_id")
        public Builder uniqueRequestId(Optional<String> uniqueRequestId) {
            this.uniqueRequestId = uniqueRequestId;
            return this;
        }

        /**
         * Sets value for `uniqueRequestId`
         * The user-generated idempotency key given to the transfer.
         */
        public Builder uniqueRequestId(String uniqueRequestId) {
            return this.uniqueRequestId(Optional.ofNullable(uniqueRequestId));
        }
        /**
         * Sets value for `updatedAt`
         * Date/time the transfer was last updated.
         */
        @JsonSetter("updated_at")
        public Builder updatedAt(Optional<String> updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Sets value for `updatedAt`
         * Date/time the transfer was last updated.
         */
        public Builder updatedAt(String updatedAt) {
            return this.updatedAt(Optional.ofNullable(updatedAt));
        }



        public Transfer build() {
            return new Transfer(this);
        }
    }

}



