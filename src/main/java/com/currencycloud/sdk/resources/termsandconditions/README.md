# termsandconditions

## Module Functions

### Accept Terms of Use <a name="accept"></a>

Endpoint for accounts using our Outsourced KYC model to accept Terms of Use.

**API Endpoint**: `POST /terms_and_conditions/accept`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `email` | ✓ | The email of the user accepting the Terms of Use. Length must be between 1 and 255 characters. <br> Regex:  /^[\w\.\_\%\-\+]+@([\w-]+\.)+\w{2,}+$/ | `"string"` |
| `firstName` | ✓ | The first name of the user accepting the Terms of Use. Must be between 1 and 100 characters in length and not contain < or >. | `"string"` |
| `lastName` | ✓ | The last name of the user accepting the Terms of Use. Must be between 1 and 100 characters in length and not contain < or >. | `"string"` |
| `referenceId` | ✓ | The account / sub-account UUID that the Terms of Use are being accepted for. | `"string"` |
| `referenceType` | ✓ | The type of reference accepting the Terms of Use. | `TermsAndConditionsAcceptBodyReferenceTypeEnum.ACCOUNT` |
| `type` | ✓ | The type of Terms of Use the user is accepting. | `TermsAndConditionsAcceptBodyTypeEnum.VGSI` |
| `version` | ✓ | The version of the Terms of Use the user is accepting. | `TermsAndConditionsAcceptBodyVersionEnum.ENUM_1_0` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.AcceptTermsResponse;
import com.currencycloud.sdk.model.TermsAndConditionsAcceptBodyReferenceTypeEnum;
import com.currencycloud.sdk.model.TermsAndConditionsAcceptBodyTypeEnum;
import com.currencycloud.sdk.model.TermsAndConditionsAcceptBodyVersionEnum;
import com.currencycloud.sdk.resources.termsandconditions.params.AcceptRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
AcceptTermsResponse res = client.termsAndConditions().accept(AcceptRequest
                          .builder()
                          .email("string")
                          .firstName("string")
                          .lastName("string")
                          .referenceId("string")
                          .referenceType(TermsAndConditionsAcceptBodyReferenceTypeEnum.ACCOUNT)
                          .type(TermsAndConditionsAcceptBodyTypeEnum.VGSI)
                          .version(TermsAndConditionsAcceptBodyVersionEnum.ENUM_1_0)
                          .build());
```

#### Response

##### Type
[AcceptTermsResponse](/src/main/java/com/currencycloud/sdk/model/AcceptTermsResponse.java)

##### Example
`AcceptTermsResponse
.builder()
.build()`

