
package com.currencycloud.sdk;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.model.ReferenceGetPayerRequiredDetailsPayerEntityTypeEnum;
import com.currencycloud.sdk.model.ReferenceGetPayerRequiredDetailsPaymentTypeEnum;
import com.currencycloud.sdk.model.ReferenceGetPaymentFeeRulesChargeTypeEnum;
import com.currencycloud.sdk.model.ReferenceGetPaymentFeeRulesPaymentTypeEnum;
import com.currencycloud.sdk.model.ReferenceGetPaymentPurposeCodesEntityTypeEnum;
import com.currencycloud.sdk.resources.reference.params.GetBeneficiaryRequirementsRequest;
import com.currencycloud.sdk.resources.reference.params.GetConversionDatesRequest;
import com.currencycloud.sdk.resources.reference.params.GetPayerRequiredDetailsRequest;
import com.currencycloud.sdk.resources.reference.params.GetPaymentDatesRequest;
import com.currencycloud.sdk.resources.reference.params.GetPaymentFeeRulesRequest;
import com.currencycloud.sdk.resources.reference.params.GetPaymentPurposeCodesRequest;
import com.currencycloud.sdk.resources.reference.params.GetSettlementAccountsRequest;
import org.junit.jupiter.api.Test;


public final class ReferenceTestClient {
    @Test
    void testGetBeneficiaryRequirements200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.reference().getBeneficiaryRequirements(GetBeneficiaryRequirementsRequest
                    .builder()
                    .bankAccountCountry("string")
                    .beneficiaryCountry("string")
                    .currency("string")
                    .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGetConversionDates200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.reference().getConversionDates(GetConversionDatesRequest
                                                  .builder()
                                                  .conversionPair("string")
                                                  .onBehalfOf("string")
                                                  .startDate("1970-01-01")
                                                  .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGetConversionDates200SuccessRequiredOnly() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.reference().getConversionDates(GetConversionDatesRequest
                                                  .builder()
                                                  .conversionPair("string")
                                                  .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGetAvailableCurrencies200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.reference().getAvailableCurrencies();
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGetPayerRequiredDetails200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.reference().getPayerRequiredDetails(GetPayerRequiredDetailsRequest
                    .builder()
                    .payerCountry("string")
                    .currency("string")
                    .payerEntityType(ReferenceGetPayerRequiredDetailsPayerEntityTypeEnum.COMPANY)
                    .paymentType(ReferenceGetPayerRequiredDetailsPaymentTypeEnum.PRIORITY)
                    .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGetPayerRequiredDetails200SuccessRequiredOnly() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.reference().getPayerRequiredDetails(GetPayerRequiredDetailsRequest
                    .builder()
                    .payerCountry("string")
                    .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGetPaymentDates200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.reference().getPaymentDates(GetPaymentDatesRequest
                                               .builder()
                                               .currency("string")
                                               .startDate("1970-01-01")
                                               .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGetPaymentDates200SuccessRequiredOnly() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.reference().getPaymentDates(GetPaymentDatesRequest
                                               .builder()
                                               .currency("string")
                                               .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGetPaymentFeeRules200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.reference().getPaymentFeeRules(GetPaymentFeeRulesRequest
                                                  .builder()
                                                  .accountId("string")
                                                  .chargeType(ReferenceGetPaymentFeeRulesChargeTypeEnum.OURS)
                                                  .paymentType(ReferenceGetPaymentFeeRulesPaymentTypeEnum.PRIORITY)
                                                  .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGetPaymentFeeRules200SuccessRequiredOnly() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.reference().getPaymentFeeRules(GetPaymentFeeRulesRequest
                                                  .builder()
                                                  .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGetPaymentPurposeCodes200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.reference().getPaymentPurposeCodes(GetPaymentPurposeCodesRequest
                    .builder()
                    .bankAccountCountry("string")
                    .currency("string")
                    .entityType(ReferenceGetPaymentPurposeCodesEntityTypeEnum.COMPANY)
                    .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGetPaymentPurposeCodes200SuccessRequiredOnly() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.reference().getPaymentPurposeCodes(GetPaymentPurposeCodesRequest
                    .builder()
                    .bankAccountCountry("string")
                    .currency("string")
                    .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGetSettlementAccounts200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.reference().getSettlementAccounts(GetSettlementAccountsRequest
                    .builder()
                    .accountId("string")
                    .currency("string")
                    .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGetSettlementAccounts200SuccessRequiredOnly() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.reference().getSettlementAccounts(GetSettlementAccountsRequest
                    .builder()
                    .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
}
