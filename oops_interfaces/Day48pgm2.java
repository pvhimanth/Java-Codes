package oops_interfaces;

/* static can't access private method as it is a instance member 
 * so, we make method as private and static to access by methods in interface
 * and to access methods with interface name directly without implementing class
 */
interface Student1 {
	static void personalLife() {
		redundantCode();
	}

	static void professionalLife() {
		redundantCode();
	}

	private static void redundantCode() {
		System.out.println("Student will wake up with mobile");
		System.out.println("Student will do activity with mobile");
		System.out.println("Student will have breakfast with mobile");
		System.out.println("Student will code with mobile");
		System.out.println("Student will sleep with mobile");
	}
}

public class Day48pgm2 {
	public static void main(String[] args) {
		Student1.personalLife();
		Student1.professionalLife();
	}
}








/* ERROR--> As static members can't access instance members(private)
 interface Student1 {
	static void personalLife() {
		redundantCode(); -->ERROR
	}

	static void professionalLife() {
		redundantCode(); -->ERROR
	}

	private void redundantCode() {
		System.out.println("Student will wake up with mobile");
		System.out.println("Student will do activity with mobile");
		System.out.println("Student will have breakfast with mobile");
		System.out.println("Student will code with mobile");
		System.out.println("Student will sleep with mobile");
	}
 }
 */
 
