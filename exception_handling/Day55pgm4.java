package exception_handling;

/* Runtime error can't be handled with Exception class object as 
 * (Exception is not a parent of StackOverflowError class)
 */
public class Day55pgm4 {

	public static void main(String[] args) {
		disp();
	}

	static void disp() {
		/* try {
			disp();
		} 
		catch (Exception e) {
			System.out.println("Runtime error handled");
		}
		*/
	}
}
