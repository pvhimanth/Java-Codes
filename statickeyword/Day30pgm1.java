package statickeyword;

//not efficient as we used r as many times as objects created
import java.util.Scanner;
public class Day30pgm1 {
public static void main(String[] args) {
	BusinessMan b1=new BusinessMan();
	BusinessMan b2=new BusinessMan();
	BusinessMan b3=new BusinessMan();
	
	b1.acceptInput();
	b1.calculateInterest();
	b1.disp();
	
	b2.acceptInput();
	b2.calculateInterest();
	b2.disp();
	
	b3.acceptInput();
	b3.calculateInterest();
	b3.disp();

}
}
class BusinessMan{
	float p;
	float t;
	float si;
	float r;
	
	void acceptInput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the prinicpal amount");
		p=scan.nextFloat();
		System.out.println("Enter the time duration");
		t=scan.nextFloat();
		r=15.2f;
	}
	void calculateInterest() {
		System.out.println("Simple interst is");
		si=(p*t*r)/100;
	}
	void disp() {
		System.out.println(si);
	}
}
