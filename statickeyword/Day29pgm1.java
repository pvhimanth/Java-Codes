package statickeyword;

//Accessing and declaring Static variables,block,method and instance variables ,block,method and constructor
class Test{
	static int a,b;
	
	static {
		System.out.println("Inside static block");
	}
	
	static void fun1() {
		System.out.println("Inside static method");
		a=10;
		b=20;
	}
	
	int x,y;
	
	{
		System.out.println("Inside instance block");
	}
	
	void fun2() {
		System.out.println("Inside instance method");
	}
	
	Test(){
		System.out.println("Inside constructor");
		x=10;
		y=20;
	}
	
}
public class Day29pgm1 {
public static void main(String[] args) {
	Test.fun1();
	Test t=new Test();
	t.fun2();
}
}
