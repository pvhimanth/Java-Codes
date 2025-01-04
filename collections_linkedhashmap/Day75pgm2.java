package collections_linkedhashmap;

import java.util.LinkedHashMap;

/* Creating LinkedHashMap object and inserting data using put() method 
 * inform of <key,value> pairs
 */
public class Day75pgm2 {
	public static void main(String[] args) {
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(10, "SACHIN");
		lhm.put(7, "DHONI");
		lhm.put(18, "VIRAT");
		lhm.put(45, "ROHIT");
		System.out.println(lhm);
	}
}
