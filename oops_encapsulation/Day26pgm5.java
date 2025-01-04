package oops_encapsulation;

//constructor overloading using zero parameterized constructor and parameterized constructor 
class Customer4 {
	private int cId;
	private String cName;
	private int cNum;

	public Customer4() {
		cId = 1;
		cName = "Ram";
		cNum = 956454644;
	}

	public Customer4(int cId, String cName, int cNum) {
		this.cId = cId;
		this.cName = cName;
		this.cNum = cNum;
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

public class Day26pgm5 {
	public static void main(String[] args) {

		Customer4 c = new Customer4();
		System.out.println(c.getcId());
		System.out.println(c.getcName());
		System.out.println(c.getcNum());

		Customer4 c2 = new Customer4(18, "Himanth", 630270269);
		System.out.println(c2.getcId());
		System.out.println(c2.getcName());
		System.out.println(c2.getcNum());

	}
}
