package exception_handling;

import java.util.Scanner;

//Driving license problem using custom exception 
class UnderAgeException extends Exception { // created custom exception by extending exception class

}

class OverAgeException extends Exception {

}

class DrivingLicense {
	int age;

	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Age");
		age = scan.nextInt();
	}

	void verify() throws Exception {
		if (age >= 18 && age <= 65) {
			System.out.println("Collect your driving License");
		} 
		else if (age < 18) {
			System.out.println("Your are kid, driving license issued at at age 18");
			UnderAgeException uae = new UnderAgeException(); // created UnderAgeException object
			throw uae; // throwing exception object to Rto
		} 
		else if (age > 65) {
			System.out.println("Your are Old, not eligible to issue new driving license");
			OverAgeException oae = new OverAgeException(); // created OverAgeException object
			throw oae; // throwing exception object to Rto
		}
	}
}

class Rto {
	void init() {
		DrivingLicense d = new DrivingLicense();
		try {
			d.acceptInput();
			d.verify();
		} 
		catch (Exception e) {
			try {
				d.acceptInput();
				d.verify();
			} 
			catch (Exception f) {
				try {
					d.acceptInput();
					d.verify();
				} 
				catch (Exception g) {
					System.out.println("YOUR PROFILE IS BLOCKED");
				}
			}
		}

	}
}

public class Day56pgm1 {
	public static void main(String[] args) {
		Rto r = new Rto();
		r.init();
	}
}
