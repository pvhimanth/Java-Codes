package pgms;

class Car1{
	String name;
	int cost;
}
public class Day17pgm9 {
public static void main(String[] args) {
	
	
	// Array of objects - here array only stores references
	
	Car1[] c=new Car1[3];
	
	c[0]=new Car1();
	c[0].name="Maruthi";
	c[0].cost=500000;
	
	c[1]=new Car1();
	c[1].name="Hyundai";
	c[1].cost=600000;
	
	c[2]=new Car1();
	c[2].name="Mercedes";
	c[2].cost=1000000;
	
	System.out.println(c[0].name);
	System.out.println(c[1].name);
	System.out.println(c[2].name);

	
	
}
}
