package oops_interfaces;

// Rule 10: Variables inside interface are public, static and final

interface CalculatorS {
	int COUNT = 7;
}

class Demo implements CalculatorS {
	void change() {
//		COUNT=7; ---> can't change variable value as it is final
	}
}

public class Day46pgm8 {
	public static void main(String[] args) {
		System.out.println(Demo.COUNT); // access variable with class as it is static
	}
}
