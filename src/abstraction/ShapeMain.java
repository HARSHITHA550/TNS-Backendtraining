package abstraction;

//Demo for abstract class
//combination of abstract class+concrete method
abstract class Shape {
	
	//abstract method
	abstract void draw();
	
	//concrete method
	void display() {
		System.out.println("The shape details:");
	}
}


//Implementation class
class circle extends Shape {
	void draw() {
		System.out.println("circle");
		
	}
}

//Main class
public class ShapeMain {

	public static void main(String[] args) {
		Shape ob=new circle();
		ob.display();
		ob.draw();
		}
}
