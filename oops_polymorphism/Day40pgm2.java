package oops_polymorphism;

/* Achieving polymorphism through code flexibility and code reduction,
 * in here we created separate class with method having parent ref as parameter,
 * so we need not need to create parent ref at main method just by calling method 
 * and passing object address we can achieve polymorphism
 */

class Plane11 {

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

class CargoPlane11 extends Plane11 {

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

class PassengerPlane11 extends Plane11 {

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

class FighterPlane11 extends Plane11 {

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

class Airport{
	public void permit(Plane11 ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}
public class Day40pgm2 {
	public static void main(String[] args) {
		
		CargoPlane11 cp = new CargoPlane11();
		PassengerPlane11 pp = new PassengerPlane11();
		FighterPlane11 fp = new FighterPlane11();
		
		Airport a=new Airport();
		
		a.permit(cp); /*this cp gives address of child object 
		            at parameter ref and points to CargoPlane11 object */
	
		a.permit(pp);
		a.permit(fp);

	}
}
