package oops_inheritance;

//Final methods can be inherited but can't be overridden
class Alpha1{
	final void disp() {
		System.out.println("Hi");
	}
}

/* ERROR
 * 
 * class Beta1 extends Alpha1{
	void disp() {
		System.out.println("Hello");
	}
}
*/
 class Beta1 extends Alpha1{
	 
 }

public class Day35pgm5 {
public static void main(String[] args) {

	
	Beta1 b=new Beta1();
	b.disp();
}
}
