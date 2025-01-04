package collections_treemap;

import java.util.TreeMap;

public class Day75pgm5 {
	public static void main(String[] args) {

		// we can store heterogeneous elements in value can't in keys
		TreeMap tm1 = new TreeMap();
		tm1.put(10, "SACHIN");
		tm1.put(7, 7.0);
		System.out.println(tm1);

		/*
		 * we can't store duplicate keys in TreeMap, if duplicates are given, then newly
		 * inserted value will override the old value of duplicate key
		 */
		TreeMap tm2 = new TreeMap();
		tm2.put(7, "DHONI");
		tm2.put(7, "RONALDO");
		System.out.println(tm2);

		// we can store duplicate values in <key,value> pairs in TreeMap
		TreeMap tm3 = new TreeMap();
		tm3.put(5, "ZIDANE");
		tm3.put(10, "ZIDANE");
		System.out.println(tm3);

		/* we can store duplicate null values in value of <key,value> pairs
		 * and can't able to single null value in keys
		 */
		TreeMap tm4 = new TreeMap();
		tm4.put(10, null);
		tm4.put(7, null);
		System.out.println(tm4);
	}
}
