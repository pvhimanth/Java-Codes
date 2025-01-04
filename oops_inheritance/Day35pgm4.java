package oops_inheritance;

//final variables can't be modified but can be inherited

/* ERROR
 * 
 * class Alpha{
	final float PI=3.142f;
	void disp() {
		PI=4.142f;
		System.out.println(PI);
	}
}
 */

class Alpha{
	final float PI=3.142f;
	void disp() {
		System.out.println(PI);
	}
}

class Beta extends Alpha{
	void disp1() {
		System.out.println(PI);
	}
}

public class Day35pgm4 {
public static void main(String[] args) {
	Alpha a=new Alpha();
	a.disp();
	
	Beta b=new Beta();
	b.disp();
}
}
