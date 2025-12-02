
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Contact status - "enabled" allows the contact to conduct activity on the sub-account, "not_enabled" disables the contact.
 */
public enum ContactsUpdateStatusEnum {
    ENABLED("enabled"),
    NOT_ENABLED("not_enabled");

    private final String value;

    ContactsUpdateStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


