
package com.currencycloud.sdk.resources.conversions.params;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * SplitPreviewRequest
 */
@JsonDeserialize(builder = SplitPreviewRequest.Builder.class)
public final class SplitPreviewRequest {
    /**
     * The UUID of the conversion to be split, the UUID is returned by a successful trade request when creating a conversion.
     */
    private final String id;

    /**
     * The amount at which to split this conversion.
     */
    private final String amount;


    private SplitPreviewRequest(Builder builder) {
        this.id = builder.id;
        this.amount = builder.amount;
    }

    /**
     * Retrieves value for `id`
     * The UUID of the conversion to be split, the UUID is returned by a successful trade request when creating a conversion.
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }
    /**
     * Retrieves value for `amount`
     * The amount at which to split this conversion.
     */
    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof SplitPreviewRequest && equalTo((SplitPreviewRequest) other);
    }

    private boolean equalTo(SplitPreviewRequest other) {
        return
            id.equals(other.id) &&

            amount.equals(other.amount)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.id,
                   this.amount
               );
    }

    @Override
    public String toString() {
        return "SplitPreviewRequest{" +
               "id=" + id + ", " +
               "amount=" + amount +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * The UUID of the conversion to be split, the UUID is returned by a successful trade request when creating a conversion.
         */
        private String id = null;

        /**
         * The amount at which to split this conversion.
         */
        private String amount = null;


        private Builder() {}

        public Builder from(SplitPreviewRequest other) {
            id(other.getId());
            amount(other.getAmount());
            return this;
        }

        /**
         * Sets value for `id`
         * The UUID of the conversion to be split, the UUID is returned by a successful trade request when creating a conversion.
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



        public SplitPreviewRequest build() {
            if (id == null) {
                throw new IllegalStateException("id is required");
            }

            if (amount == null) {
                throw new IllegalStateException("amount is required");
            }

            return new SplitPreviewRequest(this);
        }
    }

}



