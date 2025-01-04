package assignment1_encapsulation;

import java.util.Scanner;

class Restaurant{
	private int id;
	private String name;
	private String email;
	private long phone;
	private String address;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public long getPhone() {
		return phone;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}
}

public class Asg1pgm6 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	Restaurant c = new Restaurant();

	int id = scan.nextInt();
	c.setId(id);
	
	scan.nextLine();
	String name = scan.nextLine();
	c.setName(name);
	
	String email = scan.next();
	c.setEmail(email);
	
	long phone = scan.nextLong();
	c.setPhone(phone);
	
	scan.nextLine();
	String address = scan.nextLine();
	c.setAddress(address);

	System.out.println(c.getId());
	System.out.println(c.getName());
	System.out.println(c.getEmail());
	System.out.println(c.getPhone());
	System.out.println(c.getAddress());
}
}
