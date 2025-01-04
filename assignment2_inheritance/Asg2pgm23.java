package assignment2_inheritance;

class MenuItem {
	private String itemID;
	private String itemName;
	private int price;
	private String category;

	public MenuItem(String itemID, String itemName, int price,String category) {
		this.itemID = itemID;
		this.itemName = itemName;
		this.price = price;
		this.category = category;
	}

	public MenuItem() {
		this("QSR345", "Nescafe", 1000,"Coffee");
		System.out.println("ItemID: " + itemID);
		System.out.println("ItemName: " + itemName);
		System.out.println("Price: " + price);
		System.out.println("Category: " + category);
	}

}

class Beverage extends MenuItem {
	float caffeineContent = 50.0f;

	public Beverage() {
		System.out.println("CaffeineContent: " + caffeineContent);
	}
}

public class Asg2pgm23 {
	public static void main(String[] args) {
		Beverage b = new Beverage();
	}
}
