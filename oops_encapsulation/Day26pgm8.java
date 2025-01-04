package oops_encapsulation;

//constructor or local chaining using this() call to print parameterized constructor values
class Customer7 {
	private int cId;
	private String cName;
	private int cNum;

	public Customer7() {
		cId = 1;
		cName = "Ram";
		cNum = 956454644;
	}

	public Customer7(String cName) {
		this();
		this.cName = cName;
	}

	public Customer7(int cId, String cName, int cNum) {
		this(cName);

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

public class Day26pgm8 {
	public static void main(String[] args) {
		Customer7 c = new Customer7(18, "Himanth", 630270269);
		System.out.println(c.getcId());
		System.out.println(c.getcName());
		System.out.println(c.getcNum());
	}
}
