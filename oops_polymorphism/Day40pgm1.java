package oops_polymorphism;


// Achieved polymorphism by giving parent reference to child object
class Plane0 {

	void takeOff() {
		System.out.println("plane takesoff");
	}

	void fly() {
		System.out.println("Plane files");
	}

	void land() {
		System.out.println("plane lands");
	}

}

class CargoPlane0 extends Plane0 {

	@Override
	void takeOff() {
		System.out.println("Cargo plane takesoff");
	}

	@Override
	void fly() {
		System.out.println("Cargo Plane files ");
	}

	@Override
	void land() {
		System.out.println("Cargo plane lands");
	}
}

class PassengerPlane0 extends Plane0 {

	@Override
	void takeOff() {
		System.out.println("Passenger plane takesoff");
	}

	@Override
	void fly() {
		System.out.println("Passenger Plane files ");
	}

	@Override
	void land() {
		System.out.println("Passenger plane lands");
	}
}

class FighterPlane0 extends Plane0 {

	@Override
	void takeOff() {
		System.out.println("Fighter plane takesoff");
	}

	@Override
	void fly() {
		System.out.println("Fighter Plane files");
	}

	@Override
	void land() {
		System.out.println("Fighter plane lands");
	}
}
public class Day40pgm1 {
public static void main(String[] args) {
	
	
	Plane0 ref;
	CargoPlane0 cp = new CargoPlane0();
	PassengerPlane0 pp = new PassengerPlane0();
	FighterPlane0 fp = new FighterPlane0();
	
	ref=cp;
	ref.takeOff();
	ref.fly();
	ref.land();
	
	ref=pp;
	ref.takeOff();
	ref.fly();
	ref.land();
	
	ref=fp;
	ref.takeOff();
	ref.fly();
	ref.land();
}
}
