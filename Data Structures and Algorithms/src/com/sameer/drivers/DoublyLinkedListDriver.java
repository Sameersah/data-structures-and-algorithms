package com.sameer.drivers;

import com.sameer.dataStructures.DoublyLinkedList;

public class DoublyLinkedListDriver {

	public static void main (String args[]){
		
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.add(10);
		
		list.add(20);
		
		list.add(30);
		
		list.display();
		
		list.remove(20);
		
		list.display();
		
		list.reverseUsingIteration();
		
		list.display();
		
	}
}

