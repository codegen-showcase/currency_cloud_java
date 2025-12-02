
package com.currencycloud.sdk.resources.auth;

import java.io.IOException;
import java.util.Map;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.core.BaseClient;
import com.currencycloud.sdk.core.HttpRequestBuilder;
import com.currencycloud.sdk.core.RequestOptions;
import com.currencycloud.sdk.core.ResponseHandler;
import com.currencycloud.sdk.model.AuthLoginBody;
import com.currencycloud.sdk.model.AuthenticationToken;
import com.currencycloud.sdk.resources.auth.params.LoginRequest;


public class AuthClient {
    protected final BaseClient baseClient;

    public AuthClient(BaseClient baseClient) {
        this.baseClient = baseClient;

    }

    /**
    * Login
    *
    * Authenticates and authorizes a user to the Currencycloud API.<br><br>
    * Submit a login ID and API key for a Currencycloud account, you can register for and API key <a href="https://developer.currencycloud.com/register-for-an-api-key/">here</a>. A temporary authentication token is returned following a succesful login.<br><br>
    * The authentication token is required to make requests to all other endpoints in the Currencycloud API. Tokens expire after 30 minutes of inactivity.<br><br>
    * Token requests are limited to 60 calls per minute.<br><br>
    * For security, Currencycloud accounts are disabled when four unsuccessful login attempts are made within a short period. In these circumstances, account holders must <a href="mailto:support@currencycloud.com">contact support</a> to reactivate their account.
    *
    * POST /authenticate/api
    */
    public AuthenticationToken login(LoginRequest request) {
        return login(request, null);
    }


    /**
    * Login
    *
    * Authenticates and authorizes a user to the Currencycloud API.<br><br>
    * Submit a login ID and API key for a Currencycloud account, you can register for and API key <a href="https://developer.currencycloud.com/register-for-an-api-key/">here</a>. A temporary authentication token is returned following a succesful login.<br><br>
    * The authentication token is required to make requests to all other endpoints in the Currencycloud API. Tokens expire after 30 minutes of inactivity.<br><br>
    * Token requests are limited to 60 calls per minute.<br><br>
    * For security, Currencycloud accounts are disabled when four unsuccessful login attempts are made within a short period. In these circumstances, account holders must <a href="mailto:support@currencycloud.com">contact support</a> to reactivate their account.
    *
    * POST /authenticate/api
    */
    public AuthenticationToken login(LoginRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/authenticate/api")
            .method("POST")
            .setFormUrlEncodedBody(AuthLoginBody.builder().apiKey(request.getApiKey()).loginId(
                                       request.getLoginId()).build(), Map.ofEntries(Map.entry("api_key", "form"), Map.entry("login_id",
                                               "form")), Map.ofEntries(Map.entry("api_key", true), Map.entry("login_id", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, AuthenticationToken.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Logout
    *
    * Authentication tokens expire automatically after 30 minutes of inactivity. If a session is no longer required, it is good security practice to retire its authentication token early rather than leave it to time out.
    *
    * POST /authenticate/close_session
    */
    public okhttp3.Response logout() {
        return logout(null);
    }


    /**
    * Logout
    *
    * Authentication tokens expire automatically after 30 minutes of inactivity. If a session is no longer required, it is good security practice to retire its authentication token early rather than leave it to time out.
    *
    * POST /authenticate/close_session
    */
    public okhttp3.Response logout(RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/authenticate/close_session")
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return response;
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }



}
