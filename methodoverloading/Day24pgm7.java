package methodoverloading;

// Return type doesn't participate in method overloading

class Calculator6 {
	void disp(int a, int b) {
		System.out.println("1");
	}

	int disp(int a, float b) {
		System.out.println("2");
		return 100;
	}

}

public class Day24pgm7 {
	public static void main(String[] args) {
		Calculator6 c = new Calculator6();
		c.disp(25, 90);
		
		c.disp(20, 30.3f);
	}
}
