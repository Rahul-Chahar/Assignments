package Collections_Generics_and_Stream_API.Fruit_Basket_Estimation_Streams;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FruitBasketUtility fruitBasketUtility = new FruitBasketUtility();

        while (true) {
            System.out.println("Select an option:\n1.Add Fruit to Basket\n2.Calculate Bill\n3.Exit");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the fruit name");
                    String fruitName = scanner.next();
                    System.out.println("Enter weight in Kgs");
                    int weightInKgs = scanner.nextInt();
                    System.out.println("Enter price per Kg");
                    int pricePerKg = scanner.nextInt();

                    FruitBasket fbObj = new FruitBasket(fruitName, weightInKgs, pricePerKg);
                    fruitBasketUtility.addToBasket(fbObj);
                    break;

                case 2:
                    List<FruitBasket> basketList = fruitBasketUtility.getFruitBasketList();

                    if (basketList.isEmpty()) {
                        System.out.println("Your basket is empty. Please add fruits.");
                    } else {
                        int totalBill = fruitBasketUtility.calculateBill(basketList.stream());
                        System.out.println("The estimated bill amount is Rs " + totalBill);
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using the application.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}





