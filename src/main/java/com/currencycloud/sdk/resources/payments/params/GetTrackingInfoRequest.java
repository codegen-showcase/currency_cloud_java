
package com.currencycloud.sdk.resources.payments.params;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * GetTrackingInfoRequest
 */
@JsonDeserialize(builder = GetTrackingInfoRequest.Builder.class)
public final class GetTrackingInfoRequest {
    /**
     * Payment UUID
     */
    private final String id;


    private GetTrackingInfoRequest(Builder builder) {
        this.id = builder.id;
    }

    /**
     * Retrieves value for `id`
     * Payment UUID
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof GetTrackingInfoRequest && equalTo((GetTrackingInfoRequest) other);
    }

    private boolean equalTo(GetTrackingInfoRequest other) {
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
        return "GetTrackingInfoRequest{" +
               "id=" + id +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Payment UUID
         */
        private String id = null;


        private Builder() {}

        public Builder from(GetTrackingInfoRequest other) {
            id(other.getId());
            return this;
        }

        /**
         * Sets value for `id`
         * Payment UUID
         */
        @JsonSetter("id")
        public Builder id(String id) {
            if (id == null) {
                throw new IllegalArgumentException("id cannot be null");
            }

            this.id = id;
            return this;
        }



        public GetTrackingInfoRequest build() {
            if (id == null) {
                throw new IllegalStateException("id is required");
            }

            return new GetTrackingInfoRequest(this);
        }
    }

}



