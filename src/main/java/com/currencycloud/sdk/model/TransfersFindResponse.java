
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
 * TransfersFindResponse
 */
@JsonDeserialize(builder = TransfersFindResponse.Builder.class)
public final class TransfersFindResponse {
    /**
     * Pagination.
     */
    private final Optional<Pagination> pagination;

    private final Optional<List<Transfer>> transfers;


    private TransfersFindResponse(Builder builder) {
        this.pagination = builder.pagination;
        this.transfers = builder.transfers;
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
     * Retrieves value for `transfers`
     */
    @JsonProperty("transfers")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<Transfer>> getTransfers() {
        return transfers;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof TransfersFindResponse && equalTo((TransfersFindResponse) other);
    }

    private boolean equalTo(TransfersFindResponse other) {
        return
            pagination.equals(other.pagination) &&

            transfers.equals(other.transfers)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.pagination,
                   this.transfers
               );
    }

    @Override
    public String toString() {
        return "TransfersFindResponse{" +
               "pagination=" + pagination + ", " +
               "transfers=" + transfers +
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

        private Optional<List<Transfer>> transfers = Optional.empty();


        private Builder() {}

        public Builder from(TransfersFindResponse other) {
            pagination(other.getPagination());
            transfers(other.getTransfers());
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
         * Sets value for `transfers`
         */
        @JsonSetter("transfers")
        public Builder transfers(Optional<List<Transfer>> transfers) {
            this.transfers = transfers;
            return this;
        }

        /**
         * Sets value for `transfers`
         */
        public Builder transfers(List<Transfer> transfers) {
            return this.transfers(Optional.ofNullable(transfers));
        }



        public TransfersFindResponse build() {
            return new TransfersFindResponse(this);
        }
    }

}



