package collections_hashmap;

import java.util.HashMap;

public class Day74pgm9 {
	public static void main(String[] args) {

		// we can store heterogeneous elements in keys
		HashMap hm1 = new HashMap();
		hm1.put(10, "SACHIN");
		hm1.put("seven", "DHONI");
		hm1.put(18.0, "VIRAT");
		hm1.put(45.0f, "ROHIT");
		System.out.println(hm1);

		// we can store heterogeneous elements in value
		HashMap hm2 = new HashMap();
		hm2.put(10, "SACHIN");
		hm2.put(7, "D");
		System.out.println(hm2);

		/*
		 * we can't store duplicate keys in HashMap , if duplicates given then newly
		 * inserted value override the old value of duplicate key
		 */
		HashMap hm3 = new HashMap();
		hm3.put(7, "DHONI");
		hm3.put(7, "RONALDO");
		System.out.println(hm3);

		// we can store duplicate values in <key,value> pairs in HashMap
		HashMap hm4 = new HashMap();
		hm4.put(5, "ZIDANE");
		hm4.put(10, "ZIDANE");
		System.out.println(hm4);

		/*
		 * we can store single null in keys in HashMap as duplicates not allowed in keys
		 * if duplicate null is give n in keys then newly inserted <key,value> pair
		 * which has null in key will override the old <key,value> pair which has null
		 * in key
		 */
		HashMap hm5 = new HashMap();
		hm5.put(null, "SACHIN");
		hm5.put(null, "DHONI");
		System.out.println(hm5);

		// we can store duplicate null values in value of <key,value> pairs
		HashMap hm6 = new HashMap();
		hm6.put(10, null);
		hm6.put(7, null);
		System.out.println(hm6);
	}
}
