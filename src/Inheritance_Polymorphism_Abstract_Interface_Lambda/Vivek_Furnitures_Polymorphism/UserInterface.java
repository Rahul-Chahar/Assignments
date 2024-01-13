package Inheritance_Polymorphism_Abstract_Interface_Lambda.Vivek_Furnitures_Polymorphism;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Customer Name");
        String customerName = scanner.nextLine();

        System.out.println("Enter Phone Number");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter address");
        String address = scanner.nextLine();

        System.out.println("Enter Bero Type");
        String beroType = scanner.nextLine();

        if (beroType.equals("Steel Bero")) {
            System.out.println("Enter Bero Colour");
            String beroColour = scanner.nextLine();

            System.out.println("Enter Bero Height");
            int beroHeight = scanner.nextInt();

            SteelBero steelBero = new SteelBero(beroType, beroColour, beroHeight);
            steelBero.calculatePrice();
            double discount = new Discount().calculateDiscount(steelBero);
            double totalPrice = steelBero.price - discount;

            System.out.printf("Amount needs to be paid %.2f%n", totalPrice);
        } else if (beroType.equals("Wooden Bero")) {
            System.out.println("Enter Bero Colour");
            String beroColour = scanner.nextLine();

            System.out.println("Enter Wood Type");
            String woodType = scanner.nextLine();

            WoodenBero woodenBero = new WoodenBero(beroType, beroColour, woodType);
            woodenBero.calculatePrice();
            double discount = new Discount().calculateDiscount(woodenBero);
            double totalPrice = woodenBero.price - discount;

            System.out.printf("Amount needs to be paid %.2f%n", totalPrice);
        } else {
            System.out.println(beroType + " is an invalid bero type");
        }

        scanner.close();
    }
}