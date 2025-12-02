
package com.currencycloud.sdk;

import java.util.List;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.model.PaymentsCreateBodyChargeTypeEnum;
import com.currencycloud.sdk.model.PaymentsCreateBodyPayerEntityTypeEnum;
import com.currencycloud.sdk.model.PaymentsCreateBodyPayerIdentificationTypeEnum;
import com.currencycloud.sdk.model.PaymentsCreateBodyPaymentTypeEnum;
import com.currencycloud.sdk.model.PaymentsFindChargeTypeEnum;
import com.currencycloud.sdk.model.PaymentsFindOrderAscDescEnum;
import com.currencycloud.sdk.model.PaymentsFindReviewStatusEnum;
import com.currencycloud.sdk.model.PaymentsFindScopeEnum;
import com.currencycloud.sdk.model.PaymentsFindStatusEnum;
import com.currencycloud.sdk.model.PaymentsGetDeliveryDatePaymentTypeEnum;
import com.currencycloud.sdk.model.PaymentsGetPaymentFeesOrderAscDescEnum;
import com.currencycloud.sdk.model.PaymentsGetReviewStatusEnum;
import com.currencycloud.sdk.model.PaymentsQuotePaymentFeeChargeTypeEnum;
import com.currencycloud.sdk.model.PaymentsQuotePaymentFeePaymentTypeEnum;
import com.currencycloud.sdk.model.PaymentsRetryNotificationsNotificationTypeEnum;
import com.currencycloud.sdk.model.PaymentsUpdateBodyChargeTypeEnum;
import com.currencycloud.sdk.model.PaymentsUpdateBodyPayerEntityTypeEnum;
import com.currencycloud.sdk.model.PaymentsUpdateBodyPayerIdentificationTypeEnum;
import com.currencycloud.sdk.model.PaymentsUpdateBodyPaymentTypeEnum;
import com.currencycloud.sdk.model.PaymentsValidateBodyChargeTypeEnum;
import com.currencycloud.sdk.model.PaymentsValidateBodyPayerEntityTypeEnum;
import com.currencycloud.sdk.model.PaymentsValidateBodyPayerIdentificationTypeEnum;
import com.currencycloud.sdk.model.PaymentsValidateBodyPaymentTypeEnum;
import com.currencycloud.sdk.resources.payments.params.AssignPaymentFeeRequest;
import com.currencycloud.sdk.resources.payments.params.AuthoriseRequest;
import com.currencycloud.sdk.resources.payments.params.ConfirmationRequest;
import com.currencycloud.sdk.resources.payments.params.CreateRequest;
import com.currencycloud.sdk.resources.payments.params.DeleteRequest;
import com.currencycloud.sdk.resources.payments.params.FindRequest;
import com.currencycloud.sdk.resources.payments.params.GetDeliveryDateRequest;
import com.currencycloud.sdk.resources.payments.params.GetPaymentFeesRequest;
import com.currencycloud.sdk.resources.payments.params.GetRequest;
import com.currencycloud.sdk.resources.payments.params.GetSubmissionInfoRequest;
import com.currencycloud.sdk.resources.payments.params.GetTrackingInfoRequest;
import com.currencycloud.sdk.resources.payments.params.QuotePaymentFeeRequest;
import com.currencycloud.sdk.resources.payments.params.RetryNotificationsRequest;
import com.currencycloud.sdk.resources.payments.params.UnassignPaymentFeeRequest;
import com.currencycloud.sdk.resources.payments.params.UpdateRequest;
import com.currencycloud.sdk.resources.payments.params.ValidateRequest;
import org.junit.jupiter.api.Test;


