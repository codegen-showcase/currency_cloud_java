# reference

## Module Functions

### Get Beneficiary Requirements <a name="get_beneficiary_requirements"></a>

Returns the information that is required to make payments to beneficiaries in specified currencies and countries.

**API Endpoint**: `GET /reference/beneficiary_required_details`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `bankAccountCountry` | ✓ | Two-letter ISO country code. | `"string"` |
| `beneficiaryCountry` | ✓ | Two-letter ISO country code. If the beneficiary is a company, this is the country in which the company is registered. If the beneficiary is an individual, this is the country in which they are based. | `"string"` |
| `currency` | ✓ | Currency in which money is held in the beneficiary's bank account. Three-letter ISO currency code. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.ReferenceGetBeneficiaryRequirementsResponse;
import com.currencycloud.sdk.resources.reference.params.GetBeneficiaryRequirementsRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
ReferenceGetBeneficiaryRequirementsResponse res = client.reference().getBeneficiaryRequirements(
            GetBeneficiaryRequirementsRequest
            .builder()
            .bankAccountCountry("string")
            .beneficiaryCountry("string")
            .currency("string")
            .build());
```

#### Response

##### Type
[ReferenceGetBeneficiaryRequirementsResponse](/src/main/java/com/currencycloud/sdk/model/ReferenceGetBeneficiaryRequirementsResponse.java)

##### Example
`ReferenceGetBeneficiaryRequirementsResponse
.builder()
.build()`

### Get Conversion Dates <a name="get_conversion_dates"></a>

Provides a list of upcoming non-trading dates, such as weekends or public holidays, for a specified currency pair. Common use cases include situations where this information needs to be provided, or for planning upcoming conversion bookings. <br><br> Many currencies are triangulated; this means that holidays affecting the intermediary currency, as well as the sale and purchase currencies, will impact transactions. Find out more at our <a href="https://support.currencycloud.com/hc/en-gb/articles/5223342659484-Currency-Triangulation">support article.</a>

**API Endpoint**: `GET /reference/conversion_dates`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `conversionPair` | ✓ | Concatenated string of the currency codes for the two currencies involved, e.g. "USDEUR". | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |
| `startDate` | ✗ | Start date of conversion. ISO 8601 format YYYY-MM-DD. | `"1970-01-01"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.ConversionDates;
import com.currencycloud.sdk.resources.reference.params.GetConversionDatesRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
ConversionDates res = client.reference().getConversionDates(GetConversionDatesRequest
                      .builder()
                      .conversionPair("string")
                      .build());
```

#### Response

##### Type
[ConversionDates](/src/main/java/com/currencycloud/sdk/model/ConversionDates.java)

##### Example
`ConversionDates
.builder()
.defaultConversionDate("2020-11-20")
.firstConversionCutoffDatetime("2020-11-18T15:50:00Z")
.firstConversionDate("2020-11-18")
.invalidConversionDates(Map.ofEntries(
Map.entry("2020-11-21", "No trading on Saturday"),
Map.entry("2020-11-22", "No trading on Sunday"),
Map.entry("2020-11-28", "No trading on Saturday"),
Map.entry("2020-11-29", "No trading on Sunday"),
Map.entry("2020-12-05", "No trading on Saturday"),
Map.entry("2020-12-06", "No trading on Sunday"),
Map.entry("2020-12-12", "No trading on Saturday"),
Map.entry("2020-12-13", "No trading on Sunday"),
Map.entry("2020-12-19", "No trading on Saturday"),
Map.entry("2020-12-20", "No trading on Sunday"),
Map.entry("2020-12-25", "Christmas Day"),
Map.entry("2020-12-26", "No trading on Saturday"),
Map.entry("2020-12-27", "No trading on Sunday"),
Map.entry("2020-12-28", "Boxing Day OBS"),
Map.entry("2021-01-01", "New Year's Day"),
Map.entry("2021-01-02", "No trading on Saturday"),
Map.entry("2021-01-03", "No trading on Sunday")
))
.nextDayConversionDate("2020-11-19")
.offlineConversionDates(List.of(
"2020-11-23"
))
.optimizeLiquidityConversionDate("2020-11-23")
.build()`

### Get Available Currencies <a name="get_available_currencies"></a>

Gets a list of all currencies that can be traded on the Currencycloud platform.

**API Endpoint**: `GET /reference/currencies`

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.AvailableCurrencies;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
AvailableCurrencies res = client.reference().getAvailableCurrencies();
```

#### Response

