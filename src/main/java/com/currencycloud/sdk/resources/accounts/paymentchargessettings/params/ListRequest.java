
package com.currencycloud.sdk.resources.accounts.paymentchargessettings.params;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * ListRequest
 */
@JsonDeserialize(builder = ListRequest.Builder.class)
public final class ListRequest {
    /**
     * A UUID of a sub-account or house account visible to the authenticated user.
     */
    private final String accountId;


    private ListRequest(Builder builder) {
        this.accountId = builder.accountId;
    }

    /**
     * Retrieves value for `accountId`
     * A UUID of a sub-account or house account visible to the authenticated user.
     */
    @JsonProperty("account_id")
    public String getAccountId() {
        return accountId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof ListRequest && equalTo((ListRequest) other);
    }

    private boolean equalTo(ListRequest other) {
        return
            accountId.equals(other.accountId)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountId
               );
    }

    @Override
    public String toString() {
        return "ListRequest{" +
               "accountId=" + accountId +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * A UUID of a sub-account or house account visible to the authenticated user.
         */
        private String accountId = null;


        private Builder() {}

        public Builder from(ListRequest other) {
            accountId(other.getAccountId());
            return this;
        }

        /**
         * Sets value for `accountId`
         * A UUID of a sub-account or house account visible to the authenticated user.
         */
        @JsonSetter("account_id")
        public Builder accountId(String accountId) {
            if (accountId == null) {
                throw new IllegalArgumentException("accountId cannot be null");
            }

            this.accountId = accountId;
            return this;
        }



        public ListRequest build() {
            if (accountId == null) {
                throw new IllegalStateException("accountId is required");
            }

            return new ListRequest(this);
        }
    }

}



