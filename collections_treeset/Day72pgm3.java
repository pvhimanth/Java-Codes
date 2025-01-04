package collections_treeset;

import java.util.TreeSet;

//Creating TreeSet and inserting data --> sorts the data internally
public class Day72pgm3 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println(ts);
	}
}
