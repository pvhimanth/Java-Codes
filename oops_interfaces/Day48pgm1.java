package oops_interfaces;

/*
 *  Here duplicate removed by making another method and calling that method in another method
 * 
 * private methods can be given to provide redundancy , to avoid being inherited and to provide 
 * facility that the private methods only access by interface methods 
 * not access by any class
 */
interface Student {
	default void personalLife() {
		redundantCode();
	}

	default void professionalLife() {
		redundantCode();
	}

	private void redundantCode() {
		System.out.println("Student will wake up with mobile");
		System.out.println("Student will do activity with mobile");
		System.out.println("Student will have breakfast with mobile");
		System.out.println("Student will code with mobile");
		System.out.println("Student will sleep with mobile");
	}
}

class College implements Student {

}

public class Day48pgm1 {
	public static void main(String[] args) {
		College c = new College();
		c.personalLife();
		c.professionalLife();
//		c.redundantCode(); ---> as method is private can't be accessible
	}
}
