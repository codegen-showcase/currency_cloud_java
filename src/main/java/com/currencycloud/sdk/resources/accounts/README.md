# accounts

## Module Functions

### Get Authenticating Account <a name="get_main"></a>

Gets the authenticated user's main account.

**API Endpoint**: `GET /accounts/current`

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.Account;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Account res = client.accounts().getMain();
```

#### Response

##### Type
[Account](/src/main/java/com/currencycloud/sdk/model/Account.java)

##### Example
`Account
.builder()
.accountName("Company PLC")
.agentOrReliance(true)
.apiTrading(true)
.bankAccountVerified(AccountBankAccountVerifiedEnum.NOT_REQUIRED)
.brand("currencycloud")
.city("London")
.country("GB")
.createdAt("2023-12-31T23:59:59.000Z")
.id("B7DE235A-FF5D-4252-83C2-06A605267FEA")
.identificationType(AccountIdentificationTypeEnum.GREEN_CARD)
.identificationValue("123456789")
.legalEntityType("company")
.onlineTrading(true)
.phoneTrading(true)
.postalCode("AB12 CD1")
.processThirdPartyFunds(false)
.settlementType(AccountSettlementTypeEnum.BULK)
.shortReference("110104-00004")
.spreadTable("flat_0.5_percent")
.stateOrProvince("")
.status(AccountStatusEnum.ENABLED)
.street("1 London Road")
.termsAndConditionsAccepted(true)
.updatedAt("2023-12-31T23:59:59.000Z")
.yourReference("0012345564ABC")
.build()`

### Get Account <a name="get"></a>

Gets an account or sub-account owned by the authenticated user.

**API Endpoint**: `GET /accounts/{id}`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | Account UUID, returned by the create account endpoint. | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.Account;
import com.currencycloud.sdk.resources.accounts.params.GetRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Account res = client.accounts().get(GetRequest
                                    .builder()
                                    .id("string")
                                    .build());
```

#### Response

##### Type
[Account](/src/main/java/com/currencycloud/sdk/model/Account.java)

##### Example
`Account
.builder()
.accountName("Company PLC")
.agentOrReliance(true)
.apiTrading(true)
.bankAccountVerified(AccountBankAccountVerifiedEnum.NOT_REQUIRED)
.brand("currencycloud")
.city("London")
.country("GB")
.createdAt("2023-12-31T23:59:59.000Z")
.id("B7DE235A-FF5D-4252-83C2-06A605267FEA")
.identificationType(AccountIdentificationTypeEnum.GREEN_CARD)
.identificationValue("123456789")
.legalEntityType("company")
.onlineTrading(true)
.phoneTrading(true)
.postalCode("AB12 CD1")
.processThirdPartyFunds(false)
.settlementType(AccountSettlementTypeEnum.BULK)
.shortReference("110104-00004")
.spreadTable("flat_0.5_percent")
.stateOrProvince("")
.status(AccountStatusEnum.ENABLED)
.street("1 London Road")
.termsAndConditionsAccepted(true)
.updatedAt("2023-12-31T23:59:59.000Z")
.yourReference("0012345564ABC")
.build()`

### Create Account <a name="create"></a>

Creates a new sub-account. Returns the new account entity on success.

