package pgms;

public class Day10pgm3 {
public static void main(String[] args) {
	// Explicit type casting
	double a=54644.46466;
	float b;
	b=(float)a;
	System.out.println(a); //prints 54644.46466
	System.out.println(b); //prints 54644.465 as loss some data from large to small conversions
	
	long c=4664654654646464L;
	int d;
	d=(int)c;
	System.out.println(c); //prints 4664654654646464
	System.out.println(d); //prints -1951356736 as it rollback 214748367 to -214748368
	
	short e=4644;
	byte f;
	f=(byte)e;
	System.out.println(e); //prints 4644
	System.out.println(f); //prints 36  rolback as byte only stores -128to127
	
	float g=5.655f;
	int h;
	h=(int)g;
	System.out.println(g); // Prints 5.655
	System.out.println(h); // prints 5 as loss of data from large to small conversions
	
	double i=4646.55;
	long j;
	j=(long)i;
	System.out.println(i); //prints 4646.55
	System.out.println(j); //prints 4646 loss .55 as large to small conversions
	
	int k=129;
	byte l;
	l=(byte)k;
	System.out.println(k); //prints 129
	System.out.println(l); //prints -127 rollbacked as large to small conversions
}
}
