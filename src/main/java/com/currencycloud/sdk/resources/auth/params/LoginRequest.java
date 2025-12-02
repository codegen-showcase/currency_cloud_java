
package com.currencycloud.sdk.resources.auth.params;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * LoginRequest
 */
@JsonDeserialize(builder = LoginRequest.Builder.class)
public final class LoginRequest {
    /**
     * The unique API key for the Currencycloud account.
     */
    private final String apiKey;

    /**
     * The login ID for a Currencycloud account, this is usually an email address.
     */
    private final String loginId;


    private LoginRequest(Builder builder) {
        this.apiKey = builder.apiKey;
        this.loginId = builder.loginId;
    }

    /**
     * Retrieves value for `apiKey`
     * The unique API key for the Currencycloud account.
     */
    @JsonProperty("api_key")
    public String getApiKey() {
        return apiKey;
    }
    /**
     * Retrieves value for `loginId`
     * The login ID for a Currencycloud account, this is usually an email address.
     */
    @JsonProperty("login_id")
    public String getLoginId() {
        return loginId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof LoginRequest && equalTo((LoginRequest) other);
    }

    private boolean equalTo(LoginRequest other) {
        return
            apiKey.equals(other.apiKey) &&

            loginId.equals(other.loginId)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.apiKey,
                   this.loginId
               );
    }

    @Override
    public String toString() {
        return "LoginRequest{" +
               "apiKey=" + apiKey + ", " +
               "loginId=" + loginId +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * The unique API key for the Currencycloud account.
         */
        private String apiKey = null;

        /**
         * The login ID for a Currencycloud account, this is usually an email address.
         */
        private String loginId = null;


        private Builder() {}

        public Builder from(LoginRequest other) {
            apiKey(other.getApiKey());
            loginId(other.getLoginId());
            return this;
        }

        /**
         * Sets value for `apiKey`
         * The unique API key for the Currencycloud account.
         */
        @JsonSetter("api_key")
        public Builder apiKey(String apiKey) {
            if (apiKey == null) {
                throw new IllegalArgumentException("apiKey cannot be null");
            }

            this.apiKey = apiKey;
            return this;
        }
        /**
         * Sets value for `loginId`
         * The login ID for a Currencycloud account, this is usually an email address.
         */
        @JsonSetter("login_id")
        public Builder loginId(String loginId) {
            if (loginId == null) {
                throw new IllegalArgumentException("loginId cannot be null");
            }

            this.loginId = loginId;
            return this;
        }



        public LoginRequest build() {
            if (apiKey == null) {
                throw new IllegalStateException("apiKey is required");
            }

            if (loginId == null) {
                throw new IllegalStateException("loginId is required");
            }

            return new LoginRequest(this);
        }
    }

}



