
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
 * ReferenceGetSettlementAccountsResponse
 */
@JsonDeserialize(builder = ReferenceGetSettlementAccountsResponse.Builder.class)
public final class ReferenceGetSettlementAccountsResponse {
    private final Optional<List<SettlementAccount>> settlementAccounts;


    private ReferenceGetSettlementAccountsResponse(Builder builder) {
        this.settlementAccounts = builder.settlementAccounts;
    }

    /**
     * Retrieves value for `settlementAccounts`
     */
    @JsonProperty("settlement_accounts")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<SettlementAccount>> getSettlementAccounts() {
        return settlementAccounts;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof ReferenceGetSettlementAccountsResponse &&
               equalTo((ReferenceGetSettlementAccountsResponse) other);
    }

    private boolean equalTo(ReferenceGetSettlementAccountsResponse other) {
        return
            settlementAccounts.equals(other.settlementAccounts)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.settlementAccounts
               );
    }

    @Override
    public String toString() {
        return "ReferenceGetSettlementAccountsResponse{" +
               "settlementAccounts=" + settlementAccounts +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<List<SettlementAccount>> settlementAccounts = Optional.empty();


        private Builder() {}

        public Builder from(ReferenceGetSettlementAccountsResponse other) {
            settlementAccounts(other.getSettlementAccounts());
            return this;
        }

        /**
         * Sets value for `settlementAccounts`
         */
        @JsonSetter("settlement_accounts")
        public Builder settlementAccounts(Optional<List<SettlementAccount>> settlementAccounts) {
            this.settlementAccounts = settlementAccounts;
            return this;
        }

        /**
         * Sets value for `settlementAccounts`
         */
        public Builder settlementAccounts(List<SettlementAccount> settlementAccounts) {
            return this.settlementAccounts(Optional.ofNullable(settlementAccounts));
        }



        public ReferenceGetSettlementAccountsResponse build() {
            return new ReferenceGetSettlementAccountsResponse(this);
        }
    }

}



