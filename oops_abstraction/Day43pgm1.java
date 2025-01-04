package oops_abstraction;

// normal class
class A1 {
	void disp() {
		System.out.println("Hi");
	}
}

// abstract class - abstract has to given when there is method of abstract
abstract class B1 {
	abstract void disp();
}

public class Day43pgm1 {
	public static void main(String[] args) {
		A1 a=new A1();
		a.disp(); // can create object of parent class
		
//		B1 b=new B1(); can't able to create object to abstract class
		
	}
}