**API Endpoint**: `POST /accounts/create`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `accountName` | ✓ | Account name. | `"string"` |
| `city` | ✓ | City | `"string"` |
| `country` | ✓ | Two-letter ISO country code. | `"string"` |
| `legalEntityType` | ✓ | Legal entity. | `AccountsCreateBodyLegalEntityTypeEnum.COMPANY` |
| `street` | ✓ | First line of address. | `"string"` |
| `apiTrading` | ✗ | Allow the account to make trades via the Currencycloud API. | `true` |
| `brand` | ✗ | The value of this field is used for white labeling the Currencycloud user interface. If nothing is specified then the account will inherit the house account's brand. | `"string"` |
| `identificationType` | ✗ | A legal document that verifies the identity of the account owner. Required for individual sub-accounts on our outsourced KYC model, optional otherwise. | `AccountsCreateBodyIdentificationTypeEnum.CITIZENSHIP_PAPERS` |
| `identificationValue` | ✗ | Unique reference code for the identification document, such as a passport number. Required if "identification_type" is provided. | `"string"` |
| `onlineTrading` | ✗ | Allow the account to make trades via Currencycloud Direct. | `true` |
| `phoneTrading` | ✗ | Allow the account to make trades via phone. | `true` |
| `postalCode` | ✗ | Postal code. Required for sub-accounts on our outsourced KYC model, also required where country code = "US", "CA" or "MX". | `"string"` |
| `spreadTable` | ✗ | The name of the spread table assigned to the account. This is needed if they intend to apply markup. | `"string"` |
| `stateOrProvince` | ✗ | State or province two-letter ISO 3166 code. Only applicable to some countries, required where country code = "US", "CA" or "MX". | `"string"` |
| `status` | ✗ | Account status. | `AccountsCreateBodyStatusEnum.DISABLED` |
| `termsAndConditionsAccepted` | ✗ | Acceptance of the terms and conditions. Required for sub-accounts that are on our Outsourced KYC model, optional otherwise. | `true` |
| `yourReference` | ✗ | User-generated reference code. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.Account;
import com.currencycloud.sdk.model.AccountsCreateBodyLegalEntityTypeEnum;
import com.currencycloud.sdk.resources.accounts.params.CreateRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Account res = client.accounts().create(CreateRequest
                                       .builder()
                                       .accountName("string")
                                       .city("string")
                                       .country("string")
                                       .legalEntityType(AccountsCreateBodyLegalEntityTypeEnum.COMPANY)
                                       .street("string")
                                       .build());
```

#### Response

##### Type
[Account](/src/main/java/com/currencycloud/sdk/model/Account.java)

##### Example
`Account
.builder()
.accountName("Company PLC")
.agentOrReliance(true)
.apiTrading(true)
.bankAccountVerified(AccountBankAccountVerifiedEnum.NOT_REQUIRED)
.brand("currencycloud")
.city("London")
.country("GB")
.createdAt("2023-12-31T23:59:59.000Z")
.id("B7DE235A-FF5D-4252-83C2-06A605267FEA")
.identificationType(AccountIdentificationTypeEnum.GREEN_CARD)
.identificationValue("123456789")
.legalEntityType("company")
.onlineTrading(true)
.phoneTrading(true)
.postalCode("AB12 CD1")
.processThirdPartyFunds(false)
.settlementType(AccountSettlementTypeEnum.BULK)
.shortReference("110104-00004")
.spreadTable("flat_0.5_percent")
.stateOrProvince("")
.status(AccountStatusEnum.ENABLED)
.street("1 London Road")
.termsAndConditionsAccepted(true)
.updatedAt("2023-12-31T23:59:59.000Z")
.yourReference("0012345564ABC")
.build()`

### Find Accounts <a name="find"></a>

Returns account and any sub-accounts owned by the authenticated user. Optionally filter by account status and other criteria.

**API Endpoint**: `POST /accounts/find`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `accountName` | ✗ | Account name. | `"string"` |
| `bankAccountVerified` | ✗ | Has the bank account been verified? | `AccountsFindBodyBankAccountVerifiedEnum.FALSE` |
| `brand` | ✗ | The value of this field is used for white labeling the Currencycloud user interface. | `"string"` |
| `city` | ✗ | City. | `"string"` |
| `country` | ✗ | Two-letter country code. | `"string"` |
| `order` | ✗ | Any field name to change the sort order. | `"string"` |
| `orderAscDesc` | ✗ | Sort records in ascending or descending order. | `AccountsFindBodyOrderAscDescEnum.ASC` |
| `page` | ✗ | Page number. | `123L` |
| `perPage` | ✗ | Number of results per page. | `123L` |
| `postalCode` | ✗ | Postal code. | `"string"` |
| `spreadTable` | ✗ | The name of the spread table assigned to the account. | `"string"` |
| `stateOrProvince` | ✗ | State or province two-letter ISO 3166 code. Only applicable to some countries. | `"string"` |
| `status` | ✗ | Account status. | `AccountsFindBodyStatusEnum.DISABLED` |
| `street` | ✗ | First line of address. | `"string"` |
| `yourReference` | ✗ | User-generated reference code. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.AccountsFindResponse;
import com.currencycloud.sdk.resources.accounts.params.FindRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
AccountsFindResponse res = client.accounts().find(FindRequest
                           .builder()
                           .build());
```

