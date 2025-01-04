package oops_encapsulation;

//accessing data in bank using getters and setters with different method names
class Bank{
	int accountNumber;
	int password;
	
	public void setData1(int x) {
		accountNumber=x;
	}
	public void setData2(int y) {
		password=y;
	}
	public int getData1() {
		return accountNumber;
	}
	public int getData2() {
		return password;
	}
	
}
public class Day25pgm4 {
public static void main(String[] args) {
	Bank b=new Bank();
	b.setData1(5657);
	b.setData2(6666);
	System.out.println(b.getData1());
	System.out.println(b.getData2());

}
}
