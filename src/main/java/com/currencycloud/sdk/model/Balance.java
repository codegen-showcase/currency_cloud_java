
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Balance.
 */
@JsonDeserialize(builder = Balance.Builder.class)
public final class Balance {
    /**
     * Account UUID
     */
    private final Optional<String> accountId;

    /**
     * The balance amount.
     */
    private final Optional<String> amount;

    /**
     * Date/time the record was created.
     */
    private final Optional<String> createdAt;

    /**
     * Three-letter ISO currency code for the currency the amount is shown in.
     */
    private final Optional<String> currency;

    /**
     * Balance UUID
     */
    private final Optional<String> id;

    /**
     * Date/time the record was last updated.
     */
    private final Optional<String> updatedAt;


    private Balance(Builder builder) {
        this.accountId = builder.accountId;
        this.amount = builder.amount;
        this.createdAt = builder.createdAt;
        this.currency = builder.currency;
        this.id = builder.id;
        this.updatedAt = builder.updatedAt;
    }

    /**
     * Retrieves value for `accountId`
     * Account UUID
     */
    @JsonProperty("account_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAccountId() {
        return accountId;
    }
    /**
     * Retrieves value for `amount`
     * The balance amount.
     */
    @JsonProperty("amount")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAmount() {
        return amount;
    }
    /**
     * Retrieves value for `createdAt`
     * Date/time the record was created.
     */
    @JsonProperty("created_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatedAt() {
        return createdAt;
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
     * Retrieves value for `id`
     * Balance UUID
     */
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getId() {
        return id;
    }
    /**
     * Retrieves value for `updatedAt`
     * Date/time the record was last updated.
     */
    @JsonProperty("updated_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof Balance && equalTo((Balance) other);
    }

    private boolean equalTo(Balance other) {
        return
            accountId.equals(other.accountId) &&

            amount.equals(other.amount) &&

            createdAt.equals(other.createdAt) &&

            currency.equals(other.currency) &&

            id.equals(other.id) &&

            updatedAt.equals(other.updatedAt)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountId,
                   this.amount,
                   this.createdAt,
                   this.currency,
                   this.id,
                   this.updatedAt
               );
    }

    @Override
    public String toString() {
        return "Balance{" +
               "accountId=" + accountId + ", " +
               "amount=" + amount + ", " +
               "createdAt=" + createdAt + ", " +
               "currency=" + currency + ", " +
               "id=" + id + ", " +
               "updatedAt=" + updatedAt +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Account UUID
         */
        private Optional<String> accountId = Optional.empty();

        /**
         * The balance amount.
         */
        private Optional<String> amount = Optional.empty();

        /**
         * Date/time the record was created.
         */
        private Optional<String> createdAt = Optional.empty();

        /**
         * Three-letter ISO currency code for the currency the amount is shown in.
         */
        private Optional<String> currency = Optional.empty();

        /**
         * Balance UUID
         */
        private Optional<String> id = Optional.empty();

        /**
         * Date/time the record was last updated.
         */
        private Optional<String> updatedAt = Optional.empty();


        private Builder() {}

        public Builder from(Balance other) {
            accountId(other.getAccountId());
            amount(other.getAmount());
            createdAt(other.getCreatedAt());
            currency(other.getCurrency());
            id(other.getId());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        /**
         * Sets value for `accountId`
         * Account UUID
         */
        @JsonSetter("account_id")
        public Builder accountId(Optional<String> accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Sets value for `accountId`
         * Account UUID
         */
        public Builder accountId(String accountId) {
            return this.accountId(Optional.ofNullable(accountId));
        }
        /**
         * Sets value for `amount`
         * The balance amount.
         */
        @JsonSetter("amount")
        public Builder amount(Optional<String> amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Sets value for `amount`
         * The balance amount.
         */
        public Builder amount(String amount) {
            return this.amount(Optional.ofNullable(amount));
        }
        /**
         * Sets value for `createdAt`
         * Date/time the record was created.
         */
        @JsonSetter("created_at")
        public Builder createdAt(Optional<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Sets value for `createdAt`
         * Date/time the record was created.
         */
        public Builder createdAt(String createdAt) {
            return this.createdAt(Optional.ofNullable(createdAt));
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
         * Sets value for `id`
         * Balance UUID
         */
        @JsonSetter("id")
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        /**
         * Sets value for `id`
         * Balance UUID
         */
        public Builder id(String id) {
            return this.id(Optional.ofNullable(id));
        }
        /**
         * Sets value for `updatedAt`
         * Date/time the record was last updated.
         */
        @JsonSetter("updated_at")
        public Builder updatedAt(Optional<String> updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Sets value for `updatedAt`
         * Date/time the record was last updated.
         */
        public Builder updatedAt(String updatedAt) {
            return this.updatedAt(Optional.ofNullable(updatedAt));
        }



        public Balance build() {
            return new Balance(this);
        }
    }

}



