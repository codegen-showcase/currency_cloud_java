
package com.currencycloud.sdk.model;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * TransactionsFindResponse
 */
@JsonDeserialize(builder = TransactionsFindResponse.Builder.class)
public final class TransactionsFindResponse {
    /**
     * Pagination.
     */
    private final Optional<Pagination> pagination;

    private final Optional<List<Transaction>> transactions;


    private TransactionsFindResponse(Builder builder) {
        this.pagination = builder.pagination;
        this.transactions = builder.transactions;
    }

    /**
     * Retrieves value for `pagination`
     * Pagination.
     */
    @JsonProperty("pagination")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Pagination> getPagination() {
        return pagination;
    }
    /**
     * Retrieves value for `transactions`
     */
    @JsonProperty("transactions")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<Transaction>> getTransactions() {
        return transactions;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof TransactionsFindResponse && equalTo((TransactionsFindResponse) other);
    }

    private boolean equalTo(TransactionsFindResponse other) {
        return
            pagination.equals(other.pagination) &&

            transactions.equals(other.transactions)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.pagination,
                   this.transactions
               );
    }

    @Override
    public String toString() {
        return "TransactionsFindResponse{" +
               "pagination=" + pagination + ", " +
               "transactions=" + transactions +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Pagination.
         */
        private Optional<Pagination> pagination = Optional.empty();

        private Optional<List<Transaction>> transactions = Optional.empty();


        private Builder() {}

        public Builder from(TransactionsFindResponse other) {
            pagination(other.getPagination());
            transactions(other.getTransactions());
            return this;
        }

        /**
         * Sets value for `pagination`
         * Pagination.
         */
        @JsonSetter("pagination")
        public Builder pagination(Optional<Pagination> pagination) {
            this.pagination = pagination;
            return this;
        }

        /**
         * Sets value for `pagination`
         * Pagination.
         */
        public Builder pagination(Pagination pagination) {
            return this.pagination(Optional.ofNullable(pagination));
        }
        /**
         * Sets value for `transactions`
         */
        @JsonSetter("transactions")
        public Builder transactions(Optional<List<Transaction>> transactions) {
            this.transactions = transactions;
            return this;
        }

        /**
         * Sets value for `transactions`
         */
        public Builder transactions(List<Transaction> transactions) {
            return this.transactions(Optional.ofNullable(transactions));
        }



        public TransactionsFindResponse build() {
            return new TransactionsFindResponse(this);
        }
    }

}



