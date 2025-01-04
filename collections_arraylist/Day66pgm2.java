package collections_arraylist;
import java.util.ArrayList;

//we can store heterogenous elements in ArrayList
public class Day66pgm2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(2.5f);
		al.add(1413434353543245L);
		al.add("P");
		al.add("Himanth");
		al.add(true);
		al.add(null); // we can store null in ArrayList		
		al.add(10); // duplicates can be stored in ArrayList
		System.out.println(al);
	}
}
