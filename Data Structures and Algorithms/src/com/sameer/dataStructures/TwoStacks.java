package com.sameer.dataStructures;

public class TwoStacks {

	private Integer[] array;
	private int top1;
	private int top2;
	
	public TwoStacks(int size) {
		
		array = new Integer[size];
		top1 = -1;
		top2 = size;
		
	}
	
	public boolean isFull1() {
		if(top1+1 == top2) {
			return true;
		}
		else 
			return false;
	}
	
	public boolean isFull2() {
		if(top2-1 == top1) {
			return true;
		}
		else 
			return false;
	}
	
	public void push1(int data) {	
		if(isFull1()) {
			System.out.println("Stack 1 is full.");
		}
		else {
			array[++top1] = data;
		}
		
	}
	
	public void push2(int data) {
		
		if(isFull2()) {
			System.out.println("Sstack 2 is full.");
		}
		else {
			array[--top2] = data;
		}
	}
	
	public boolean isEmpty1() {
		if(top1== -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isEmpty2() {
		if(top2== array.length) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Integer peek1() {
		if(isEmpty1()) {
			System.out.println("Stack 1 is empty.");
			return null;
		}
		else {
			return array[top1];
		}
	}
	
	public Integer peek2() {
		if(isEmpty2()) {
			System.out.println("Stack 1 is empty.");
			return null;
		}
		else {
			return array[top2];
		}
	}
	
	
	
	public Integer pop1() {
		Integer data = peek1();
		if(data != null) {
			top1--;
		}
	
		return data;
	}
	public Integer pop2() {
		Integer data = peek2();
		if(data != null) {
			top2--;
		}
	
		return data;
	}

	public void display1() {
		for(int i=0;i<=top1;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public void display2() {
		for(int i=array.length-1;i>=top2;i--) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}


}
