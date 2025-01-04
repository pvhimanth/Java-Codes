package assignment2_inheritance;

class Account {
	private int accountNumber;
	private String accountHolder;
	private int balance;
	private String accountType;

	public Account(int accountNumber, String accountHolder, int balance, String accountType) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
		this.accountType = accountType;
	}

	public Account() {
		this(56024, "Himanth", 1000000, "Savings");
		System.out.println("AccountNumber: "+accountNumber);
		System.out.println("AccountHolder: "+accountHolder);
		System.out.println("Balance: "+balance);
		System.out.println("AccountType: "+accountType);
	}
}

class SavingsAccount extends Account {
	float interestRate = 3.6f;

	public SavingsAccount() {
		System.out.println("InterestRate: "+interestRate);
	}
}

public class Asg2pgm15 {
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount();

	}
}
