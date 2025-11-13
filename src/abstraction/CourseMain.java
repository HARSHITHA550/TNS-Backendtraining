package abstraction;

//Demo for interface
//combo of abstract,default & static methods
interface Course {
	
	//abstract method
	void enroll(String StudentName);
	void completecourse();
	
	//final variable
	int COURSE_DURATION=45;
	
	//default method
	default void greet() {
		System.out.println("Welcome to the course");
	}
	
	//static method
	static void info() {
		System.out.println("Java language training");
	}
}

//Implementation class
class Javacourse implements Course {
	public void enroll(String StudentName) {
		System.out.println(StudentName  + " has enrolled for java course");
		}
	
	public void completecourse() {
		System.out.println("Java course completed successfully");
	}
}


//Main class
public class CourseMain {
	public static void main(String[] args) {
		Course c=new Javacourse();
		c.greet();
		Course.info();
		
		c.enroll("Harshitha");
		c.completecourse();
		
	
		
	}

}
