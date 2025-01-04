package exception_handling;

//Runtime error can be handled using try and catch
public class Day55pgm1 {


	public static void main(String[] args) {
		disp();
	}

	static void disp() {
		try {
			disp();
		} 
		catch (StackOverflowError e) {
			System.out.println("Runtime error handled");
		}
	}
}
