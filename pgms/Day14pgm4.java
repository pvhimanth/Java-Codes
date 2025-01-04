package pgms;

class Calculator4{
	int c;
	int add(int a,int b) {
		c=a+b;
		return c;
	}
}
public class Day14pgm4 {
public static void main(String[] args) {
	Calculator4 calc=new Calculator4();
	int num1=40;
	int num2=35;
	int res=calc.add(num1, num2);
	System.out.println(res);
}
}
