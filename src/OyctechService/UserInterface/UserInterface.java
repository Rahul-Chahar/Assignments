package OyctechService.UserInterface;

// UserInterface.java
//package com.client;

import OyctechService.LaptopService.LaptopService;
import com.service.LaptopService;

import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        LaptopService laptopService = new LaptopService();
        boolean recordsInserted;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of laptop service records");
        int num = sc.nextInt();

        String[] s = new String[num];

        System.out.println("Enter the laptop service details");
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            s[i] = sc.nextLine();
        }

        recordsInserted = laptopService.addServiceList(s);

        if (recordsInserted) {
            System.out.println("Read valid laptop service records and updated it to the database");
        } else {
            System.out.println("Failed to add records to the database");
        }
    }
}

