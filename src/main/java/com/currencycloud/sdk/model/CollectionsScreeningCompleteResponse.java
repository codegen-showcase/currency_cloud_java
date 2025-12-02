
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * CollectionsScreeningCompleteResponse
 */
@JsonDeserialize(builder = CollectionsScreeningCompleteResponse.Builder.class)
public final class CollectionsScreeningCompleteResponse {
    /**
     * Account UUID
     */
    private final Optional<String> accountId;

    /**
     * House Account UUID
     */
    private final Optional<String> houseAccountId;

    private final Optional<CollectionsScreeningCompleteResponseResult> result;

    /**
     * The transaction UUID
     */
    private final Optional<String> transactionId;


    private CollectionsScreeningCompleteResponse(Builder builder) {
        this.accountId = builder.accountId;
        this.houseAccountId = builder.houseAccountId;
        this.result = builder.result;
        this.transactionId = builder.transactionId;
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
     * Retrieves value for `houseAccountId`
     * House Account UUID
     */
    @JsonProperty("house_account_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getHouseAccountId() {
        return houseAccountId;
    }
    /**
     * Retrieves value for `result`
     */
    @JsonProperty("result")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<CollectionsScreeningCompleteResponseResult> getResult() {
        return result;
    }
    /**
     * Retrieves value for `transactionId`
     * The transaction UUID
     */
    @JsonProperty("transaction_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getTransactionId() {
        return transactionId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof CollectionsScreeningCompleteResponse &&
               equalTo((CollectionsScreeningCompleteResponse) other);
    }

    private boolean equalTo(CollectionsScreeningCompleteResponse other) {
        return
            accountId.equals(other.accountId) &&

            houseAccountId.equals(other.houseAccountId) &&

            result.equals(other.result) &&

            transactionId.equals(other.transactionId)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountId,
                   this.houseAccountId,
                   this.result,
                   this.transactionId
               );
    }

    @Override
    public String toString() {
        return "CollectionsScreeningCompleteResponse{" +
               "accountId=" + accountId + ", " +
               "houseAccountId=" + houseAccountId + ", " +
               "result=" + result + ", " +
               "transactionId=" + transactionId +
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
         * House Account UUID
         */
        private Optional<String> houseAccountId = Optional.empty();

        private Optional<CollectionsScreeningCompleteResponseResult> result = Optional.empty();

        /**
         * The transaction UUID
         */
        private Optional<String> transactionId = Optional.empty();


        private Builder() {}

        public Builder from(CollectionsScreeningCompleteResponse other) {
            accountId(other.getAccountId());
            houseAccountId(other.getHouseAccountId());
            result(other.getResult());
            transactionId(other.getTransactionId());
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
         * Sets value for `houseAccountId`
         * House Account UUID
         */
        @JsonSetter("house_account_id")
        public Builder houseAccountId(Optional<String> houseAccountId) {
            this.houseAccountId = houseAccountId;
            return this;
        }

        /**
         * Sets value for `houseAccountId`
         * House Account UUID
         */
        public Builder houseAccountId(String houseAccountId) {
            return this.houseAccountId(Optional.ofNullable(houseAccountId));
        }
        /**
         * Sets value for `result`
         */
        @JsonSetter("result")
        public Builder result(Optional<CollectionsScreeningCompleteResponseResult> result) {
            this.result = result;
            return this;
        }

        /**
         * Sets value for `result`
         */
        public Builder result(CollectionsScreeningCompleteResponseResult result) {
            return this.result(Optional.ofNullable(result));
        }
        /**
         * Sets value for `transactionId`
         * The transaction UUID
         */
        @JsonSetter("transaction_id")
        public Builder transactionId(Optional<String> transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        /**
         * Sets value for `transactionId`
         * The transaction UUID
         */
        public Builder transactionId(String transactionId) {
            return this.transactionId(Optional.ofNullable(transactionId));
        }



        public CollectionsScreeningCompleteResponse build() {
            return new CollectionsScreeningCompleteResponse(this);
        }
    }

}



