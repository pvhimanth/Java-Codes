package exception_handling;
import java.util.Scanner;

//Atm problem using custom exception
class InvalidPinException extends Exception { // created custom exception by extending exception class

}

class Atm {
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
			System.out.println("Invalid pin");
			InvalidPinException ipe = new InvalidPinException(); // created InvalidPinException object
			throw ipe; //throwing exception object to atm 
		}
	}
}

class Bank {
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

public class Day55pgm5 {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.init();
	}
}
