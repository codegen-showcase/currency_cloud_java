
package com.currencycloud.sdk.resources.withdrawalaccounts.find.params;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * FindRequest
 */
@JsonDeserialize(builder = FindRequest.Builder.class)
public final class FindRequest {
    /**
     * The UUID of a sub-account you want to see the withdrawal accounts for. If omitted the withdrawal accounts for the house account and all sub-accounts are returned.
     */
    private final Optional<String> accountId;


    private FindRequest(Builder builder) {
        this.accountId = builder.accountId;
    }

    /**
     * Retrieves value for `accountId`
     * The UUID of a sub-account you want to see the withdrawal accounts for. If omitted the withdrawal accounts for the house account and all sub-accounts are returned.
     */
    @JsonProperty("account_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAccountId() {
        return accountId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof FindRequest && equalTo((FindRequest) other);
    }

    private boolean equalTo(FindRequest other) {
        return
            accountId.equals(other.accountId)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountId
               );
    }

    @Override
    public String toString() {
        return "FindRequest{" +
               "accountId=" + accountId +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * The UUID of a sub-account you want to see the withdrawal accounts for. If omitted the withdrawal accounts for the house account and all sub-accounts are returned.
         */
        private Optional<String> accountId = Optional.empty();


        private Builder() {}

        public Builder from(FindRequest other) {
            accountId(other.getAccountId());
            return this;
        }

        /**
         * Sets value for `accountId`
         * The UUID of a sub-account you want to see the withdrawal accounts for. If omitted the withdrawal accounts for the house account and all sub-accounts are returned.
         */
        @JsonSetter("account_id")
        public Builder accountId(Optional<String> accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Sets value for `accountId`
         * The UUID of a sub-account you want to see the withdrawal accounts for. If omitted the withdrawal accounts for the house account and all sub-accounts are returned.
         */
        public Builder accountId(String accountId) {
            return this.accountId(Optional.ofNullable(accountId));
        }



        public FindRequest build() {
            return new FindRequest(this);
        }
    }

}



