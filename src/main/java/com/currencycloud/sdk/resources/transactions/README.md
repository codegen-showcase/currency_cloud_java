# transactions

## Module Functions

### Find Transactions <a name="find"></a>

Search for transactions.

**API Endpoint**: `GET /transactions/find`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `action` | ✗ | The action that triggered the transaction. | `TransactionsFindActionEnum.CONVERSION` |
| `amount` | ✗ | Amount the transaction is for. | `"string"` |
| `amountFrom` | ✗ | Minimum amount | `"string"` |
| `amountTo` | ✗ | Maximum amount | `"string"` |
| `beneficiaryId` | ✗ | Beneficiary UUID. Required if "related_entity_type" is "payment". | `"string"` |
| `completedAtFrom` | ✗ | Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z". | `"1970-01-01T00:00:00"` |
| `completedAtTo` | ✗ | Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z". | `"1970-01-01T00:00:00"` |
| `createdAtFrom` | ✗ | Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z". | `"1970-01-01T00:00:00"` |
| `createdAtTo` | ✗ | Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z". | `"1970-01-01T00:00:00"` |
| `currency` | ✗ | Three-letter ISO currency code. | `"string"` |
| `currencyPair` | ✗ | Concatenated string of the two currencies traded, e.g. "USDEUR". Required if "related_entity_type" is "conversion". | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |
| `order` | ✗ | The field to sort by. Defaults to 'created_at' if not specified.<br><br> Please note that if you choose to order by 'completed_at', it's important to populate the query parameter 'status' with the value 'completed' in order to ensure that transactions are sequenced in the order they were processed. Without this, transactions that completed within the same second may not be ordered correctly. | `"string"` |
| `orderAscDesc` | ✗ | Sort results in ascending or descending order. | `TransactionsFindOrderAscDescEnum.ASC` |
| `page` | ✗ | Page number | `123L` |
| `perPage` | ✗ | Number of results per page. | `123L` |
| `relatedEntityId` | ✗ | UUID of the related entity. | `"string"` |
| `relatedEntityShortReference` | ✗ | Short reference code. | `"string"` |
| `relatedEntityType` | ✗ | The related entity that created the transaction.<br> For information, the related_entity_type for margin transactions is <b>'margin_transaction'</b>. While it isn't possible to search directly by this value, margin transactions can be filtered using the ‘action’ field and may be included in the response. | `TransactionsFindRelatedEntityTypeEnum.CONVERSION` |
| `scope` | ✗ | "Own" account, "clients" sub-accounts, or "all" accounts. | `TransactionsFindScopeEnum.ALL` |
| `settlesAtFrom` | ✗ | Earliest processing date. Any valid ISO 8601 format, e.g. "e.g. "2023-12-31T23:59:59Z". | `"1970-01-01T00:00:00"` |
| `settlesAtTo` | ✗ | Latest processing date. Any valid ISO 8601 format, e.g. "e.g. "2023-12-31T23:59:59Z". | `"1970-01-01T00:00:00"` |
| `status` | ✗ | Transaction status. | `TransactionsFindStatusEnum.COMPLETED` |
| `type` | ✗ | Whether the transaction debits or credits the account balance. | `TransactionsFindTypeEnum.CREDIT` |
| `updatedAtFrom` | ✗ | Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z". | `"1970-01-01T00:00:00"` |
| `updatedAtTo` | ✗ | Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59Z". | `"1970-01-01T00:00:00"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.TransactionsFindResponse;
import com.currencycloud.sdk.resources.transactions.params.FindRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
TransactionsFindResponse res = client.transactions().find(FindRequest
                               .builder()
                               .build());
```

#### Response

##### Type
[TransactionsFindResponse](/src/main/java/com/currencycloud/sdk/model/TransactionsFindResponse.java)

##### Example
`TransactionsFindResponse
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

### Get Sender Details <a name="get_sender_details"></a>

Returns a JSON structure with details of the sender of funds.

**API Endpoint**: `GET /transactions/sender/{id}`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | The Related Entity UUID (related_entity_id) for the Transaction. | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.Sender;
import com.currencycloud.sdk.resources.transactions.params.GetSenderDetailsRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Sender res = client.transactions().getSenderDetails(GetSenderDetailsRequest
             .builder()
             .id("string")
             .build());
```

#### Response

##### Type
[Sender](/src/main/java/com/currencycloud/sdk/model/Sender.java)

##### Example
`Sender
.builder()
.amount("450.00")
.createdAt("2018-03-27T10:51:32.000Z")
.id("21a7edce-fff8-486a-ac28-0dd143375081")
.sender("CITIBANK XFER, POPMONEY")
.updatedAt("2018-03-27T10:51:34.000Z")
.valueDate("2018-03-27T00:00:00.000Z")
.build()`

### Get Transaction <a name="get"></a>

Gets a transaction record.

**API Endpoint**: `GET /transactions/{id}`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | Transaction UUID | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.Transaction;
import com.currencycloud.sdk.resources.transactions.params.GetRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Transaction res = client.transactions().get(GetRequest
                  .builder()
                  .id("string")
                  .build());
```

#### Response

##### Type
[Transaction](/src/main/java/com/currencycloud/sdk/model/Transaction.java)

##### Example
`Transaction
.builder()
.accountId("7b9757a8-eee9-4572-86e6-77f4d711eaa6")
.action(TransactionActionEnum.CONVERSION)
.amount("1000.00")
.balanceAmount("2000.00")
.balanceId("c5f1f54e-d6d8-4140-8110-f5b99bbc80c3")
.completedAt("2023-12-31T23:59:59.000Z")
.createdAt("2023-12-31T23:59:59.000Z")
.currency("USD")
.id("c5a990eb-d4d7-482f-bfb1-695261fb1e4d")
.reason("Reason for Transaction")
.relatedEntityId("e93e322f-93aa-4d31-b050-449da723db0b")
.relatedEntityShortReference("140416-GGJBNQ001")
.relatedEntityType(TransactionRelatedEntityTypeEnum.CONVERSION)
.settlesAt("2023-12-31T23:59:59.000Z")
.status(TransactionStatusEnum.COMPLETED)
.type(TransactionTypeEnum.CREDIT)
.updatedAt("2023-12-31T23:59:59.000Z")
.build()`

