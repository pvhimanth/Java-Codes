package assignment1_encapsulation;

import java.util.Scanner;

class Restaurant1{
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

public class Asg1pgm7 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);


	int n = scan.nextInt();
	Restaurant1[] arrRes=new Restaurant1[n];
	for (int i = 0; i < n; i++) {
		Restaurant1 r = new Restaurant1();
		
		int id = scan.nextInt();
		r.setId(id);
		
		scan.nextLine();
		String name = scan.nextLine();
		r.setName(name);
		
		String email = scan.next();
		r.setEmail(email);
		
		long phone = scan.nextLong();
		r.setPhone(phone);
		
		scan.nextLine();
		String address = scan.nextLine();
		r.setAddress(address);
		
		arrRes[i]=r;
	}
    
	for(int i=0;i<n;i++) {
	System.out.println(arrRes[i].getId());
	System.out.println(arrRes[i].getName());
	System.out.println(arrRes[i].getEmail());
	System.out.println(arrRes[i].getPhone());
	System.out.println(arrRes[i].getAddress());
	}

}
}
