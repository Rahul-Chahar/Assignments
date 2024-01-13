package Inheritance_Polymorphism_Abstract_Interface_Lambda.Number_Category_Lambda;

public class UserInterface {
    public static NumberCategory checkAmicable() {
        return (number1, number2) -> {
            int sumDivisorsNumber1 = calculateSumDivisors(number1);
            int sumDivisorsNumber2 = calculateSumDivisors(number2);

            return (sumDivisorsNumber1 == number2) && (sumDivisorsNumber2 == number1);
        };
    }

    public static NumberCategory checkPalindrome() {
        return (number1, number2) -> {
            int product = number1 * number2;
            return isPalindrome(product);
        };
    }

    private static int calculateSumDivisors(int number) {
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }
        return sum;
    }

    private static boolean isPalindrome(int number) {
        String numStr = String.valueOf(number);
        int left = 0;
        int right = numStr.length() - 1;

        while (left < right) {
            if (numStr.charAt(left) != numStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        NumberCategory amicableCategory = checkAmicable();
        NumberCategory palindromeCategory = checkPalindrome();

        boolean areAmicable = amicableCategory.checkNumberCategory(number1, number2);
        boolean isPalindrome = palindromeCategory.checkNumberCategory(number1, number2);

        System.out.println("\n" + number1 + " and " + number2 + (areAmicable ? " are amicable numbers" : " are not amicable numbers"));
        System.out.println("Their Product " + number1 * number2 + (isPalindrome ? " do" : " does not") + " produce a Palindrome");

        scanner.close();
    }
}
