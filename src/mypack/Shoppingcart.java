package mypack;


///Demo for control statements(for,while,do-while,Enhanced for)
public class Shoppingcart {

	public static void main(String[] args) {
		
		
		//for loop
		System.out.println("Adding items to cart");
		for(int productId=1;productId<=5;productId++) {
			System.out.println("Product added: "+productId);
		}
		
		//while loop
		System.out.println("Checking stock availability");
		int stock=3;
		while(stock>0) {
			System.out.println("Stock available:"+stock);
			stock--;
		}
		
		//do while loop
		System.out.println("Payment precessing");
		int attempt=1;
		do {
			System.out.println("Attempt "+attempt+": processing");
			attempt++;
		}
		while(attempt <=3);
		
		
		//Enhanced for loop
		System.out.println("Final items in cart");
		String items[]= {"Laptop","Mouse","Keyboard"};
		for(String item : items) {
			System.out.println(item);
		}

	}

}
