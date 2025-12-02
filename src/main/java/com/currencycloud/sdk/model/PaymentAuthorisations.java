
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
 * Payment Authorisations.
 */
@JsonDeserialize(builder = PaymentAuthorisations.Builder.class)
public final class PaymentAuthorisations {
    private final Optional<List<PaymentAuthorisation>> authorisations;


    private PaymentAuthorisations(Builder builder) {
        this.authorisations = builder.authorisations;
    }

    /**
     * Retrieves value for `authorisations`
     */
    @JsonProperty("authorisations")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<PaymentAuthorisation>> getAuthorisations() {
        return authorisations;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof PaymentAuthorisations && equalTo((PaymentAuthorisations) other);
    }

    private boolean equalTo(PaymentAuthorisations other) {
        return
            authorisations.equals(other.authorisations)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.authorisations
               );
    }

    @Override
    public String toString() {
        return "PaymentAuthorisations{" +
               "authorisations=" + authorisations +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<List<PaymentAuthorisation>> authorisations = Optional.empty();


        private Builder() {}

        public Builder from(PaymentAuthorisations other) {
            authorisations(other.getAuthorisations());
            return this;
        }

        /**
         * Sets value for `authorisations`
         */
        @JsonSetter("authorisations")
        public Builder authorisations(Optional<List<PaymentAuthorisation>> authorisations) {
            this.authorisations = authorisations;
            return this;
        }

        /**
         * Sets value for `authorisations`
         */
        public Builder authorisations(List<PaymentAuthorisation> authorisations) {
            return this.authorisations(Optional.ofNullable(authorisations));
        }



        public PaymentAuthorisations build() {
            return new PaymentAuthorisations(this);
        }
    }

}



