package com.sameer.drivers;

import com.sameer.dataStructures.ArrayStack;

public class ArrayStackDriver {

	public static void main (String args[]) {
		
		ArrayStack stack = new ArrayStack(10);
		
		System.out.println("Is stack empty ? "+stack.isEmpty());
		
		stack.push(20);
		stack.push(30);
		stack.pop();
		stack.push(40);
		stack.pop();
		stack.push(50);
		
		stack.display();
	}
}
