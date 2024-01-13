package Inheritance_Polymorphism_Abstract_Interface_Lambda.Auditing_Lambda;

import java.util.ArrayList;
@FunctionalInterface
interface EmployeeAudit {
    ArrayList<String> fetchEmployeeDetails(double salary);
}