
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * PaymentsValidateResponse
 */
@JsonDeserialize(builder = PaymentsValidateResponse.Builder.class)
public final class PaymentsValidateResponse {
    private final Optional<String> validationResult;


    private PaymentsValidateResponse(Builder builder) {
        this.validationResult = builder.validationResult;
    }

    /**
     * Retrieves value for `validationResult`
     */
    @JsonProperty("validation_result")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getValidationResult() {
        return validationResult;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof PaymentsValidateResponse && equalTo((PaymentsValidateResponse) other);
    }

    private boolean equalTo(PaymentsValidateResponse other) {
        return
            validationResult.equals(other.validationResult)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.validationResult
               );
    }

    @Override
    public String toString() {
        return "PaymentsValidateResponse{" +
               "validationResult=" + validationResult +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> validationResult = Optional.empty();


        private Builder() {}

        public Builder from(PaymentsValidateResponse other) {
            validationResult(other.getValidationResult());
            return this;
        }

        /**
         * Sets value for `validationResult`
         */
        @JsonSetter("validation_result")
        public Builder validationResult(Optional<String> validationResult) {
            this.validationResult = validationResult;
            return this;
        }

        /**
         * Sets value for `validationResult`
         */
        public Builder validationResult(String validationResult) {
            return this.validationResult(Optional.ofNullable(validationResult));
        }



        public PaymentsValidateResponse build() {
            return new PaymentsValidateResponse(this);
        }
    }

}



