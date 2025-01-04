package methodoverridingrules;

//can't change the no of parameters during method overriding

class Demop {

	void disp() {
		System.out.println("Hi");
	}
}

class Demoq extends Demop {
/* ERROR can't change no,type of parameters 
 * 
 	@Override
	void disp(int a,int b) {
		System.out.println("Hello");
	}
 */
	
	// but here works as here follows method overloading concept
	void disp(int a,int b) {
		System.out.println("Hello");
	}
}

public class Day37pgm4 {

	public static void main(String[] args) {
		Demoq d = new Demoq();
		d.disp();
		d.disp(100,200);
	}

}
