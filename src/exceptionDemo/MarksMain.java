package exceptionDemo;


//custom exception class
class InvalidMarks extends Exception {
	public InvalidMarks(String msg) {
		super(msg);
	}
}

//Driver class
class MarksChecker {
	public void checkMarks(int marks) throws InvalidMarks {
		if(marks<0 || marks>100) {
			throw new InvalidMarks("Marks must be betweem 0 and 100");
		}
		else {
			System.out.println("Marks are valid: "+marks);
		}
	}
}

//Main class
public class MarksMain {

	public static void main(String[] args) {
		MarksChecker m=new MarksChecker();
		try {
			m.checkMarks(150);
		}
		catch(ArithmeticException | InvalidMarks e) {
			e.printStackTrace();
		}
	}
}
