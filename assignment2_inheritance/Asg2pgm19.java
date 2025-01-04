package assignment2_inheritance;

class DeviceD {
	private String deviceID;
	private String brand;
	private String model;
	private int price;

	public DeviceD(String deviceID, String brand, String model, int price) {
		this.deviceID = deviceID;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public DeviceD() {
		this("HP28947", "HP", "Pavilion-15", 75000);
		System.out.println("DeviceID: " + deviceID);
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Price: " + price);
	}
}

class LaptopD extends DeviceD {
	String processorType = "Intel i5";

	public LaptopD() {
		System.out.println("ProcessorType: " + processorType);
	}
}

public class Asg2pgm19 {
	public static void main(String[] args) {
		LaptopD rp = new LaptopD();

	}
}
