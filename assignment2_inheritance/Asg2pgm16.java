package assignment2_inheritance;

class Vehicle1 {
	private String vehicleId;
	private String manufacturer;
	private String model;
	private int year;

	

	public Vehicle1(String vehicleId, String manufacturer, String model, int year) {
		this.vehicleId = vehicleId;
		this.manufacturer = manufacturer;
		this.model = model;
		this.year = year;
	}



	public Vehicle1() {
		this("AP 26 0007", "Mercedes", "W11", 2020);
		System.out.println("VehicleId: "+vehicleId);
		System.out.println("Manufacturer: "+manufacturer);
		System.out.println("Model: "+model);
		System.out.println("Year: "+year);
	}
}

class Car1 extends Vehicle1 {
	String fuelType ="Diesel";

	public Car1() {
		System.out.println("FuelType: "+fuelType);
	}
}

public class Asg2pgm16 {
	public static void main(String[] args) {
		Car1 c = new Car1();

	}
}
