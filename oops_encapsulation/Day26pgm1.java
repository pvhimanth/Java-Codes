package oops_encapsulation;

//creating n setter and n getters	
class Customer{
	private int cId;
	private String cName;
	private int cNum;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getcNum() {
		return cNum;
	}
	public void setcNum(int cNum) {
		this.cNum = cNum;
	}

}
public class Day26pgm1 {
public static void main(String[] args) {
	Customer c=new Customer();
	c.setcId(18);
	c.setcName("Himanth");
	c.setcNum(630270269);
	System.out.println(c.getcId());
	System.out.println(c.getcName());
	System.out.println(c.getcNum());

}
}
