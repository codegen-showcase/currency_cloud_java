# collectionsscreening

## Module Functions

### Accept or Reject Inbound Transaction <a name="complete"></a>

Allows you to accept or reject an inbound transaction before the funds are credited to the beneficiary’s account.

**API Endpoint**: `PUT /collections_screening/{transactionId}/complete`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `accepted` | ✓ | Should the transaction be accepted - true or false. | `true` |
| `reason` | ✓ | Reason for acceptance or rejection. If "accepted" is true, the value should be "accepted". If "accepted" is false, the value should be one of the other values.  | `CollectionsScreeningCompleteBodyReasonEnum.ACCEPTED` |
| `transactionId` | ✓ | The related_entity_id from the Cash Manager notification. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.CollectionsScreeningCompleteBodyReasonEnum;
import com.currencycloud.sdk.model.CollectionsScreeningCompleteResponse;
import com.currencycloud.sdk.resources.collectionsscreening.params.CompleteRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
CollectionsScreeningCompleteResponse res = client.collectionsScreening().complete(CompleteRequest
        .builder()
        .accepted(true)
        .reason(CollectionsScreeningCompleteBodyReasonEnum.ACCEPTED)
        .transactionId("string")
        .build());
```

#### Response

##### Type
[CollectionsScreeningCompleteResponse](/src/main/java/com/currencycloud/sdk/model/CollectionsScreeningCompleteResponse.java)

##### Example
`CollectionsScreeningCompleteResponse
.builder()
.accountId("7a116d7d-6310-40ae-8d54-0ffbe41dc1c9")
.houseAccountId("7a116d7d-6310-40ae-8d54-0ffbe41dc1c9")
.transactionId("bdcca5e6-32fe-45f6-9476-6f8f518e6270")
.build()`

