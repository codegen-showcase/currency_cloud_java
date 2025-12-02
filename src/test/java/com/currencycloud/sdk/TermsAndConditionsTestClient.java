
package com.currencycloud.sdk;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.model.TermsAndConditionsAcceptBodyReferenceTypeEnum;
import com.currencycloud.sdk.model.TermsAndConditionsAcceptBodyTypeEnum;
import com.currencycloud.sdk.model.TermsAndConditionsAcceptBodyVersionEnum;
import com.currencycloud.sdk.resources.termsandconditions.params.AcceptRequest;
import org.junit.jupiter.api.Test;


public final class TermsAndConditionsTestClient {
    @Test
    void testAccept200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.termsAndConditions().accept(AcceptRequest
                                               .builder()
                                               .email("string")
                                               .firstName("string")
                                               .lastName("string")
                                               .referenceId("string")
                                               .referenceType(TermsAndConditionsAcceptBodyReferenceTypeEnum.ACCOUNT)
                                               .type(TermsAndConditionsAcceptBodyTypeEnum.VGSI)
                                               .version(TermsAndConditionsAcceptBodyVersionEnum.ENUM_1_0)
                                               .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
}
