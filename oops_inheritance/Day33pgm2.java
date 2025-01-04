package oops_inheritance;

//Multilevel level inheritance (GrandParent,Parent,Child) 
class GrandParent{
	float height=5.11f;
	
	void readBooks() {
		System.out.println("I will read Books");
	}
}

class Parentt extends GrandParent{
	
}

class Childd extends Parentt{
	
}
public class Day33pgm2 {
public static void main(String[] args) {
	Childd c=new Childd();
	System.out.println(c.height);
	c.readBooks();
}
}

