package OyctechService.ApplicationUtil;

// ApplicationUtil.java
//package com.util;

import OyctechService.InvalidLaptopException.InvalidLaptopException;
import com.exception.InvalidLaptopException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplicationUtil {

    public static List<String> extractDetails(String[] input) throws InvalidLaptopException {
        List<String> stringList = new ArrayList<>();
        for (String record : input) {
            if (validateLaptopName(record)) {
                stringList.add(record);
            }
        }
        return stringList;
    }

    public static boolean validateLaptopName(String laptopName) throws InvalidLaptopException {
        String[] validLaptopNames = {"apple", "dell", "hp", "lenovo", "acer"};
        String[] details = laptopName.split(":");
        String name = details[1].toLowerCase();

        for (String validName : validLaptopNames) {
            if (name.equals(validName)) {
                return true;
            }
        }

        throw new InvalidLaptopException("Invalid laptop name: " + name);
    }

    public static Date stringToDateConverter(String stringDate) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            return format.parse(stringDate);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static java.sql.Date utilToSqlDateConverter(java.util.Date utDate) {
        return new java.sql.Date(utDate.getTime());
    }
}

