package Collections_Generics_and_Stream_API.School_Team_HashSet;


import java.util.HashSet;
import java.util.Scanner;

// UserInterface class to handle user interactions
public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassHouseFormation classHouseObj = new ClassHouseFormation();

        System.out.println("Enter the number of students");
        int numStudents = scanner.nextInt();

        if (numStudents <= 0) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }

        System.out.println("Enter the details");
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < numStudents; i++) {
            String details = scanner.nextLine();
            classHouseObj.addName(details);
        }

        HashSet<String> result = classHouseObj.formTeam();

        for (String entry : result) {
            System.out.println(entry);
        }

        scanner.close();
    }
}
