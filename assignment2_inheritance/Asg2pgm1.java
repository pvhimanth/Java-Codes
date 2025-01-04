package assignment2_inheritance;

class Plane {
	public void takeOff() {
		System.out.println("Plane takeOff");
	}

	public void fly() {
		System.out.println("Plane flies");
	}

	public void land() {
		System.out.println("Plane lands");
	}

}

class CargoPlane extends Plane {

}

class PassengerPlane extends Plane {

}

class FighterPlane extends Plane {

}

public class Asg2pgm1 {
	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();

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
