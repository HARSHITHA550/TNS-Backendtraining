package oopsdemo;

//Demo for Encapsulation
public class DemoOnEncapsulation {

    // Private variables 
    private int studentID;
    private String studentName;
    private double marks;

    // Setters
    // Set student ID
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Set marks with validation
    public void setMarks(double marks) {
        if(marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks!");
        }
    }

    // Getters
    // Get student ID
    public int getStudentID() {
        return studentID;
    }

    // Get student name
    public String getStudentName() {
        return studentName;
    }

    // Get marks
    public double getMarks() {
        return marks;
    }

    // Main method to demonstrate encapsulation
    public static void main(String[] args) {
        DemoOnEncapsulation s = new DemoOnEncapsulation();

        s.setStudentID(101);
        s.setStudentName("Harshitha");
        s.setMarks(95.5);

        System.out.println("Student ID: " + s.getStudentID());
        System.out.println("Student Name: " + s.getStudentName());
        System.out.println("Marks: " + s.getMarks());

        s.setMarks(120); 
    }
}