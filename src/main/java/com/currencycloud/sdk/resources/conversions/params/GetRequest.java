
package com.currencycloud.sdk.resources.conversions.params;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * GetRequest
 */
@JsonDeserialize(builder = GetRequest.Builder.class)
public final class GetRequest {
    /**
     * Conversion UUID, this is returned by a successful trade request when creating a conversion.
     */
    private final String id;

    /**
     * A contact UUID for the sub-account you're acting on behalf of.
     */
    private final Optional<String> onBehalfOf;


    private GetRequest(Builder builder) {
        this.id = builder.id;
        this.onBehalfOf = builder.onBehalfOf;
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
     * Retrieves value for `onBehalfOf`
     * A contact UUID for the sub-account you're acting on behalf of.
     */
    @JsonProperty("on_behalf_of")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getOnBehalfOf() {
        return onBehalfOf;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof GetRequest && equalTo((GetRequest) other);
    }

    private boolean equalTo(GetRequest other) {
        return
            id.equals(other.id) &&

            onBehalfOf.equals(other.onBehalfOf)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.id,
                   this.onBehalfOf
               );
    }

    @Override
    public String toString() {
        return "GetRequest{" +
               "id=" + id + ", " +
               "onBehalfOf=" + onBehalfOf +
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
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        private Optional<String> onBehalfOf = Optional.empty();


        private Builder() {}

        public Builder from(GetRequest other) {
            id(other.getId());
            onBehalfOf(other.getOnBehalfOf());
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
         * Sets value for `onBehalfOf`
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        @JsonSetter("on_behalf_of")
        public Builder onBehalfOf(Optional<String> onBehalfOf) {
            this.onBehalfOf = onBehalfOf;
            return this;
        }

        /**
         * Sets value for `onBehalfOf`
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        public Builder onBehalfOf(String onBehalfOf) {
            return this.onBehalfOf(Optional.ofNullable(onBehalfOf));
        }



        public GetRequest build() {
            if (id == null) {
                throw new IllegalStateException("id is required");
            }

            return new GetRequest(this);
        }
    }

}



