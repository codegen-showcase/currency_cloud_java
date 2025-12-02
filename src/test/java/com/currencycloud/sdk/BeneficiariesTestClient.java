
package com.currencycloud.sdk;

import java.util.List;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.model.BeneficiariesAccountVerificationBodyBeneficiaryEntityTypeEnum;
import com.currencycloud.sdk.model.BeneficiariesAccountVerificationBodyPaymentTypeEnum;
import com.currencycloud.sdk.model.BeneficiariesCreateBodyBankAccountTypeEnum;
import com.currencycloud.sdk.model.BeneficiariesCreateBodyBeneficiaryEntityTypeEnum;
import com.currencycloud.sdk.model.BeneficiariesCreateBodyBeneficiaryIdentificationTypeEnum;
import com.currencycloud.sdk.model.BeneficiariesCreateBodyPaymentTypesItemEnum;
import com.currencycloud.sdk.model.BeneficiariesCreateBodyRoutingCodeType1Enum;
import com.currencycloud.sdk.model.BeneficiariesCreateBodyRoutingCodeType2Enum;
import com.currencycloud.sdk.model.BeneficiariesFindBodyBankAccountTypeEnum;
import com.currencycloud.sdk.model.BeneficiariesFindBodyBeneficiaryEntityTypeEnum;
import com.currencycloud.sdk.model.BeneficiariesFindBodyOrderAscDescEnum;
import com.currencycloud.sdk.model.BeneficiariesFindBodyRoutingCodeType0Enum;
import com.currencycloud.sdk.model.BeneficiariesFindBodyScopeEnum;
import com.currencycloud.sdk.model.BeneficiariesUpdateBodyBankAccountTypeEnum;
import com.currencycloud.sdk.model.BeneficiariesUpdateBodyBeneficiaryEntityTypeEnum;
import com.currencycloud.sdk.model.BeneficiariesUpdateBodyBeneficiaryIdentificationTypeEnum;
import com.currencycloud.sdk.model.BeneficiariesUpdateBodyPaymentTypesItemEnum;
import com.currencycloud.sdk.model.BeneficiariesUpdateBodyRoutingCodeType1Enum;
import com.currencycloud.sdk.model.BeneficiariesUpdateBodyRoutingCodeType2Enum;
import com.currencycloud.sdk.model.BeneficiariesValidateBodyBankAccountTypeEnum;
import com.currencycloud.sdk.model.BeneficiariesValidateBodyBeneficiaryEntityTypeEnum;
import com.currencycloud.sdk.model.BeneficiariesValidateBodyBeneficiaryIdentificationTypeEnum;
import com.currencycloud.sdk.model.BeneficiariesValidateBodyPaymentTypesItemEnum;
import com.currencycloud.sdk.model.BeneficiariesValidateBodyRoutingCodeType1Enum;
import com.currencycloud.sdk.model.BeneficiariesValidateBodyRoutingCodeType2Enum;
import com.currencycloud.sdk.resources.beneficiaries.params.AccountVerificationRequest;
import com.currencycloud.sdk.resources.beneficiaries.params.CreateRequest;
import com.currencycloud.sdk.resources.beneficiaries.params.DeleteRequest;
import com.currencycloud.sdk.resources.beneficiaries.params.FindRequest;
import com.currencycloud.sdk.resources.beneficiaries.params.GetRequest;
import com.currencycloud.sdk.resources.beneficiaries.params.UpdateRequest;
import com.currencycloud.sdk.resources.beneficiaries.params.ValidateRequest;
import org.junit.jupiter.api.Test;


