package com.sameer.dataStructures;

import com.sameer.dataStructures.LinkedList.LinkedList;

public class LinkedListStack {

	private LinkedList list;
	private int top;
	
	public LinkedListStack() {
		list = new LinkedList();
		top = -1;
	}
	
	public boolean isEmpty() {
		if(list.size() != 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public void push(int data) {
		list.add(data);
		top++;
	}
	
	public int pop() {
		int data = peek();
		if(data!= -1) {
			list.remove(top);
			top--;
		}
		
		return data;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		else {
			return list.get(top).getData();
		}
	}
	
	public void display(){
		for(int i=0;i<=top;i++) {
			System.out.println(list.get(i).getData());
		}
	}
}
