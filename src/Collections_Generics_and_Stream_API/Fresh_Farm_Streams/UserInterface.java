package Collections_Generics_and_Stream_API.Fresh_Farm_Streams;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of cartons");
        int numCartons = scanner.nextInt();

        if (numCartons <= 0) {
            System.out.println("Invalid");
            scanner.close();
            return;
        }

        CartonUtility cartonUtility = new CartonUtility();

        System.out.println("Enter carton details");
        for (int i = 0; i < numCartons; i++) {
            String input = scanner.next();
            String[] cartonDetails = input.split("/");

            if (cartonDetails.length != 3) {
                System.out.println("Invalid input");
                scanner.close();
                return;
            }

            try {
                String productName = cartonDetails[0].trim();
                int quantity = Integer.parseInt(cartonDetails[1].trim());
                double productCost = Double.parseDouble(cartonDetails[2].trim());

                if (quantity <= 0) {
                    System.out.println("Quantity number should be a valid number");
                    scanner.close();
                    return;
                }

                Carton carton = new Carton(productName, quantity, productCost);
                cartonUtility.getCartonList().add(carton);

            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
                scanner.close();
                return;
            }
        }

        Carton maxCarton = cartonUtility.findMax(cartonUtility.convertToStream());

        if (maxCarton != null) {
            System.out.println(maxCarton.getProductName() + " had the highest quantity with " + maxCarton.getQuantity() + " nos");
        }

        scanner.close();
    }
}
