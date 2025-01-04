package methodoverridingrules;

// Accessing parent class variable from child class using super keyword

class Exp{
	int i=9;
}

class Gxp extends Exp{
	int i=999;
	
	void disp() {
		System.out.println(i);
		System.out.println(super.i); // super keyword
	}
}
public class Day37pgm7 {
public static void main(String[] args) {
	Gxp g=new Gxp();
	g.disp();
}
}
