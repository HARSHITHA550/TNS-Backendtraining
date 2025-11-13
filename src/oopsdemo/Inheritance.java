package oopsdemo;

//Demo for Inheritance --> code Reuse ability
//parent,child -- superclass and subclass -- base class and derived class
//types of inheritance --> single,multilevel,hierarchical (not accepted multiple)

public class Inheritance {
	
	
	//Demo for parent class
	public class Employee {
		protected String name;
		protected double salary;

	//this --> the variables are belonging to this class
	public Employee(String name,double salary) {
		this.name=name;
		this.salary=salary;
		}
	
	public void showDetails() {
		System.out.println("Employee Name: "+name);
		System.out.println("Salary: "+salary);
	}
}
	
	
	
	//Demo for child class
     public class Manager extends Employee {
    	 private String department;
    	 
    	 public Manager(String name,double salary,String department) {
    		 
    		 //super --> the parent variable in the child class
    		 super(name,salary);
    		 this.department = department;
    	 }
    	 public void showManagerInfo() {
    		 System.out.println("Department: "+department);
    	 }
}
  
     
     
     //Main method
     public static void main(String[] args) {
    	 
    	 //in inheritance create instance for the child class
    	 Inheritance obj=new Inheritance();
    	 Manager m=obj.new Manager("Harshitha",85000,"AIML");
    	 m.showDetails();
    	 m.showManagerInfo();
     }
     
}
