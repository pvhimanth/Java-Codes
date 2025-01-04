package collections_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

// passing ArrayList ref to LinkedList constructor to copy data of ArrayList to LinkedList
public class Day70pgm1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		
		LinkedList ll=new LinkedList(al);
		System.out.println(ll);
	}
}
