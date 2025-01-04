package oops_encapsulation;

class Customer1{
	private int cId;
	private String cName;
	private int cNum;
	
	public void setData(int cId,String cName,int cNum) {
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
public class Day26pgm2 {
	public static void main(String[] args) {
		Customer1 c=new Customer1();
		c.setData(18,"Himanth",630270269);
		System.out.println(c.getcId());
		System.out.println(c.getcName());
		System.out.println(c.getcNum());

	}
}
