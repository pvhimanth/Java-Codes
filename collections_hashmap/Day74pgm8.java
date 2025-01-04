package collections_hashmap;

import java.util.HashMap;

/* Creating HashMap object and inserting data using put() method 
 * inform of <key,value> pairs
 */
public class Day74pgm8 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(10, "SACHIN");
		hm.put(7, "DHONI");
		hm.put(18, "VIRAT");
		hm.put(45, "ROHIT");
		System.out.println(hm);
	}
}
