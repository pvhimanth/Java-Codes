package oops_encapsulation;

/* accesing data with same name of instance variable and local variables 
   using gettters and setters(without using this keyword)---->print 0 0 as default
   values of instance varables
 */
class Bank1 {
	int accountNumber;
	int password;

	public void setAccountNumber(int accountNumber) {
		accountNumber = accountNumber;
	}

	public void setPassword(int password) {
		password = password;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getPassword() {
		return password;
	}

}

public class Day25pgm5 {
	public static void main(String[] args) {
		Bank1 b=new Bank1();
		b.setAccountNumber(4569);
		b.setPassword(7777);
		System.out.println(b.getAccountNumber());
		System.out.println(b.getPassword());
		

	}
}
