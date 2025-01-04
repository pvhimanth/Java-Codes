package oops_interfaces;

class Cinema {
	/*
	 * ERROR--default can't be created in class
	 * 
	 * default void name() {
	 * 
	 * }
	 */
}

// default methods can be implemented by classes
interface Plane {
	default void CargoPlane() {
		System.out.println("CargoPlane fights flies at lower heights");
	}
}

class Fly implements Plane {

}

public class Day47pgm3 {
	public static void main(String[] args) {
		Fly f = new Fly();
		f.CargoPlane();
	}
}
