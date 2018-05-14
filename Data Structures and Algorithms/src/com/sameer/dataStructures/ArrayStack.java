package com.sameer.dataStructures;

public class ArrayStack {

	private Integer[] arr;
	private int top ;
	
	public ArrayStack(int size) {
		arr = new Integer[size];
		top = -1;
	}
	
	public boolean isEmpty() {
		if(this.top == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(this.top == arr.length) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stackoverflow");
		}
		else {
			arr[++top] = data;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stackunderflow");
			return -1;
		}
		else {
			return arr[top--];
		}
	}

	public void display() {
		if(isEmpty()) {
			System.out.println("stack is empty.");
		}
		else {
			for(int i=0;i<=top;i++) {
				System.out.println(arr[i]);
			}
		}
		
	}
}
