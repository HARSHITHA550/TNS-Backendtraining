package mypack;

// Demo for types of variables 
public class TypesOfVariables {

    // Instance variable
    String employeeName;

    // Static variable 
    static String company = "Tech Solutions";

    // Method using local variables
    void calculateSalary() {
        int basic = 50000;      // local variable
        int bonus = 10000;      // local variable
        int total = basic + bonus;
        System.out.println("Total Salary: " + total);
    }

    // Method to print message
    void printInfo() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Company: " + company);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating object of TypesOfVariables
        TypesOfVariables emp = new TypesOfVariables();

        // Assigning instance variable
        emp.employeeName = "Harshitha";

        // Display employee info
        emp.printInfo();

        // Calculate salary using local variables
        emp.calculateSalary();

        // Access static variable directly
        System.out.println("Company (via class name): " + TypesOfVariables.company);
    }
}