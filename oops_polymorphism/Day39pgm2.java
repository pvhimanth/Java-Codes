package oops_polymorphism;

//Accesing specialized methods of child with parent reference through down casting

class Plane1 {
	void fly() {
		System.out.println("Plane files");
	}
	
}

class CargoPlane1 extends Plane1 {
	@Override
	void fly() {
		System.out.println("Cargo Plane files at lower heights");
	}
	
	void carryCargo() {
		System.out.println("Cargo Plane carries goods");
	}
}

class PassengerPlane1 extends Plane1 {
	@Override
	void fly() {
		System.out.println("Passenger Plane files at medium heights");
	}
	
	void carryPassengers() {
		System.out.println("Passenger Plane carries passengers");
	}
}

class FighterPlane1 extends Plane1 {
	@Override
	void fly() {
		System.out.println("Fighter Plane files at any heights");
	}
	
	void carryWeapons() {
		System.out.println("Fighter Plane carries weapons");
	}
}

public class Day39pgm2 {
public static void main(String[] args) {
	
	Plane1 ref; // parent reference
	CargoPlane1 cp = new CargoPlane1();
	PassengerPlane1 pp = new PassengerPlane1();
	FighterPlane1 fp = new FighterPlane1();
	
	ref = cp;
	((CargoPlane1)(ref)).carryCargo(); //parents refereence behaves like a child to access specialized methods
	
	ref = pp;
	((PassengerPlane1)(ref)).carryPassengers();

	ref = fp;
	((FighterPlane1)(ref)).carryWeapons();

	
}
}
