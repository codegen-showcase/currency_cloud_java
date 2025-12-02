
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Authentication token
 */
@JsonDeserialize(builder = AuthenticationToken.Builder.class)
public final class AuthenticationToken {
    /**
     * A randomly-generated 64-digit authentication token. Clients must store this securely and destroy it when it is no longer needed.
     */
    private final Optional<String> authToken;


    private AuthenticationToken(Builder builder) {
        this.authToken = builder.authToken;
    }

    /**
     * Retrieves value for `authToken`
     * A randomly-generated 64-digit authentication token. Clients must store this securely and destroy it when it is no longer needed.
     */
    @JsonProperty("auth_token")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAuthToken() {
        return authToken;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof AuthenticationToken && equalTo((AuthenticationToken) other);
    }

    private boolean equalTo(AuthenticationToken other) {
        return
            authToken.equals(other.authToken)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.authToken
               );
    }

    @Override
    public String toString() {
        return "AuthenticationToken{" +
               "authToken=" + authToken +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * A randomly-generated 64-digit authentication token. Clients must store this securely and destroy it when it is no longer needed.
         */
        private Optional<String> authToken = Optional.empty();


        private Builder() {}

        public Builder from(AuthenticationToken other) {
            authToken(other.getAuthToken());
            return this;
        }

        /**
         * Sets value for `authToken`
         * A randomly-generated 64-digit authentication token. Clients must store this securely and destroy it when it is no longer needed.
         */
        @JsonSetter("auth_token")
        public Builder authToken(Optional<String> authToken) {
            this.authToken = authToken;
            return this;
        }

        /**
         * Sets value for `authToken`
         * A randomly-generated 64-digit authentication token. Clients must store this securely and destroy it when it is no longer needed.
         */
        public Builder authToken(String authToken) {
            return this.authToken(Optional.ofNullable(authToken));
        }



        public AuthenticationToken build() {
            return new AuthenticationToken(this);
        }
    }

}



