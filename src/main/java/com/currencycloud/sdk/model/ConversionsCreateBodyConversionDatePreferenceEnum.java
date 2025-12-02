
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Available and required only if conversion_date is not provided.<br> Must be one of the following:<br> - 'earliest' for earliest available conversion date. Make sure there is sufficient time to send funds to Currencycloud.<br> - 'next_day' for next day available conversion date - T+1.<br> - 'default' for conversion - T+1 for <a href="https://support.currencycloud.com/hc/en-gb/articles/360017419080-Making-payments-to-India-Indonesia-Malaysia-and-the-Philippines-INR-IDR-MYR-PHP-FAQ">APAC restricted currencies</a>, T+2 for all others.<br> - 'optimize_liquidity' for maximizing chances of getting a successful rate. Most relevant for exotic pairs. Conversion is T+0 for <a href="https://support.currencycloud.com/hc/en-gb/articles/360017419080-Making-payments-to-India-Indonesia-Malaysia-and-the-Philippines-INR-IDR-MYR-PHP-FAQ">APAC restricted currencies</a>, and T+1 or T+2 for all others.
 */
public enum ConversionsCreateBodyConversionDatePreferenceEnum {
    DEFAULT("default"),
    EARLIEST("earliest"),
    NEXT_DAY("next_day"),
    OPTIMIZE_LIQUIDITY("optimize_liquidity");

    private final String value;

    ConversionsCreateBodyConversionDatePreferenceEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


