package OyctechService.LaptopService;

// LaptopService.java
//package com.service;

import OyctechService.ApplicationUtil.ApplicationUtil;
import OyctechService.InvalidLaptopException.InvalidLaptopException;
import OyctechService.Laptop.Laptop;
import OyctechService.LaptopDAO.LaptopDAO;
import com.dao.LaptopDAO;
import com.exception.InvalidLaptopException;
import com.model.Laptop;
import com.util.ApplicationUtil;

import java.util.ArrayList;
import java.util.List;

public class LaptopService {

    public boolean addServiceList(String[] input) {
        try {
            List<String> validRecords = ApplicationUtil.extractDetails(input);
            List<Laptop> serviceRecords = buildServiceList(validRecords);
            return insertServiceList(serviceRecords) > 0;
        } catch (InvalidLaptopException e) {
            System.out.println("Invalid laptop record: " + e.getMessage());
            return false;
        }
    }

    public static List<Laptop> buildServiceList(List<String> serviceRecords) {
        List<Laptop> objectList = new ArrayList<>();
        for (String record : serviceRecords) {
            String[] details = record.split(":");
            String hardwareId = details[0];
            String laptopName = details[1];
            String receivedDateStr = details[2];
            String rootIssue = details[3];
            String issueIntensity = details[4];

            java.util.Date receivedDate = ApplicationUtil.stringToDateConverter(receivedDateStr);
            double billAmount = calculateBillAmount(rootIssue, issueIntensity);

            Laptop laptop = new Laptop(hardwareId, laptopName, receivedDate, rootIssue, issueIntensity, billAmount);
            objectList.add(laptop);
        }
        return objectList;
    }

    public static double calculateBillAmount(String rootIssue, String issueIntensity) {
        double billCharges = 0;

        switch (rootIssue.toLowerCase()) {
            case "software":
                billCharges = 2000;
                break;
            case "display":
                billCharges = 5000;
                break;
            case "keyboard":
                billCharges = 1000;
                break;
            case "sound":
                billCharges = 800;
                break;
            case "key":
                billCharges = 500;
                break;
        }

        switch (issueIntensity.toLowerCase()) {
            case "low":
                return billCharges * 0.95;
            case "mid":
                return billCharges * 1.05;
            case "high":
                return billCharges * 1.1;
            default:
                return -1; // Invalid issueIntensity
        }
    }

    private int insertServiceList(List<Laptop> serviceList) {
        LaptopDAO laptopDAO = new LaptopDAO();
        return laptopDAO.insertServiceList(serviceList);
    }
}

