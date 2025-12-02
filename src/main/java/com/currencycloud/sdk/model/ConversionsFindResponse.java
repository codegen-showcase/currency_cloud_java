
package com.currencycloud.sdk.model;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * ConversionsFindResponse
 */
@JsonDeserialize(builder = ConversionsFindResponse.Builder.class)
public final class ConversionsFindResponse {
    private final Optional<List<Conversion>> conversions;

    /**
     * Pagination.
     */
    private final Optional<Pagination> pagination;


    private ConversionsFindResponse(Builder builder) {
        this.conversions = builder.conversions;
        this.pagination = builder.pagination;
    }

    /**
     * Retrieves value for `conversions`
     */
    @JsonProperty("conversions")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<Conversion>> getConversions() {
        return conversions;
    }
    /**
     * Retrieves value for `pagination`
     * Pagination.
     */
    @JsonProperty("pagination")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Pagination> getPagination() {
        return pagination;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof ConversionsFindResponse && equalTo((ConversionsFindResponse) other);
    }

    private boolean equalTo(ConversionsFindResponse other) {
        return
            conversions.equals(other.conversions) &&

            pagination.equals(other.pagination)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.conversions,
                   this.pagination
               );
    }

    @Override
    public String toString() {
        return "ConversionsFindResponse{" +
               "conversions=" + conversions + ", " +
               "pagination=" + pagination +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<List<Conversion>> conversions = Optional.empty();

        /**
         * Pagination.
         */
        private Optional<Pagination> pagination = Optional.empty();


        private Builder() {}

        public Builder from(ConversionsFindResponse other) {
            conversions(other.getConversions());
            pagination(other.getPagination());
            return this;
        }

        /**
         * Sets value for `conversions`
         */
        @JsonSetter("conversions")
        public Builder conversions(Optional<List<Conversion>> conversions) {
            this.conversions = conversions;
            return this;
        }

        /**
         * Sets value for `conversions`
         */
        public Builder conversions(List<Conversion> conversions) {
            return this.conversions(Optional.ofNullable(conversions));
        }
        /**
         * Sets value for `pagination`
         * Pagination.
         */
        @JsonSetter("pagination")
        public Builder pagination(Optional<Pagination> pagination) {
            this.pagination = pagination;
            return this;
        }

        /**
         * Sets value for `pagination`
         * Pagination.
         */
        public Builder pagination(Pagination pagination) {
            return this.pagination(Optional.ofNullable(pagination));
        }



        public ConversionsFindResponse build() {
            return new ConversionsFindResponse(this);
        }
    }

}



