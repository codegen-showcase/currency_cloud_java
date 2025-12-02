
package com.currencycloud.sdk.resources.beneficiaries.params;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * DeleteRequest
 */
@JsonDeserialize(builder = DeleteRequest.Builder.class)
public final class DeleteRequest {
    /**
     * A contact UUID for the sub-account you're acting on behalf of.
     */
    private final Optional<String> onBehalfOf;

    /**
     * Beneficiary UUID
     */
    private final String id;


    private DeleteRequest(Builder builder) {
        this.onBehalfOf = builder.onBehalfOf;
        this.id = builder.id;
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
    /**
     * Retrieves value for `id`
     * Beneficiary UUID
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof DeleteRequest && equalTo((DeleteRequest) other);
    }

    private boolean equalTo(DeleteRequest other) {
        return
            onBehalfOf.equals(other.onBehalfOf) &&

            id.equals(other.id)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.onBehalfOf,
                   this.id
               );
    }

    @Override
    public String toString() {
        return "DeleteRequest{" +
               "onBehalfOf=" + onBehalfOf + ", " +
               "id=" + id +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        private Optional<String> onBehalfOf = Optional.empty();

        /**
         * Beneficiary UUID
         */
        private String id = null;


        private Builder() {}

        public Builder from(DeleteRequest other) {
            onBehalfOf(other.getOnBehalfOf());
            id(other.getId());
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
        /**
         * Sets value for `id`
         * Beneficiary UUID
         */
        @JsonSetter("id")
        public Builder id(String id) {
            if (id == null) {
                throw new IllegalArgumentException("id cannot be null");
            }

            this.id = id;
            return this;
        }



        public DeleteRequest build() {
            if (id == null) {
                throw new IllegalStateException("id is required");
            }

            return new DeleteRequest(this);
        }
    }

}



