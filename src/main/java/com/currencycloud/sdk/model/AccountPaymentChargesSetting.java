
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Account Payment Charges Setting.
 */
@JsonDeserialize(builder = AccountPaymentChargesSetting.Builder.class)
public final class AccountPaymentChargesSetting {
    /**
     * Account ID
     */
    private final Optional<String> accountId;

    /**
     * Unique ID
     */
    private final Optional<String> chargeSettingsId;

    /**
     * The charge type - shared or ours.
     */
    private final Optional<AccountPaymentChargesSettingChargeTypeEnum> chargeType;

    /**
     * Is this the default charge type for this account?
     */
    private final Optional<Boolean> default_;

    /**
     * Is this charge type enabled for this account?
     */
    private final Optional<Boolean> enabled;


    private AccountPaymentChargesSetting(Builder builder) {
        this.accountId = builder.accountId;
        this.chargeSettingsId = builder.chargeSettingsId;
        this.chargeType = builder.chargeType;
        this.default_ = builder.default_;
        this.enabled = builder.enabled;
    }

    /**
     * Retrieves value for `accountId`
     * Account ID
     */
    @JsonProperty("account_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAccountId() {
        return accountId;
    }
    /**
     * Retrieves value for `chargeSettingsId`
     * Unique ID
     */
    @JsonProperty("charge_settings_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getChargeSettingsId() {
        return chargeSettingsId;
    }
    /**
     * Retrieves value for `chargeType`
     * The charge type - shared or ours.
     */
    @JsonProperty("charge_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<AccountPaymentChargesSettingChargeTypeEnum> getChargeType() {
        return chargeType;
    }
    /**
     * Retrieves value for `default_`
     * Is this the default charge type for this account?
     */
    @JsonProperty("default")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getDefault_() {
        return default_;
    }
    /**
     * Retrieves value for `enabled`
     * Is this charge type enabled for this account?
     */
    @JsonProperty("enabled")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getEnabled() {
        return enabled;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof AccountPaymentChargesSetting &&
               equalTo((AccountPaymentChargesSetting) other);
    }

    private boolean equalTo(AccountPaymentChargesSetting other) {
        return
            accountId.equals(other.accountId) &&

            chargeSettingsId.equals(other.chargeSettingsId) &&

            chargeType.equals(other.chargeType) &&

            default_.equals(other.default_) &&

            enabled.equals(other.enabled)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountId,
                   this.chargeSettingsId,
                   this.chargeType,
                   this.default_,
                   this.enabled
               );
    }

    @Override
    public String toString() {
        return "AccountPaymentChargesSetting{" +
               "accountId=" + accountId + ", " +
               "chargeSettingsId=" + chargeSettingsId + ", " +
               "chargeType=" + chargeType + ", " +
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
         * Account ID
         */
        private Optional<String> accountId = Optional.empty();

        /**
         * Unique ID
         */
        private Optional<String> chargeSettingsId = Optional.empty();

        /**
         * The charge type - shared or ours.
         */
        private Optional<AccountPaymentChargesSettingChargeTypeEnum> chargeType = Optional.empty();

        /**
         * Is this the default charge type for this account?
         */
        private Optional<Boolean> default_ = Optional.empty();

        /**
         * Is this charge type enabled for this account?
         */
        private Optional<Boolean> enabled = Optional.empty();


        private Builder() {}

        public Builder from(AccountPaymentChargesSetting other) {
            accountId(other.getAccountId());
            chargeSettingsId(other.getChargeSettingsId());
            chargeType(other.getChargeType());
            default_(other.getDefault_());
            enabled(other.getEnabled());
            return this;
        }

        /**
         * Sets value for `accountId`
         * Account ID
         */
        @JsonSetter("account_id")
        public Builder accountId(Optional<String> accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Sets value for `accountId`
         * Account ID
         */
        public Builder accountId(String accountId) {
            return this.accountId(Optional.ofNullable(accountId));
        }
        /**
         * Sets value for `chargeSettingsId`
         * Unique ID
         */
        @JsonSetter("charge_settings_id")
        public Builder chargeSettingsId(Optional<String> chargeSettingsId) {
            this.chargeSettingsId = chargeSettingsId;
            return this;
        }

        /**
         * Sets value for `chargeSettingsId`
         * Unique ID
         */
        public Builder chargeSettingsId(String chargeSettingsId) {
            return this.chargeSettingsId(Optional.ofNullable(chargeSettingsId));
        }
        /**
         * Sets value for `chargeType`
         * The charge type - shared or ours.
         */
        @JsonSetter("charge_type")
        public Builder chargeType(Optional<AccountPaymentChargesSettingChargeTypeEnum> chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * Sets value for `chargeType`
         * The charge type - shared or ours.
         */
        public Builder chargeType(AccountPaymentChargesSettingChargeTypeEnum chargeType) {
            return this.chargeType(Optional.ofNullable(chargeType));
        }
        /**
         * Sets value for `default_`
         * Is this the default charge type for this account?
         */
        @JsonSetter("default")
        public Builder default_(Optional<Boolean> default_) {
            this.default_ = default_;
            return this;
        }

        /**
         * Sets value for `default_`
         * Is this the default charge type for this account?
         */
        public Builder default_(Boolean default_) {
            return this.default_(Optional.ofNullable(default_));
        }
        /**
         * Sets value for `enabled`
         * Is this charge type enabled for this account?
         */
        @JsonSetter("enabled")
        public Builder enabled(Optional<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets value for `enabled`
         * Is this charge type enabled for this account?
         */
        public Builder enabled(Boolean enabled) {
            return this.enabled(Optional.ofNullable(enabled));
        }



        public AccountPaymentChargesSetting build() {
            return new AccountPaymentChargesSetting(this);
        }
    }

}



