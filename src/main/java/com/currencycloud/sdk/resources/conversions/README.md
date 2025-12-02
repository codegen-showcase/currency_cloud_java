# conversions

## Module Functions

### Find Conversions <a name="find"></a>

Finds conversions based on search parameters. If no search parameters are provided, all conversions under the house account are returned.

**API Endpoint**: `GET /conversions/find`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `buyAmountFrom` | ✗ | Minimum buy amount. | `"string"` |
| `buyAmountTo` | ✗ | Maximum buy amount. | `"string"` |
| `buyCurrency` | ✗ | The currency purchased- three character ISO code. | `"string"` |
| `conversionDateFrom` | ✗ | Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00". | `"string"` |
| `conversionDateTo` | ✗ | Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00". | `"string"` |
| `conversionIds` | ✗ | One or more conversion UUIDs to filter out of results. | `List.of("string")` |
| `createdAtFrom` | ✗ | Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00". | `"string"` |
| `createdAtTo` | ✗ | Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00". | `"string"` |
| `currencyPair` | ✗ | Concatenated string of the two currencies traded, e.g. "USDEUR". | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |
| `order` | ✗ | Any field name to change the sort order. | `"string"` |
| `orderAscDesc` | ✗ | Sort records in ascending or descending order. | `ConversionsFindOrderAscDescEnum.ASC` |
| `page` | ✗ | Page number. | `123L` |
| `partnerBuyAmountFrom` | ✗ | Minimum buy amount (sub-accounts). | `"string"` |
| `partnerBuyAmountTo` | ✗ | Maximum buy amount (sub-accounts). | `"string"` |
| `partnerSellAmountFrom` | ✗ | Minimum sell amount (sub-accounts). | `"string"` |
| `partnerSellAmountTo` | ✗ | Maximum sell amount (sub-accounts). | `"string"` |
| `perPage` | ✗ | Number of results per page. | `123L` |
| `scope` | ✗ | "Own" account, "clients" sub-accounts, or "all" accounts. | `ConversionsFindScopeEnum.ALL` |
| `sellAmountFrom` | ✗ | Minimum sell amount. | `"string"` |
| `sellAmountTo` | ✗ | Maximum sell amount. | `"string"` |
| `sellCurrency` | ✗ | The currency sold - three character ISO code. | `"string"` |
| `settlementDateFrom` | ✗ | Earliest date when sold currency debited. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00". | `"string"` |
| `settlementDateTo` | ✗ | Latest date when sold currency debited. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00". | `"string"` |
| `shortReference` | ✗ | Short reference code. | `"string"` |
| `status` | ✗ | Conversion status. | `ConversionsFindStatusEnum.AWAITING_FUNDS` |
| `uniqueRequestId` | ✗ | User-generated idempotency key. | `"string"` |
| `updatedAtFrom` | ✗ | Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00". | `"string"` |
| `updatedAtTo` | ✗ | Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00". | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.ConversionsFindResponse;
import com.currencycloud.sdk.resources.conversions.params.FindRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
ConversionsFindResponse res = client.conversions().find(FindRequest
                              .builder()
                              .build());
```

#### Response

##### Type
[ConversionsFindResponse](/src/main/java/com/currencycloud/sdk/model/ConversionsFindResponse.java)

##### Example
`ConversionsFindResponse
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

### Retrieve Profit / Loss <a name="profit_and_loss"></a>

Returns the information of any actions related to a conversion that have generated profit or loss, including the profit or loss amount.