public final class PaymentsTestClient {
    @Test
    void testFind200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.payments().find(FindRequest
                                   .builder()
                                   .amount("string")
                                   .amountFrom("string")
                                   .amountTo("string")
                                   .beneficiaryId("string")
                                   .bulkUploadId("string")
                                   .chargeType(PaymentsFindChargeTypeEnum.OURS)
                                   .conversionId("string")
                                   .createdAtFrom("1970-01-01T00:00:00")
                                   .createdAtTo("1970-01-01T00:00:00")
                                   .currency("string")
                                   .onBehalfOf("string")
                                   .order("string")
                                   .orderAscDesc(PaymentsFindOrderAscDescEnum.ASC)
                                   .page(123L)
                                   .paymentDateFrom("1970-01-01")
                                   .paymentDateTo("1970-01-01")
                                   .paymentGroupId("string")
                                   .perPage(123L)
                                   .reason("string")
                                   .reviewStatus(PaymentsFindReviewStatusEnum.IN_REVIEW)
                                   .scope(PaymentsFindScopeEnum.ALL)
                                   .shortReference("string")
                                   .status(PaymentsFindStatusEnum.AUTHORISED)
                                   .transferredAtFrom("1970-01-01T00:00:00")
                                   .transferredAtTo("1970-01-01T00:00:00")
                                   .uniqueRequestId("string")
                                   .updatedAtFrom("1970-01-01T00:00:00")
                                   .updatedAtTo("1970-01-01T00:00:00")
                                   .withDeleted(true)
                                   .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testFind200SuccessRequiredOnly() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.payments().find(FindRequest
                                   .builder()
                                   .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGetDeliveryDate200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.payments().getDeliveryDate(GetDeliveryDateRequest
                                              .builder()
                                              .bankCountry("string")
                                              .currency("string")
                                              .paymentDate("string")
                                              .paymentType(PaymentsGetDeliveryDatePaymentTypeEnum.PRIORITY)
                                              .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGetPaymentFees200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.payments().getPaymentFees(GetPaymentFeesRequest
                                             .builder()
                                             .order("string")
                                             .orderAscDesc(PaymentsGetPaymentFeesOrderAscDescEnum.ASC)
                                             .page(123L)
                                             .perPage(123L)
                                             .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGetPaymentFees200SuccessRequiredOnly() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.payments().getPaymentFees(GetPaymentFeesRequest
                                             .builder()
                                             .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testQuotePaymentFee200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.payments().quotePaymentFee(QuotePaymentFeeRequest
                                              .builder()
                                              .paymentCurrency("string")
                                              .paymentDestinationCountry("string")
                                              .paymentType(PaymentsQuotePaymentFeePaymentTypeEnum.PRIORITY)
                                              .accountId("string")
                                              .chargeType(PaymentsQuotePaymentFeeChargeTypeEnum.OURS)
                                              .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testQuotePaymentFee200SuccessRequiredOnly() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.payments().quotePaymentFee(QuotePaymentFeeRequest
                                              .builder()
                                              .paymentCurrency("string")
                                              .paymentDestinationCountry("string")
                                              .paymentType(PaymentsQuotePaymentFeePaymentTypeEnum.PRIORITY)
                                              .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGet200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.payments().get(GetRequest
                                  .builder()
                                  .id("string")
                                  .onBehalfOf("string")
                                  .reviewStatus(PaymentsGetReviewStatusEnum.IN_REVIEW)
                                  .withDeleted(true)
                                  .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGet200SuccessRequiredOnly() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.payments().get(GetRequest
                                  .builder()
                                  .id("string")
                                  .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testConfirmation200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.payments().confirmation(ConfirmationRequest
                                           .builder()
                                           .id("string")
                                           .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGetSubmissionInfo200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.payments().getSubmissionInfo(GetSubmissionInfoRequest
                                                .builder()
                                                .id("string")
                                                .onBehalfOf("string")
                                                .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGetSubmissionInfo200SuccessRequiredOnly() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.payments().getSubmissionInfo(GetSubmissionInfoRequest
                                                .builder()
                                                .id("string")
                                                .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testGetTrackingInfo200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.payments().getTrackingInfo(GetTrackingInfoRequest
                                              .builder()
                                              .id("string")
                                              .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testAssignPaymentFee200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.payments().assignPaymentFee(AssignPaymentFeeRequest
                                               .builder()
                                               .accountId("3e4666bf-d5e5-4aa7-b8ce-cefe41c7568a")
                                               .paymentFeeId("3e4666bf-d5e5-4aa7-b8ce-cefe41c7568a")
                                               .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testAuthorise200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.payments().authorise(AuthoriseRequest
                                        .builder()
                                        .paymentIds(List.of(
                                                "string"
                                                    ))
                                        .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testCreate200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.payments().create(CreateRequest
                                     .builder()
                                     .amount("string")
                                     .beneficiaryId("string")
                                     .chargeType(PaymentsCreateBodyChargeTypeEnum.OURS)
                                     .conversionId("string")
                                     .currency("string")
                                     .feeAmount("string")
                                     .feeCurrency("string")
                                     .invoiceDate("string")
                                     .invoiceNumber("string")
                                     .onBehalfOf("string")
                                     .payerAddress("string")
                                     .payerCity("string")
                                     .payerCompanyName("string")
                                     .payerCountry("string")
                                     .payerDateOfBirth("string")
                                     .payerEntityType(PaymentsCreateBodyPayerEntityTypeEnum.COMPANY)
                                     .payerFirstName("string")
                                     .payerIdentificationType(PaymentsCreateBodyPayerIdentificationTypeEnum.CITIZENSHIP_PAPERS)
                                     .payerIdentificationValue("string")
                                     .payerLastName("string")
                                     .payerPostcode("string")
                                     .payerStateOrProvince("string")
                                     .paymentDate("string")
                                     .paymentType(PaymentsCreateBodyPaymentTypeEnum.PRIORITY)
                                     .purposeCode("string")
                                     .reason("string")
                                     .reference("string")
                                     .ultimateBeneficiaryName("string")
                                     .uniqueRequestId("string")
                                     .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testUnassignPaymentFee200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.payments().unassignPaymentFee(UnassignPaymentFeeRequest
                                                 .builder()
                                                 .accountId("3e4666bf-d5e5-4aa7-b8ce-cefe41c7568a")
                                                 .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testValidate200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.payments().validate(ValidateRequest
                                       .builder()
                                       .amount("string")
                                       .beneficiaryId("string")
                                       .chargeType(PaymentsValidateBodyChargeTypeEnum.OURS)
                                       .conversionId("string")
                                       .currency("string")
                                       .feeAmount("string")
                                       .feeCurrency("string")
                                       .id("string")
                                       .onBehalfOf("string")
                                       .payerAddress("string")
                                       .payerCity("string")
                                       .payerCompanyName("string")
                                       .payerCountry("string")
                                       .payerDateOfBirth("string")
                                       .payerEntityType(PaymentsValidateBodyPayerEntityTypeEnum.COMPANY)
                                       .payerFirstName("string")
                                       .payerIdentificationType(PaymentsValidateBodyPayerIdentificationTypeEnum.CITIZENSHIP_PAPERS)
                                       .payerIdentificationValue("string")
                                       .payerLastName("string")
                                       .payerPostcode("string")
                                       .payerStateOrProvince("string")
                                       .paymentDate("string")
                                       .paymentType(PaymentsValidateBodyPaymentTypeEnum.PRIORITY)
                                       .purposeCode("string")
                                       .reason("string")
                                       .reference("string")
                                       .ultimateBeneficiaryName("string")
                                       .uniqueRequestId("string")
                                       .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testUpdate200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.payments().update(UpdateRequest
                                     .builder()
                                     .amount("string")
                                     .beneficiaryId("string")
                                     .chargeType(PaymentsUpdateBodyChargeTypeEnum.OURS)
                                     .conversionId("string")
                                     .currency("string")
                                     .feeAmount("string")
                                     .feeCurrency("string")
                                     .invoiceDate("string")
                                     .invoiceNumber("string")
                                     .onBehalfOf("string")
                                     .payerAddress("string")
                                     .payerCity("string")
                                     .payerCompanyName("string")
                                     .payerCountry("string")
                                     .payerDateOfBirth("string")
                                     .payerEntityType(PaymentsUpdateBodyPayerEntityTypeEnum.COMPANY)
                                     .payerFirstName("string")
                                     .payerIdentificationType(PaymentsUpdateBodyPayerIdentificationTypeEnum.CITIZENSHIP_PAPERS)
                                     .payerIdentificationValue("string")
                                     .payerLastName("string")
                                     .payerPostcode("string")
                                     .payerStateOrProvince("string")
                                     .paymentDate("string")
                                     .paymentType(PaymentsUpdateBodyPaymentTypeEnum.PRIORITY)
                                     .purposeCode("string")
                                     .reason("string")
                                     .reference("string")
                                     .ultimateBeneficiaryName("string")
                                     .id("string")
                                     .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testDelete200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.payments().delete(DeleteRequest
                                     .builder()
                                     .onBehalfOf("string")
                                     .id("string")
                                     .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testRetryNotifications200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.payments().retryNotifications(RetryNotificationsRequest
                                                 .builder()
                                                 .id("string")
                                                 .notificationType(PaymentsRetryNotificationsNotificationTypeEnum.PAYMENT_FAILED_NOTIFICATION)
                                                 .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
}
