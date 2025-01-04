package pgms;

public class Day10pgm2 {
public static void main(String[] args) {
	// Implicit Type casting
	byte a=2;
	double b;
	b=a;
	System.out.println(a); //prints a
	System.out.println(b); //prints 2 as 2.0 as it is real datatype
	
	int c=5655;
	long d;
	d=c;
	System.out.println(c); //prints 5655
	System.out.println(d); //prints 5655
	
	float e=5.666f;
	double f;
	f=e;
	System.out.println(e);
	System.out.println(f); // prints 5.665999889373779 as double have double precision
	
	short g=56;
	long h;
	h=g;
	System.out.println(h); // prints 56
	System.out.println(g); // prints 56
    
//	double i=52.646466;
//	long j;
//	j=i;
//  System.out.println(i);
//  System.out.println(j); causes error we use explicit type casting

}
}
