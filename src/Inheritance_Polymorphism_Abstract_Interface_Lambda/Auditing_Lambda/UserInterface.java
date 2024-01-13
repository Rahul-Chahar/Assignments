package Inheritance_Polymorphism_Abstract_Interface_Lambda.Auditing_Lambda;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInterface {
    private static Map<String, Double> employeeMap = new HashMap<>();

    public static void addEmployeeDetails(String employeeName, double salary) {
        employeeMap.put(employeeName, salary);
    }

    public static EmployeeAudit findEmployee() {
        return salary -> {
            ArrayList<String> result = new ArrayList<>();
            for (Map.Entry<String, Double> entry : employeeMap.entrySet()) {
                if (entry.getValue() <= salary) {
                    result.add(entry.getKey());
                }
            }
            return result;
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Add Employee Details\n2.Find Employee Details\n3.Exit");
            System.out.print("\nEnter the choice\n");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter the Employee name\n");
                    String employeeName = scanner.next();
                    System.out.print("Enter the Employee Salary\n");
                    double salary = scanner.nextDouble();
                    addEmployeeDetails(employeeName, salary);
                    break;

                case 2:
                    System.out.print("\nEnter the salary to be searched\n");
                    double searchSalary = scanner.nextDouble();
                    EmployeeAudit employeeAudit = findEmployee();
                    ArrayList<String> employeeList = employeeAudit.fetchEmployeeDetails(searchSalary);

                    System.out.println("\nEmployee List");
                    if (employeeList.isEmpty()) {
                        System.out.println("No Employee Found");
                    } else {
                        for (String employee : employeeList) {
                            System.out.println(employee);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nLet's complete the session");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("\nInvalid choice. Please enter a valid option.");
            }
        }
    }
}