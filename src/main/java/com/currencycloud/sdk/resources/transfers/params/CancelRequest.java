
package com.currencycloud.sdk.resources.transfers.params;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * CancelRequest
 */
@JsonDeserialize(builder = CancelRequest.Builder.class)
public final class CancelRequest {
    /**
     * ID of the transfer to be cancelled.
     */
    private final String id;


    private CancelRequest(Builder builder) {
        this.id = builder.id;
    }

    /**
     * Retrieves value for `id`
     * ID of the transfer to be cancelled.
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof CancelRequest && equalTo((CancelRequest) other);
    }

    private boolean equalTo(CancelRequest other) {
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
        return "CancelRequest{" +
               "id=" + id +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * ID of the transfer to be cancelled.
         */
        private String id = null;


        private Builder() {}

        public Builder from(CancelRequest other) {
            id(other.getId());
            return this;
        }

        /**
         * Sets value for `id`
         * ID of the transfer to be cancelled.
         */
        @JsonSetter("id")
        public Builder id(String id) {
            if (id == null) {
                throw new IllegalArgumentException("id cannot be null");
            }

            this.id = id;
            return this;
        }



        public CancelRequest build() {
            if (id == null) {
                throw new IllegalStateException("id is required");
            }

            return new CancelRequest(this);
        }
    }

}



