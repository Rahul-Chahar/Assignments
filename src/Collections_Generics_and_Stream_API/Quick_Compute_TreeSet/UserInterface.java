package Collections_Generics_and_Stream_API.Quick_Compute_TreeSet;

import java.util.Scanner;

// UserInterface class to handle user interactions
public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumAvg numAvg = new NumAvg();

        while (true) {
            System.out.println("1.Add number\n2.Find average\n3.Exit\nEnter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter the number");
                    int num = scanner.nextInt();
                    numAvg.addNum(num);
                    break;
                case 2:
                    double average = numAvg.calAvg();
                    if (average == 0.0) {
                        System.out.println("The set is empty");
                    } else {
                        System.out.println(average);
                    }
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