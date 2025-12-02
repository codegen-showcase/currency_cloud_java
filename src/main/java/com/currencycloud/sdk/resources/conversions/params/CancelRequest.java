
package com.currencycloud.sdk.resources.conversions.params;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * CancelRequest
 */
@JsonDeserialize(builder = CancelRequest.Builder.class)
public final class CancelRequest {
    /**
     * Notes describing the reason for cancellation.
     */
    private final Optional<String> notes;

    /**
     * UUID of the conversion that is being cancelled. The UUID is returned by a successful trade request when creating a conversion.
     */
    private final String id;


    private CancelRequest(Builder builder) {
        this.notes = builder.notes;
        this.id = builder.id;
    }

    /**
     * Retrieves value for `notes`
     * Notes describing the reason for cancellation.
     */
    @JsonProperty("notes")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getNotes() {
        return notes;
    }
    /**
     * Retrieves value for `id`
     * UUID of the conversion that is being cancelled. The UUID is returned by a successful trade request when creating a conversion.
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
            notes.equals(other.notes) &&

            id.equals(other.id)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.notes,
                   this.id
               );
    }

    @Override
    public String toString() {
        return "CancelRequest{" +
               "notes=" + notes + ", " +
               "id=" + id +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Notes describing the reason for cancellation.
         */
        private Optional<String> notes = Optional.empty();

        /**
         * UUID of the conversion that is being cancelled. The UUID is returned by a successful trade request when creating a conversion.
         */
        private String id = null;


        private Builder() {}

        public Builder from(CancelRequest other) {
            notes(other.getNotes());
            id(other.getId());
            return this;
        }

        /**
         * Sets value for `notes`
         * Notes describing the reason for cancellation.
         */
        @JsonSetter("notes")
        public Builder notes(Optional<String> notes) {
            this.notes = notes;
            return this;
        }

        /**
         * Sets value for `notes`
         * Notes describing the reason for cancellation.
         */
        public Builder notes(String notes) {
            return this.notes(Optional.ofNullable(notes));
        }
        /**
         * Sets value for `id`
         * UUID of the conversion that is being cancelled. The UUID is returned by a successful trade request when creating a conversion.
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



