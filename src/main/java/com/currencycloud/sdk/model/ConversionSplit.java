
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * ConversionSplit
 */
@JsonDeserialize(builder = ConversionSplit.Builder.class)
public final class ConversionSplit {
    private final Optional<ConversionSplitDetails> childConversion;

    private final Optional<ConversionSplitDetails> parentConversion;


    private ConversionSplit(Builder builder) {
        this.childConversion = builder.childConversion;
        this.parentConversion = builder.parentConversion;
    }

    /**
     * Retrieves value for `childConversion`
     */
    @JsonProperty("child_conversion")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<ConversionSplitDetails> getChildConversion() {
        return childConversion;
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

        return other instanceof ConversionSplit && equalTo((ConversionSplit) other);
    }

    private boolean equalTo(ConversionSplit other) {
        return
            childConversion.equals(other.childConversion) &&

            parentConversion.equals(other.parentConversion)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.childConversion,
                   this.parentConversion
               );
    }

    @Override
    public String toString() {
        return "ConversionSplit{" +
               "childConversion=" + childConversion + ", " +
               "parentConversion=" + parentConversion +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<ConversionSplitDetails> childConversion = Optional.empty();

        private Optional<ConversionSplitDetails> parentConversion = Optional.empty();


        private Builder() {}

        public Builder from(ConversionSplit other) {
            childConversion(other.getChildConversion());
            parentConversion(other.getParentConversion());
            return this;
        }

        /**
         * Sets value for `childConversion`
         */
        @JsonSetter("child_conversion")
        public Builder childConversion(Optional<ConversionSplitDetails> childConversion) {
            this.childConversion = childConversion;
            return this;
        }

        /**
         * Sets value for `childConversion`
         */
        public Builder childConversion(ConversionSplitDetails childConversion) {
            return this.childConversion(Optional.ofNullable(childConversion));
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



        public ConversionSplit build() {
            return new ConversionSplit(this);
        }
    }

}



