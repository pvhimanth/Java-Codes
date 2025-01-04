package oops_inheritance;

//Hybrid inheritance - mixture of different inheritances

class GrandParentt{
	float height=5.11f;
	
	void readBooks() {
		System.out.println("I will read Books");
	}
}

class Parentttt extends GrandParentt{

}

class Childdd1 extends Parenttt {

}

class Childdd2 extends Parenttt {

}

class Childdd3 extends Parenttt {

}

public class Day33pgm4 {
	public static void main(String[] args) {
		
		Childdd1 c1 = new Childdd1();
		System.out.println(c1.height);
		c1.readBooks();
		
		Childdd2 c2 = new Childdd2();
		System.out.println(c2.height);
		c2.readBooks();
		
		Childdd3 c3 = new Childdd3();
		System.out.println(c3.height);
		c3.readBooks();
	}
}
