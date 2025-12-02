
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Scope allows contacts to search all profit and losses at all account levels. Defaults to own.<br> 'own' - search profit and losses on the main account <br> 'clients' - search profit and losses of account sub-accounts <br> 'all' - search profit and losses of main account and sub-accounts.
 */
public enum ConversionsProfitAndLossScopeEnum {
    ALL("all"),
    CLIENT("client"),
    OWN("own");

    private final String value;

    ConversionsProfitAndLossScopeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


