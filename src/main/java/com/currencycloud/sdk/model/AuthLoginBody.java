
package com.currencycloud.sdk.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * AuthLoginBody
 */
@JsonDeserialize(builder = AuthLoginBody.Builder.class)
public final class AuthLoginBody {
    /**
     * The unique API key for the Currencycloud account.
     */
    private final String apiKey;

    /**
     * The login ID for a Currencycloud account, this is usually an email address.
     */
    private final String loginId;


    private AuthLoginBody(Builder builder) {
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

        return other instanceof AuthLoginBody && equalTo((AuthLoginBody) other);
    }

    private boolean equalTo(AuthLoginBody other) {
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
        return "AuthLoginBody{" +
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

        public Builder from(AuthLoginBody other) {
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



        public AuthLoginBody build() {
            if (apiKey == null) {
                throw new IllegalStateException("apiKey is required");
            }

            if (loginId == null) {
                throw new IllegalStateException("loginId is required");
            }

            return new AuthLoginBody(this);
        }
    }

}



