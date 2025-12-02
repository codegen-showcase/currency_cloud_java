
package com.currencycloud.sdk.resources.reference.params;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * GetSettlementAccountsRequest
 */
@JsonDeserialize(builder = GetSettlementAccountsRequest.Builder.class)
public final class GetSettlementAccountsRequest {
    /**
     * Account UUID
     */
    private final Optional<String> accountId;

    /**
     * Three-letter ISO currency code.
     */
    private final Optional<String> currency;


    private GetSettlementAccountsRequest(Builder builder) {
        this.accountId = builder.accountId;
        this.currency = builder.currency;
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
     * Retrieves value for `currency`
     * Three-letter ISO currency code.
     */
    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCurrency() {
        return currency;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof GetSettlementAccountsRequest &&
               equalTo((GetSettlementAccountsRequest) other);
    }

    private boolean equalTo(GetSettlementAccountsRequest other) {
        return
            accountId.equals(other.accountId) &&

            currency.equals(other.currency)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountId,
                   this.currency
               );
    }

    @Override
    public String toString() {
        return "GetSettlementAccountsRequest{" +
               "accountId=" + accountId + ", " +
               "currency=" + currency +
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
         * Three-letter ISO currency code.
         */
        private Optional<String> currency = Optional.empty();


        private Builder() {}

        public Builder from(GetSettlementAccountsRequest other) {
            accountId(other.getAccountId());
            currency(other.getCurrency());
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



        public GetSettlementAccountsRequest build() {
            return new GetSettlementAccountsRequest(this);
        }
    }

}



