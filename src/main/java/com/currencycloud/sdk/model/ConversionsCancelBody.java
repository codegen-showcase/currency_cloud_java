
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * ConversionsCancelBody
 */
@JsonDeserialize(builder = ConversionsCancelBody.Builder.class)
public final class ConversionsCancelBody {
    /**
     * Notes describing the reason for cancellation.
     */
    private final Optional<String> notes;


    private ConversionsCancelBody(Builder builder) {
        this.notes = builder.notes;
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

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof ConversionsCancelBody && equalTo((ConversionsCancelBody) other);
    }

    private boolean equalTo(ConversionsCancelBody other) {
        return
            notes.equals(other.notes)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.notes
               );
    }

    @Override
    public String toString() {
        return "ConversionsCancelBody{" +
               "notes=" + notes +
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


        private Builder() {}

        public Builder from(ConversionsCancelBody other) {
            notes(other.getNotes());
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



        public ConversionsCancelBody build() {
            return new ConversionsCancelBody(this);
        }
    }

}



