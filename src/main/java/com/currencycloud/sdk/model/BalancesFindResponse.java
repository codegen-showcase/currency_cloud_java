
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
 * BalancesFindResponse
 */
@JsonDeserialize(builder = BalancesFindResponse.Builder.class)
public final class BalancesFindResponse {
    private final Optional<List<Balance>> balances;

    /**
     * Pagination.
     */
    private final Optional<Pagination> pagination;


    private BalancesFindResponse(Builder builder) {
        this.balances = builder.balances;
        this.pagination = builder.pagination;
    }

    /**
     * Retrieves value for `balances`
     */
    @JsonProperty("balances")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<Balance>> getBalances() {
        return balances;
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

        return other instanceof BalancesFindResponse && equalTo((BalancesFindResponse) other);
    }

    private boolean equalTo(BalancesFindResponse other) {
        return
            balances.equals(other.balances) &&

            pagination.equals(other.pagination)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.balances,
                   this.pagination
               );
    }

    @Override
    public String toString() {
        return "BalancesFindResponse{" +
               "balances=" + balances + ", " +
               "pagination=" + pagination +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<List<Balance>> balances = Optional.empty();

        /**
         * Pagination.
         */
        private Optional<Pagination> pagination = Optional.empty();


        private Builder() {}

        public Builder from(BalancesFindResponse other) {
            balances(other.getBalances());
            pagination(other.getPagination());
            return this;
        }

        /**
         * Sets value for `balances`
         */
        @JsonSetter("balances")
        public Builder balances(Optional<List<Balance>> balances) {
            this.balances = balances;
            return this;
        }

        /**
         * Sets value for `balances`
         */
        public Builder balances(List<Balance> balances) {
            return this.balances(Optional.ofNullable(balances));
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



        public BalancesFindResponse build() {
            return new BalancesFindResponse(this);
        }
    }

}



