package methodoverloading;

/*Method overloading with type casting or type promotion
 (same method names,no of parameters,type of parameters,and datatypes)
 */

class Calculator5 {

	void add(int a, char b) {
		System.out.println("int char");
	}

	void add(char a, int b) {
		System.out.println("char int");
	}
}
public class Day24pgm3 {
public static void main(String[] args) {
	Calculator5 c=new Calculator5();
	//c.add('A','B'); // exception as compiler ambiguous
}
}
