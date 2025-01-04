package oops_encapsulation;

//creating constructor with parameters

class Customer2{
	private int cId;
	private String cName;
	private int cNum;
	public Customer2(int cId,String cName,int cNum) {
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
public class Day26pgm3 {
public static void main(String[] args) {
	Customer2 c=new Customer2(18,"Himanth",630270269);
	System.out.println(c.getcId());
	System.out.println(c.getcName());
	System.out.println(c.getcNum());
}
}
