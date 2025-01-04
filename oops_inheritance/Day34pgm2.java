package oops_inheritance;

//calling one constructor of one class to constructor of another class with arguments using super() call
class Test11{
	int x;
	int y;
	
	Test11(){
		x=100;
		y=200;
	}
	
	Test11(int x,int y){
		this.x=x;
		this.y=y;
	}
}

class Test22 extends Test11{
	int a;
	int b;
	
	Test22(){
		a=300;
		b=400;
	}
	
	Test22(int a,int b){
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
public class Day34pgm2 {
public static void main(String[] args) {
	Test22 t2=new Test22(9,99);
	t2.disp();
}
}

