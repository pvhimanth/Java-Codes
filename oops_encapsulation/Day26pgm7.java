package oops_encapsulation;

//constructor or local chaining using this() call to print parameterized constructor values
class Customer6 {
	private int cId;
	private String cName;
	private int cNum;

	public Customer6() {
		cId = 1;
		cName = "Ram";
		cNum = 956454644;
	}

	public Customer6(int cId, String cName, int cNum) {
		this();
		this.cId=cId;
		this.cName=cName;
		this.cNum=cNum;
	}

	public int getcId() {
		return cId;
	}

	public String getcName() {
		return cName;
	}

	public int getcNum() {
		return cNum;
	}

}
public class Day26pgm7 {
public static void main(String[] args) {
	Customer6 c = new Customer6(18, "Himanth", 630270269);
	System.out.println(c.getcId());
	System.out.println(c.getcName());
	System.out.println(c.getcNum());
}
}
