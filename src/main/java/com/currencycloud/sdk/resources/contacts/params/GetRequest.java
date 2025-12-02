
package com.currencycloud.sdk.resources.contacts.params;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * GetRequest
 */
@JsonDeserialize(builder = GetRequest.Builder.class)
public final class GetRequest {
    /**
     * Contact UUID
     */
    private final String id;


    private GetRequest(Builder builder) {
        this.id = builder.id;
    }

    /**
     * Retrieves value for `id`
     * Contact UUID
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof GetRequest && equalTo((GetRequest) other);
    }

    private boolean equalTo(GetRequest other) {
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
        return "GetRequest{" +
               "id=" + id +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Contact UUID
         */
        private String id = null;


        private Builder() {}

        public Builder from(GetRequest other) {
            id(other.getId());
            return this;
        }

        /**
         * Sets value for `id`
         * Contact UUID
         */
        @JsonSetter("id")
        public Builder id(String id) {
            if (id == null) {
                throw new IllegalArgumentException("id cannot be null");
            }

            this.id = id;
            return this;
        }



        public GetRequest build() {
            if (id == null) {
                throw new IllegalStateException("id is required");
            }

            return new GetRequest(this);
        }
    }

}



