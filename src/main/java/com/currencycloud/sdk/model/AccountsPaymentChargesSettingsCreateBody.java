
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * AccountsPaymentChargesSettingsCreateBody
 */
@JsonDeserialize(builder = AccountsPaymentChargesSettingsCreateBody.Builder.class)
public final class AccountsPaymentChargesSettingsCreateBody {
    /**
     * Set the given Account Payment Charges Setting as default. This will be used when the 'charge_type' parameter is not specified for a payment.
     */
    private final Optional<Boolean> default_;

    /**
     * Enable or disable the given Account Payment Charges Setting.
     */
    private final Optional<Boolean> enabled;


    private AccountsPaymentChargesSettingsCreateBody(Builder builder) {
        this.default_ = builder.default_;
        this.enabled = builder.enabled;
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

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof AccountsPaymentChargesSettingsCreateBody &&
               equalTo((AccountsPaymentChargesSettingsCreateBody) other);
    }

    private boolean equalTo(AccountsPaymentChargesSettingsCreateBody other) {
        return
            default_.equals(other.default_) &&

            enabled.equals(other.enabled)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.default_,
                   this.enabled
               );
    }

    @Override
    public String toString() {
        return "AccountsPaymentChargesSettingsCreateBody{" +
               "default_=" + default_ + ", " +
               "enabled=" + enabled +
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


        private Builder() {}

        public Builder from(AccountsPaymentChargesSettingsCreateBody other) {
            default_(other.getDefault_());
            enabled(other.getEnabled());
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



        public AccountsPaymentChargesSettingsCreateBody build() {
            return new AccountsPaymentChargesSettingsCreateBody(this);
        }
    }

}



