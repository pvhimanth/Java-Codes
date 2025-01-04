package statickeyword;

//static members can execute without creating object using class
class Test3{
	static int a=100;
	
	static {
		System.out.println(a);
	}
	
	static void disp(){
		System.out.println(a);
	}
}
	
public class Day31pgm3 {
 public static void main(String[] args) {
	Test3 t=new Test3();
	System.out.println(Test3.a);
	Test3.disp();
	
}
}
