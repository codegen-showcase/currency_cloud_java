
package com.currencycloud.sdk.resources.conversions.params;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * CancellationQuoteRequest
 */
@JsonDeserialize(builder = CancellationQuoteRequest.Builder.class)
public final class CancellationQuoteRequest {
    /**
     * Conversion UUID, this is returned by a successful trade request when creating a conversion.
     */
    private final String id;


    private CancellationQuoteRequest(Builder builder) {
        this.id = builder.id;
    }

    /**
     * Retrieves value for `id`
     * Conversion UUID, this is returned by a successful trade request when creating a conversion.
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof CancellationQuoteRequest && equalTo((CancellationQuoteRequest) other);
    }

    private boolean equalTo(CancellationQuoteRequest other) {
        return
            id.equals(other.id)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.id
               );
    }

    @Override
    public String toString() {
        return "CancellationQuoteRequest{" +
               "id=" + id +
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


        private Builder() {}

        public Builder from(CancellationQuoteRequest other) {
            id(other.getId());
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



        public CancellationQuoteRequest build() {
            if (id == null) {
                throw new IllegalStateException("id is required");
            }

            return new CancellationQuoteRequest(this);
        }
    }

}



