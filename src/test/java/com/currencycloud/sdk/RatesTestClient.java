
package com.currencycloud.sdk;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.model.RatesFindBankDetailsBodyIdentifierTypeEnum;
import com.currencycloud.sdk.model.RatesGetDetailedConversionDatePreferenceEnum;
import com.currencycloud.sdk.model.RatesGetDetailedFixedSideEnum;
import com.currencycloud.sdk.resources.rates.params.FindBankDetailsRequest;
import com.currencycloud.sdk.resources.rates.params.FindRequest;
import com.currencycloud.sdk.resources.rates.params.GetDetailedRequest;
import org.junit.jupiter.api.Test;


public final class RatesTestClient {
    @Test
    void testGetDetailed200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.rates().getDetailed(GetDetailedRequest
                                       .builder()
                                       .amount("string")
                                       .buyCurrency("string")
                                       .fixedSide(RatesGetDetailedFixedSideEnum.BUY)
                                       .sellCurrency("string")
                                       .conversionDate("1970-01-01")
                                       .conversionDatePreference(RatesGetDetailedConversionDatePreferenceEnum.DEFAULT)
                                       .onBehalfOf("string")
                                       .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGetDetailed200SuccessRequiredOnly() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.rates().getDetailed(GetDetailedRequest
                                       .builder()
                                       .amount("string")
                                       .buyCurrency("string")
                                       .fixedSide(RatesGetDetailedFixedSideEnum.BUY)
                                       .sellCurrency("string")
                                       .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testFind200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.rates().find(FindRequest
                                .builder()
                                .currencyPair("string")
                                .ignoreInvalidPairs(true)
                                .onBehalfOf("string")
                                .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testFind200SuccessRequiredOnly() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.rates().find(FindRequest
                                .builder()
                                .currencyPair("string")
                                .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testFindBankDetails200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.rates().findBankDetails(FindBankDetailsRequest
                                           .builder()
                                           .identifierType(RatesFindBankDetailsBodyIdentifierTypeEnum.ABA)
                                           .identifierValue("string")
                                           .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
}
