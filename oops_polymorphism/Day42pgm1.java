package oops_polymorphism;

// Aggregation and composition
/*
 * Aggregation-loose Bond b/w Objects
 * Composition-Tight Bond b/w Objects
 */

// Aggregate class
class Charger{
	private String brand;
	private float voltage;
	public Charger(String brand, float voltage) {
		this.brand = brand;
		this.voltage = voltage;
	}
	public String getBrand() {
		return brand;
	}
	public float getVoltage() {
		return voltage;
	}
}

// Composite class
class Os{
	private String name ;
	private int size;
	public Os(String name, int size) {
		this.name = name;
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
}

// Main class
class Mobile{
	Os os=new Os("ANDROID",2); //implementing composition
	
	public void hasA(Charger c) { //implementing aggregation
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}
	
}
public class Day42pgm1 {
public static void main(String[] args) {
	
	/*Accessing aggregate and composition classes(Before Mobile lost)
	 * Accessing composite class with help of main class as it is a tight bond
	 */
	
	Charger c=new Charger("SAMSUNG",12.5f);
	Mobile m=new Mobile();
	System.out.println(m.os.getName());
	System.out.println(m.os.getSize());
	m.hasA(c); // passing Charger object address to hasA method
	
	
	//After MObile lost
	m=null;
	
/* Throws exception as m is not referenced as it collected by garbage collector
 *  System.out.println(m.os.getName());
 * 	System.out.println(m.os.getSize());
	m.hasA(c);
 */

	
	// can acesss the aggregate classes without main class as it has loose bond
	System.out.println(c.getBrand());
	System.out.println(c.getVoltage());
}
}
