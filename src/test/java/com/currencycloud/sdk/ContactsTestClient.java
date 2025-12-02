
package com.currencycloud.sdk;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.model.ContactsCreateBodyStatusEnum;
import com.currencycloud.sdk.model.ContactsFindBodyOrderAscDescEnum;
import com.currencycloud.sdk.model.ContactsFindBodyStatusEnum;
import com.currencycloud.sdk.model.ContactsUpdateStatusEnum;
import com.currencycloud.sdk.resources.contacts.params.CreateRequest;
import com.currencycloud.sdk.resources.contacts.params.FindRequest;
import com.currencycloud.sdk.resources.contacts.params.GetRequest;
import com.currencycloud.sdk.resources.contacts.params.UpdateRequest;
import org.junit.jupiter.api.Test;


public final class ContactsTestClient {
    @Test
    void testGetCurrent200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.contacts().getCurrent();
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
            client.contacts().get(GetRequest
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
            client.contacts().create(CreateRequest
                                     .builder()
                                     .accountId("string")
                                     .dateOfBirth("string")
                                     .emailAddress("string")
                                     .firstName("string")
                                     .lastName("string")
                                     .locale("string")
                                     .loginId("string")
                                     .mobilePhoneNumber("string")
                                     .phoneNumber("string")
                                     .status(ContactsCreateBodyStatusEnum.ENABLED)
                                     .timezone("string")
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
            client.contacts().find(FindRequest
                                   .builder()
                                   .accountId("string")
                                   .accountName("string")
                                   .emailAddress("string")
                                   .firstName("string")
                                   .lastName("string")
                                   .locale("string")
                                   .loginId("string")
                                   .order("string")
                                   .orderAscDesc(ContactsFindBodyOrderAscDescEnum.ASC)
                                   .page("string")
                                   .perPage("string")
                                   .phoneNumber("string")
                                   .status(ContactsFindBodyStatusEnum.ENABLED)
                                   .timezone("string")
                                   .yourReference("string")
                                   .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGenerateHmacKey200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.contacts().generateHmacKey();
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
            client.contacts().update(UpdateRequest
                                     .builder()
                                     .id("string")
                                     .dateOfBirth("1970-01-01")
                                     .emailAddress("string")
                                     .firstName("string")
                                     .lastName("string")
                                     .locale("string")
                                     .loginId("string")
                                     .mobilePhoneNumber("string")
                                     .phoneNumber("string")
                                     .status(ContactsUpdateStatusEnum.ENABLED)
                                     .timezone("string")
                                     .yourReference("string")
                                     .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testUpdate200SuccessRequiredOnly() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.contacts().update(UpdateRequest
                                     .builder()
                                     .id("string")
                                     .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
}
