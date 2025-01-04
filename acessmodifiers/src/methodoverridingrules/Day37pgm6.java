package methodoverridingrules;

/* static methods can't be overridden if tried 
  without @overridden , parent static method will be hidden
 */
class Parent1{
	static void disp() {
		System.out.println("Hi");
	}
}

class Child1 extends Parent1 {
	
	/* ERROR - static methods can't be overridden
	 * 
	@Override
	static void disp() {
		System.out.println("Hello");
	}
	 */
	
	/* here works because child static method hidden
	   prints hello as can't have same method with same,no of
	   parameters in same class
	 */
	static void disp() {
		System.out.println("Hello");
	}
	
}

public class Day37pgm6 {
public static void main(String[] args) {
	Child1 c=new Child1();
	c.disp();
}
}
