package assignment1_encapsulation;

import java.util.Scanner;

class Customer4 {
	private int id;
	private String name;
	private String email;
	private long phone;
	private String password;
	private String address;

	public Customer4(int id, String name, String email, long phone, String password, String address) {
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

public class Asg1pgm5 {
public static void main(String[] args) {
	
Scanner scan = new Scanner(System.in);
	
	int id=scan.nextInt();
	String name=scan.next();
	String email=scan.next();
	String phone = scan.next();
	String password = scan.next();
	scan.nextLine();
	String address = scan.nextLine();
    
	Customer4 c=null;
	if(phone.startsWith("6")|| phone.startsWith("7") || phone.startsWith("8") || phone.startsWith("9")) {
		long phoneNo=Long.parseLong(phone);
		c=new Customer4(id,name,email,phoneNo,password,address);
	}
	
	System.out.println(c.getId());
	System.out.println(c.getName());
	System.out.println(c.getEmail());
	System.out.println(c.getPhone());
	System.out.println(c.getPassword());
	System.out.println(c.getAddress());
}
}
