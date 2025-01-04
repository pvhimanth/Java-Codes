package collections_treemap;

import java.util.TreeMap;

/* Creating TreeMap object and inserting data using put() method 
 * inform of <key,value> pairs
 */
public class Day75pgm4 {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put(10, "SACHIN");
		tm.put(7, "DHONI");
		tm.put(18, "VIRAT");
		tm.put(45, "ROHIT");
		System.out.println(tm);
	}
}
