package Inheritance_Polymorphism_Abstract_Interface_Lambda.Endowment_Plan_Inheritance;

import java.util.Scanner;

public class UserInterface {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get common details
        System.out.println("Enter Endowment Id");
        String endowmentId = scanner.nextLine();

        System.out.println("Enter Holder Name");
        String holderName = scanner.nextLine();

        System.out.println("Enter Endowment Type");
        String endowmentType = scanner.nextLine();

        System.out.println("Enter Registration Date");
        String registrationDate = scanner.nextLine();

        // Process based on endowment type
        if (endowmentType.equalsIgnoreCase("educational")) {
            // Educational endowment
            System.out.println("Enter Educational Institution");
            String educationalInstitution = scanner.nextLine();

            System.out.println("Enter Educational Division");
            String educationalDivision = scanner.nextLine();

            EducationalEndowment educationalEndowment = new EducationalEndowment(
                    endowmentId, holderName, endowmentType, registrationDate, educationalInstitution, educationalDivision);

            double endowmentAmount = educationalEndowment.calculateEndowment();
            System.out.printf("Endowment Amount %.2f%n", endowmentAmount);
        } else if (endowmentType.equalsIgnoreCase("health")) {
            // Health endowment
            System.out.println("Enter Health Care Center");
            String healthCareCenter = scanner.nextLine();

            System.out.println("Enter Holder Age");
            int holderAge = scanner.nextInt();

            HealthEndowment healthEndowment = new HealthEndowment(
                    endowmentId, holderName, endowmentType, registrationDate, healthCareCenter, holderAge);

            double endowmentAmount = healthEndowment.calculateEndowment();
            System.out.printf("Endowment Amount %.2f%n", endowmentAmount);
        } else {
            // Invalid endowment type
            System.out.printf("%s is an invalid endowment type%n", endowmentType);
        }

        scanner.close();
    }
}