package pgms;

// No input returns Output
class Calculator1 {
	int a = 10;
	int b = 50;

	int add() {
		int c;
		c = a + b;
		return c;
	}
}

public class Day14pgm2 {
public static void main(String[] args) {
	Calculator1 calc=new Calculator1();
	int res=calc.add();
	System.out.println(res);
	
	
}
}
