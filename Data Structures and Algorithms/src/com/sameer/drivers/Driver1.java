package com.sameer.drivers;

import com.sameer.dataStructures.LinkedList;

public class Driver1 {

	public static void main (String args[]) {
		
		LinkedList list = new LinkedList();
		
		list.add(20);
		
		list.add(30);
		
		list.add(40);
		
		list.add(50);
		
		list.display();
		
		System.out.println("Size: "+list.size());
		
		list.remove(1);
		
		System.out.println("Size: "+list.size());
		
		list.display();
		
		System.out.println(list);
	}
}
