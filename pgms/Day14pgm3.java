package pgms;

// Takes Input No Output
class Calculator3{
	int c;
	void add(int a,int b) {
		c=a+b;
		System.out.println(c);
	}
}
public class Day14pgm3 {
public static void main(String[] args) {
	Calculator3 calc=new Calculator3();
	int num1=50;
	int num2=40;
	calc.add(num1, num2);
}
}
