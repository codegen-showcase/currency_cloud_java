
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * The status of the submission.
 */
public enum PaymentSubmissionInformationStatusEnum {
    CANCELED("canceled"),
    CLOSED("closed"),
    COMPLETED_MANUALLY("completed_manually"),
    DUPLICATED("duplicated"),
    FAILED("failed"),
    PENDING("pending"),
    PROCESSING("processing"),
    SUCCESS("success"),
    WAITING_TO_PROCESS("waiting_to_process");

    private final String value;

    PaymentSubmissionInformationStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


