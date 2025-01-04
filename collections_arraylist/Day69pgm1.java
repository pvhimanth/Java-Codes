package collections_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

// ArrayList can store only objects
class Student {

}

public class Day69pgm1 {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(26.5f);
		al.add('A');
		al.add(new Student());
		al.add(new Exception());
		al.add(new Scanner(System.in));
		al.add(new Thread());
		
		System.out.println(al);
	}
}
