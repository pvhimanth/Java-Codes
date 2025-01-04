package assignment2_inheritance;

import java.util.Scanner;

class MenuItemD {
	private int itemId;
	private String itemName;
	private int price;
	private String category;

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	void display() {
		System.out.println("Item ID: " + itemId);
		System.out.println("Item Name: " + itemName);
		System.out.println("Price: " + price);
		System.out.println("Category: " + category);
	}
}

class BeverageD extends MenuItemD {
	float caffeineContent;

	public BeverageD(float caffeineContent) {
		this.caffeineContent = caffeineContent;
	}

}

class MainCourse extends MenuItemD {
	int calories;
	String cuisineType;

	public MainCourse(int calories, String cuisineType) {
		this.calories = calories;
		this.cuisineType = cuisineType;
	}

}

public class Asg2pgm25 {
	public static void main(String[] args) {
		System.out.println("Enter your choice");
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			String choice = scan.nextLine();
		}
		System.out.println("Enter the MenuItem:");
		String menu = scan.nextLine();
		String[] arr = menu.split(",");

		MenuItemD mi = new MenuItemD();
		mi.setItemId(101);
		mi.setItemName(arr[0]);
		int p = Integer.parseInt(arr[1]);
		mi.setPrice(p);
		mi.setCategory(arr[2]);

		float cc = Float.parseFloat(arr[3]);
		BeverageD mc = new BeverageD(cc);

		mi.display();
		System.out.println("CaffeineContent: " + mc.caffeineContent);

	}
}
