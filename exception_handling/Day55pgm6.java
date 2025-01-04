package exception_handling;
import java.util.Scanner;

//Atm problem using custom exception with getMessage() 
class InvalidPinException1 extends Exception { // created custom exception by extending exception class
	
	@Override
	public String getMessage() {
		return "Invalid Pin";
	}
}

class Atm1 {
	int pin = 123456;
	int p;

	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your pin");
		p = scan.nextInt();
	}

	void verify() throws Exception {
		if (p == pin) {
			System.out.println("Collect your money");
		} 
		else {
			InvalidPinException1 ipe = new InvalidPinException1(); // created InvalidPinException object
			ipe.getMessage();
			throw ipe; //throwing exception object to atm 
		}
	}
}

class Bank1 {
	void init() {
		Atm a = new Atm();
		try {
			a.acceptInput();
			a.verify();
		} 
		catch (Exception e) {
			try {
				a.acceptInput();
				a.verify();
			} 
			catch (Exception f) {
				try {
					a.acceptInput();
					a.verify();
				} 
				catch (Exception g) {
					System.out.println("CARD BLOCKED CONTACT YOUR NEAREST BANK");
				}
			}
		}
	}
}

public class Day55pgm6 {
	public static void main(String[] args) {
		Bank1 b = new Bank1();
		b.init();
	}
}
