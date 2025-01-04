package collections_legacyclasses;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;

// Legacy classes --> Vector, Stack, Hashtable
public class Day75pgm7 {
	public static void main(String[] args) {

		// Vector Class
		Vector v1 = new Vector();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		System.out.println(v1);

		// Stack Class
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s);

		// HashTable class
		Hashtable ht = new Hashtable();
		ht.put(7, "Vini Jr");
		ht.put(8, "Kroos");
		System.out.println(ht);

		// traversing legacy class object data using Enumeration
		Vector v2 = new Vector();
		v2.add(10);
		v2.add(20);
		v2.add(30);

		Enumeration itr = v2.elements();
		while (itr.hasMoreElements()) {
			System.out.println(itr.nextElement());
		}

	}
}
