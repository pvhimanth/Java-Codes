package oops_encapsulation;

//constructor or local chaining using this() call
class Customer5 {
	private int cId;
	private String cName;
	private int cNum;

	public Customer5() {
		cId = 1;
		cName = "Ram";
		cNum = 956454644;
	}

	public Customer5(int cId, String cName, int cNum) {
		this();
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
public class Day26pgm6 {
public static void main(String[] args) {
	Customer5 c = new Customer5(18, "Himanth", 630270269);
	System.out.println(c.getcId());
	System.out.println(c.getcName());
	System.out.println(c.getcNum());
}
}
