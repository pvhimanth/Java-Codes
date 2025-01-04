package assignment1_encapsulation;


import java.util.Scanner;

class Restaurant3 {
	private int id;
	private String name;
	private String email;
	private long phone;
	private String address;

	
	public Restaurant3(int id, String name, String email, long phone, String address) {
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

public class Asg1pgm9 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int id = scan.nextInt();
	
	scan.nextLine();
	String name = scan.nextLine();
	
	String email = scan.next();
	
	long phone = scan.nextLong();
	
	scan.nextLine();
	String address = scan.nextLine();
	
	String check="@"+name.replaceAll("\\s+", "").toLowerCase()+".com";
	
	Restaurant3 r=null;
	if(email.contains(check)) {
		
		 r=new Restaurant3(id,name,email,phone,address);
	}
	
	System.out.println(r.getId());
	System.out.println(r.getName());
	System.out.println(r.getEmail());
	System.out.println(r.getPhone());
	System.out.println(r.getAddress());
	
    
	
}
}
