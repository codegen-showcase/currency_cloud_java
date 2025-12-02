
package com.currencycloud.sdk.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * PaymentTrackingInfo
 */
@JsonDeserialize(builder = PaymentTrackingInfo.Builder.class)
public final class PaymentTrackingInfo {
    /**
     * Time of completion.
     */
    private final String completionTime;

    /**
     * Time of initiation.
     */
    private final String initiationTime;

    /**
     * Time of last update.
     */
    private final String lastUpdateTime;

    /**
     * List of events that have been applied to the payment.
     */
    private final List<Map<String, Object>> paymentEvents;

    /**
     * Status of the transaction.
     */
    private final PaymentTrackingInfoTransactionStatus transactionStatus;

    /**
     * Unique End-to-end Transaction Reference.
     */
    private final String uetr;

    private final Map<String, Object> additionalProperties;


    private PaymentTrackingInfo(Builder builder) {
        this.completionTime = builder.completionTime;
        this.initiationTime = builder.initiationTime;
        this.lastUpdateTime = builder.lastUpdateTime;
        this.paymentEvents = builder.paymentEvents;
        this.transactionStatus = builder.transactionStatus;
        this.uetr = builder.uetr;
        this.additionalProperties = builder.additionalProperties;
    }

    /**
     * Retrieves value for `completionTime`
     * Time of completion.
     */
    @JsonProperty("completion_time")
    public String getCompletionTime() {
        return completionTime;
    }
    /**
     * Retrieves value for `initiationTime`
     * Time of initiation.
     */
    @JsonProperty("initiation_time")
    public String getInitiationTime() {
        return initiationTime;
    }
    /**
     * Retrieves value for `lastUpdateTime`
     * Time of last update.
     */
    @JsonProperty("last_update_time")
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }
    /**
     * Retrieves value for `paymentEvents`
     * List of events that have been applied to the payment.
     */
    @JsonProperty("payment_events")
    public List<Map<String, Object>> getPaymentEvents() {
        return paymentEvents;
    }
    /**
     * Retrieves value for `transactionStatus`
     * Status of the transaction.
     */
    @JsonProperty("transaction_status")
    public PaymentTrackingInfoTransactionStatus getTransactionStatus() {
        return transactionStatus;
    }
    /**
     * Retrieves value for `uetr`
     * Unique End-to-end Transaction Reference.
     */
    @JsonProperty("uetr")
    public String getUetr() {
        return uetr;
    }
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof PaymentTrackingInfo && equalTo((PaymentTrackingInfo) other);
    }

    private boolean equalTo(PaymentTrackingInfo other) {
        return
            completionTime.equals(other.completionTime) &&

            initiationTime.equals(other.initiationTime) &&

            lastUpdateTime.equals(other.lastUpdateTime) &&

            paymentEvents.equals(other.paymentEvents) &&

            transactionStatus.equals(other.transactionStatus) &&

            uetr.equals(other.uetr)
            &&
            additionalProperties.equals(other.additionalProperties)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.completionTime,
                   this.initiationTime,
                   this.lastUpdateTime,
                   this.paymentEvents,
                   this.transactionStatus,
                   this.uetr
                   ,
                   this.additionalProperties
               );
    }

    @Override
    public String toString() {
        return "PaymentTrackingInfo{" +
               "completionTime=" + completionTime + ", " +
               "initiationTime=" + initiationTime + ", " +
               "lastUpdateTime=" + lastUpdateTime + ", " +
               "paymentEvents=" + paymentEvents + ", " +
               "transactionStatus=" + transactionStatus + ", " +
               "uetr=" + uetr +
               ", additionalProperties=" + additionalProperties +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Time of completion.
         */
        private String completionTime = null;

        /**
         * Time of initiation.
         */
        private String initiationTime = null;

        /**
         * Time of last update.
         */
        private String lastUpdateTime = null;

        /**
         * List of events that have been applied to the payment.
         */
        private List<Map<String, Object>> paymentEvents = null;

        /**
         * Status of the transaction.
         */
        private PaymentTrackingInfoTransactionStatus transactionStatus = null;

        /**
         * Unique End-to-end Transaction Reference.
         */
        private String uetr = null;

        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(PaymentTrackingInfo other) {
            completionTime(other.getCompletionTime());
            initiationTime(other.getInitiationTime());
            lastUpdateTime(other.getLastUpdateTime());
            paymentEvents(other.getPaymentEvents());
            transactionStatus(other.getTransactionStatus());
            uetr(other.getUetr());
            additionalProperties(other.getAdditionalProperties());
            return this;
        }

        /**
         * Sets value for `completionTime`
         * Time of completion.
         */
        @JsonSetter("completion_time")
        public Builder completionTime(String completionTime) {
            if (completionTime == null) {
                throw new IllegalArgumentException("completionTime cannot be null");
            }

            this.completionTime = completionTime;
            return this;
        }
        /**
         * Sets value for `initiationTime`
         * Time of initiation.
         */
        @JsonSetter("initiation_time")
        public Builder initiationTime(String initiationTime) {
            if (initiationTime == null) {
                throw new IllegalArgumentException("initiationTime cannot be null");
            }

            this.initiationTime = initiationTime;
            return this;
        }
        /**
         * Sets value for `lastUpdateTime`
         * Time of last update.
         */
        @JsonSetter("last_update_time")
        public Builder lastUpdateTime(String lastUpdateTime) {
            if (lastUpdateTime == null) {
                throw new IllegalArgumentException("lastUpdateTime cannot be null");
            }

            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        /**
         * Sets value for `paymentEvents`
         * List of events that have been applied to the payment.
         */
        @JsonSetter("payment_events")
        public Builder paymentEvents(List<Map<String, Object>> paymentEvents) {
            if (paymentEvents == null) {
                throw new IllegalArgumentException("paymentEvents cannot be null");
            }

            this.paymentEvents = paymentEvents;
            return this;
        }
        /**
         * Sets value for `transactionStatus`
         * Status of the transaction.
         */
        @JsonSetter("transaction_status")
        public Builder transactionStatus(PaymentTrackingInfoTransactionStatus transactionStatus) {
            if (transactionStatus == null) {
                throw new IllegalArgumentException("transactionStatus cannot be null");
            }

            this.transactionStatus = transactionStatus;
            return this;
        }
        /**
         * Sets value for `uetr`
         * Unique End-to-end Transaction Reference.
         */
        @JsonSetter("uetr")
        public Builder uetr(String uetr) {
            if (uetr == null) {
                throw new IllegalArgumentException("uetr cannot be null");
            }

            this.uetr = uetr;
            return this;
        }

        @JsonAnySetter
        public Builder additionalProperty(String key, Object value) {
            this.additionalProperties.put(key, value);
            return this;
        }

        public Builder additionalProperties(Map<String, Object> additionalProperties) {
            this.additionalProperties.putAll(additionalProperties);
            return this;
        }



        public PaymentTrackingInfo build() {
            if (completionTime == null) {
                throw new IllegalStateException("completionTime is required");
            }

            if (initiationTime == null) {
                throw new IllegalStateException("initiationTime is required");
            }

            if (lastUpdateTime == null) {
                throw new IllegalStateException("lastUpdateTime is required");
            }

            if (paymentEvents == null) {
                throw new IllegalStateException("paymentEvents is required");
            }

            if (transactionStatus == null) {
                throw new IllegalStateException("transactionStatus is required");
            }

            if (uetr == null) {
                throw new IllegalStateException("uetr is required");
            }

            return new PaymentTrackingInfo(this);
        }
    }

}



