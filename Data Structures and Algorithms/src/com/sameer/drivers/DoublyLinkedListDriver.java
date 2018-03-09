package com.sameer.drivers;

import com.sameer.dataStructures.DoublyLinkedList;

public class DoublyLinkedListDriver {

	public static void main (String args[]){
		
		System.out.println("DoublyLink LinkedList Test:");
		
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.add(10);
		
		list.add(20);
		
		list.add(30);
		
		list.add(40);
		
		list.add(50);
		
		list.display();
		
		list.remove(10);
		
		System.out.println("After list.remove(10)");
		
		list.display();
		
		list.reverseUsingIteration();
		
		System.out.println("After list.revreseUsingIteration()");
		
		list.display();
		
		list.removeAtIndex(0);
		
		System.out.println("After list.removeAtIndex(0)");
		
		list.display();
		
	}
}

