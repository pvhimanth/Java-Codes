package exception_handling;

// handling the checked exception
public class Day54pgm1 {
	public static void main(String[] args) {
		for (int i = 65; i <= 69; i++) {
			System.out.println((char) i);
			try {
				Thread.sleep(3000); // checked exception if not handled
			} 
			catch (Exception e) {
				System.out.println("Handled");
			}
		}
	}
}
