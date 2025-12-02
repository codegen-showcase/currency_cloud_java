
package com.currencycloud.sdk.resources.accounts.paymentchargessettings.params;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * CreateRequest
 */
@JsonDeserialize(builder = CreateRequest.Builder.class)
public final class CreateRequest {
    /**
     * Set the given Account Payment Charges Setting as default. This will be used when the 'charge_type' parameter is not specified for a payment.
     */
    private final Optional<Boolean> default_;

    /**
     * Enable or disable the given Account Payment Charges Setting.
     */
    private final Optional<Boolean> enabled;

    /**
     * Account UUID
     */
    private final String accountId;

    /**
     * Account Payment Charges Setting UUID. Can be retrieved via appropriate GET call for the given Account UUID.
     */
    private final String chargeSettingsId;


    private CreateRequest(Builder builder) {
        this.default_ = builder.default_;
        this.enabled = builder.enabled;
        this.accountId = builder.accountId;
        this.chargeSettingsId = builder.chargeSettingsId;
    }

    /**
     * Retrieves value for `default_`
     * Set the given Account Payment Charges Setting as default. This will be used when the 'charge_type' parameter is not specified for a payment.
     */
    @JsonProperty("default")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getDefault_() {
        return default_;
    }
    /**
     * Retrieves value for `enabled`
     * Enable or disable the given Account Payment Charges Setting.
     */
    @JsonProperty("enabled")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getEnabled() {
        return enabled;
    }
    /**
     * Retrieves value for `accountId`
     * Account UUID
     */
    @JsonProperty("account_id")
    public String getAccountId() {
        return accountId;
    }
    /**
     * Retrieves value for `chargeSettingsId`
     * Account Payment Charges Setting UUID. Can be retrieved via appropriate GET call for the given Account UUID.
     */
    @JsonProperty("charge_settings_id")
    public String getChargeSettingsId() {
        return chargeSettingsId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof CreateRequest && equalTo((CreateRequest) other);
    }

    private boolean equalTo(CreateRequest other) {
        return
            default_.equals(other.default_) &&

            enabled.equals(other.enabled) &&

            accountId.equals(other.accountId) &&

            chargeSettingsId.equals(other.chargeSettingsId)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.default_,
                   this.enabled,
                   this.accountId,
                   this.chargeSettingsId
               );
    }

    @Override
    public String toString() {
        return "CreateRequest{" +
               "default_=" + default_ + ", " +
               "enabled=" + enabled + ", " +
               "accountId=" + accountId + ", " +
               "chargeSettingsId=" + chargeSettingsId +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Set the given Account Payment Charges Setting as default. This will be used when the 'charge_type' parameter is not specified for a payment.
         */
        private Optional<Boolean> default_ = Optional.empty();

        /**
         * Enable or disable the given Account Payment Charges Setting.
         */
        private Optional<Boolean> enabled = Optional.empty();

        /**
         * Account UUID
         */
        private String accountId = null;

        /**
         * Account Payment Charges Setting UUID. Can be retrieved via appropriate GET call for the given Account UUID.
         */
        private String chargeSettingsId = null;


        private Builder() {}

        public Builder from(CreateRequest other) {
            default_(other.getDefault_());
            enabled(other.getEnabled());
            accountId(other.getAccountId());
            chargeSettingsId(other.getChargeSettingsId());
            return this;
        }

        /**
         * Sets value for `default_`
         * Set the given Account Payment Charges Setting as default. This will be used when the 'charge_type' parameter is not specified for a payment.
         */
        @JsonSetter("default")
        public Builder default_(Optional<Boolean> default_) {
            this.default_ = default_;
            return this;
        }

        /**
         * Sets value for `default_`
         * Set the given Account Payment Charges Setting as default. This will be used when the 'charge_type' parameter is not specified for a payment.
         */
        public Builder default_(Boolean default_) {
            return this.default_(Optional.ofNullable(default_));
        }
        /**
         * Sets value for `enabled`
         * Enable or disable the given Account Payment Charges Setting.
         */
        @JsonSetter("enabled")
        public Builder enabled(Optional<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets value for `enabled`
         * Enable or disable the given Account Payment Charges Setting.
         */
        public Builder enabled(Boolean enabled) {
            return this.enabled(Optional.ofNullable(enabled));
        }
        /**
         * Sets value for `accountId`
         * Account UUID
         */
        @JsonSetter("account_id")
        public Builder accountId(String accountId) {
            if (accountId == null) {
                throw new IllegalArgumentException("accountId cannot be null");
            }

            this.accountId = accountId;
            return this;
        }
        /**
         * Sets value for `chargeSettingsId`
         * Account Payment Charges Setting UUID. Can be retrieved via appropriate GET call for the given Account UUID.
         */
        @JsonSetter("charge_settings_id")
        public Builder chargeSettingsId(String chargeSettingsId) {
            if (chargeSettingsId == null) {
                throw new IllegalArgumentException("chargeSettingsId cannot be null");
            }

            this.chargeSettingsId = chargeSettingsId;
            return this;
        }



        public CreateRequest build() {
            if (accountId == null) {
                throw new IllegalStateException("accountId is required");
            }

            if (chargeSettingsId == null) {
                throw new IllegalStateException("chargeSettingsId is required");
            }

            return new CreateRequest(this);
        }
    }

}



