package assignment1_encapsulation;

import java.util.Scanner;

class Customer2 {
	private int id;
	private String name;
	private String email;
	private long phone;
	private String password;
	private String address;

	public Customer2(int id, String name, String email, long phone, String password, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public long getPhone() {
		return phone;
	}

	public String getPassword() {
		return password;
	}

	public String getAddress() {
		return address;
	}
}

public class Asg1pgm3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();
		String[] arr = input.split(",");

		int id = Integer.parseInt(arr[0]);

		long phone = Long.parseLong(arr[3]);

		Customer2 c = new Customer2(id, arr[1], arr[2], phone, arr[4], arr[5]);

		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getEmail());
		System.out.println(c.getPhone());
		System.out.println(c.getPassword());
		System.out.println(c.getAddress());

	}
}
