
package com.currencycloud.sdk.resources.conversions.params;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * SplitRequest
 */
@JsonDeserialize(builder = SplitRequest.Builder.class)
public final class SplitRequest {
    /**
     * The amount at which to split this conversion.
     */
    private final String amount;

    /**
     * UUID of the conversion that is being split. The conversion UUID is returned by a successful trade request when creating a conversion."
     */
    private final String id;


    private SplitRequest(Builder builder) {
        this.amount = builder.amount;
        this.id = builder.id;
    }

    /**
     * Retrieves value for `amount`
     * The amount at which to split this conversion.
     */
    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }
    /**
     * Retrieves value for `id`
     * UUID of the conversion that is being split. The conversion UUID is returned by a successful trade request when creating a conversion."
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof SplitRequest && equalTo((SplitRequest) other);
    }

    private boolean equalTo(SplitRequest other) {
        return
            amount.equals(other.amount) &&

            id.equals(other.id)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.amount,
                   this.id
               );
    }

    @Override
    public String toString() {
        return "SplitRequest{" +
               "amount=" + amount + ", " +
               "id=" + id +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * The amount at which to split this conversion.
         */
        private String amount = null;

        /**
         * UUID of the conversion that is being split. The conversion UUID is returned by a successful trade request when creating a conversion."
         */
        private String id = null;


        private Builder() {}

        public Builder from(SplitRequest other) {
            amount(other.getAmount());
            id(other.getId());
            return this;
        }

        /**
         * Sets value for `amount`
         * The amount at which to split this conversion.
         */
        @JsonSetter("amount")
        public Builder amount(String amount) {
            if (amount == null) {
                throw new IllegalArgumentException("amount cannot be null");
            }

            this.amount = amount;
            return this;
        }
        /**
         * Sets value for `id`
         * UUID of the conversion that is being split. The conversion UUID is returned by a successful trade request when creating a conversion."
         */
        @JsonSetter("id")
        public Builder id(String id) {
            if (id == null) {
                throw new IllegalArgumentException("id cannot be null");
            }

            this.id = id;
            return this;
        }



        public SplitRequest build() {
            if (amount == null) {
                throw new IllegalStateException("amount is required");
            }

            if (id == null) {
                throw new IllegalStateException("id is required");
            }

            return new SplitRequest(this);
        }
    }

}



