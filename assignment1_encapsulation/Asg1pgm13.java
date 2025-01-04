package assignment1_encapsulation;

import java.util.Scanner;

class Menu2{
	private int id;
	private String name;
	private int price;
	private String description;
	
	
	public Menu2(int id, String name, int price, String description) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String getDescription() {
		return description;
	}
	
}

public class Asg1pgm13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();
		String[] arr = input.split(",");

		int id = Integer.parseInt(arr[0]);

		int price = Integer.parseInt(arr[2]);

		Menu2 m = new Menu2(id, arr[1],price,arr[3]);

		System.out.println(m.getId());
		System.out.println(m.getName());
		System.out.println(m.getPrice());
		System.out.println(m.getDescription());
		
	}
}
