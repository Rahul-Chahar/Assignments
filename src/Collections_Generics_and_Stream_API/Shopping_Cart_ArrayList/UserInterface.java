package Collections_Generics_and_Stream_API.Shopping_Cart_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

// UserInterface class to handle user interactions
public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Products products = new Products();

        while (true) {
            System.out.println("1.Add\n2.Display\n3.Exit\nEnter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter the product");
                    String product = scanner.nextLine();
                    products.addProductToList(product);
                    break;
                case 2:
                    ArrayList<String> currentProductList = products.getProductList();
                    if (currentProductList.isEmpty()) {
                        System.out.println("The list is empty");
                    } else {
                        products.sortProductList();
                        for (String item : currentProductList) {
                            System.out.println(item);
                        }
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
