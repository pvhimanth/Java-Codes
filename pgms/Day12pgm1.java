package pgms;

class InstanceVariables{
	int a;
	float b;
	boolean c;
}

public class Day12pgm1 {
public static void main(String[] args) {
	InstanceVariables i=new InstanceVariables();
	System.out.println(i.a);
	System.out.println(i.b);
	System.out.println(i.c);
	i.a=100;
	i.b=5.66f;
	i.c=true;
	System.out.println(i.a);
	System.out.println(i.b);
	System.out.println(i.c);

}
}
