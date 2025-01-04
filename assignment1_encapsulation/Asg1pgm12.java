package assignment1_encapsulation;

import java.util.Scanner;

class Menu1{
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
public class Asg1pgm12 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		Menu1[] arrMenu=new Menu1[n];
		for (int i = 0; i < n; i++) {
			Menu1 m = new Menu1();
			
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
			
			arrMenu[i]=m;
		}
        
		for(int i=0;i<n;i++) {
		System.out.println(arrMenu[i].getId());
		System.out.println(arrMenu[i].getName());
		System.out.println(arrMenu[i].getPrice());
		System.out.println(arrMenu[i].getDescription());
		
		}

	}
		
	}


