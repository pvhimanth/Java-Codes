package oops_inheritance;

//single level inheritance (one parent,one child)
class Parent1{
	float height=5.11f;
	
	void readBooks() {
		System.out.println("I will read Books");
	}
}

class Child1 extends Parent1{
	
}

public class Day33pgm1 {
public static void main(String[] args) {
	Child1 c=new Child1();
	System.out.println(c.height);
	c.readBooks();
}
}
