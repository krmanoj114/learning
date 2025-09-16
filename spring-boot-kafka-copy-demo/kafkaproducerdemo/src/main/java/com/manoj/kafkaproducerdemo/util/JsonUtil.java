package com.manoj.kafkaproducerdemo.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonUtil {
    public static <T> String convertObjToJsonStr(T obj) {
        String jsonStringReq = null;
        ObjectMapper objMapper = new ObjectMapper() ;
        try {
            jsonStringReq = objMapper.writeValueAsString(obj);

        }catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return jsonStringReq;
    }

    public static <T> T convertJsonStrToObject(String jsonStrRes,Class<T> classArg){

        ObjectMapper mapper = new ObjectMapper();
        T resObj = null;
        try {
            resObj = mapper.readValue(jsonStrRes, classArg);
        }catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return resObj;
    }

    public static <T> T readJsonFile(Class<T> classArg,String filePath){

        T resObj = null;
        try {
            byte[] encoded = Files.readAllBytes(Paths.get(filePath));
            String json =  new String(encoded, Charset.defaultCharset());
            resObj = convertJsonStrToObject(json, classArg);
        } catch (IOException e) {
            System.out.println("Error occured while reading Json :"+e.getMessage());
        }
         return resObj;
    }

   /* public static void main(String[] args) {

        UpgradeInfoResponse upgradeInfo = new UpgradeInfoResponse();
        OrderUpgradeDetailsResponse orderUpgDtlResp = new OrderUpgradeDetailsResponse();

        Metadata metadata = new Metadata();
        metadata.setQueryParams("QueryParams");
        metadata.setDateTime("10MAY2017");
        metadata.setRecordCount("1");
        Status status = new Status();
        status.setCode("SUC");
        status.setDescription("success");
        metadata.setStatus(status);


        List<DataExtension> dataExtensions = new ArrayList<DataExtension>();

        DataExtension dataExtension = new DataExtension();
        dataExtension.setName("Pax1");
        dataExtension.setValue("Val1");
        dataExtensions.add(dataExtension);

        dataExtension = new DataExtension();
        dataExtension.setName("Pax2");
        dataExtension.setValue("Val2");
        dataExtensions.add(dataExtension);
        metadata.setDataExtension(dataExtensions);
        //dataExtension.setPassengerCount("2");
        //metadata.setDataExtension(dataExtension);

        orderUpgDtlResp.setMetadata(metadata);

        Records records = new Records();
        //orderUpgDtlResp.setRecords(records);
		*//*Pnr pnr = new Pnr();
		pnr.setBookingReference("PNRAAA");
		pnr.setCreationDate("10MAY2017");*//*
        records.setBookingReference("PNRAAA");
        records.setCreationDate("10MAY2017");

        List<Passenger> passengers = new ArrayList<Passenger>();
        records.setPassengers(passengers);

        Passenger passenger = new Passenger();

        passenger.setPnrPassengerName("Pax1");
        Name name = new Name();
        name.setFirstName("Pax1FirstName");
        name.setLastName("Pax1LastName");
        //name.setMiddleName("Pax1MiddleName");
        name.setSalutation("Mr");
        passenger.setName(name);
        passengers.add(passenger);

        LastUpgrade lastUpgrade = new LastUpgrade();
        lastUpgrade.setUpgradeType("CASH");
        lastUpgrade.setUpgradedDate("10MAY2017");
        lastUpgrade.setBoardPoint("DXB");
        lastUpgrade.setOffPoint("LHR");
        lastUpgrade.setFormOfPayment("CASH");
        lastUpgrade.setFromClass("B");
        lastUpgrade.setToClass("F");

        passenger.setLastUpgrade(lastUpgrade);

        List<CustomerId> customerIds = new ArrayList<CustomerId>();
        CustomerId customerId = new CustomerId();
        customerId.setName("Pax1");
        customerId.setValue("Val2");
        customerIds.add(customerId);
        passenger.setCustomerIds(customerIds);
        passengers.add(passenger);
        List<Loyalty> loyalties = new ArrayList<Loyalty>();
        Loyalty loyalty = new Loyalty();
        loyalty.setNumber("998904432");
        loyalty.setCarrier("EK");
        loyalty.setIsUsedOnOrder(true);
        loyalty.setIsValidated(true);
        loyalty.setTier("1");
        loyalties.add(loyalty);
        passenger.setLoyalty(loyalties);

        upgradeInfo.setOrderUpgradeDetailsResponse(orderUpgDtlResp);

        String convertObjToJsonStr = convertObjToJsonStr(upgradeInfo);

        System.out.println("upgradeInfo   :  "+convertObjToJsonStr);


        //UpgradeEligibilityCheckRequestDTO upgradeEligibilityCheckRequest = new UpgradeEligibilityCheckRequestDTO();

        ClientInfoDTO clientInfo = new ClientInfoDTO();
        //upgradeEligibilityCheckRequest.setClientInfo(clientInfo);
        clientInfo.setUid("aibH0M6cf7yoQxWyTouu0cjw");
        clientInfo.setModuleCode("OLCI_UPG_CHK");
        clientInfo.setBrowserver("10.14.132.5");
        clientInfo.setChannelCode("WEB");
        clientInfo.setClientIP("10.12.12.232");
        clientInfo.setCountrySite("us");
        clientInfo.setDeviceID("4dd2d9e795dc0c6b3e0d6328ff72108b079e07f2c5f1dd4a6e8abd5d8286675a");
        clientInfo.setLanguageCode("en");
        clientInfo.setPlatform("WEB");
        clientInfo.setStartTime("2017-03-22 16:42:30.102");
        clientInfo.setVersion("4.6.217");

		*//*UpgradeEligibilityRequestDTO updateEligibilityCheck = new UpgradeEligibilityRequestDTO();
		updateEligibilityCheck.setPnr("PNRAA12");
		updateEligibilityCheck.setFlightNo("EK0202");
		updateEligibilityCheck.setFlightDate("12APR2017");
		updateEligibilityCheck.setEligibleForMilesUpgrade(true);
		updateEligibilityCheck.setEligibleForCashUpgrade(true);

		upgradeEligibilityCheckRequest.setUpdateEligibilityCheck(updateEligibilityCheck);

		convertObjToJsonStr = convertObjToJsonStr(upgradeEligibilityCheckRequest);*//*

        System.out.println("upgradeEligibilityCheckRequest   :  "+convertObjToJsonStr);

    }*/
}
