package assignment2_inheritance;

class Vehicle {
	String make;
	String model;

	void startEngine() {
		System.out.println("Engine Started");
	}

	void stopEngine() {
		System.out.println("Stopping Engine");
	}
}

class Car extends Vehicle {
	
	void accelerate() {
		System.out.println("Car started Accelerating");
	}
}

class Motorcycle extends Vehicle {
	void accelerate() {
		System.out.println("MotorCycle started Accelerating");
	}
}

class Truck extends Vehicle {
	void accelerate() {
		System.out.println("Truck started Accelerating");
	}
}

public class Asg2pgm4 {
	public static void main(String[] args) {
		Car c = new Car();
		Motorcycle m = new Motorcycle();
		Truck t = new Truck();

		c.startEngine();
		c.accelerate();
		c.stopEngine();

		m.startEngine();
		m.accelerate();
		m.stopEngine();

		t.startEngine();
		t.accelerate();
		t.stopEngine();

	}
}
