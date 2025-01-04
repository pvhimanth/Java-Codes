package assignment1_encapsulation;

import java.util.Scanner;

class Customer1 {
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

public class Asg1pgm2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);


		int n = scan.nextInt();
		Customer1[] arrCustomer=new Customer1[n];
		for (int i = 0; i < n; i++) {
			Customer1 c = new Customer1();
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
			
			arrCustomer[i]=c;
		}
        
		for(int i=0;i<n;i++) {
		System.out.println(arrCustomer[i].getId());
		System.out.println(arrCustomer[i].getName());
		System.out.println(arrCustomer[i].getEmail());
		System.out.println(arrCustomer[i].getPhone());
		System.out.println(arrCustomer[i].getPassword());
		System.out.println(arrCustomer[i].getAddress());
		}

	}
}
