package oops_inheritance;

//private members never get inherited

class Person{
//	private int accountNum=9442;
//	private int password=1234; CAUSE ERROR
	
	int accountNum=9442;
    int password=1234;
}

class Hacker extends Person {
	void disp() {
    accountNum=5555;
	password=9994;
	System.out.println(accountNum);
	System.out.println(	password);
	}
	
}

public class Day35pgm1 {
public static void main(String[] args) {
	Hacker h=new Hacker();
	h.disp();
}
}

