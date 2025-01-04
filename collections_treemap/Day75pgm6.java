package collections_treemap;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

// Methods of TreeMap
public class Day75pgm6 {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();

		tm.put(7, "Vini Jr");
		tm.put(5, "Bellingham");
		tm.put(1, "Courtois");

		// entrySet() method
		Set es = tm.entrySet();
		Iterator itr1 = es.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("------------------------");

		// keySet() method
		Set ks = tm.keySet();
		Iterator itr2 = ks.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("------------------------");

		// values() method
		Collection v = tm.values();
		Iterator itr3 = v.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		System.out.println("------------------------");

		// containsKey() method
		System.out.println(tm.containsKey(7));
		System.out.println("------------------------");

		// containsValue() method
		System.out.println(tm.containsValue("Bellingham"));
		System.out.println("------------------------");

		// isEmpty() method
		System.out.println(tm.isEmpty());
		System.out.println("------------------------");

		// remove(key) method
		System.out.println(tm);
		tm.remove(5);
		System.out.println(tm);
	}
}
