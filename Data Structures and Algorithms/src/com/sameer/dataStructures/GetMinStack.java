package com.sameer.dataStructures;

import com.sameer.dataStructures.LinkedList.LinkedList;

public class GetMinStack {

	private LinkedList list;
	private LinkedList minList;
	private int top;
	private int minListTop;
	
	public GetMinStack() {
		list = new LinkedList();
		top =-1;
		minList = new LinkedList();
		minListTop = -1 ;
	}
	
	public boolean isEmpty() {
		if(list.size()==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void push(int data) {
		list.add(data);
		top++;
		
		if(minList.size()==0) {
			minList.add(data);
			minListTop++;
		}
		else {
		if(data <= minList.get(minListTop).getData()) {
			minList.add(data);
		}
		
		}
	}
	
	public int pop() {
		int data = peek();
		
		if(data != -1) {
			list.remove(top);
			top --;
			if(data == minList.get(minListTop).getData()) {
				minList.remove(minListTop);
				minListTop--;
			}
		}
		return data;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty.");
			return -1;
		}
		else {
			return list.get(top).getData();
		}
	}
	
	public int getMin() {
	    if(minList.size() == 0) {
	    	System.out.println("Stack is empty.");
	    	return -1;
	    }
	    else {
	    	return minList.get(minListTop).getData();
	    }
	}
}
