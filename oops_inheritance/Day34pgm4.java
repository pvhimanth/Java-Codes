package oops_inheritance;

/* calling one constructor of one class to 
 * constructor of another class with arguments ,this() and using super() call
 */

class Test1111{
	int x;
	int y;
	
	Test1111(){
		x=100;
		y=200;
	}
	
	Test1111(int x,int y){
		this.x=x;
		this.y=y;
	}
}

class Test2222 extends Test1111{
	int a;
	int b;
	
	Test2222(){
		this(9,99);
		a=300;
		b=400;
	}
	
	Test2222(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	void disp() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
		
	}
}
public class Day34pgm4 {
public static void main(String[] args) {
	Test2222 t2=new Test2222();
	t2.disp();
}
}


