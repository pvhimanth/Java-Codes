package methodoverridingrules;

// static methods can be inherited
class Parent{
	static void disp() {
		System.out.println("Hi");
	}
}

class Child extends Parent {
	
}
public class Day37pgm5 {
	public static void main(String[] args) {
		
		Child.disp();
	}
}
