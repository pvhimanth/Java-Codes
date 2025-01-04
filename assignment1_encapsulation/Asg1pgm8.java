package assignment1_encapsulation;

import java.util.Scanner;

class Restaurant2 {
	private int id;
	private String name;
	private String email;
	private long phone;
	private String address;

	
	public Restaurant2(int id, String name, String email, long phone, String address) {
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

public class Asg1pgm8 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	String input=scan.nextLine();
	
	String[] arr=input.split(",");
	
	int id=Integer.parseInt(arr[0]);
	Long phone=Long.parseLong(arr[3]);

	Restaurant2 r=new Restaurant2(id,arr[1],arr[2],phone,arr[4]);
	
	System.out.println(r.getId());
	System.out.println(r.getName());
	System.out.println(r.getEmail());
	System.out.println(r.getPhone());
	System.out.println(r.getAddress());
	
	
}
}
