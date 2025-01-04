package pgms;

public class Day11pgm1 {
public static void main(String[] args) {
	
	// Incrementation and decremantation
	int a=5;
	int b;
	b=a+1;
	System.out.println(a);
	System.out.println(b);

	System.out.println("--------------------------------");
	
	int c=9;
	int d;
	d=c-1;
	System.out.println(c);
	System.out.println(d);
	
	System.out.println("--------------------------------");
	
	// pre-increment
	int e=5;
	int f;
	f=++e;
	System.out.println(e);
	System.out.println(f);
	
	System.out.println("--------------------------------");
	
    // post-increment
	int g=12;
	int h;
	h=g++;
	System.out.println(g);
	System.out.println(h);
	
	System.out.println("--------------------------------");
	
	// pre-decrement
	int i=24;
	int j;
	j=--i;
	System.out.println(i);
	System.out.println(j);
	
	System.out.println("--------------------------------");
	
	// post-decrement
	int k=15;
	int l;
	l=k--;
	System.out.println(k);
	System.out.println(l);
		
	System.out.println("--------------------------------");
	
	int a1=6;
	int b1= ++a1 - a1  + a1-- - a1++;
	System.out.println(a1);
	System.out.println(b1);
	System.out.println("--------------------------------");
	
	byte c1=127;
	c1++;
	c1++;
	System.out.println(c1); // rollbacks as as byte can't store 129 
	System.out.println("--------------------------------");

	//operator precedence
	
	int m=10,n=10;
	int res=m++/(++n*n--)/--m;
	System.out.println(res); // print 0 as float values cant store in int so 10/121 treated as 01
	System.out.println(m);
	System.out.println(n);
	System.out.println("--------------------------------");

	
	int d1=5;
	int e2=d1/2;
	System.out.println(e2); //in 2.5 prints only 2, where .5 is got truncated
	System.out.println("--------------------------------");
	
	int x=001,y=010,z=100;
	int r=--x + y++ - z-- - --z + ++y - --x + y-- - --x;
	System.out.println(r); //001,010 is octal values as need to convert to decimal first to inr/dec values
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	System.out.println("--------------------------------");

    int f1='A',g2='a';
    System.out.println(f1++ + ++ g2);
    System.out.println("--------------------------------");

    

}
}
