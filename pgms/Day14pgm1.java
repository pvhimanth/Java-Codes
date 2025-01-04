package pgms;

// No input No Output
class Calculator {
	int a = 40;
	int b = 50;

	void add() {
		int c;
		c = a + b;
		System.out.println(c);
	}
}

public class Day14pgm1 {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add();	
	}

}
