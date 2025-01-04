package assignment2_inheritance;

class Product {
	private String productID;
	private String productName;
	private int price;
	private int quantityInStock;

	public Product(String productID, String productName, int price, int quantityInStock) {
		this.productID = productID;
		this.productName = productName;
		this.price = price;
		this.quantityInStock = quantityInStock;
	}

	public Product() {
		this("I15", "Iphone", 150000, 10000);
		System.out.println("ProductID: " + productID);
		System.out.println("ProductName: " + productName);
		System.out.println("Price: " + price);
		System.out.println("QuantityInStock: " + quantityInStock);
	}

}

class ElectronicProduct extends Product {
	int warrantyPeriod = 2;

	public ElectronicProduct() {
		System.out.println("WarrantyPeriod: " + warrantyPeriod);
	}
}

public class Asg2pgm21 {
	public static void main(String[] args) {
		ElectronicProduct ep = new ElectronicProduct();
	}
}
