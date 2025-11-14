package arraydemo;

import java.util.Scanner;
//Demo for user input
public class UserInputDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		System.out.println("Enter your course: ");
		String course=sc.nextLine();
		System.out.println("Enter duration:");
		int days=sc.nextInt();
		
		System.out.println(name+" completed "+course+" course in "+days+" days ");
		
	}

}
