package oops_inheritance;

//Hierarchical level inheritance (one parent,multiple childs) 

class Parenttt {
	float height = 5.11f;

	void readBooks() {
		System.out.println("I will read Books");
	}
}

class Childd1 extends Parentt {

}

class Childd2 extends Parentt {

}

class Childd3 extends Parentt {

}

public class Day33pgm3 {
	public static void main(String[] args) {
		
		Childd1 c1 = new Childd1();
		System.out.println(c1.height);
		c1.readBooks();
		
		Childd2 c2 = new Childd2();
		System.out.println(c2.height);
		c2.readBooks();
		
		Childd3 c3 = new Childd3();
		System.out.println(c3.height);
		c3.readBooks();
	}
}
