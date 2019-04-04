package javabasics;

//import java.util.*;

public class Stack {
	public static void main(String[] args)
	{
		java.util.Stack<Integer> stack = new java.util.Stack<Integer>();
	
		// Push
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		// Peek
		System.out.println(stack.peek());
		
		// Pop
		stack.pop();
		stack.pop();
		
		// Search
		System.out.println(stack.search(20));
		System.out.println(stack.search(40));
		
		System.out.println(stack);
	}
}
