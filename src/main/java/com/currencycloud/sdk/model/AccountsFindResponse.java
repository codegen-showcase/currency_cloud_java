
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
 * AccountsFindResponse
 */
@JsonDeserialize(builder = AccountsFindResponse.Builder.class)
public final class AccountsFindResponse {
    private final Optional<List<Account>> accounts;

    /**
     * Pagination.
     */
    private final Optional<Pagination> pagination;


    private AccountsFindResponse(Builder builder) {
        this.accounts = builder.accounts;
        this.pagination = builder.pagination;
    }

    /**
     * Retrieves value for `accounts`
     */
    @JsonProperty("accounts")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<Account>> getAccounts() {
        return accounts;
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

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof AccountsFindResponse && equalTo((AccountsFindResponse) other);
    }

    private boolean equalTo(AccountsFindResponse other) {
        return
            accounts.equals(other.accounts) &&

            pagination.equals(other.pagination)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accounts,
                   this.pagination
               );
    }

    @Override
    public String toString() {
        return "AccountsFindResponse{" +
               "accounts=" + accounts + ", " +
               "pagination=" + pagination +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<List<Account>> accounts = Optional.empty();

        /**
         * Pagination.
         */
        private Optional<Pagination> pagination = Optional.empty();


        private Builder() {}

        public Builder from(AccountsFindResponse other) {
            accounts(other.getAccounts());
            pagination(other.getPagination());
            return this;
        }

        /**
         * Sets value for `accounts`
         */
        @JsonSetter("accounts")
        public Builder accounts(Optional<List<Account>> accounts) {
            this.accounts = accounts;
            return this;
        }

        /**
         * Sets value for `accounts`
         */
        public Builder accounts(List<Account> accounts) {
            return this.accounts(Optional.ofNullable(accounts));
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



        public AccountsFindResponse build() {
            return new AccountsFindResponse(this);
        }
    }

}



