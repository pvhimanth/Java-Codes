package exception_handling;

/* Runtime error can be handled using try and catch
 *  with Throwable class(parent of all inbuilt Exception and Error classes)
 */
public class Day55pgm3 {

	public static void main(String[] args) {
		disp();
	}

	static void disp() {
		try {
			disp();
		} 
		catch (Throwable e) {
			System.out.println("Runtime error handled");
		}
	}
}
