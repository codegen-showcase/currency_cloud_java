
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
 * ConversionsProfitAndLossResponse
 */
@JsonDeserialize(builder = ConversionsProfitAndLossResponse.Builder.class)
public final class ConversionsProfitAndLossResponse {
    private final Optional<List<ConversionProfitAndLoss>> conversionProfitAndLosses;

    /**
     * Pagination.
     */
    private final Optional<Pagination> pagination;


    private ConversionsProfitAndLossResponse(Builder builder) {
        this.conversionProfitAndLosses = builder.conversionProfitAndLosses;
        this.pagination = builder.pagination;
    }

    /**
     * Retrieves value for `conversionProfitAndLosses`
     */
    @JsonProperty("conversion_profit_and_losses")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<ConversionProfitAndLoss>> getConversionProfitAndLosses() {
        return conversionProfitAndLosses;
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

        return other instanceof ConversionsProfitAndLossResponse &&
               equalTo((ConversionsProfitAndLossResponse) other);
    }

    private boolean equalTo(ConversionsProfitAndLossResponse other) {
        return
            conversionProfitAndLosses.equals(other.conversionProfitAndLosses) &&

            pagination.equals(other.pagination)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.conversionProfitAndLosses,
                   this.pagination
               );
    }

    @Override
    public String toString() {
        return "ConversionsProfitAndLossResponse{" +
               "conversionProfitAndLosses=" + conversionProfitAndLosses + ", " +
               "pagination=" + pagination +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<List<ConversionProfitAndLoss>> conversionProfitAndLosses = Optional.empty();

        /**
         * Pagination.
         */
        private Optional<Pagination> pagination = Optional.empty();


        private Builder() {}

        public Builder from(ConversionsProfitAndLossResponse other) {
            conversionProfitAndLosses(other.getConversionProfitAndLosses());
            pagination(other.getPagination());
            return this;
        }

        /**
         * Sets value for `conversionProfitAndLosses`
         */
        @JsonSetter("conversion_profit_and_losses")
        public Builder conversionProfitAndLosses(Optional<List<ConversionProfitAndLoss>>
                conversionProfitAndLosses) {
            this.conversionProfitAndLosses = conversionProfitAndLosses;
            return this;
        }

        /**
         * Sets value for `conversionProfitAndLosses`
         */
        public Builder conversionProfitAndLosses(List<ConversionProfitAndLoss> conversionProfitAndLosses) {
            return this.conversionProfitAndLosses(Optional.ofNullable(conversionProfitAndLosses));
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



        public ConversionsProfitAndLossResponse build() {
            return new ConversionsProfitAndLossResponse(this);
        }
    }

}



