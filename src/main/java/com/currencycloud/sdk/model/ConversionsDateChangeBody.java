
package com.currencycloud.sdk.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * ConversionsDateChangeBody
 */
@JsonDeserialize(builder = ConversionsDateChangeBody.Builder.class)
public final class ConversionsDateChangeBody {
    /**
     * New conversion settlement date, format YYYY-MM-DD.
     */
    private final String newSettlementDate;


    private ConversionsDateChangeBody(Builder builder) {
        this.newSettlementDate = builder.newSettlementDate;
    }

    /**
     * Retrieves value for `newSettlementDate`
     * New conversion settlement date, format YYYY-MM-DD.
     */
    @JsonProperty("new_settlement_date")
    public String getNewSettlementDate() {
        return newSettlementDate;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof ConversionsDateChangeBody && equalTo((ConversionsDateChangeBody) other);
    }

    private boolean equalTo(ConversionsDateChangeBody other) {
        return
            newSettlementDate.equals(other.newSettlementDate)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.newSettlementDate
               );
    }

    @Override
    public String toString() {
        return "ConversionsDateChangeBody{" +
               "newSettlementDate=" + newSettlementDate +
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


        private Builder() {}

        public Builder from(ConversionsDateChangeBody other) {
            newSettlementDate(other.getNewSettlementDate());
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



        public ConversionsDateChangeBody build() {
            if (newSettlementDate == null) {
                throw new IllegalStateException("newSettlementDate is required");
            }

            return new ConversionsDateChangeBody(this);
        }
    }

}



