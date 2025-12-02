
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
 * Recognised profit / loss on a conversion.
 */
@JsonDeserialize(builder = ConversionProfitAndLoss.Builder.class)
public final class ConversionProfitAndLoss {
    private final Optional<List<ConversionCancellation>> conversionProfitAndLosses;

    /**
     * Pagination.
     */
    private final Optional<Pagination> pagination;


    private ConversionProfitAndLoss(Builder builder) {
        this.conversionProfitAndLosses = builder.conversionProfitAndLosses;
        this.pagination = builder.pagination;
    }

    /**
     * Retrieves value for `conversionProfitAndLosses`
     */
    @JsonProperty("conversion_profit_and_losses")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<ConversionCancellation>> getConversionProfitAndLosses() {
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

        return other instanceof ConversionProfitAndLoss && equalTo((ConversionProfitAndLoss) other);
    }

    private boolean equalTo(ConversionProfitAndLoss other) {
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
        return "ConversionProfitAndLoss{" +
               "conversionProfitAndLosses=" + conversionProfitAndLosses + ", " +
               "pagination=" + pagination +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<List<ConversionCancellation>> conversionProfitAndLosses = Optional.empty();

        /**
         * Pagination.
         */
        private Optional<Pagination> pagination = Optional.empty();


        private Builder() {}

        public Builder from(ConversionProfitAndLoss other) {
            conversionProfitAndLosses(other.getConversionProfitAndLosses());
            pagination(other.getPagination());
            return this;
        }

        /**
         * Sets value for `conversionProfitAndLosses`
         */
        @JsonSetter("conversion_profit_and_losses")
        public Builder conversionProfitAndLosses(Optional<List<ConversionCancellation>>
                conversionProfitAndLosses) {
            this.conversionProfitAndLosses = conversionProfitAndLosses;
            return this;
        }

        /**
         * Sets value for `conversionProfitAndLosses`
         */
        public Builder conversionProfitAndLosses(List<ConversionCancellation> conversionProfitAndLosses) {
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



        public ConversionProfitAndLoss build() {
            return new ConversionProfitAndLoss(this);
        }
    }

}



