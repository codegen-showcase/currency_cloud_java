# transfers

## Module Functions

### Find Transfers <a name="find"></a>

Searches for transfer records that meet the given criteria.

**API Endpoint**: `GET /transfers/find`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `amountFrom` | ✗ | Minimum amount | `123.0` |
| `amountTo` | ✗ | Maximum amount | `123.0` |
| `completedAtFrom` | ✗ | Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z". | `"1970-01-01T00:00:00"` |
| `completedAtTo` | ✗ | Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z". | `"1970-01-01T00:00:00"` |
| `createdAtFrom` | ✗ | Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z". | `"1970-01-01T00:00:00"` |
| `createdAtTo` | ✗ | Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z". | `"1970-01-01T00:00:00"` |
| `creatorAccountId` | ✗ | Account UUID of transfer instructor. | `"string"` |
| `creatorContactId` | ✗ | Contact UUID of transfer instructor. | `"string"` |
| `currency` | ✗ | Three-letter ISO currency code. | `"string"` |
| `destinationAccountId` | ✗ | Account UUID of the receiving account. | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |
| `order` | ✗ | The field name to sort by - "created_at", "updated_at" or "completed_at". Defaults to "created_at" if not specified..<br> | `TransfersFindOrderEnum.COMPLETED_AT` |
| `orderAscDesc` | ✗ | Sort records in ascending or descending order. | `TransfersFindOrderAscDescEnum.ASC` |
| `page` | ✗ | Page number | `123L` |
| `perPage` | ✗ | Number of results per page. | `123L` |
| `shortReference` | ✗ | Short reference code. | `"string"` |
| `sourceAccountId` | ✗ | Account UUID of the paying account. | `"string"` |
| `status` | ✗ | Transfer status | `TransfersFindStatusEnum.CANCELLED` |
| `uniqueRequestId` | ✗ | User-generated idempotency key. | `"string"` |
| `updatedAtFrom` | ✗ | Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z". | `"1970-01-01T00:00:00"` |
| `updatedAtTo` | ✗ | Any valid ISO 8601 format, no older than two years e.g. "2024-12-31T23:59:59Z". | `"1970-01-01T00:00:00"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.TransfersFindResponse;
import com.currencycloud.sdk.resources.transfers.params.FindRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
TransfersFindResponse res = client.transfers().find(FindRequest
                            .builder()
                            .build());
```

#### Response

##### Type
[TransfersFindResponse](/src/main/java/com/currencycloud/sdk/model/TransfersFindResponse.java)

##### Example
`TransfersFindResponse
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

### Get Transfer <a name="get"></a>

Returns the money transfer record with the given ID.

**API Endpoint**: `GET /transfers/{id}`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | Transfer UUID, this was returned when the transfer was created. | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.Transfer;
import com.currencycloud.sdk.resources.transfers.params.GetRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Transfer res = client.transfers().get(GetRequest
                                      .builder()
                                      .id("string")
                                      .build());
```

#### Response

##### Type
[Transfer](/src/main/java/com/currencycloud/sdk/model/Transfer.java)

##### Example
`Transfer
.builder()
.amount("1250.00")
.completedAt("2023-01-18T14:08:34.000Z")
.createdAt("2023-01-18T14:08:34.000Z")
.creatorAccountId("30cb8632-e152-11e6-a5af-080027a79e8f")
.creatorContactId("262e3d2a-e152-11e6-a5af-080027a79e8f")
.currency("GBP")
.destinationAccountId("946f2d58-e150-11e6-a5af-080027a79e8f")
.id("993d63bd-e151-11e6-a5af-080027a79e8f")
.reason("Director's fees for March")
.shortReference("BT-20200118-VMSCBS")
.sourceAccountId("a7117404-e150-11e6-a5af-080027a79e8f")
.status("completed")
.uniqueRequestId("1234567890abc")
.updatedAt("2023-01-18T14:08:34.000Z")
.build()`

### Create Transfer <a name="create"></a>

Transfers funds from one account to another. No currency conversion is performed, so the sending and receiving accounts must hold money in the same currency.

**API Endpoint**: `POST /transfers/create`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `amount` | ✓ | Amount | `123.0` |
| `currency` | ✓ | Three-letter ISO currency code. | `"string"` |
| `destinationAccountId` | ✓ | Account UUID of the receiving account. | `"string"` |
| `sourceAccountId` | ✓ | Account UUID of the paying account. | `"string"` |
| `reason` | ✗ | User-generated reason for transfer, freeform text. | `"string"` |
| `uniqueRequestId` | ✗ | User-generated idempotency key. The value must be 100 characters or fewer. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.Transfer;
import com.currencycloud.sdk.resources.transfers.params.CreateRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Transfer res = client.transfers().create(CreateRequest
               .builder()
               .amount(123.45)
               .currency("string")
               .destinationAccountId("string")
               .sourceAccountId("string")
               .build());
```

#### Response

##### Type
[Transfer](/src/main/java/com/currencycloud/sdk/model/Transfer.java)

##### Example
`Transfer
.builder()
.amount("1250.00")
.completedAt("2023-01-18T14:08:34.000Z")
.createdAt("2023-01-18T14:08:34.000Z")
.creatorAccountId("30cb8632-e152-11e6-a5af-080027a79e8f")
.creatorContactId("262e3d2a-e152-11e6-a5af-080027a79e8f")
.currency("GBP")
.destinationAccountId("946f2d58-e150-11e6-a5af-080027a79e8f")
.id("993d63bd-e151-11e6-a5af-080027a79e8f")
.reason("Director's fees for March")
.shortReference("BT-20200118-VMSCBS")
.sourceAccountId("a7117404-e150-11e6-a5af-080027a79e8f")
.status("completed")
.uniqueRequestId("1234567890abc")
.updatedAt("2023-01-18T14:08:34.000Z")
.build()`

### Cancel Transfer <a name="cancel"></a>

Requests that a transfer be cancelled.

**API Endpoint**: `POST /transfers/{id}/cancel`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | ID of the transfer to be cancelled. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.Transfer;
import com.currencycloud.sdk.resources.transfers.params.CancelRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Transfer res = client.transfers().cancel(CancelRequest
               .builder()
               .id("string")
               .build());
```

#### Response

##### Type
[Transfer](/src/main/java/com/currencycloud/sdk/model/Transfer.java)

##### Example
`Transfer
.builder()
.amount("1250.00")
.completedAt("2023-01-18T14:08:34.000Z")
.createdAt("2023-01-18T14:08:34.000Z")
.creatorAccountId("30cb8632-e152-11e6-a5af-080027a79e8f")
.creatorContactId("262e3d2a-e152-11e6-a5af-080027a79e8f")
.currency("GBP")
.destinationAccountId("946f2d58-e150-11e6-a5af-080027a79e8f")
.id("993d63bd-e151-11e6-a5af-080027a79e8f")
.reason("Director's fees for March")
.shortReference("BT-20200118-VMSCBS")
.sourceAccountId("a7117404-e150-11e6-a5af-080027a79e8f")
.status("completed")
.uniqueRequestId("1234567890abc")
.updatedAt("2023-01-18T14:08:34.000Z")
.build()`