##### Type
[AvailableCurrencies](/src/main/java/com/currencycloud/sdk/model/AvailableCurrencies.java)

##### Example
`AvailableCurrencies
.builder()
.canBuy(true)
.canSell(true)
.code("AED")
.decimalPlaces(2L)
.name("United Arab Emirates Dirham")
.onlineTrading(true)
.build()`

### Get Payer Requirements <a name="get_payer_required_details"></a>

Returns the payer information you need to provide to create a payment. Requirements vary depending on the location of the payer, the type of payment to be made (priority or regular), and other factors.

**API Endpoint**: `GET /reference/payer_required_details`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `payerCountry` | ✓ | Two-letter ISO country code. | `"string"` |
| `currency` | ✗ | Three-letter ISO 4217 currency code. | `"string"` |
| `payerEntityType` | ✗ | Legal entity type - company or individual. | `ReferenceGetPayerRequiredDetailsPayerEntityTypeEnum.COMPANY` |
| `paymentType` | ✗ | Currencycloud supports two types of payments: "priority" (Swift), made using the Swift network; and "regular" (local), made using the local bank network. | `ReferenceGetPayerRequiredDetailsPaymentTypeEnum.PRIORITY` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.PayerRequirements;
import com.currencycloud.sdk.resources.reference.params.GetPayerRequiredDetailsRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
PayerRequirements res = client.reference().getPayerRequiredDetails(GetPayerRequiredDetailsRequest
                        .builder()
                        .payerCountry("string")
                        .build());
```

#### Response

##### Type
[PayerRequirements](/src/main/java/com/currencycloud/sdk/model/PayerRequirements.java)

##### Example
`PayerRequirements
.builder()
.payerEntityType(PayerRequirementsPayerEntityTypeEnum.COMPANY)
.paymentType(PayerRequirementsPaymentTypeEnum.PRIORITY)
.requiredFields(List.of(
PayerRequirementsRequiredFieldsItem
.builder()
.name("payer_country")
.validationRule("^[A-z]{2}$")
.build(),
PayerRequirementsRequiredFieldsItem
.builder()
.name("payer_city")
.validationRule("^.{1,255}")
.build(),
PayerRequirementsRequiredFieldsItem
.builder()
.name("payer_address")
.validationRule("^.{1,255}")
.build(),
PayerRequirementsRequiredFieldsItem
.builder()
.name("payer_postcode")
.validationRule("^.{1,255}")
.build(),
PayerRequirementsRequiredFieldsItem
.builder()
.name("payer_company_name")
.validationRule("^.{1,255}")
.build()
))
.build()`

### Get Payment Dates <a name="get_payment_dates"></a>

Gets a list of invalid payment dates for a given currency covering a two months period from the start_date specified. A payment date is when a payment will be executed by Currencycloud. Payments cannot be made on some days, for example when banks are closed.

**API Endpoint**: `GET /reference/payment_dates`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `currency` | ✓ | Currency in which payment made. Three-letter ISO currency code. | `"string"` |
| `startDate` | ✗ | Payment start date, defaults to today's date. ISO 8601 format YYYY-MM-DD. | `"1970-01-01"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.PaymentDates;
import com.currencycloud.sdk.resources.reference.params.GetPaymentDatesRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
PaymentDates res = client.reference().getPaymentDates(GetPaymentDatesRequest
                   .builder()
                   .currency("string")
                   .build());
