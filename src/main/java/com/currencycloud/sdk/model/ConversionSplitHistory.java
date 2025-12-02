
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
 * ConversionSplitHistory
 */
@JsonDeserialize(builder = ConversionSplitHistory.Builder.class)
public final class ConversionSplitHistory {
    /**
     * The child conversion (after split).
     */
    private final Optional<List<ConversionSplitDetails>> childConversions;

    private final Optional<ConversionSplitDetails> originConversion;

    private final Optional<ConversionSplitDetails> parentConversion;


    private ConversionSplitHistory(Builder builder) {
        this.childConversions = builder.childConversions;
        this.originConversion = builder.originConversion;
        this.parentConversion = builder.parentConversion;
    }

    /**
     * Retrieves value for `childConversions`
     * The child conversion (after split).
     */
    @JsonProperty("child_conversions")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<ConversionSplitDetails>> getChildConversions() {
        return childConversions;
    }
    /**
     * Retrieves value for `originConversion`
     */
    @JsonProperty("origin_conversion")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<ConversionSplitDetails> getOriginConversion() {
        return originConversion;
    }
    /**
     * Retrieves value for `parentConversion`
     */
    @JsonProperty("parent_conversion")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<ConversionSplitDetails> getParentConversion() {
        return parentConversion;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof ConversionSplitHistory && equalTo((ConversionSplitHistory) other);
    }

    private boolean equalTo(ConversionSplitHistory other) {
        return
            childConversions.equals(other.childConversions) &&

            originConversion.equals(other.originConversion) &&

            parentConversion.equals(other.parentConversion)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.childConversions,
                   this.originConversion,
                   this.parentConversion
               );
    }

    @Override
    public String toString() {
        return "ConversionSplitHistory{" +
               "childConversions=" + childConversions + ", " +
               "originConversion=" + originConversion + ", " +
               "parentConversion=" + parentConversion +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * The child conversion (after split).
         */
        private Optional<List<ConversionSplitDetails>> childConversions = Optional.empty();

        private Optional<ConversionSplitDetails> originConversion = Optional.empty();

        private Optional<ConversionSplitDetails> parentConversion = Optional.empty();


        private Builder() {}

        public Builder from(ConversionSplitHistory other) {
            childConversions(other.getChildConversions());
            originConversion(other.getOriginConversion());
            parentConversion(other.getParentConversion());
            return this;
        }

        /**
         * Sets value for `childConversions`
         * The child conversion (after split).
         */
        @JsonSetter("child_conversions")
        public Builder childConversions(Optional<List<ConversionSplitDetails>> childConversions) {
            this.childConversions = childConversions;
            return this;
        }

        /**
         * Sets value for `childConversions`
         * The child conversion (after split).
         */
        public Builder childConversions(List<ConversionSplitDetails> childConversions) {
            return this.childConversions(Optional.ofNullable(childConversions));
        }
        /**
         * Sets value for `originConversion`
         */
        @JsonSetter("origin_conversion")
        public Builder originConversion(Optional<ConversionSplitDetails> originConversion) {
            this.originConversion = originConversion;
            return this;
        }

        /**
         * Sets value for `originConversion`
         */
        public Builder originConversion(ConversionSplitDetails originConversion) {
            return this.originConversion(Optional.ofNullable(originConversion));
        }
        /**
         * Sets value for `parentConversion`
         */
        @JsonSetter("parent_conversion")
        public Builder parentConversion(Optional<ConversionSplitDetails> parentConversion) {
            this.parentConversion = parentConversion;
            return this;
        }

        /**
         * Sets value for `parentConversion`
         */
        public Builder parentConversion(ConversionSplitDetails parentConversion) {
            return this.parentConversion(Optional.ofNullable(parentConversion));
        }



        public ConversionSplitHistory build() {
            return new ConversionSplitHistory(this);
        }
    }

}



