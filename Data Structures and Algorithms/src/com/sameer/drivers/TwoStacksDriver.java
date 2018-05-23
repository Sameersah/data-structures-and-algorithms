package com.sameer.drivers;

import com.sameer.dataStructures.TwoStacks;

public class TwoStacksDriver {

	public static void main(String args[]) {
		TwoStacks stack = new TwoStacks(10);
		
		
		stack.push1(10);
		stack.push2(100);
		
		stack.display1();
		stack.display2();
		
		stack.push1(20);
		stack.push2(200);
		
		stack.display1();
		stack.display2();
		
		stack.push1(30);
		stack.push2(300);
		
		stack.display1();
		stack.display2();
		
		stack.push1(40);
		stack.push2(400);
		
	//	stack.push1(50);
		stack.push2(500);
		
		stack.display1();
		stack.display2();
		
	//	stack.push1(60);
		stack.push2(600);
		
		stack.display1();
		stack.display2();
		
		
		
		
	}
}