```

#### Response

##### Type
[PaymentDates](/src/main/java/com/currencycloud/sdk/model/PaymentDates.java)

##### Example
`PaymentDates
.builder()
.firstPaymentDate("2013-04-15T00:00:00.000Z")
.invalidPaymentDates(Map.ofEntries(
Map.entry("2013-04-18", "Good Friday"),
Map.entry("2013-04-19", "No trading on Saturday"),
Map.entry("2013-04-20", "No trading on Sunday"),
Map.entry("2013-04-21", "Easter Monday"),
Map.entry("2013-04-26", "No trading on Saturday"),
Map.entry("2013-04-27", "No trading on Sunday"),
Map.entry("2013-05-03", "No trading on Saturday"),
Map.entry("2013-05-04", "No trading on Sunday"),
Map.entry("2013-05-05", "Early May Bank Holiday"),
Map.entry("2013-05-10", "No trading on Saturday"),
Map.entry("2013-05-11", "No trading on Sunday"),
Map.entry("2013-05-17", "No trading on Saturday"),
Map.entry("2013-05-18", "No trading on Sunday"),
Map.entry("2013-05-24", "No trading on Saturday"),
Map.entry("2013-05-25", "No trading on Sunday"),
Map.entry("2013-05-26", "Spring Bank Holiday"),
Map.entry("2013-05-31", "No trading on Saturday"),
Map.entry("2013-06-01", "No trading on Sunday"),
Map.entry("2013-06-07", "No trading on Saturday"),
Map.entry("2013-06-08", "No trading on Sunday"),
Map.entry("2013-06-14", "No trading on Saturday")
))
.build()`

### Get Payment Fee Rules <a name="get_payment_fee_rules"></a>

Gets the <a href="https://support.currencycloud.com/hc/en-gb/articles/360017471459-Applying-fees-to-individual-payments-FAQ">payment fee</a> information set up for the account / payment type provided.

**API Endpoint**: `GET /reference/payment_fee_rules`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `accountId` | ✗ | Account UUID | `"string"` |
| `chargeType` | ✗ | Payment charge value. Limits the search results to payments of the specified <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430820-Selecting-payment-charges-for-SWIFT-payments-FAQ">charge type</a> - 'ours' or 'shared'. | `ReferenceGetPaymentFeeRulesChargeTypeEnum.OURS` |
| `paymentType` | ✗ | Payment type value. Limits the search results to payments of the specified payment type - 'priority'(Swift) or 'regular'(local). | `ReferenceGetPaymentFeeRulesPaymentTypeEnum.PRIORITY` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.ReferenceGetPaymentFeeRulesResponse;
import com.currencycloud.sdk.resources.reference.params.GetPaymentFeeRulesRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
ReferenceGetPaymentFeeRulesResponse res = client.reference().getPaymentFeeRules(
            GetPaymentFeeRulesRequest
            .builder()
            .build());
```

#### Response

##### Type
[ReferenceGetPaymentFeeRulesResponse](/src/main/java/com/currencycloud/sdk/model/ReferenceGetPaymentFeeRulesResponse.java)

##### Example
`ReferenceGetPaymentFeeRulesResponse
.builder()
.build()`

### Get Payment Purpose Codes <a name="get_payment_purpose_codes"></a>

Gets a list of payment purpose codes for a given currency and entity type. When initiating cross-border payments, the central bank of the country may require a purpose to be included with your transaction in order for your payment to be accepted and processed. If a payment purpose code is required but not provided, your payment may be delayed or rejected by the beneficiary bank.

**API Endpoint**: `GET /reference/payment_purpose_codes`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `bankAccountCountry` | ✓ | Two-letter ISO country code of the bank account. | `"string"` |
| `currency` | ✓ | Three-letter ISO currency code for the currency in which payment will be made. No purpose codes will be returned if an invalid currency code is given. | `"string"` |
| `entityType` | ✗ | Legal entity type - company or individual. | `ReferenceGetPaymentPurposeCodesEntityTypeEnum.COMPANY` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.ReferenceGetPaymentPurposeCodesResponse;
import com.currencycloud.sdk.resources.reference.params.GetPaymentPurposeCodesRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
ReferenceGetPaymentPurposeCodesResponse res = client.reference().getPaymentPurposeCodes(
            GetPaymentPurposeCodesRequest
            .builder()
            .bankAccountCountry("string")
            .currency("string")
            .build());
```

#### Response

##### Type
[ReferenceGetPaymentPurposeCodesResponse](/src/main/java/com/currencycloud/sdk/model/ReferenceGetPaymentPurposeCodesResponse.java)

##### Example
`ReferenceGetPaymentPurposeCodesResponse
.builder()
.build()`

### Get Settlement Accounts <a name="get_settlement_accounts"></a>

Gets settlement account information - a list of accounts that require funding in order to allow for outstanding transactions to be processed.

**API Endpoint**: `GET /reference/settlement_accounts`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `accountId` | ✗ | Account UUID | `"string"` |
| `currency` | ✗ | Three-letter ISO currency code. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.ReferenceGetSettlementAccountsResponse;
import com.currencycloud.sdk.resources.reference.params.GetSettlementAccountsRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
ReferenceGetSettlementAccountsResponse res = client.reference().getSettlementAccounts(
            GetSettlementAccountsRequest
            .builder()
            .build());
```

#### Response

##### Type
[ReferenceGetSettlementAccountsResponse](/src/main/java/com/currencycloud/sdk/model/ReferenceGetSettlementAccountsResponse.java)

##### Example
`ReferenceGetSettlementAccountsResponse
.builder()
.build()`

