package Inheritance_Polymorphism_Abstract_Interface_Lambda.College_Fee_Abstract;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student Id");
        int studentId = scanner.nextInt();

        System.out.println("Enter Student name");
        String studentName = scanner.next();

        System.out.println("Enter Department name");
        String department = scanner.next();

        System.out.println("Enter gender");
        String gender = scanner.next();

        System.out.println("Enter category");
        String category = scanner.next();

        System.out.println("Enter College fee");
        double collegeFee = scanner.nextDouble();

        if (category.equals("Hosteller")) {
            System.out.println("Enter the room number");
            int roomNumber = scanner.nextInt();

            System.out.println("Enter the Block name");
            char blockName = scanner.next().charAt(0);

            System.out.println("Enter the room type");
            String roomType = scanner.next();

            Hosteller hosteller = new Hosteller(studentId, studentName, department, gender, category, collegeFee, roomNumber, blockName, roomType);
            System.out.printf("Total College fee is %.1f%n", hosteller.calculateTotalFee());
        } else if (category.equals("DayScholar")) {
            System.out.println("Enter Bus number");
            int busNumber = scanner.nextInt();

            System.out.println("Enter the distance");
            float distance = scanner.nextFloat();

            DayScholar dayScholar = new DayScholar(studentId, studentName, department, gender, category, collegeFee, busNumber, distance);
            System.out.printf("Total College fee is %.1f%n", dayScholar.calculateTotalFee());
        } else {
            System.out.println("Invalid category");
        }

        scanner.close();
    }
}