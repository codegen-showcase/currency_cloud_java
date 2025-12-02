
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * The notification to be resent.
 */
public enum PaymentsRetryNotificationsNotificationTypeEnum {
    PAYMENT_FAILED_NOTIFICATION("payment_failed_notification"),
    PAYMENT_READY_TO_SEND_NOTIFICATION("payment_ready_to_send_notification"),
    PAYMENT_RELEASED_NOTIFICATION("payment_released_notification");

    private final String value;

    PaymentsRetryNotificationsNotificationTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


