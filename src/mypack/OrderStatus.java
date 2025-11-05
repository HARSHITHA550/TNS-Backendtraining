package mypack;

//Demo for conditional statement (switch case)
public class OrderStatus {

	public static void main(String[] args) {
		
		int status = 2;
		
		switch(status) {
		case 1: 
			System.out.println("Order placed");
			System.out.println("We received your order");
			break;
			
		case 2:
			System.out.println("Order packed");
			System.out.println("Your order is ready to dispatch");
			break;
			
		case 3:
			System.out.println("Shipped");
			System.out.println("Your order is on the way");
			break;
			
		case 4:
			System.out.println("Out for delivery");
			System.out.println("Your package will arrive today");
			break;
			 
			
		case 5:
			System.out.println("Delivered");
			System.out.println("Thank you for shopping");
			break;
			
			default:
				System.out.println("Invalid order status");
		}
		
		
		//Enhanced switch
		String message = switch(status) {
		case 1 ->"Order placed - We received your order";
		case 2 ->"Order packed - Your order is ready to dispatch";
		case 3 ->"Shipped - Your order is on the way";
		case 4 ->"Out for delivery - Your package will arrive today";
		case 5 ->"Delivered - Thank you for shopping";
		default ->"Invalid order status";
		
	
		};
		System.out.println(message); //Order packed - Your order is ready to dispatch

	}

}
