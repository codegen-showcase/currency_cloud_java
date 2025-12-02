
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * TransfersCreateBody
 */
@JsonDeserialize(builder = TransfersCreateBody.Builder.class)
public final class TransfersCreateBody {
    /**
     * Amount
     */
    private final Double amount;

    /**
     * Three-letter ISO currency code.
     */
    private final String currency;

    /**
     * Account UUID of the receiving account.
     */
    private final String destinationAccountId;

    /**
     * User-generated reason for transfer, freeform text.
     */
    private final Optional<String> reason;

    /**
     * Account UUID of the paying account.
     */
    private final String sourceAccountId;

    /**
     * User-generated idempotency key. The value must be 100 characters or fewer.
     */
    private final Optional<String> uniqueRequestId;


    private TransfersCreateBody(Builder builder) {
        this.amount = builder.amount;
        this.currency = builder.currency;
        this.destinationAccountId = builder.destinationAccountId;
        this.reason = builder.reason;
        this.sourceAccountId = builder.sourceAccountId;
        this.uniqueRequestId = builder.uniqueRequestId;
    }

    /**
     * Retrieves value for `amount`
     * Amount
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
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
     * Retrieves value for `destinationAccountId`
     * Account UUID of the receiving account.
     */
    @JsonProperty("destination_account_id")
    public String getDestinationAccountId() {
        return destinationAccountId;
    }
    /**
     * Retrieves value for `reason`
     * User-generated reason for transfer, freeform text.
     */
    @JsonProperty("reason")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getReason() {
        return reason;
    }
    /**
     * Retrieves value for `sourceAccountId`
     * Account UUID of the paying account.
     */
    @JsonProperty("source_account_id")
    public String getSourceAccountId() {
        return sourceAccountId;
    }
    /**
     * Retrieves value for `uniqueRequestId`
     * User-generated idempotency key. The value must be 100 characters or fewer.
     */
    @JsonProperty("unique_request_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUniqueRequestId() {
        return uniqueRequestId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof TransfersCreateBody && equalTo((TransfersCreateBody) other);
    }

    private boolean equalTo(TransfersCreateBody other) {
        return
            amount.equals(other.amount) &&

            currency.equals(other.currency) &&

            destinationAccountId.equals(other.destinationAccountId) &&

            reason.equals(other.reason) &&

            sourceAccountId.equals(other.sourceAccountId) &&

            uniqueRequestId.equals(other.uniqueRequestId)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.amount,
                   this.currency,
                   this.destinationAccountId,
                   this.reason,
                   this.sourceAccountId,
                   this.uniqueRequestId
               );
    }

    @Override
    public String toString() {
        return "TransfersCreateBody{" +
               "amount=" + amount + ", " +
               "currency=" + currency + ", " +
               "destinationAccountId=" + destinationAccountId + ", " +
               "reason=" + reason + ", " +
               "sourceAccountId=" + sourceAccountId + ", " +
               "uniqueRequestId=" + uniqueRequestId +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Amount
         */
        private Double amount = null;

        /**
         * Three-letter ISO currency code.
         */
        private String currency = null;

        /**
         * Account UUID of the receiving account.
         */
        private String destinationAccountId = null;

        /**
         * User-generated reason for transfer, freeform text.
         */
        private Optional<String> reason = Optional.empty();

        /**
         * Account UUID of the paying account.
         */
        private String sourceAccountId = null;

        /**
         * User-generated idempotency key. The value must be 100 characters or fewer.
         */
        private Optional<String> uniqueRequestId = Optional.empty();


        private Builder() {}

        public Builder from(TransfersCreateBody other) {
            amount(other.getAmount());
            currency(other.getCurrency());
            destinationAccountId(other.getDestinationAccountId());
            reason(other.getReason());
            sourceAccountId(other.getSourceAccountId());
            uniqueRequestId(other.getUniqueRequestId());
            return this;
        }

        /**
         * Sets value for `amount`
         * Amount
         */
        @JsonSetter("amount")
        public Builder amount(Double amount) {
            if (amount == null) {
                throw new IllegalArgumentException("amount cannot be null");
            }

            this.amount = amount;
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
         * Sets value for `destinationAccountId`
         * Account UUID of the receiving account.
         */
        @JsonSetter("destination_account_id")
        public Builder destinationAccountId(String destinationAccountId) {
            if (destinationAccountId == null) {
                throw new IllegalArgumentException("destinationAccountId cannot be null");
            }

            this.destinationAccountId = destinationAccountId;
            return this;
        }
        /**
         * Sets value for `reason`
         * User-generated reason for transfer, freeform text.
         */
        @JsonSetter("reason")
        public Builder reason(Optional<String> reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Sets value for `reason`
         * User-generated reason for transfer, freeform text.
         */
        public Builder reason(String reason) {
            return this.reason(Optional.ofNullable(reason));
        }
        /**
         * Sets value for `sourceAccountId`
         * Account UUID of the paying account.
         */
        @JsonSetter("source_account_id")
        public Builder sourceAccountId(String sourceAccountId) {
            if (sourceAccountId == null) {
                throw new IllegalArgumentException("sourceAccountId cannot be null");
            }

            this.sourceAccountId = sourceAccountId;
            return this;
        }
        /**
         * Sets value for `uniqueRequestId`
         * User-generated idempotency key. The value must be 100 characters or fewer.
         */
        @JsonSetter("unique_request_id")
        public Builder uniqueRequestId(Optional<String> uniqueRequestId) {
            this.uniqueRequestId = uniqueRequestId;
            return this;
        }

        /**
         * Sets value for `uniqueRequestId`
         * User-generated idempotency key. The value must be 100 characters or fewer.
         */
        public Builder uniqueRequestId(String uniqueRequestId) {
            return this.uniqueRequestId(Optional.ofNullable(uniqueRequestId));
        }



        public TransfersCreateBody build() {
            if (amount == null) {
                throw new IllegalStateException("amount is required");
            }

            if (currency == null) {
                throw new IllegalStateException("currency is required");
            }

            if (destinationAccountId == null) {
                throw new IllegalStateException("destinationAccountId is required");
            }

            if (sourceAccountId == null) {
                throw new IllegalStateException("sourceAccountId is required");
            }

            return new TransfersCreateBody(this);
        }
    }

}



