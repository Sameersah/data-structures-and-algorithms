package com.sameer.linkedlist;

public class LinkedListDriver {

	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		list.addInEnd(10);
		list.addInEnd(20);
		list.addInEnd(30);
		
		list.print();
		
		list.addInStart(5);
		list.print();
		
		list.addAt(3,15);
		list.print();
		
		list.addAt(1,3);
		list.print();
		
		list.deleteFromEnd();
		list.print();
		
		list.deleteFromStart();
		list.print();
		
		list.deleteAt(10);
		list.print();
		
	}
}
