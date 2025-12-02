
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Reason for acceptance or rejection. If "accepted" is true, the value should be "accepted". If "accepted" is false, the value should be one of the other values.
 *
 */
public enum CollectionsScreeningCompleteBodyReasonEnum {
    ACCEPTED("accepted"),
    INSUFFICIENT_TRANSACTION_INFORMATION("insufficient_transaction_information"),
    INTERNAL_WATCHLIST_MATCH("internal_watchlist_match"),
    SANCTIONED_MATCH("sanctioned_match"),
    SUSPECTED_FRAUD("suspected_fraud"),
    SUSPECTED_MONEY_LAUNDERING_ACTIVITY("suspected_money_laundering_activity"),
    UNSUPPORTED_CURRENCY("unsupported_currency");

    private final String value;

    CollectionsScreeningCompleteBodyReasonEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


