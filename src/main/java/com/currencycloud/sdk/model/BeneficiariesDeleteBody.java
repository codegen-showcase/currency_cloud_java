
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * BeneficiariesDeleteBody
 */
@JsonDeserialize(builder = BeneficiariesDeleteBody.Builder.class)
public final class BeneficiariesDeleteBody {
    /**
     * A contact UUID for the sub-account you're acting on behalf of.
     */
    private final Optional<String> onBehalfOf;


    private BeneficiariesDeleteBody(Builder builder) {
        this.onBehalfOf = builder.onBehalfOf;
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

        return other instanceof BeneficiariesDeleteBody && equalTo((BeneficiariesDeleteBody) other);
    }

    private boolean equalTo(BeneficiariesDeleteBody other) {
        return
            onBehalfOf.equals(other.onBehalfOf)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.onBehalfOf
               );
    }

    @Override
    public String toString() {
        return "BeneficiariesDeleteBody{" +
               "onBehalfOf=" + onBehalfOf +
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


        private Builder() {}

        public Builder from(BeneficiariesDeleteBody other) {
            onBehalfOf(other.getOnBehalfOf());
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



        public BeneficiariesDeleteBody build() {
            return new BeneficiariesDeleteBody(this);
        }
    }

}