**API Endpoint**: `GET /conversions/profit_and_loss`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `accountId` | ✗ | UUID of the Account that the Conversion belongs to. | `"string"` |
| `amountFrom` | ✗ | Allows you to return profit and losses based on a minimum profit or loss amount. | `"string"` |
| `amountTo` | ✗ | Allows you to return profit and losses based on a maximum profit or loss amount. | `"string"` |
| `contactId` | ✗ | UUID of the Contact that performed the action. | `"string"` |
| `conversionId` | ✗ | UUID of the conversion. | `"string"` |
| `currency` | ✗ | The currency of the profit and loss. ISO 4217 standard. | `"string"` |
| `eventDateTimeFrom` | ✗ | Allows you to return profit and losses that will be made from on or after a defined date/time. ISO 8601 standard. | `"string"` |
| `eventDateTimeTo` | ✗ | Allows you to return profit and losses that will be made from on or before a defined date/time. ISO 8601 standard. | `"string"` |
| `eventType` | ✗ | Event type, in this case 'self_service_cancellation'. | `"string"` |
| `order` | ✗ | The field to order entries by. | `"string"` |
| `orderAscDesc` | ✗ | Whether the order is ascending (asc) or descending (desc). | `ConversionsProfitAndLossOrderAscDescEnum.ASC` |
| `page` | ✗ | Returns a specific page within the results of a search. | `"string"` |
| `perPage` | ✗ | Maximum number of entries to return per page of results. | `"string"` |
| `scope` | ✗ | Scope allows contacts to search all profit and losses at all account levels. Defaults to own.<br> 'own' - search profit and losses on the main account <br> 'clients' - search profit and losses of account sub-accounts <br> 'all' - search profit and losses of main account and sub-accounts. | `ConversionsProfitAndLossScopeEnum.ALL` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.ConversionsProfitAndLossResponse;
import com.currencycloud.sdk.resources.conversions.params.ProfitAndLossRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
ConversionsProfitAndLossResponse res = client.conversions().profitAndLoss(ProfitAndLossRequest
                                       .builder()
                                       .build());
```

#### Response

##### Type
[ConversionsProfitAndLossResponse](/src/main/java/com/currencycloud/sdk/model/ConversionsProfitAndLossResponse.java)

##### Example
`ConversionsProfitAndLossResponse
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

### Get Conversion <a name="get"></a>

Gets a conversion record for the provided unique ID.

**API Endpoint**: `GET /conversions/{id}`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | Conversion UUID, this is returned by a successful trade request when creating a conversion. | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.Conversion;
import com.currencycloud.sdk.resources.conversions.params.GetRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Conversion res = client.conversions().get(GetRequest
                 .builder()
                 .id("string")
                 .build());
```

#### Response

##### Type
[Conversion](/src/main/java/com/currencycloud/sdk/model/Conversion.java)

##### Example
`Conversion
.builder()
.accountId("0386e472-8d2b-45a8-9c14-a393dce5bf3a")
.buyCurrency("GBP")
.clientBuyAmount("1000.00")
.clientRate("1.5949")
.clientSellAmount("1594.90")
.conversionDate("2023-12-31T23:59:59.000Z")
.coreRate("1.5871")
.createdAt("2023-12-31T23:59:59.000Z")
.creatorContactId("ac743762-5860-4b78-9c6a-82c5bca68867")
.currencyPair("GBPUSD")
.depositAmount("47.85")
.depositCurrency("GBP")
.depositRequired(true)
.depositRequiredAt("2023-12-31T23:59:59.000Z")
.depositStatus(ConversionDepositStatusEnum.AWAITING_DEPOSIT)
.fixedSide(ConversionFixedSideEnum.BUY)
.id("c9b6b851-10f9-4bbf-881e-1d8a49adf7d8")
.midMarketRate("1.5868")
.partnerBuyAmount("1000.00")
.partnerRate("1.5878")
.partnerSellAmount("1587.80")
.paymentIds(List.of(
"b934794f-d810-4b4a-b360-5a0f47b7126e"
))
.sellCurrency("USD")
.settlementDate("2023-12-31T23:59:59.000Z")
.shortReference("20140507-VRTNFC")
.status(ConversionStatusEnum.AWAITING_FUNDS)
.unallocatedFunds("1000.00")
.uniqueRequestId("1234567890abc")
.updatedAt("2023-12-31T23:59:59.000Z")
.build()`

### Quote Conversion Cancellation <a name="cancellation_quote"></a>

Gets a quote of the projected cost to cancel a conversion identified by a provided unique ID {id}.

**API Endpoint**: `GET /conversions/{id}/cancellation_quote`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | Conversion UUID, this is returned by a successful trade request when creating a conversion. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.ConversionCancellationQuote;
import com.currencycloud.sdk.resources.conversions.params.CancellationQuoteRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
ConversionCancellationQuote res = client.conversions().cancellationQuote(CancellationQuoteRequest
                                  .builder()
                                  .id("string")
                                  .build());
```

