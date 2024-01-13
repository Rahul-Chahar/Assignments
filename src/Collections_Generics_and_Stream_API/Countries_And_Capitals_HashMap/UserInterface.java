package Collections_Generics_and_Stream_API.Countries_And_Capitals_HashMap;

import java.util.Scanner;

// UserInterface class to handle user interactions
public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Country countryObj = new Country();

        while (true) {
            System.out.println("1.Add\n2.Search\n3.Exit\nEnter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter the country name");
                    String countryName = scanner.nextLine();
                    System.out.println("Enter the capital name");
                    String capitalName = scanner.nextLine();
                    countryObj.add(countryName, capitalName);
                    break;
                case 2:
                    System.out.println("Enter the country name");
                    String searchCountry = scanner.nextLine();
                    System.out.println(countryObj.search(searchCountry));
                    break;
                case 3:
                    System.out.println("Thank you for using the application");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option (1-3).");
            }
        }
    }
}
