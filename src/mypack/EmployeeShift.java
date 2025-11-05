package mypack;

//Demo for conditional statements (if,else if,else)
public class EmployeeShift {

	public static void main(String[] args) {
		
		int shiftcode=1;
		
		//if
		if(shiftcode == 1) {
			System.out.println("Morning shift: 9AM - 5PM");
		}
		
		//else if
		else if(shiftcode == 2) {
			System.out.println("Afternoon shift: 1PM - 9PM");
		}
		
		else if(shiftcode ==3) {
			System.out.println("Night shift: 9PM - 5AM");
		}
		
		//else
		else {
			System.out.println("Invalid shiftcode");
		}
	

	}

}
