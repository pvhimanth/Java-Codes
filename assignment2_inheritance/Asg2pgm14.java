package assignment2_inheritance;

class Plane1 {
	void takeOff() {
		System.out.println("Plane is taking off");
	}

	void fly() {
		System.out.println("Plane flies");
	}

	void land() {
		System.out.println("Plane is landing");
	}

}

class CargoPlane1 extends Plane1 {
	@Override
	void fly() {
		System.out.println("CargoPlane flies at lower heights");
	}

}

class PassengerPlane1 extends Plane1 {
	@Override
	void fly() {
		System.out.println("PassengerPlane flies at medium heights");
	}
}

class FighterPlane1 extends Plane1 {
	@Override
	void fly() {
		System.out.println("FighterPlane flies at any heights");
	}

}

public class Asg2pgm14 {
	public static void main(String[] args) {
		CargoPlane1 cp = new CargoPlane1();
		PassengerPlane1 pp = new PassengerPlane1();
		FighterPlane1 fp = new FighterPlane1();

		cp.takeOff();
		cp.fly();
		cp.land();

		pp.takeOff();
		pp.fly();
		pp.land();

		fp.takeOff();
		fp.fly();
		fp.land();

	}
}
