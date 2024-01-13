package Inheritance_Polymorphism_Abstract_Interface_Lambda.Departmental_Store_Interface;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the customer name");
        String customerName = scanner.nextLine();

        System.out.println("Enter the phone number");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter the street name");
        String streetName = scanner.nextLine();

        System.out.println("Enter the bill amount");
        double billAmount = scanner.nextDouble();

        System.out.println("Enter the distance");
        int distance = scanner.nextInt();

        CustomerDetails customer = new CustomerDetails(customerName, phoneNumber, streetName, billAmount, distance);

        System.out.println("Customer name: " + customer.getCustomerName());
        System.out.println("Phone number: " + customer.getPhoneNumber());
        System.out.println("Street name: " + customer.getStreetName());
        System.out.println("Bonus points: " + customer.calculateBonusPoints());
        System.out.println("Delivery charge: " + customer.deliveryCharge());

        scanner.close();
    }
}
