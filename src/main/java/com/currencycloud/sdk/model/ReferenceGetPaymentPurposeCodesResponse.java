
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
 * ReferenceGetPaymentPurposeCodesResponse
 */
@JsonDeserialize(builder = ReferenceGetPaymentPurposeCodesResponse.Builder.class)
public final class ReferenceGetPaymentPurposeCodesResponse {
    private final Optional<List<PaymentPurposeCodes>> purposeCodes;


    private ReferenceGetPaymentPurposeCodesResponse(Builder builder) {
        this.purposeCodes = builder.purposeCodes;
    }

    /**
     * Retrieves value for `purposeCodes`
     */
    @JsonProperty("purpose_codes")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<PaymentPurposeCodes>> getPurposeCodes() {
        return purposeCodes;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof ReferenceGetPaymentPurposeCodesResponse &&
               equalTo((ReferenceGetPaymentPurposeCodesResponse) other);
    }

    private boolean equalTo(ReferenceGetPaymentPurposeCodesResponse other) {
        return
            purposeCodes.equals(other.purposeCodes)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.purposeCodes
               );
    }

    @Override
    public String toString() {
        return "ReferenceGetPaymentPurposeCodesResponse{" +
               "purposeCodes=" + purposeCodes +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<List<PaymentPurposeCodes>> purposeCodes = Optional.empty();


        private Builder() {}

        public Builder from(ReferenceGetPaymentPurposeCodesResponse other) {
            purposeCodes(other.getPurposeCodes());
            return this;
        }

        /**
         * Sets value for `purposeCodes`
         */
        @JsonSetter("purpose_codes")
        public Builder purposeCodes(Optional<List<PaymentPurposeCodes>> purposeCodes) {
            this.purposeCodes = purposeCodes;
            return this;
        }

        /**
         * Sets value for `purposeCodes`
         */
        public Builder purposeCodes(List<PaymentPurposeCodes> purposeCodes) {
            return this.purposeCodes(Optional.ofNullable(purposeCodes));
        }



        public ReferenceGetPaymentPurposeCodesResponse build() {
            return new ReferenceGetPaymentPurposeCodesResponse(this);
        }
    }

}



