package com.sameer.drivers;

import com.sameer.dataStructures.LinkedListStack;

public class LinkedListStackDriver {

	public static void main(String args[]) {
		LinkedListStack stack = new LinkedListStack();
		
		System.out.println("is stack empty? "+stack.isEmpty());
		
		stack.push(10);
		stack.push(20);
		stack.pop();
		stack.push(30);
		stack.display();
	}
}
