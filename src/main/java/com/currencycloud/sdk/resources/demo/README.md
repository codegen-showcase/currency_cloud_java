# demo

## Module Functions

### Emulate inbound funds <a name="simulate_funding"></a>

Triggers a production-like flow for processing funds, topping up CM balance or rejecting the transaction without topping up CM balance. This resource is only available in the Currencycloud Demo environment; it is not implemented in the Production environment.

**API Endpoint**: `POST /demo/funding/create`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `amount` | ✓ | Amount of the emulated transaction. | `123.0` |
| `currency` | ✓ | Three-digit currency code. | `"string"` |
| `id` | ✓ | Unique value in UUID format, user-generated with each request. | `"string"` |
| `receiverAccountNumber` | ✓ | A client's virtual account number or its sub-account (as seen in Find Funding Accounts). | `"string"` |
| `action` | ✗ | Allows you to trigger approval or rejection behaviour. | `DemoSimulateFundingBodyActionEnum.APPROVE` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |
| `receiverRoutingCode` | ✗ | A client's virtual account routing code or its sub-account (as seen in Find Funding Accounts). | `"string"` |
| `senderAccountNumber` | ✗ | Sender account number. | `"string"` |
| `senderAddress` | ✗ | Sender's address. | `"string"` |
| `senderCountry` | ✗ | Two character ISO sender country code. | `"string"` |
| `senderName` | ✗ | Sender's name. | `"string"` |
| `senderReference` | ✗ | Sender reference. | `"string"` |
| `senderRoutingCode` | ✗ | Sender routing code. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.SimulateFunding;
import com.currencycloud.sdk.resources.demo.params.SimulateFundingRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
SimulateFunding res = client.demo().simulateFunding(SimulateFundingRequest
                      .builder()
                      .amount(123.45)
                      .currency("string")
                      .id("string")
                      .receiverAccountNumber("string")
                      .build());
```

#### Response

##### Type
[SimulateFunding](/src/main/java/com/currencycloud/sdk/model/SimulateFunding.java)

##### Example
`SimulateFunding
.builder()
.accountId("2090939e-b2f7-3f2b-1363-4d235b3f58af")
.action(SimulateFundingActionEnum.REJECT)
.amount("150.53")
.createdAt("2018-05-14T14:18:30Z")
.currency("GBP")
.id("2090939e-b2f7-3f2b-1363-jfy28d74kc72")
.receiverAccountNumber("22213332")
.receiverRoutingCode("776813")
.senderAccountNumber("22223333")
.senderAddress("Some Street")
.senderCountry("GB")
.senderName("Mr. Sender")
.senderReference("sender-ref\"")
.senderRoutingCode("222333")
.shortReference("REF-22122")
.state("pending")
.updatedAt("2018-05-14T14:18:30Z")
.build()`