#### Response

##### Type
[ConversionCancellationQuote](/src/main/java/com/currencycloud/sdk/model/ConversionCancellationQuote.java)

##### Example
`ConversionCancellationQuote
.builder()
.amount("100")
.currency("GBP")
.eventDateTime("2023-07-14T17:03:11.000Z")
.build()`

### Quote Conversion Date Change <a name="date_change_quote"></a>

Gets a quote of the projected cost to change the date of a conversion identified by a provided unique ID {id}.

**API Endpoint**: `GET /conversions/{id}/date_change_quote`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | Conversion UUID, this is returned by a successful trade request when creating a conversion. | `"string"` |
| `newSettlementDate` | ✓ | Desired new settlement date of conversion, format YYYY-MM-DD. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.ConversionDateChange;
import com.currencycloud.sdk.resources.conversions.params.DateChangeQuoteRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
ConversionDateChange res = client.conversions().dateChangeQuote(DateChangeQuoteRequest
                           .builder()
                           .id("string")
                           .newSettlementDate("string")
                           .build());
```

#### Response

##### Type
[ConversionDateChange](/src/main/java/com/currencycloud/sdk/model/ConversionDateChange.java)

##### Example
`ConversionDateChange
.builder()
.build()`

### Conversion Split History <a name="split_history"></a>

Returns the history of executed conversion splits, specified by a unique conversion ID {id}.

**API Endpoint**: `GET /conversions/{id}/split_history`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | Conversion UUID - the UUID is returned by a successful trade request when creating a conversion. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.ConversionSplitHistory;
import com.currencycloud.sdk.resources.conversions.params.SplitHistoryRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
ConversionSplitHistory res = client.conversions().splitHistory(SplitHistoryRequest
                             .builder()
                             .id("string")
                             .build());
```

#### Response

##### Type
[ConversionSplitHistory](/src/main/java/com/currencycloud/sdk/model/ConversionSplitHistory.java)

##### Example
`ConversionSplitHistory
.builder()
.build()`

### Split Preview <a name="split_preview"></a>

Gets a preview of the details of each part of a split conversion specified by the provided unique conversion ID {id}.

**API Endpoint**: `GET /conversions/{id}/split_preview`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `amount` | ✓ | The amount at which to split this conversion. | `"string"` |
| `id` | ✓ | The UUID of the conversion to be split, the UUID is returned by a successful trade request when creating a conversion. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.ConversionSplit;
import com.currencycloud.sdk.resources.conversions.params.SplitPreviewRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
ConversionSplit res = client.conversions().splitPreview(SplitPreviewRequest
                      .builder()
                      .id("string")
                      .amount("string")
                      .build());
