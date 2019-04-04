
package javabasics;
// All the collections are defined in java.util package
import java.util.*;

public class arrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		List<Integer> blist = Arrays.asList(1,2,3,4,5);
		System.out.println(blist);
		
		// Add Elements
		alist.add(20);
		alist.add(30);
		alist.add(40);
		alist.add(50);
		alist.add(0,10); // Add element at specified index
		
		System.out.printf("Size of the arrayList is %d\n", + alist.size());
		
		// Processing all the elements in ArrayList
		for ( Integer i: alist) {
			System.out.println(i);
		}
		
		System.out.println(alist);
		System.out.println("\n");
		
		// Using Iterator
		Iterator<Integer> iter = alist.iterator();
		while(iter.hasNext()) {			
			System.out.println(iter.next());			
		}		
		System.out.println("\n");
		
		// Using ListIterator
		ListIterator<Integer> new_iter = alist.listIterator();
		while(new_iter.hasNext()) {			
			System.out.println(new_iter.next());			
		}
		
		// Remove an element
		alist.remove(0);
		
		// Find and remove an element
		alist.remove(alist.indexOf(20));
		
		alist.add(0,10);
		
		// Update
		alist.set(0, 20);
		
		System.out.println("\n");
		for ( Integer i: alist) {
			System.out.println(i);
		}
	}

}
