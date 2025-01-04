package pgms;

class Cars{
	String name;
	int noofseats;
	float cost;
}                                                                                                  

public class Day13pgm2 {
public static void main(String[] args) {
	
	//Pass By Reference  
	Cars a=new Cars();
	a.name="Tata";
	a.noofseats=6;
	a.cost=200000f;
	System.out.println(a.name);
	System.out.println(a.noofseats);
	System.out.println(a.cost);
	
	Cars b;
	b=a;
	
	b.name="Mercedes";
	b.noofseats=4;
	b.cost=800000f;
	System.out.println(b.name);
	System.out.println(b.noofseats); 
	System.out.println(b.cost);
	
	System.out.println(a.name); // prints same b.name as b and a are pointing to same object
	System.out.println(a.noofseats); 
	System.out.println(a.cost);
	
	
	}
}
