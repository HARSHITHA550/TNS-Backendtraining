package mypack;


//Executor of class for Mobile
public class MobileMain {
	public static void main(String[] args) {
		//create instance of a class 
	
		
		Mobile m1 = new Mobile();
		m1.brand="Apple";
		m1.model="iphone 14";
		m1.ram=6;
		m1.introduce();
		
		Mobile m2 = new Mobile();
		m2.brand="Samsung";
		m2.model="Galaxy S24";
		m2.ram=12;
		m2.introduce();
		
		Mobile m3 = new Mobile();
		m3.brand="OnePlus";
		m3.model="OnePlus 12";
		m3.ram=8;
		m3.introduce();
	}
}
