package methodoverloading;


// Method overloading with type casting or type promotion

class Calculator4 {

	void add(int a, char b) {
		System.out.println("int char");
	}

	void add(byte a, int b) {
		System.out.println("byte int");
	}
}
public class Day24pgm2 {
public static void main(String[] args) {
	Calculator4 c=new Calculator4();
	c.add('A','B'); // print int char
	
}
}
