package pgms;

public class Day11pgm2 {
public static void main(String[] args) {
	// Assignment Operators
	
	/* byte x=10;
       x=x*5;                      
       System.out.println(x); 
       
       prints error as we can't multiply with byte with int and here we have to explicitily 
                                   type cast
       */
	
	// so we use assignment operators
	
	byte a=10,b=10,c=10,d=10,e=10;
	a+=5;
	b-=5;
	c*=5;
	d/=5;
	e%=5;

	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	
	float f=(1/4)*10;
	System.out.println(f); //print 0.0 as .values can't print as less precision for float

	
	// byte a=128; we can't store 128 as byte range is from -128to127 but we can increment 127
}
}
