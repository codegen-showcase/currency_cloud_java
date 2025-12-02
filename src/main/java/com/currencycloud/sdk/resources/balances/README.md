# balances

## Module Functions

### Find Balances <a name="find"></a>

Searches for currency balances in the main account or a sub-account owned by the authenticated user.

**API Endpoint**: `GET /balances/find`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `amountFrom` | ✗ | Minimum balance amount. | `123.0` |
| `amountTo` | ✗ | Maximum balance amount. | `123.0` |
| `asAtDate` | ✗ | A valid ISO 8601 format, e.g. "2019-12-31T23:59:59". | `"1970-01-01T00:00:00"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"3e4666bf-d5e5-4aa7-b8ce-cefe41c7568a"` |
| `order` | ✗ | A field name to change the sort order - "created_at", "amount", "updated_at" or "currency". | `BalancesFindOrderEnum.AMOUNT` |
| `orderAscDesc` | ✗ | Sort records in ascending or descending order. | `BalancesFindOrderAscDescEnum.ASC` |
| `page` | ✗ | Page number | `123L` |
| `perPage` | ✗ | Number of results per page. | `123L` |
| `scope` | ✗ | "Own" account, "clients" sub-accounts, or "all" accounts. | `BalancesFindScopeEnum.ALL` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.BalancesFindResponse;
import com.currencycloud.sdk.resources.balances.params.FindRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
BalancesFindResponse res = client.balances().find(FindRequest
                           .builder()
                           .build());
```

#### Response

##### Type
[BalancesFindResponse](/src/main/java/com/currencycloud/sdk/model/BalancesFindResponse.java)

##### Example
`BalancesFindResponse
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

### Get Balance <a name="get"></a>

Gets the balance for a currency from the account of the authenticated user.

**API Endpoint**: `GET /balances/{currency}`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `currency` | ✓ | Three-letter ISO currency code. | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"3e4666bf-d5e5-4aa7-b8ce-cefe41c7568a"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.Balance;
import com.currencycloud.sdk.resources.balances.params.GetRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Balance res = client.balances().get(GetRequest
                                    .builder()
                                    .currency("string")
                                    .build());
```

#### Response

##### Type
[Balance](/src/main/java/com/currencycloud/sdk/model/Balance.java)

##### Example
`Balance
.builder()
.accountId("TcC")
.amount("1000.00")
.createdAt("2023-12-31T23:59:59.000Z")
.currency("USD")
.id("18230F1D-648A-406A-AD1F-A09CBC02E9E9")
.updatedAt("2023-12-31T23:59:59.000Z")
.build()`

### Top Up Margin Balance <a name="top_up_margin"></a>

Tops up the margin balance.

**API Endpoint**: `POST /balances/top_up_margin`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `amount` | ✓ | Amount to top up. | `"string"` |
| `currency` | ✓ | Three-letter ISO currency code for the currency to top up. | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.TopUpMarginBalance;
import com.currencycloud.sdk.resources.balances.params.TopUpMarginRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
TopUpMarginBalance res = client.balances().topUpMargin(TopUpMarginRequest
                         .builder()
                         .amount("string")
                         .currency("string")
                         .build());
```

#### Response

##### Type
[TopUpMarginBalance](/src/main/java/com/currencycloud/sdk/model/TopUpMarginBalance.java)

##### Example
`TopUpMarginBalance
.builder()
.accountId("6c046c51-2387-4004-8e87-4bf97102e36d")
.currency("EUR")
.transferredAmount("100.0")
.build()`

