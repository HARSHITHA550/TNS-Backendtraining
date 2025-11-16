package exceptionDemo;

//program with exception handling
public class WithException {

	public static void main(String[] args) {
		
		//Arithmetic Exception
		try {
			int x=25;
			int y=0;
			int ans=x/y;
			System.out.println("Module result is "+ans);
		}
		catch(ArithmeticException e) {
			System.err.println("Error: Division by zero");
			}
		
			
		//ArrayIndexOutOfBox Exception
		try {
			int marks[]= {35,25,45};
			System.out.println("Student marks is "+marks[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Error: Invalid array index");
			}
		
			
		//Null Pointer Exception
		try {
			String s=null;
			System.out.println("Length: "+s.length());
		}
		catch(NullPointerException e) {
			System.err.println("Error: Null value Encountered");
		}
		
	}

}
