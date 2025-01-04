package methodoverloading;

//Method overloading with same method names 

class Calculator2 {
	void add(int a, int b) {
		System.out.println(a + b);
	}

	void add(int a, float b) {
		System.out.println(a + b);
	}

	void add(float a, int b) {
		System.out.println(a + b);
	}

	void add(int a, int b, int c) {
		System.out.println(a + b);
	}

	void add(int a, float b, double c) {
		System.out.println(a + b + c);
	}

	void add(float a, int b, double c) {
		System.out.println(a + b + c);
	}

	void add(int a, int b, int c, int d) {
		System.out.println("int int int int");
	}
}

public class Day23pgm2 {
	public static void main(String[] args) {
		Calculator2 calc = new Calculator2();
		calc.add(12, 45.6f);
		calc.add(60, 6.6f, 4466.556646);
		calc.add(100, 200, 300, 400);
		calc.add(5, 30);
	}
}
