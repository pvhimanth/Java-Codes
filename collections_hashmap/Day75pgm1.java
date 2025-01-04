package collections_hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Methods of HashMap
public class Day75pgm1 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();

		hm.put(7, "Vini Jr");
		hm.put(5, "Bellingham");
		hm.put(1, "Courtois");

		// entrySet() method
		Set es = hm.entrySet();
		Iterator itr1 = es.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("------------------------");

		// keySet() method
		Set ks = hm.keySet();
		Iterator itr2 = ks.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("------------------------");

		// values() method
		Collection v = hm.values();
		Iterator itr3 = v.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		System.out.println("------------------------");

		// containsKey() method
		System.out.println(hm.containsKey(7));
		System.out.println("------------------------");

		// containsValue() method
		System.out.println(hm.containsValue("Bellingham"));
		System.out.println("------------------------");

		// isEmpty() method
		System.out.println(hm.isEmpty());
		System.out.println("------------------------");

		// remove(key) method
		System.out.println(hm);
		hm.remove(5);
		System.out.println(hm);
	}
}
