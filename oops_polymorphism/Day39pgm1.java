package oops_polymorphism;

/* Achieving Polymorphism through loose coupling
   (child object having parent reference)
 */

class Plane {
	void fly() {
		System.out.println("Plane files");
	}
}

class CargoPlane extends Plane {
	@Override
	void fly() {
		System.out.println("Cargo Plane files at lower heights");
	}
}

class PassengerPlane extends Plane {
	@Override
	void fly() {
		System.out.println("Passenger Plane files at medium heights");
	}
}

class FighterPlane extends Plane {
	@Override
	void fly() {
		System.out.println("Fighter Plane files at any heights");
	}
}

public class Day39pgm1 {
	public static void main(String[] args) {

		Plane ref; // parent reference
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();

		/*
		 * here 3 different statements use to print 3 different outputs 3:3 which is 1:1
		 * not achieve polymorphism cp.fly(); pp.fly(); fp.fly();
		 */

		// same ref.fly() statements gives 3 outputs
		ref = cp;
		ref.fly();

		ref = pp;
		ref.fly();

		ref = fp;
		ref.fly();

	}
}
