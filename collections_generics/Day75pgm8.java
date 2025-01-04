package collections_generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeSet;

// Generics --> to store specfied data in collections class as specfied in generics(<>)

class Student {
	int id;
}

class Employee {
	int id;
}

public class Day75pgm8 {
	public static void main(String[] args) {

		// ArrayList to store only Integer objects using generics
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		System.out.println(al1);

		// TreeSet to store only String objects using generics
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Vini Jr");
		ts.add("Camavinga");
		System.out.println(ts);

		// ArrayList to store Student Objects
		Student s1 = new Student();
		Student s2 = new Student();
		ArrayList<Student> al2 = new ArrayList<Student>();

		al2.add(s1);
		al2.add(s2);

		System.out.println(al2);

		// ArrayList to store Employee Objects
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		ArrayList<Employee> al3 = new ArrayList<Employee>();

		al3.add(e1);
		al3.add(e2);

		System.out.println(al3);

		// Map to store Integer Objects as Keys and String Objects as Values
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(9, "Mbappe");
		hm.put(10, "Modric");
		hm.put(11, "Rodrigyo");
		System.out.println(hm);

		// LinkedHashMap to store Employee Objects as Keys and Student Objects as Values
		LinkedHashMap<Employee, Student> lhm = new LinkedHashMap<Employee, Student>();
		lhm.put(e1, s1);
		lhm.put(e2, s2);
		System.out.println(lhm);
	}
}
