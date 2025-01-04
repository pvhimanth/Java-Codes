package oops_inheritance;

//inheritance
// child inherit properties(variable) and behaviours(methods) from parent class using extends keyword
class Parent {
	
	//parent or super or base class
	float height=5.11f;
	String colour="brown";
	String noseStructure="normal";
	
	void readBooks(){
		System.out.println("I will read books");
	}
	
	void noSmoke() {
		System.out.println("I will not smoke");
	}
	
	void noDrink() {
		System.out.println("I will not drink");
	}
	
}

class Child extends Parent{
	//child or sub or derived class

}
public class Day32pgm1 {
public static void main(String[] args) {
	
		Child c=new Child();
		
		System.out.println(c.height);
		System.out.println(c.colour);
		System.out.println(c.noseStructure);
		
		c.readBooks();
		c.noSmoke();
		c.noDrink();
	
}
}
