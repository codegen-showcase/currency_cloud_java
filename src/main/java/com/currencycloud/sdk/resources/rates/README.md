# rates

## Module Functions

### Get Detailed Rates <a name="get_detailed"></a>

Gets a detailed, tradeable rate quote to convert money from one currency to another. The quotation provided will be based on the spread table of the authenticated user. There is also the option to provide a specific date for the conversion to occur. <br><br> This endpoint provides a current tradeable rate for a single currency pair. It should be used as the start of the flow before a conversion is booked. This endpoint should be used where accuracy is the most important aspect, such as when a trade is about to be booked.

**API Endpoint**: `GET /rates/detailed`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `amount` | ✓ | Amount of the fixed buy or sell currency. | `"string"` |
| `buyCurrency` | ✓ | Currency purchased - three-letter ISO code. | `"string"` |
| `fixedSide` | ✓ | Fix the buy or sell currency. | `RatesGetDetailedFixedSideEnum.BUY` |
| `sellCurrency` | ✓ | Currency sold - three-letter ISO code. | `"string"` |
| `conversionDate` | ✗ | Date of delivery of purchased currency. ISO 8601 format YYYY-MM-DD. If not specified, deals settle in two working days. | `"1970-01-01"` |
| `conversionDatePreference` | ✗ | Available only if conversion_date is not provided. Must be one of the following:<br> 'earliest' for earliest available conversion date. Make sure there is sufficient time to send funds to Currencycloud.<br> 'next_day' for next day available conversion date - T+1.<br> 'default' for conversion - T+1 for <a href="https://support.currencycloud.com/hc/en-gb/articles/360017419080-Making-payments-to-India-Indonesia-Malaysia-and-the-Philippines-INR-IDR-MYR-PHP-FAQ">APAC restricted currencies</a>, T+2 for all others.<br> 'optimize_liquidity' for maximizing chances of getting a successful rate. Most relevant for exotic pairs. Conversion is T+0 for <a href="https://support.currencycloud.com/hc/en-gb/articles/360017419080-Making-payments-to-India-Indonesia-Malaysia-and-the-Philippines-INR-IDR-MYR-PHP-FAQ">APAC restricted currencies</a>, and T+1 or T+2 for all others. | `RatesGetDetailedConversionDatePreferenceEnum.DEFAULT` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.RateDetailed;
import com.currencycloud.sdk.model.RatesGetDetailedFixedSideEnum;
import com.currencycloud.sdk.resources.rates.params.GetDetailedRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
RateDetailed res = client.rates().getDetailed(GetDetailedRequest
                   .builder()
                   .amount("string")
                   .buyCurrency("string")
                   .fixedSide(RatesGetDetailedFixedSideEnum.BUY)
                   .sellCurrency("string")
                   .build());
```

#### Response

##### Type
[RateDetailed](/src/main/java/com/currencycloud/sdk/model/RateDetailed.java)

##### Example
`RateDetailed
.builder()
.clientBuyAmount("1000.00")
.clientBuyCurrency("GBP")
.clientRate("1.5949")
.clientSellAmount("1594.90")
.clientSellCurrency("USD")
.coreRate("1.587")
.currencyPair("GBPUSD")
.depositAmount("316.96")
.depositCurrency("USD")
.depositRequired("true")
.fixedSide(RateDetailedFixedSideEnum.BUY)
.midMarketRate("1.5868")
.partnerRate("1.5878")
.settlementCutOffTime("2023-12-31T23:59:59.000Z")
.build()`

### Get Basic Rates <a name="find"></a>

Gets indicative foreign exchange rate information for one or more currency pairs in a single request. <br><br> This endpoint is intended to provide an indication of the rate available in the market and can support requests for multiple currency pairs, so is good for polling requirements such as live FX ticker widgets. This endpoint should be used where speed, availability and the ability to request multiple currency pairs is important.

**API Endpoint**: `GET /rates/find`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `currencyPair` | ✓ | Concatenated string of the two currencies traded, e.g. "USDEUR". More than one pair can be entered, separated by a comma e.g. "EURGBP,GBPUSD,EURUSD". | `"string"` |
| `ignoreInvalidPairs` | ✗ | Ignore the validation of currency pairs. | `true` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.RatesBasic;
import com.currencycloud.sdk.resources.rates.params.FindRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
RatesBasic res = client.rates().find(FindRequest
                                     .builder()
                                     .currencyPair("string")
                                     .build());
```

#### Response

##### Type
[RatesBasic](/src/main/java/com/currencycloud/sdk/model/RatesBasic.java)

##### Example
`RatesBasic
.builder()
.build()`

### Find Bank Details <a name="find_bank_details"></a>

Returns the related bank details for the given account reference.

**API Endpoint**: `POST /reference/bank_details/find`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `identifierType` | ✓ | The type of code used to identify the account (e.g. IBAN). | `RatesFindBankDetailsBodyIdentifierTypeEnum.ABA` |
| `identifierValue` | ✓ | The value of the account identifier specified in identifier_type (e.g. the IBAN code). | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.BankDetails;
import com.currencycloud.sdk.model.RatesFindBankDetailsBodyIdentifierTypeEnum;
import com.currencycloud.sdk.resources.rates.params.FindBankDetailsRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
BankDetails res = client.rates().findBankDetails(FindBankDetailsRequest
                  .builder()
                  .identifierType(RatesFindBankDetailsBodyIdentifierTypeEnum.ABA)
                  .identifierValue("string")
                  .build());
```

#### Response

##### Type
[BankDetails](/src/main/java/com/currencycloud/sdk/model/BankDetails.java)

##### Example
`BankDetails
.builder()
.accountNumber("FR7530002002460000012345X12")
.bankAddress("212 BOULEVARD DE LA VILLETTE")
.bankBranch("AG STALINGRAD")
.bankCity("PARIS")
.bankCountry("FRANCE")
.bankCountryIso("FR")
.bankName("CREDIT LYONNAIS")
.bankPostCode("75019")
.bankState("PARIS")
.bicSwift("CRLYFRPPXXX")
.identifierType("iban")
.identifierValue("FR7530002002460000012345X12")
.build()`

