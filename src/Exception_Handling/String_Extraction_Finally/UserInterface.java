package Exception_Handling.String_Extraction_Finally;

import java.util.Scanner;

public class UserInterface {
    public static String extractString(String sentence, int number1, int number2) {
        try {
            if (number1 < 0 || number2 < 0 || number1 >= sentence.length() || number2 >= sentence.length()) {
                throw new StringIndexOutOfBoundsException();
            }

            StringBuilder result = new StringBuilder("The output string is ");
            for (int i = number1; i < number2; i++) {
                result.append(sentence.charAt(i));
            }

            return result.toString() + ". Thanks for using the application.";
        } catch (StringIndexOutOfBoundsException e) {
            return "Invalid index position. Thanks for using the application.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the String: ");
            String inputString = scanner.nextLine();

            System.out.print("Enter First Index: ");
            int firstIndex = scanner.nextInt();

            System.out.print("Enter Second Index: ");
            int secondIndex = scanner.nextInt();

            System.out.println(extractString(inputString, firstIndex, secondIndex));
        } finally {
            scanner.close();
        }
    }
}
