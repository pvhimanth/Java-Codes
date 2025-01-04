package collections_arraylist;

import java.util.ArrayList;

//print only even elements using arryalist
public class Day67pgm2 {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(21);
		al.add(30);
		al.add(41);
		al.add(51);

		for (int i = 0; i < al.size(); i++) {
			Integer a = (Integer) al.get(i); // ArrayList only store objects
			if (a % 2 == 0) {
				System.out.println(al.get(i));
			}
		}

	}
}
