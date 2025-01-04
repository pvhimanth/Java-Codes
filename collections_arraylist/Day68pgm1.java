package collections_arraylist;
import java.util.ArrayList;

// traversing using enhanced for loop
public class Day68pgm1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		for (Object a : al) {
			System.out.println(a);
		}
	}
}