public final class BeneficiariesTestClient {
    @Test
    void testGet200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.beneficiaries().get(GetRequest
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
    void testGet200SuccessRequiredOnly() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.beneficiaries().get(GetRequest
                                       .builder()
                                       .id("string")
                                       .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testAccountVerification200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.beneficiaries().accountVerification(AccountVerificationRequest
                    .builder()
                    .accountNumber("string")
                    .bankCountry("string")
                    .beneficiaryCompanyName("string")
                    .beneficiaryEntityType(BeneficiariesAccountVerificationBodyBeneficiaryEntityTypeEnum.COMPANY)
                    .beneficiaryFirstName("string")
                    .beneficiaryLastName("string")
                    .bicSwift("string")
                    .currency("string")
                    .iban("string")
                    .paymentType(BeneficiariesAccountVerificationBodyPaymentTypeEnum.PRIORITY)
                    .routingCodeType1("string")
                    .routingCodeType2("string")
                    .routingCodeValue1("string")
                    .routingCodeValue2("string")
                    .secondaryReferenceData("string")
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
            client.beneficiaries().create(CreateRequest
                                          .builder()
                                          .accountNumber("string")
                                          .bankAccountHolderName("string")
                                          .bankAccountType(BeneficiariesCreateBodyBankAccountTypeEnum.CHECKING)
                                          .bankAddress("string")
                                          .bankCountry("string")
                                          .bankName("string")
                                          .beneficiaryAddress("string")
                                          .beneficiaryCity("string")
                                          .beneficiaryCompanyName("string")
                                          .beneficiaryCountry("string")
                                          .beneficiaryDateOfBirth("string")
                                          .beneficiaryEntityType(BeneficiariesCreateBodyBeneficiaryEntityTypeEnum.COMPANY)
                                          .beneficiaryExternalReference("string")
                                          .beneficiaryFirstName("string")
                                          .beneficiaryIdentificationType(
                                              BeneficiariesCreateBodyBeneficiaryIdentificationTypeEnum.CITIZENSHIP_PAPERS)
                                          .beneficiaryIdentificationValue("string")
                                          .beneficiaryLastName("string")
                                          .beneficiaryPostcode("string")
                                          .beneficiaryStateOrProvince("string")
                                          .bicSwift("string")
                                          .businessNature("string")
                                          .companyWebsite("string")
                                          .currency("string")
                                          .defaultBeneficiary(true)
                                          .email("string")
                                          .iban("string")
                                          .name("string")
                                          .onBehalfOf("string")
                                          .paymentTypes(List.of(
                                                  BeneficiariesCreateBodyPaymentTypesItemEnum.PRIORITY
                                                  ))
                                          .routingCodeType1(BeneficiariesCreateBodyRoutingCodeType1Enum.ABA)
                                          .routingCodeType2(BeneficiariesCreateBodyRoutingCodeType2Enum.ABA)
                                          .routingCodeValue1("string")
                                          .routingCodeValue2("string")
                                          .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
    @Test
    void testFind200SuccessAllParams() {
        Client client = Client
                        .builder()
                        .environment(Environment.MOCK_SERVER)
                        .withAuthToken("API_KEY")
                        .build();

        try {
            client.beneficiaries().find(FindRequest
                                        .builder()
                                        .accountNumber("string")
                                        .bankAccountHolderName("string")
                                        .bankAccountType(BeneficiariesFindBodyBankAccountTypeEnum.CHECKING)
                                        .bankName("string")
                                        .beneficiaryCity("string")
                                        .beneficiaryCompanyName("string")
                                        .beneficiaryCountry("string")
                                        .beneficiaryDateOfBirth("1970-01-01")
                                        .beneficiaryEntityType(BeneficiariesFindBodyBeneficiaryEntityTypeEnum.COMPANY)
                                        .beneficiaryExternalReference("string")
                                        .beneficiaryFirstName("string")
                                        .beneficiaryLastName("string")
                                        .beneficiaryPostcode("string")
                                        .beneficiaryStateOrProvince("string")
                                        .bicSwift("string")
                                        .currency("string")
                                        .defaultBeneficiary(true)
                                        .iban("string")
                                        .name("string")
                                        .onBehalfOf("string")
                                        .order("string")
                                        .orderAscDesc(BeneficiariesFindBodyOrderAscDescEnum.ASC)
                                        .page(123L)
                                        .perPage(123L)
                                        .routingCodeType0(BeneficiariesFindBodyRoutingCodeType0Enum.ABA)
                                        .routingCodeValue0("string")
                                        .scope(BeneficiariesFindBodyScopeEnum.ALL)
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
            client.beneficiaries().validate(ValidateRequest
                                            .builder()
                                            .accountNumber("string")
                                            .bankAccountType(BeneficiariesValidateBodyBankAccountTypeEnum.CHECKING)
                                            .bankAddress("string")
                                            .bankCountry("string")
                                            .bankName("string")
                                            .beneficiaryAddress("string")
                                            .beneficiaryCity("string")
                                            .beneficiaryCompanyName("string")
                                            .beneficiaryCountry("string")
                                            .beneficiaryDateOfBirth("string")
                                            .beneficiaryEntityType(BeneficiariesValidateBodyBeneficiaryEntityTypeEnum.COMPANY)
                                            .beneficiaryFirstName("string")
                                            .beneficiaryIdentificationType(
                                                BeneficiariesValidateBodyBeneficiaryIdentificationTypeEnum.CITIZENSHIP_PAPERS)
                                            .beneficiaryIdentificationValue("string")
                                            .beneficiaryLastName("string")
                                            .beneficiaryPostcode("string")
                                            .beneficiaryStateOrProvince("string")
                                            .bicSwift("string")
                                            .currency("string")
                                            .iban("string")
                                            .onBehalfOf("string")
                                            .paymentTypes(List.of(
                                                    BeneficiariesValidateBodyPaymentTypesItemEnum.PRIORITY
                                                    ))
                                            .routingCodeType1(BeneficiariesValidateBodyRoutingCodeType1Enum.ABA)
                                            .routingCodeType2(BeneficiariesValidateBodyRoutingCodeType2Enum.ABA)
                                            .routingCodeValue1("string")
                                            .routingCodeValue2("string")
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
            client.beneficiaries().update(UpdateRequest
                                          .builder()
                                          .accountNumber("string")
                                          .bankAccountHolderName("string")
                                          .bankAccountType(BeneficiariesUpdateBodyBankAccountTypeEnum.CHECKING)
                                          .bankAddress("string")
                                          .bankCountry("string")
                                          .bankName("string")
                                          .beneficiaryAddress("string")
                                          .beneficiaryCity("string")
                                          .beneficiaryCompanyName("string")
                                          .beneficiaryCountry("string")
                                          .beneficiaryDateOfBirth("string")
                                          .beneficiaryEntityType(BeneficiariesUpdateBodyBeneficiaryEntityTypeEnum.COMPANY)
                                          .beneficiaryExternalReference("string")
                                          .beneficiaryFirstName("string")
                                          .beneficiaryIdentificationType(
                                              BeneficiariesUpdateBodyBeneficiaryIdentificationTypeEnum.CITIZENSHIP_PAPERS)
                                          .beneficiaryIdentificationValue("string")
                                          .beneficiaryLastName("string")
                                          .beneficiaryPostcode("string")
                                          .beneficiaryStateOrProvince("1970-01-01")
                                          .bicSwift("string")
                                          .businessNature("string")
                                          .companyWebsite("string")
                                          .currency("string")
                                          .defaultBeneficiary(true)
                                          .email("string")
                                          .iban("string")
                                          .name("string")
                                          .onBehalfOf("string")
                                          .paymentTypes(List.of(
                                                  BeneficiariesUpdateBodyPaymentTypesItemEnum.PRIORITY
                                                  ))
                                          .routingCodeType1(BeneficiariesUpdateBodyRoutingCodeType1Enum.ABA)
                                          .routingCodeType2(BeneficiariesUpdateBodyRoutingCodeType2Enum.ABA)
                                          .routingCodeValue1("string")
                                          .routingCodeValue2("string")
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
            client.beneficiaries().delete(DeleteRequest
                                          .builder()
                                          .onBehalfOf("string")
                                          .id("string")
                                          .build());
        } catch (ApiException e) {
            System.err.println("Error msg: " + e.toString());
            throw e;
        }
    }
}
