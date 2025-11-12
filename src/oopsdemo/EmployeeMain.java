package oopsdemo;

//Demo for OOPpolymorphism
// Parent class
class Employee {
    // Method to demonstrate overriding (Run-time)
    public void work() {
        System.out.println("Every employee works");
    }

    // Method Overloading (Compile-time)
    public void work(int hours) {
        System.out.println("Employee works for " + hours + " hours");
    }

    public void work(String task) {
        System.out.println("Employee is working on: " + task);
    }
}

// Child class 1
class Developer extends Employee {
    @Override
    public void work() {  
        System.out.println("Developer develops the application");
    }
}

// Child class 2
class UIDeveloper extends Employee {
    @Override
    public void work() {  
        System.out.println("UI Developer designs the frontend pages");
    }
}

// Main class 
public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee();  
        Employee e2 = new Developer();         
        Employee e3 = new UIDeveloper();      

        // Runtime (Overriding)
        e1.work(); //Employee class method
        e2.work(); //Developer class method 
        e3.work();  //UIDeveloper class method

        System.out.println();

        // Compile-time (Overloading)
        e1.work(8);         
        e1.work("Reports"); 
    }
}
