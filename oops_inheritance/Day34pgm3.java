package oops_inheritance;

/* calling one constructor of one class to parameterized constructor 
 * of another class with arguments using super() call
 */
class Test111{
	int x;
	int y;
	
	Test111(){
		x=100;
		y=200;
	}
	
	Test111(int x,int y){
		this.x=x;
		this.y=y;
	}
}

class Test222 extends Test111{
	int a;
	int b;
	
	Test222(){
		a=300;
		b=400;
	}
	
	Test222(int a,int b){
		super(a,b);
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
public class Day34pgm3 {
public static void main(String[] args) {
	Test222 t2=new Test222(9,99);
	t2.disp();
}
}

