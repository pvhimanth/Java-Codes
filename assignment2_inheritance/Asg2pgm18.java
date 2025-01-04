package assignment2_inheritance;

class Property {
	private String propertyId;
	private String adddress;
	private float squareFootage;
	private String propertyType;

	public Property(String propertyId, String adddress, float squareFootage, String propertyType) {
		this.propertyId = propertyId;
		this.adddress = adddress;
		this.squareFootage = squareFootage;
		this.propertyType = propertyType;
	}

	public Property() {
		this("G24569", "Nellore", 1500, "Villa");
		System.out.println("PropertyId: " + propertyId);
		System.out.println("Adddress: " + adddress);
		System.out.println("SquareFootage: " + squareFootage);
		System.out.println("PropertyType: " + propertyType);
	}
}

class ResidentialProperty extends Property {
	int numberOfBedrooms = 4;

	public ResidentialProperty() {
		System.out.println("NumberOfBedrooms: " + numberOfBedrooms);
	}
}

public class Asg2pgm18 {
	public static void main(String[] args) {
		ResidentialProperty rp = new ResidentialProperty();

	}
}
