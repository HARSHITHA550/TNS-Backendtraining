package mypack;

//Demo for different types of operators
public class DemoOnOperators {

	public static void main(String[] args) {
		
		//Arithmetic operators (+,-,*,/,%)
		int a=8,b=6;
		
		boolean x=true, y=false;
		
		System.out.println("Addition Value "+(a+b)); //14
		System.out.println("Subtraction Value "+(a-b));  //2
		System.out.println("Multiplication Value "+(a*b)); //48
		System.out.println("Division Value "+(a/b)); //1
		System.out.println("Modulus Value "+(a%b)); //2
		
		//Assignment operators (+=,-=,*=,/=,%=)
		int c = b;
		System.out.println("The value of c "+c); //6
		
		c*=b; //c=c*b
		 System.out.println("The value of c "+c); //36
		 
		c-=a; //c=c-a
		System.out.println("The value of c "+c); //28
		
		
		//Relational operators (==,!=,>,<,>=,<=)
		System.out.println(a>=b); //true
		System.out.println(b<=a); //true
		System.out.println(a==b); //false
		
		
		//logical operators (&&.||,!)
		System.out.println(a>b && b>a); //false
		System.out.println("The result of OR operator "+(x||y)); //true
		System.out.println("NOT of x "+(!x)); //false
		
		
		//Unary operators(++,--)
		//pre-increment
		System.out.println(++a); //9
		
		//post-increment
		System.out.println(b++); //6
		System.out.println(b); //7
		
		//pre-decrement
		System.out.println(--a); //8
		
		//post-decrement
		System.out.println(b--); //7
		System.out.println(b); //6
		
		//Ternary operator (condition? true:false)
		int p=10,q=4;
		int result=(p>q)?p:q;
		System.out.println("Greater number "+result); //10
	
		
		
	}

} 