package oops_encapsulation;

//Printing values with default constructor

class Customer3{
	private int cId;
	private String cName;
	private int cNum;
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
public class Day26pgm4 {
public static void main(String[] args) {
	Customer3 c=new Customer3();
	System.out.println(c.getcId());
	System.out.println(c.getcName());
	System.out.println(c.getcNum());
}
}
