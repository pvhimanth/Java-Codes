package statickeyword;

//static members can be accessed by anyone
class Test1{
	static int a;
	
	static {
		a=100;
		System.out.println(a);
	}
	
	static void disp(){
		System.out.println(a);
	}
	
	{
		System.out.println(a);
	}
	
	void disp2() {
		System.out.println(a);
	}
	
	Test1(){
		System.out.println(a);
	}
}
public class Day31pgm1 {
public static void main(String[] args) {
}
}
