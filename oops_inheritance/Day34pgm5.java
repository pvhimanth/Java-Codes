package oops_inheritance;

/* calling one constructor of one class to 
 * constructor of another class with arguments using this() and using super() call
 */

class Test11111{
	int x;
	int y;
	
	Test11111(){
		x=100;
		y=200;
	}
	
	Test11111(int x,int y){
		this();
		this.x=x;
		this.y=y;
	}
}

class Test22222 extends Test11111{
	int a;
	int b;
	
	Test22222(){
		super(9,99);
		a=300;
		b=400;
	}
	
	Test22222(int a,int b){
		this();
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
public class Day34pgm5 {
public static void main(String[] args) {
	Test22222 t2=new Test22222(9,99);
	t2.disp();
}
}


