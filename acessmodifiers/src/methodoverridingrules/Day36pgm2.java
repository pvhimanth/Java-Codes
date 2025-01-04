package methodoverridingrules;

//can't change the return type of method during method overriding

/* ERROR
 * 
 * public class Day36pgm2 {
	protected void disp() {
		System.out.println("Hi");
	}
}

class A1{
	protected int disp() {
		System.out.println("Hi");
	}
}
 */


public class Day36pgm2 {
	protected void disp() {
		System.out.println("Hi");
	}
}

class A1{
	protected void disp() {
		System.out.println("Hi");
	}
}

