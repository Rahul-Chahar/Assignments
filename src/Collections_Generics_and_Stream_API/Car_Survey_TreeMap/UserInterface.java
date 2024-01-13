package Collections_Generics_and_Stream_API.Car_Survey_TreeMap;

import java.util.List;
import java.util.Scanner;

// UserInterface class to handle user interactions
public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car carObj = new Car();

        while (true) {
            System.out.println("1.Add car\n2.Search by name\n3.Search by count\n4.Total\n5.Exit\nEnter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter the car name");
                    String carName = scanner.nextLine();
                    System.out.println("Enter no of cars sold");
                    int numCarsSold = scanner.nextInt();
                    carObj.addCar(carName, numCarsSold);
                    break;
                case 2:
                    System.out.println("Enter the car name");
                    String searchCarName = scanner.nextLine();
                    int carsSold = carObj.carByName(searchCarName);
                    System.out.println(carsSold != -1 ? carsSold : "Car not found");
                    break;
                case 3:
                    System.out.println("Enter the count");
                    int count = scanner.nextInt();
                    List<String> carsByCount = carObj.carByCount(count);
                    if (carsByCount.isEmpty()) {
                        System.out.println("No cars found");
                    } else {
                        for (String car : carsByCount) {
                            System.out.println(car);
                        }
                    }
                    break;
                case 4:
                    int totalCarsSold = carObj.totalCarsSold();
                    System.out.println(totalCarsSold);
                    break;
                case 5:
                    System.out.println("Thank you for using the application");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option (1-5).");
            }
        }
    }
}
