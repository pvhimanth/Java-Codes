package assignment1_encapsulation;

import java.util.Scanner;

class Customer3 {
	private int id;
	private String name;
	private String email;
	private long phone;
	private String password;
	private String address;

	public Customer3(int id, String name, String email, long phone, String password, String address) {
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
public class Asg1pgm4 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int id=scan.nextInt();
	String name=scan.next();
	String email=scan.next();
	long phone = scan.nextLong();
	String password = scan.next();
	scan.nextLine();
	String address = scan.nextLine();
    
	Customer3 c=null;
	if(email.contains("gmail.com") || email.contains("yahoo.com")) {
		c=new Customer3(id,name,email,phone,password,address);
	}
	//	else {
	//		c=new Customer3(id,name,"invalid email",phone,password,address);
	//	}
	
    
	System.out.println(c.getId());
	System.out.println(c.getName());
	System.out.println(c.getEmail());
	System.out.println(c.getPhone());
	System.out.println(c.getPassword());
	System.out.println(c.getAddress());

}
}
