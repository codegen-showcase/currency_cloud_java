
package com.currencycloud.sdk.resources.conversions.params;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * DateChangeRequest
 */
@JsonDeserialize(builder = DateChangeRequest.Builder.class)
public final class DateChangeRequest {
    /**
     * New conversion settlement date, format YYYY-MM-DD.
     */
    private final String newSettlementDate;

    /**
     * The UUID of the conversion that is being changed.
     */
    private final String id;


    private DateChangeRequest(Builder builder) {
        this.newSettlementDate = builder.newSettlementDate;
        this.id = builder.id;
    }

    /**
     * Retrieves value for `newSettlementDate`
     * New conversion settlement date, format YYYY-MM-DD.
     */
    @JsonProperty("new_settlement_date")
    public String getNewSettlementDate() {
        return newSettlementDate;
    }
    /**
     * Retrieves value for `id`
     * The UUID of the conversion that is being changed.
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof DateChangeRequest && equalTo((DateChangeRequest) other);
    }

    private boolean equalTo(DateChangeRequest other) {
        return
            newSettlementDate.equals(other.newSettlementDate) &&

            id.equals(other.id)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.newSettlementDate,
                   this.id
               );
    }

    @Override
    public String toString() {
        return "DateChangeRequest{" +
               "newSettlementDate=" + newSettlementDate + ", " +
               "id=" + id +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * New conversion settlement date, format YYYY-MM-DD.
         */
        private String newSettlementDate = null;

        /**
         * The UUID of the conversion that is being changed.
         */
        private String id = null;


        private Builder() {}

        public Builder from(DateChangeRequest other) {
            newSettlementDate(other.getNewSettlementDate());
            id(other.getId());
            return this;
        }

        /**
         * Sets value for `newSettlementDate`
         * New conversion settlement date, format YYYY-MM-DD.
         */
        @JsonSetter("new_settlement_date")
        public Builder newSettlementDate(String newSettlementDate) {
            if (newSettlementDate == null) {
                throw new IllegalArgumentException("newSettlementDate cannot be null");
            }

            this.newSettlementDate = newSettlementDate;
            return this;
        }
        /**
         * Sets value for `id`
         * The UUID of the conversion that is being changed.
         */
        @JsonSetter("id")
        public Builder id(String id) {
            if (id == null) {
                throw new IllegalArgumentException("id cannot be null");
            }

            this.id = id;
            return this;
        }



        public DateChangeRequest build() {
            if (newSettlementDate == null) {
                throw new IllegalStateException("newSettlementDate is required");
            }

            if (id == null) {
                throw new IllegalStateException("id is required");
            }

            return new DateChangeRequest(this);
        }
    }

}



