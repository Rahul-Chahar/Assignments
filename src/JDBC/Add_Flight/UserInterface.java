package JDBC.Add_Flight;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get flight details from the user
        System.out.println("Enter flight Id");
        int flightId = scanner.nextInt();
        scanner.nextLine();  // consume the newline character
        System.out.println("Enter source");
        String source = scanner.nextLine();
        System.out.println("Enter destination");
        String destination = scanner.nextLine();
        System.out.println("Enter noOfSeats");
        int noOfSeats = scanner.nextInt();
        System.out.println("Enter the fare");
        double flightFare = scanner.nextDouble();

        // Create Flight object with the user input
        Flight flight = new Flight(flightId, source, destination, noOfSeats, flightFare);

        // Create FlightManagementSystem object
        FlightManagementSystem flightManagementSystem = new FlightManagementSystem();

        // Add flight details and print the result
        if (flightManagementSystem.addFlight(flight)) {
            System.out.println("Flight details added successfully");
        } else {
            System.out.println("Flight details not added successfully");
        }
    }
}
