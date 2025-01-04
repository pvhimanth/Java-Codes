package assignment1_encapsulation;

import java.util.Scanner;

class Menu{
	private int id;
	private String name;
	private int price;
	private String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
public class Asg1pgm11 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);

	Menu m = new Menu();

	int id = scan.nextInt();
	m.setId(id);
	
	scan.nextLine();
	String name = scan.nextLine();
	m.setName(name);
	
	int price = scan.nextInt();
	m.setPrice(price);
	
	scan.nextLine();
	String description = scan.nextLine();
	m.setDescription(description);

	System.out.println(m.getId());
	System.out.println(m.getName());
	System.out.println(m.getPrice());
	System.out.println(m.getDescription());
	
}
}