```

#### Response

##### Type
[ConversionSplit](/src/main/java/com/currencycloud/sdk/model/ConversionSplit.java)

##### Example
`ConversionSplit
.builder()
.build()`

### Create Conversion <a name="create"></a>

Creates a new conversion. Returns the details of the created conversion on success.

**API Endpoint**: `POST /conversions/create`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `amount` | ✓ | Amount of the fixed buy or sell currency. | `"string"` |
| `buyCurrency` | ✓ | Three-character ISO code for currency purchased. | `"string"` |
| `fixedSide` | ✓ | Fix the buy or sell currency. | `ConversionsCreateBodyFixedSideEnum.BUY` |
| `sellCurrency` | ✓ | Three-character ISO code for currency sold. | `"string"` |
| `termAgreement` | ✓ | Indicates agreement to terms and conditions. | `true` |
| `clientBuyAmount` | ✗ | Client buy amount. | `"string"` |
| `clientSellAmount` | ✗ | Client sell amount. | `"string"` |
| `conversionDate` | ✗ | Earliest delivery date in UTC time zone. Format YYYY-MM-DD. | `"1970-01-01"` |
| `conversionDatePreference` | ✗ | Available and required only if conversion_date is not provided.<br> Must be one of the following:<br> - 'earliest' for earliest available conversion date. Make sure there is sufficient time to send funds to Currencycloud.<br> - 'next_day' for next day available conversion date - T+1.<br> - 'default' for conversion - T+1 for <a href="https://support.currencycloud.com/hc/en-gb/articles/360017419080-Making-payments-to-India-Indonesia-Malaysia-and-the-Philippines-INR-IDR-MYR-PHP-FAQ">APAC restricted currencies</a>, T+2 for all others.<br> - 'optimize_liquidity' for maximizing chances of getting a successful rate. Most relevant for exotic pairs. Conversion is T+0 for <a href="https://support.currencycloud.com/hc/en-gb/articles/360017419080-Making-payments-to-India-Indonesia-Malaysia-and-the-Philippines-INR-IDR-MYR-PHP-FAQ">APAC restricted currencies</a>, and T+1 or T+2 for all others. | `ConversionsCreateBodyConversionDatePreferenceEnum.DEFAULT` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |
| `reason` | ✗ | User-generated reason for conversion - freeform text. | `"string"` |
| `uniqueRequestId` | ✗ | User-generated idempotency key. Beneficial for request tracking / management. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.Conversion;
import com.currencycloud.sdk.model.ConversionsCreateBodyFixedSideEnum;
import com.currencycloud.sdk.resources.conversions.params.CreateRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Conversion res = client.conversions().create(CreateRequest
                 .builder()
                 .amount("string")
                 .buyCurrency("string")
                 .fixedSide(ConversionsCreateBodyFixedSideEnum.BUY)
                 .sellCurrency("string")
                 .termAgreement(true)
                 .build());
```

#### Response

##### Type
[Conversion](/src/main/java/com/currencycloud/sdk/model/Conversion.java)

##### Example
`Conversion
.builder()
.accountId("0386e472-8d2b-45a8-9c14-a393dce5bf3a")
.buyCurrency("GBP")
.clientBuyAmount("1000.00")
.clientRate("1.5949")
.clientSellAmount("1594.90")
.conversionDate("2023-12-31T23:59:59.000Z")
.coreRate("1.5871")
.createdAt("2023-12-31T23:59:59.000Z")
.creatorContactId("ac743762-5860-4b78-9c6a-82c5bca68867")
.currencyPair("GBPUSD")
.depositAmount("47.85")
.depositCurrency("GBP")
.depositRequired(true)
.depositRequiredAt("2023-12-31T23:59:59.000Z")
.depositStatus(ConversionDepositStatusEnum.AWAITING_DEPOSIT)
.fixedSide(ConversionFixedSideEnum.BUY)
.id("c9b6b851-10f9-4bbf-881e-1d8a49adf7d8")
.midMarketRate("1.5868")
.partnerBuyAmount("1000.00")
.partnerRate("1.5878")
.partnerSellAmount("1587.80")
.paymentIds(List.of(
"b934794f-d810-4b4a-b360-5a0f47b7126e"
))
.sellCurrency("USD")
.settlementDate("2023-12-31T23:59:59.000Z")
.shortReference("20140507-VRTNFC")
.status(ConversionStatusEnum.AWAITING_FUNDS)
.unallocatedFunds("1000.00")
.uniqueRequestId("1234567890abc")
.updatedAt("2023-12-31T23:59:59.000Z")
.build()`

### Cancel a Conversion <a name="cancel"></a>

Cancels the conversion identified by the provided unique ID {id}.

