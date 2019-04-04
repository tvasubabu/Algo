package javabasics;

import java.util.*;

/*
 * NOTE : java.util.LinkedList is internally implemented using 
 * Doubly Linked List, hence worst case complexities of 
 * Add an element to list - O(1)
 * Deletion - O(1)
 * Search -  O(n)
 */
public class LinkedList {
	public static void main(String[] args)
	{
		java.util.LinkedList<Integer> ll = new java.util.LinkedList<Integer>();
		
		// Add elements to list
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		
		// Update value at specified index
		ll.set(0,15);
		
		// Remove element at specified index
		ll.remove(0);
		
		// Get the size of the list
		System.out.println(ll.size());
		
		System.out.println(ll);
	}

}
