
package com.currencycloud.sdk.resources.conversions.params;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * DateChangeQuoteRequest
 */
@JsonDeserialize(builder = DateChangeQuoteRequest.Builder.class)
public final class DateChangeQuoteRequest {
    /**
     * Conversion UUID, this is returned by a successful trade request when creating a conversion.
     */
    private final String id;

    /**
     * Desired new settlement date of conversion, format YYYY-MM-DD.
     */
    private final String newSettlementDate;


    private DateChangeQuoteRequest(Builder builder) {
        this.id = builder.id;
        this.newSettlementDate = builder.newSettlementDate;
    }

    /**
     * Retrieves value for `id`
     * Conversion UUID, this is returned by a successful trade request when creating a conversion.
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }
    /**
     * Retrieves value for `newSettlementDate`
     * Desired new settlement date of conversion, format YYYY-MM-DD.
     */
    @JsonProperty("new_settlement_date")
    public String getNewSettlementDate() {
        return newSettlementDate;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof DateChangeQuoteRequest && equalTo((DateChangeQuoteRequest) other);
    }

    private boolean equalTo(DateChangeQuoteRequest other) {
        return
            id.equals(other.id) &&

            newSettlementDate.equals(other.newSettlementDate)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.id,
                   this.newSettlementDate
               );
    }

    @Override
    public String toString() {
        return "DateChangeQuoteRequest{" +
               "id=" + id + ", " +
               "newSettlementDate=" + newSettlementDate +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Conversion UUID, this is returned by a successful trade request when creating a conversion.
         */
        private String id = null;

        /**
         * Desired new settlement date of conversion, format YYYY-MM-DD.
         */
        private String newSettlementDate = null;


        private Builder() {}

        public Builder from(DateChangeQuoteRequest other) {
            id(other.getId());
            newSettlementDate(other.getNewSettlementDate());
            return this;
        }

        /**
         * Sets value for `id`
         * Conversion UUID, this is returned by a successful trade request when creating a conversion.
         */
        @JsonSetter("id")
        public Builder id(String id) {
            if (id == null) {
                throw new IllegalArgumentException("id cannot be null");
            }

            this.id = id;
            return this;
        }
        /**
         * Sets value for `newSettlementDate`
         * Desired new settlement date of conversion, format YYYY-MM-DD.
         */
        @JsonSetter("new_settlement_date")
        public Builder newSettlementDate(String newSettlementDate) {
            if (newSettlementDate == null) {
                throw new IllegalArgumentException("newSettlementDate cannot be null");
            }

            this.newSettlementDate = newSettlementDate;
            return this;
        }



        public DateChangeQuoteRequest build() {
            if (id == null) {
                throw new IllegalStateException("id is required");
            }

            if (newSettlementDate == null) {
                throw new IllegalStateException("newSettlementDate is required");
            }

            return new DateChangeQuoteRequest(this);
        }
    }

}



