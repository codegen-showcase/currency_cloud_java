
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
 * WithdrawalAccountsFindFindResponse
 */
@JsonDeserialize(builder = WithdrawalAccountsFindFindResponse.Builder.class)
public final class WithdrawalAccountsFindFindResponse {
    /**
     * Pagination.
     */
    private final Optional<Pagination> pagination;

    private final Optional<List<WithdrawalAccount>> withdrawalAccounts;


    private WithdrawalAccountsFindFindResponse(Builder builder) {
        this.pagination = builder.pagination;
        this.withdrawalAccounts = builder.withdrawalAccounts;
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
     * Retrieves value for `withdrawalAccounts`
     */
    @JsonProperty("withdrawal_accounts")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<WithdrawalAccount>> getWithdrawalAccounts() {
        return withdrawalAccounts;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof WithdrawalAccountsFindFindResponse &&
               equalTo((WithdrawalAccountsFindFindResponse) other);
    }

    private boolean equalTo(WithdrawalAccountsFindFindResponse other) {
        return
            pagination.equals(other.pagination) &&

            withdrawalAccounts.equals(other.withdrawalAccounts)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.pagination,
                   this.withdrawalAccounts
               );
    }

    @Override
    public String toString() {
        return "WithdrawalAccountsFindFindResponse{" +
               "pagination=" + pagination + ", " +
               "withdrawalAccounts=" + withdrawalAccounts +
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

        private Optional<List<WithdrawalAccount>> withdrawalAccounts = Optional.empty();


        private Builder() {}

        public Builder from(WithdrawalAccountsFindFindResponse other) {
            pagination(other.getPagination());
            withdrawalAccounts(other.getWithdrawalAccounts());
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
         * Sets value for `withdrawalAccounts`
         */
        @JsonSetter("withdrawal_accounts")
        public Builder withdrawalAccounts(Optional<List<WithdrawalAccount>> withdrawalAccounts) {
            this.withdrawalAccounts = withdrawalAccounts;
            return this;
        }

        /**
         * Sets value for `withdrawalAccounts`
         */
        public Builder withdrawalAccounts(List<WithdrawalAccount> withdrawalAccounts) {
            return this.withdrawalAccounts(Optional.ofNullable(withdrawalAccounts));
        }



        public WithdrawalAccountsFindFindResponse build() {
            return new WithdrawalAccountsFindFindResponse(this);
        }
    }

}



