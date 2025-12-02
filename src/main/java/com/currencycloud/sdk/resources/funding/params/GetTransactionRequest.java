
package com.currencycloud.sdk.resources.funding.params;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * GetTransactionRequest
 */
@JsonDeserialize(builder = GetTransactionRequest.Builder.class)
public final class GetTransactionRequest {
    /**
     * The Related Entity UUID (related_entity_id) for the transaction.
     */
    private final String id;

    /**
     * A contact UUID for the sub-account you're acting on behalf of.
     */
    private final Optional<String> onBehalfOf;


    private GetTransactionRequest(Builder builder) {
        this.id = builder.id;
        this.onBehalfOf = builder.onBehalfOf;
    }

    /**
     * Retrieves value for `id`
     * The Related Entity UUID (related_entity_id) for the transaction.
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

        return other instanceof GetTransactionRequest && equalTo((GetTransactionRequest) other);
    }

    private boolean equalTo(GetTransactionRequest other) {
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
        return "GetTransactionRequest{" +
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
         * The Related Entity UUID (related_entity_id) for the transaction.
         */
        private String id = null;

        /**
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        private Optional<String> onBehalfOf = Optional.empty();


        private Builder() {}

        public Builder from(GetTransactionRequest other) {
            id(other.getId());
            onBehalfOf(other.getOnBehalfOf());
            return this;
        }

        /**
         * Sets value for `id`
         * The Related Entity UUID (related_entity_id) for the transaction.
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



        public GetTransactionRequest build() {
            if (id == null) {
                throw new IllegalStateException("id is required");
            }

            return new GetTransactionRequest(this);
        }
    }

}



