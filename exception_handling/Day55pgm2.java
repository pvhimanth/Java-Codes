package exception_handling;

/* Runtime error can be handled using try and catch
 *  with Error class(parent of all inbuilt Runtime error classes)
 */
public class Day55pgm2 {

	public static void main(String[] args) {
		disp();
	}

	static void disp() {
		try {
			disp();
		} 
		catch (Error e) {
			System.out.println("Runtime error handled");
		}
	}
}
