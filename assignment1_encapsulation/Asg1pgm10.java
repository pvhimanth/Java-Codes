package assignment1_encapsulation;

import java.util.Scanner;

class Restaurant4 {
	private int id;
	private String name;
	private String email;
	private long phone;
	private String address;

	
	public Restaurant4(int id, String name, String email, long phone, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
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

	public String getAddress() {
		return address;
	}
}

public class Asg1pgm10 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
	
	int id=scan.nextInt();
	
	scan.nextLine();
	String name=scan.nextLine();
	
	String email=scan.next();
	
	String phone = scan.next();
	
	
	scan.nextLine();
	String address = scan.nextLine();
    
	if(phone.startsWith("6")|| phone.startsWith("7") || phone.startsWith("8") || phone.startsWith("9")) {
		long phoneNo=Long.parseLong(phone);
		Restaurant4 c=new Restaurant4(id,name,email,phoneNo,address);
		
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getEmail());
		System.out.println(c.getPhone());
		System.out.println(c.getAddress());
	}
	
	
}
}
