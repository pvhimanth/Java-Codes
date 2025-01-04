package oops_encapsulation;

//accessing secure data using getters and setters
class Ac1{
	private String coolant;
	
	public void setData(String x){
		coolant=x;
	}
	public String getData(){
		return coolant;
	}
}
public class Day25pgm3 {
public static void main(String[] args) {
	Ac1 a=new Ac1();
	a.setData("Liquid");
	System.out.println(a.getData());
}
}
