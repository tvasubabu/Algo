package javabasics;

//import java.util.*;

public class Vector {
	public static void main(String[] args)
	{
		java.util.Vector<Integer> v1 = new java.util.Vector<Integer>();
		// Add elements
		v1.add(10);
		v1.add(20);
		
		java.util.Vector<Integer> v2 = new java.util.Vector<Integer>();
		// Add another Vector
		v2.addAll(v1);
		v2.add(30);
		v2.add(40);
		
		// Remove element from specified index 
		v2.remove(0);
		
		// Update element at specified index
		v2.set(0, 15);
		
		// Get element from specified index
		System.out.println(v2.get(0));
		
		// Get the size of the Vector
		System.out.println(v2.size());
		
		System.out.println(v2);
		
	}
	
}