#### Response

##### Type
[AccountsFindResponse](/src/main/java/com/currencycloud/sdk/model/AccountsFindResponse.java)

##### Example
`AccountsFindResponse
.builder()
.pagination(Pagination
.builder()
.currentPage(1L)
.nextPage(2L)
.order("created_at")
.orderAscDesc(PaginationOrderAscDescEnum.ASC)
.perPage(25L)
.previousPage(-1L)
.totalEntries(1L)
.totalPages(1L)
.build())
.build()`

### Update Account <a name="update"></a>

Updates a sub-account owned by the authenticated user. The updated account entity is returned on success.

**API Endpoint**: `POST /accounts/{id}`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | Account UUID, returned by the create account endpoint. | `"string"` |
| `accountName` | ✗ | Account name. | `"string"` |
| `apiTrading` | ✗ | Whether trading via the Currencycloud API is to be enabled on the account. | `true` |
| `brand` | ✗ | The value of this field is used for white labeling the Currencycloud user interface. | `"string"` |
| `city` | ✗ | City name | `"string"` |
| `country` | ✗ | Two-letter ISO country code. | `"string"` |
| `identificationType` | ✗ | A legal document that verifies the identity of the account owner. | `AccountsUpdateBodyIdentificationTypeEnum.CITIZENSHIP_PAPERS` |
| `identificationValue` | ✗ | A unique reference code for the identification document, such as a passport number. | `"string"` |
| `legalEntityType` | ✗ | Legal entity. | `AccountsUpdateBodyLegalEntityTypeEnum.COMPANY` |
| `onlineTrading` | ✗ | Enable online trading on the account. | `true` |
| `phoneTrading` | ✗ | Enable phone trading on the account. | `true` |
| `postalCode` | ✗ | Postal code. | `"string"` |
| `spreadTable` | ✗ | The name of the spread table assigned to the account. | `"string"` |
| `stateOrProvince` | ✗ | State or province two-letter ISO 3166 code. Only applicable to some countries. | `"string"` |
| `status` | ✗ | Status of the account. | `AccountsUpdateBodyStatusEnum.DISABLED` |
| `street` | ✗ | First line of address. | `"string"` |
| `termsAndConditionsAccepted` | ✗ | Acceptance of the terms and conditions. | `true` |
| `yourReference` | ✗ | User-generated reference code. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.Account;
import com.currencycloud.sdk.resources.accounts.params.UpdateRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Account res = client.accounts().update(UpdateRequest
                                       .builder()
                                       .id("string")
                                       .build());
```

#### Response

##### Type
[Account](/src/main/java/com/currencycloud/sdk/model/Account.java)

##### Example
`Account
.builder()
.accountName("Company PLC")
.agentOrReliance(true)
.apiTrading(true)
.bankAccountVerified(AccountBankAccountVerifiedEnum.NOT_REQUIRED)
.brand("currencycloud")
.city("London")
.country("GB")
.createdAt("2023-12-31T23:59:59.000Z")
.id("B7DE235A-FF5D-4252-83C2-06A605267FEA")
.identificationType(AccountIdentificationTypeEnum.GREEN_CARD)
.identificationValue("123456789")
.legalEntityType("company")
.onlineTrading(true)
.phoneTrading(true)
.postalCode("AB12 CD1")
.processThirdPartyFunds(false)
.settlementType(AccountSettlementTypeEnum.BULK)
.shortReference("110104-00004")
.spreadTable("flat_0.5_percent")
.stateOrProvince("")
.status(AccountStatusEnum.ENABLED)
.street("1 London Road")
.termsAndConditionsAccepted(true)
.updatedAt("2023-12-31T23:59:59.000Z")
.yourReference("0012345564ABC")
.build()`

## Submodules
- [paymentchargessettings](paymentchargessettings/README.md) - paymentchargessettings

