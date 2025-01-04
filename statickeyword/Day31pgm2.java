package statickeyword;

//instance members can be accessed by instance members only 
class Test2{
	static int a;
	int x;
	
	static {
		a=100;
//		x=200; --error
		System.out.println(a);
	}
	
	static void disp(){
//		System.out.println(x);---error
		System.out.println(a);
	}
	
	{
		System.out.println(x);
		System.out.println(a);
	}
	
	void disp2() {
		System.out.println(x);
		System.out.println(a);
	}
	
	Test2(){
		System.out.println(x);
		System.out.println(a);
	}
}
public class Day31pgm2 {

}
