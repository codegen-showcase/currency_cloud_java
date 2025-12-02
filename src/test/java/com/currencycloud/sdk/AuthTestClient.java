
package com.currencycloud.sdk;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.resources.auth.params.LoginRequest;
import org.junit.jupiter.api.Test;


public final class AuthTestClient {
    @Test
    void testLogin200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.auth().login(LoginRequest
                                .builder()
                                .apiKey("string")
                                .loginId("string")
                                .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testLogout200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.auth().logout();
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
}
