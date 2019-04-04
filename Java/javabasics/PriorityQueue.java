package javabasics;

import java.util.*;

public class PriorityQueue {
	public static void main(String[] args) 
	{
		// I need to give complete class path because 
		// our class name is also PriorityQueue from next time
		// onwards I will have some better name :)
		java.util.PriorityQueue<Integer> pq1 = new java.util.PriorityQueue<Integer>();
				
		// Add element
		pq1.add(40);
		pq1.add(10);
		pq1.add(50);
		pq1.add(20);
		
		// Why is it not printing in correct order, 
		// It seems that is not expected 
		System.out.println(pq1);
		
		// Remove element at head
		System.out.println(pq1.remove());
		System.out.println(pq1.remove());
		System.out.println(pq1.remove());
		System.out.println(pq1.remove());
		
		// Check if queue is empty
		System.out.println(pq1.isEmpty());
		
		// Add
		pq1.add(40);
		pq1.add(10);
		pq1.add(50);
		pq1.add(20);
		
		// Check if queue contains an element
		System.out.println(pq1.contains(20));
		System.out.println(pq1.contains(30));
		
		// Empty check
		System.out.println(pq1.isEmpty());
		
		// Take a look at head element without removing it
		System.out.println(pq1.peek());
		
		// remove the head element
		System.out.println(pq1.poll());
		
		System.out.println(pq1);
		
		// Similar ti Add
		pq1.offer(10);
		
		System.out.println(pq1);
		
		/**************************************************************/		
		// Defining our own comparator
		// Courtesy https://www.callicoder.com/java-priority-queue/
		
		Comparator<String> cmp = new Comparator<String>()
		{
			public int compare(String s1, String s2)
			{
				return s1.length() - s2.length();
			}			
		};
		
		// Declaring Priority Queue, Also specifying our comparator function
		java.util.PriorityQueue<String> pq2 = new java.util.PriorityQueue<String>(cmp);
		
		// Add element
		pq2.add("Hello");
		pq2.add("World");
		pq2.add("How");
		pq2.add("Am");
		pq2.add("I");		
		
		// Doesn't print in correct order, I guess that is expected
		System.out.println(pq2);
		
		// Remove element at head
		// Prints in correct order
		System.out.println(pq2.remove());
		System.out.println(pq2.remove());
		System.out.println(pq2.remove());
		System.out.println(pq2.remove());
		System.out.println(pq2.remove());
	}

}
