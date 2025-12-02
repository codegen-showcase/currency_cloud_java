
package com.currencycloud.sdk;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.model.AccountsCreateBodyIdentificationTypeEnum;
import com.currencycloud.sdk.model.AccountsCreateBodyLegalEntityTypeEnum;
import com.currencycloud.sdk.model.AccountsCreateBodyStatusEnum;
import com.currencycloud.sdk.model.AccountsFindBodyBankAccountVerifiedEnum;
import com.currencycloud.sdk.model.AccountsFindBodyOrderAscDescEnum;
import com.currencycloud.sdk.model.AccountsFindBodyStatusEnum;
import com.currencycloud.sdk.model.AccountsUpdateBodyIdentificationTypeEnum;
import com.currencycloud.sdk.model.AccountsUpdateBodyLegalEntityTypeEnum;
import com.currencycloud.sdk.model.AccountsUpdateBodyStatusEnum;
import com.currencycloud.sdk.resources.accounts.params.CreateRequest;
import com.currencycloud.sdk.resources.accounts.params.FindRequest;
import com.currencycloud.sdk.resources.accounts.params.GetRequest;
import com.currencycloud.sdk.resources.accounts.params.UpdateRequest;
import org.junit.jupiter.api.Test;


public final class AccountsTestClient {
    @Test
    void testGetMain200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.accounts().getMain();
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGet200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.accounts().get(GetRequest
                                  .builder()
                                  .id("string")
                                  .onBehalfOf("string")
                                  .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGet200SuccessRequiredOnly() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.accounts().get(GetRequest
                                  .builder()
                                  .id("string")
                                  .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testCreate200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.accounts().create(CreateRequest
                                     .builder()
                                     .accountName("string")
                                     .apiTrading(true)
                                     .brand("string")
                                     .city("string")
                                     .country("string")
                                     .identificationType(AccountsCreateBodyIdentificationTypeEnum.CITIZENSHIP_PAPERS)
                                     .identificationValue("string")
                                     .legalEntityType(AccountsCreateBodyLegalEntityTypeEnum.COMPANY)
                                     .onlineTrading(true)
                                     .phoneTrading(true)
                                     .postalCode("string")
                                     .spreadTable("string")
                                     .stateOrProvince("string")
                                     .status(AccountsCreateBodyStatusEnum.DISABLED)
                                     .street("string")
                                     .termsAndConditionsAccepted(true)
                                     .yourReference("string")
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
            client.accounts().find(FindRequest
                                   .builder()
                                   .accountName("string")
                                   .bankAccountVerified(AccountsFindBodyBankAccountVerifiedEnum.FALSE)
                                   .brand("string")
                                   .city("string")
                                   .country("string")
                                   .order("string")
                                   .orderAscDesc(AccountsFindBodyOrderAscDescEnum.ASC)
                                   .page(123L)
                                   .perPage(123L)
                                   .postalCode("string")
                                   .spreadTable("string")
                                   .stateOrProvince("string")
                                   .status(AccountsFindBodyStatusEnum.DISABLED)
                                   .street("string")
                                   .yourReference("string")
                                   .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testUpdate200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.accounts().update(UpdateRequest
                                     .builder()
                                     .accountName("string")
                                     .apiTrading(true)
                                     .brand("string")
                                     .city("string")
                                     .country("string")
                                     .identificationType(AccountsUpdateBodyIdentificationTypeEnum.CITIZENSHIP_PAPERS)
                                     .identificationValue("string")
                                     .legalEntityType(AccountsUpdateBodyLegalEntityTypeEnum.COMPANY)
                                     .onlineTrading(true)
                                     .phoneTrading(true)
                                     .postalCode("string")
                                     .spreadTable("string")
                                     .stateOrProvince("string")
                                     .status(AccountsUpdateBodyStatusEnum.DISABLED)
                                     .street("string")
                                     .termsAndConditionsAccepted(true)
                                     .yourReference("string")
                                     .id("string")
                                     .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
}
