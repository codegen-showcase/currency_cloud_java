
package com.currencycloud.sdk.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Status of the transaction.
 */
@JsonDeserialize(builder = PaymentTrackingInfoTransactionStatus.Builder.class)
public final class PaymentTrackingInfoTransactionStatus {
    /**
     * Reason for current status.
     */
    private final String reason;

    /**
     * Current status
     */
    private final String status;


    private PaymentTrackingInfoTransactionStatus(Builder builder) {
        this.reason = builder.reason;
        this.status = builder.status;
    }

    /**
     * Retrieves value for `reason`
     * Reason for current status.
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }
    /**
     * Retrieves value for `status`
     * Current status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof PaymentTrackingInfoTransactionStatus &&
               equalTo((PaymentTrackingInfoTransactionStatus) other);
    }

    private boolean equalTo(PaymentTrackingInfoTransactionStatus other) {
        return
            reason.equals(other.reason) &&

            status.equals(other.status)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.reason,
                   this.status
               );
    }

    @Override
    public String toString() {
        return "PaymentTrackingInfoTransactionStatus{" +
               "reason=" + reason + ", " +
               "status=" + status +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Reason for current status.
         */
        private String reason = null;

        /**
         * Current status
         */
        private String status = null;


        private Builder() {}

        public Builder from(PaymentTrackingInfoTransactionStatus other) {
            reason(other.getReason());
            status(other.getStatus());
            return this;
        }

        /**
         * Sets value for `reason`
         * Reason for current status.
         */
        @JsonSetter("reason")
        public Builder reason(String reason) {
            if (reason == null) {
                throw new IllegalArgumentException("reason cannot be null");
            }

            this.reason = reason;
            return this;
        }
        /**
         * Sets value for `status`
         * Current status
         */
        @JsonSetter("status")
        public Builder status(String status) {
            if (status == null) {
                throw new IllegalArgumentException("status cannot be null");
            }

            this.status = status;
            return this;
        }



        public PaymentTrackingInfoTransactionStatus build() {
            if (reason == null) {
                throw new IllegalStateException("reason is required");
            }

            if (status == null) {
                throw new IllegalStateException("status is required");
            }

            return new PaymentTrackingInfoTransactionStatus(this);
        }
    }

}



