
package com.currencycloud.sdk.resources.payments.params;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * AuthoriseRequest
 */
@JsonDeserialize(builder = AuthoriseRequest.Builder.class)
public final class AuthoriseRequest {
    /**
     * One or more payment UUID identifiers to be authorised.
     */
    private final List<String> paymentIds;


    private AuthoriseRequest(Builder builder) {
        this.paymentIds = builder.paymentIds;
    }

    /**
     * Retrieves value for `paymentIds`
     * One or more payment UUID identifiers to be authorised.
     */
    @JsonProperty("payment_ids[]")
    public List<String> getPaymentIds() {
        return paymentIds;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof AuthoriseRequest && equalTo((AuthoriseRequest) other);
    }

    private boolean equalTo(AuthoriseRequest other) {
        return
            paymentIds.equals(other.paymentIds)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.paymentIds
               );
    }

    @Override
    public String toString() {
        return "AuthoriseRequest{" +
               "paymentIds=" + paymentIds +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * One or more payment UUID identifiers to be authorised.
         */
        private List<String> paymentIds = null;


        private Builder() {}

        public Builder from(AuthoriseRequest other) {
            paymentIds(other.getPaymentIds());
            return this;
        }

        /**
         * Sets value for `paymentIds`
         * One or more payment UUID identifiers to be authorised.
         */
        @JsonSetter("payment_ids[]")
        public Builder paymentIds(List<String> paymentIds) {
            if (paymentIds == null) {
                throw new IllegalArgumentException("paymentIds cannot be null");
            }

            this.paymentIds = paymentIds;
            return this;
        }



        public AuthoriseRequest build() {
            if (paymentIds == null) {
                throw new IllegalStateException("paymentIds is required");
            }

            return new AuthoriseRequest(this);
        }
    }

}



