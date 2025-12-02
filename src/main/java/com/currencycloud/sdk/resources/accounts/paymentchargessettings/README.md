# accounts.paymentchargessettings

## Module Functions

### Get Payment Charges Settings <a name="list"></a>

Retrieves the Payment Charges Settings for the given account.

**API Endpoint**: `GET /accounts/{account_id}/payment_charges_settings`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `accountId` | ✓ | A UUID of a sub-account or house account visible to the authenticated user. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.AccountsPaymentChargesSettingsListResponse;
import com.currencycloud.sdk.resources.accounts.paymentchargessettings.params.ListRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
AccountsPaymentChargesSettingsListResponse res = client.accounts().paymentChargesSettings().list(
            ListRequest
            .builder()
            .accountId("string")
            .build());
```

#### Response

##### Type
[AccountsPaymentChargesSettingsListResponse](/src/main/java/com/currencycloud/sdk/model/AccountsPaymentChargesSettingsListResponse.java)

##### Example
`AccountsPaymentChargesSettingsListResponse
.builder()
.build()`

### Manage Account Payment Charges Settings <a name="create"></a>

Manage a given account's Payment Charge Settings (enable, disable, set as default).

**API Endpoint**: `POST /accounts/{account_id}/payment_charges_settings/{charge_settings_id}`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `accountId` | ✓ | Account UUID | `"string"` |
| `chargeSettingsId` | ✓ | Account Payment Charges Setting UUID. Can be retrieved via appropriate GET call for the given Account UUID. | `"string"` |
| `default_` | ✗ | Set the given Account Payment Charges Setting as default. This will be used when the 'charge_type' parameter is not specified for a payment. | `true` |
| `enabled` | ✗ | Enable or disable the given Account Payment Charges Setting. | `true` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.AccountPaymentChargesSetting;
import com.currencycloud.sdk.resources.accounts.paymentchargessettings.params.CreateRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
AccountPaymentChargesSetting res = client.accounts().paymentChargesSettings().create(CreateRequest
                                   .builder()
                                   .accountId("string")
                                   .chargeSettingsId("string")
                                   .build());
```

#### Response

##### Type
[AccountPaymentChargesSetting](/src/main/java/com/currencycloud/sdk/model/AccountPaymentChargesSetting.java)

##### Example
`AccountPaymentChargesSetting
.builder()
.accountId("2b6db571-a810-0144-a9b2-10a22cb33cf9")
.chargeSettingsId("2b7db581-a810-0132-a8c2-10b11cb33cfc")
.chargeType(AccountPaymentChargesSettingChargeTypeEnum.SHARED)
.default_(true)
.enabled(true)
.build()`

