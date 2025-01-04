package assignment1_encapsulation;

import java.util.Scanner;

class Customer {
	private int id;
	private String name;
	private String email;
	private long phone;
	private String password;
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

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}
}

public class Asg1pgm1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Customer c = new Customer();

		int id = scan.nextInt();
		c.setId(id);
		String name = scan.next();
		c.setName(name);
		String email = scan.next();
		c.setEmail(email);
		long phone = scan.nextLong();
		c.setPhone(phone);
		String password = scan.next();
		c.setPassword(password);
		
		scan.nextLine();
		String address = scan.nextLine();
		c.setAddress(address);

		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getEmail());
		System.out.println(c.getPhone());
		System.out.println(c.getPassword());
		System.out.println(c.getAddress());

	}
}
