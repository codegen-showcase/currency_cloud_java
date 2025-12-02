
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
 * FundingFindAccountsResponse
 */
@JsonDeserialize(builder = FundingFindAccountsResponse.Builder.class)
public final class FundingFindAccountsResponse {
    private final Optional<List<FundingAccount>> fundingAccounts;

    /**
     * Pagination.
     */
    private final Optional<Pagination> pagination;


    private FundingFindAccountsResponse(Builder builder) {
        this.fundingAccounts = builder.fundingAccounts;
        this.pagination = builder.pagination;
    }

    /**
     * Retrieves value for `fundingAccounts`
     */
    @JsonProperty("funding_accounts")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<FundingAccount>> getFundingAccounts() {
        return fundingAccounts;
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

        return other instanceof FundingFindAccountsResponse && equalTo((FundingFindAccountsResponse) other);
    }

    private boolean equalTo(FundingFindAccountsResponse other) {
        return
            fundingAccounts.equals(other.fundingAccounts) &&

            pagination.equals(other.pagination)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.fundingAccounts,
                   this.pagination
               );
    }

    @Override
    public String toString() {
        return "FundingFindAccountsResponse{" +
               "fundingAccounts=" + fundingAccounts + ", " +
               "pagination=" + pagination +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<List<FundingAccount>> fundingAccounts = Optional.empty();

        /**
         * Pagination.
         */
        private Optional<Pagination> pagination = Optional.empty();


        private Builder() {}

        public Builder from(FundingFindAccountsResponse other) {
            fundingAccounts(other.getFundingAccounts());
            pagination(other.getPagination());
            return this;
        }

        /**
         * Sets value for `fundingAccounts`
         */
        @JsonSetter("funding_accounts")
        public Builder fundingAccounts(Optional<List<FundingAccount>> fundingAccounts) {
            this.fundingAccounts = fundingAccounts;
            return this;
        }

        /**
         * Sets value for `fundingAccounts`
         */
        public Builder fundingAccounts(List<FundingAccount> fundingAccounts) {
            return this.fundingAccounts(Optional.ofNullable(fundingAccounts));
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



        public FundingFindAccountsResponse build() {
            return new FundingFindAccountsResponse(this);
        }
    }

}



