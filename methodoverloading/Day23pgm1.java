package methodoverloading;

// Method overloading with different method names-confusion to remember methods

class Calculator {

	void add1(int a, int b) {
		System.out.println(a + b);
	}

	void add2(int a, float b) {
		System.out.println(a + b);
	}

	void add3(float a, int b) {
		System.out.println(a + b);
	}

	void add4(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	void add5(int a, float b, double c) {
		System.out.println(a + b + c);
	}

	void add6(float a, int b, double c) {
		System.out.println(a + b + c);
	}

	void add7(int a, int b, int c, int d) {
		System.out.println("int int int int");
	}
}

public class Day23pgm1 {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add2(2, 66.6f);
		calc.add5(45, 5.6f, 313.3431413431);
		calc.add7(40, 50, 60, 90);
	}
}
