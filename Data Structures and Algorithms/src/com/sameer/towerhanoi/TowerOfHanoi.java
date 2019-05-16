package com.sameer.towerhanoi;

/*
 * Three pillars, Only one plate moves at a time, bigger plate can't be on top of smaller plates. 
 * Sol - move n-1 plates to auxilary pillar, move last plate to destination plate, move the n-1 plates to destination plate
 * if only 1 plate move to destination plate, solve for n-1 plates
 * */
import java.util.Stack;

public class TowerOfHanoi {

	
public static void main (String args[]) {
	System.out.println("Tower of Hanoi");
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	Stack<Integer> stack3 = new Stack<Integer>();
	
	System.out.println(stack1.size());
	insert(stack1);
	System.out.println(stack1.size());
}

public static void insert(Stack stack1) {
	stack1.push(3);
}
	
}