**API Endpoint**: `POST /conversions/{id}/cancel`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | UUID of the conversion that is being cancelled. The UUID is returned by a successful trade request when creating a conversion. | `"string"` |
| `notes` | ✗ | Notes describing the reason for cancellation. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.ConversionProfitAndLoss;
import com.currencycloud.sdk.resources.conversions.params.CancelRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
ConversionProfitAndLoss res = client.conversions().cancel(CancelRequest
                              .builder()
                              .id("string")
                              .build());
```

#### Response

##### Type
[ConversionProfitAndLoss](/src/main/java/com/currencycloud/sdk/model/ConversionProfitAndLoss.java)

##### Example
`ConversionProfitAndLoss
.builder()
.conversionProfitAndLosses(List.of(
ConversionCancellation
.builder()
.accountId("2090939e-b2f7-3f2b-1363-4d235b3f58af")
.amount("-0.28")
.contactId("8a98ebac-6f88-e205-a685-4d235b1b088b")
.conversionId("648945d7-1cff-4dae-a432-7d5501c77a8a")
.currency("GBP")
.eventAccountId("2090939e-b2f7-3f2b-1363-4d235b3f58af")
.eventContactId("8a98ebac-6f88-e205-a685-4d235b1b088b")
.eventDateTime("2023-11-10T12:18:56.000Z")
.eventType("self_service_cancellation")
.notes("Cancel the conversion due to personal issues")
.build(),
ConversionCancellation
.builder()
.accountId("67e1b252-40a7-454d-a097-8f77d385889d")
.amount("-0.83")
.contactId("04d0c252-7b78-4d72-b408-df78841e3ddc")
.conversionId("540c2ea3-9916-4efb-9cd9-0f8ce63a5c04")
.currency("USD")
.eventAccountId("67e1b252-40a7-454d-a097-8f77d385889d")
.eventContactId("04d0c252-7b78-4d72-b408-df78841e3ddc")
.eventDateTime("2023-11-10T12:18:56.000Z")
.eventType("self_service_cancellation")
.notes("Cancel due to very important reason")
.build()
))
.pagination(Pagination
.builder()
.currentPage(1L)
.nextPage(2L)
.order("created_at")
.orderAscDesc(PaginationOrderAscDescEnum.ASC)
.perPage(25L)
.previousPage(-1L)
.totalEntries(2L)
.totalPages(1L)
.build())
.build()`

### Conversion Date Change <a name="date_change"></a>

Changes the date of the conversion identified by the provided unique ID {id}.

**API Endpoint**: `POST /conversions/{id}/date_change`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | The UUID of the conversion that is being changed. | `"string"` |
| `newSettlementDate` | ✓ | New conversion settlement date, format YYYY-MM-DD. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.ConversionDateChange;
import com.currencycloud.sdk.resources.conversions.params.DateChangeRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
ConversionDateChange res = client.conversions().dateChange(DateChangeRequest
                           .builder()
                           .newSettlementDate("string")
                           .id("string")
                           .build());
```

#### Response

##### Type
[ConversionDateChange](/src/main/java/com/currencycloud/sdk/model/ConversionDateChange.java)

##### Example
`ConversionDateChange
.builder()
.build()`

### Conversion Split <a name="split"></a>

Splits the conversion specified by the unique ID {id}. Upon success, it returns the details of the parent and new child conversions.

**API Endpoint**: `POST /conversions/{id}/split`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `amount` | ✓ | The amount at which to split this conversion. | `"string"` |
| `id` | ✓ | UUID of the conversion that is being split. The conversion UUID is returned by a successful trade request when creating a conversion." | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.ConversionSplit;
import com.currencycloud.sdk.resources.conversions.params.SplitRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
ConversionSplit res = client.conversions().split(SplitRequest
                      .builder()
                      .amount("string")
                      .id("string")
                      .build());
```

#### Response

##### Type
[ConversionSplit](/src/main/java/com/currencycloud/sdk/model/ConversionSplit.java)

##### Example
`ConversionSplit
.builder()
.build()`

