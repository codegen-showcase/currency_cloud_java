
package com.currencycloud.sdk.resources.payments.params;

import java.util.Objects;

import com.currencycloud.sdk.model.PaymentsRetryNotificationsNotificationTypeEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * RetryNotificationsRequest
 */
@JsonDeserialize(builder = RetryNotificationsRequest.Builder.class)
public final class RetryNotificationsRequest {
    /**
     * Payment UUID
     */
    private final String id;

    /**
     * The notification to be resent.
     */
    private final PaymentsRetryNotificationsNotificationTypeEnum notificationType;


    private RetryNotificationsRequest(Builder builder) {
        this.id = builder.id;
        this.notificationType = builder.notificationType;
    }

    /**
     * Retrieves value for `id`
     * Payment UUID
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }
    /**
     * Retrieves value for `notificationType`
     * The notification to be resent.
     */
    @JsonProperty("notification_type")
    public PaymentsRetryNotificationsNotificationTypeEnum getNotificationType() {
        return notificationType;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof RetryNotificationsRequest && equalTo((RetryNotificationsRequest) other);
    }

    private boolean equalTo(RetryNotificationsRequest other) {
        return
            id.equals(other.id) &&

            notificationType.equals(other.notificationType)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.id,
                   this.notificationType
               );
    }

    @Override
    public String toString() {
        return "RetryNotificationsRequest{" +
               "id=" + id + ", " +
               "notificationType=" + notificationType +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Payment UUID
         */
        private String id = null;

        /**
         * The notification to be resent.
         */
        private PaymentsRetryNotificationsNotificationTypeEnum notificationType = null;


        private Builder() {}

        public Builder from(RetryNotificationsRequest other) {
            id(other.getId());
            notificationType(other.getNotificationType());
            return this;
        }

        /**
         * Sets value for `id`
         * Payment UUID
         */
        @JsonSetter("id")
        public Builder id(String id) {
            if (id == null) {
                throw new IllegalArgumentException("id cannot be null");
            }

            this.id = id;
            return this;
        }
        /**
         * Sets value for `notificationType`
         * The notification to be resent.
         */
        @JsonSetter("notification_type")
        public Builder notificationType(PaymentsRetryNotificationsNotificationTypeEnum notificationType) {
            if (notificationType == null) {
                throw new IllegalArgumentException("notificationType cannot be null");
            }

            this.notificationType = notificationType;
            return this;
        }



        public RetryNotificationsRequest build() {
            if (id == null) {
                throw new IllegalStateException("id is required");
            }

            if (notificationType == null) {
                throw new IllegalStateException("notificationType is required");
            }

            return new RetryNotificationsRequest(this);
        }
    }

}



