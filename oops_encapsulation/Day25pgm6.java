package oops_encapsulation;

//accessing data using this keyword with instance variables
class Bank2 {
	int accountNumber;
	int password;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	
	
}
public class Day25pgm6 {
	public static void main(String[] args) {
		Bank2 b=new Bank2();
		b.setAccountNumber(4559);
		b.setPassword(8888);
		System.out.println(b.getAccountNumber());
		System.out.println(b.getPassword());
		

	}
}
