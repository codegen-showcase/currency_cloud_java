# payers

## Module Functions

### Get Payer <a name="get"></a>

Get a payer record.

**API Endpoint**: `GET /payers/{id}`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | Payer UUID. | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.Payer;
import com.currencycloud.sdk.resources.payers.params.GetRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Payer res = client.payers().get(GetRequest
                                .builder()
                                .id("string")
                                .build());
```

#### Response

##### Type
[Payer](/src/main/java/com/currencycloud/sdk/model/Payer.java)

##### Example
`Payer
.builder()
.address(List.of(
"164 Bishopsgate",
"London"
))
.city("London")
.companyName("Acme Corporation")
.country("GB")
.createdAt("2023-12-31T23:59:59.000Z")
.dateOfBirth("2023-12-31T23:59:59.000Z")
.firstName("")
.id("543477161-91de-012f-e284-1e0030c7f3123")
.identificationType("incorporation_number")
.identificationValue("123123")
.lastName("")
.legalEntityType(PayerLegalEntityTypeEnum.COMPANY)
.postcode("EC2M 4LX")
.stateOrProvince("")
.updatedAt("2023-12-31T23:59:59.000Z")
.build()`

