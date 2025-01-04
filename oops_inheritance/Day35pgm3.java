package oops_inheritance;

//Inherited,Overridden,Specialized methods

class Plane {
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

class CargoPlane extends Plane {
	@Override
	void fly() {
		System.out.println("CargoPlane flies at lower heights");
	}

	void carryCargo() {
		System.out.println("CargoPlane carries goods");
	}

}

class PassengerPlane extends Plane {
	@Override
	void fly() {
		System.out.println("PassengerPlane flies at medium heights");
	}

	void carryPassengers() {
		System.out.println("PassengerPlane carries passengers");
	}
}

class FighterPlane extends Plane {
	@Override
	void fly() {
		System.out.println("FighterPlane flies at any heights");
	}

	void carryWeapons() {
		System.out.println("FighterPlane carries weapons");
	}
}

public class Day35pgm3 {
	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();

		cp.takeOff();
		cp.fly();
		cp.land();
		cp.carryCargo();

		System.out.println("--------------------------");

		pp.takeOff();
		pp.fly();
		pp.land();
		pp.carryPassengers();

		System.out.println("--------------------------");
		fp.takeOff();
		fp.fly();
		fp.land();
		fp.carryWeapons();

	}
}
