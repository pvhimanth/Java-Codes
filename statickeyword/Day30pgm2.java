package statickeyword;

//efficient as we declared using as it can be reused many times
import java.util.Scanner;
public class Day30pgm2 {
public static void main(String[] args) {
	BusinessMans b1=new BusinessMans();
	BusinessMans b2=new BusinessMans();
	BusinessMans b3=new BusinessMans();
	
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
class BusinessMans{
	float p;
	float t;
	float si;
	static float r;
	
	static {
		r=15.2f;
	}
	
	void acceptInput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the prinicpal amount");
		p=scan.nextFloat();
		System.out.println("Enter the time duration");
		t=scan.nextFloat();
	}
	void calculateInterest() {
		System.out.println("Simple interst is");
		si=(p*t*r)/100;
	}
	void disp() {
		System.out.println(si);
	}
}

