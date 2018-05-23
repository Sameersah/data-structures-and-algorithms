package com.sameer.drivers;

import com.sameer.dataStructures.GetMinStack;

public class MinListStackDriver {

	public static void main (String args[]) {
		GetMinStack stack = new GetMinStack();
		
		stack.push(10);
		stack.pop();
		stack.push(40);
		stack.push(50);
		stack.push(60);
		
		System.out.println("Minimum- "+stack.getMin());
	}
}
