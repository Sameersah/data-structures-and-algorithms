package com.sameer.drivers;

import com.sameer.dataStructures.LinkedList;

public class Driver1 {

	public static void main (String args[]) {
		
		LinkedList list = new LinkedList();
		
		list.add(20);
		
		list.add(30);
		
		list.add(40);
		
		list.add(50);
		
		list.add(60);
		
		list.add(70);
		
		list.display();
		
		System.out.println("Size: "+list.size());
		
		System.out.println("Removing element- ");
		
		list.remove(1);
		
		System.out.println("Size: "+list.size());
		
		list.display();
		
		System.out.println(list);
		
		System.out.println("Swapping 2 nodes without swaping data - ");
		
		list.swapNodesWithoutData(20, 50);
		
		list.display();
		
		list.swapNodesWithoutData(50, 40);
		
		list.display();
		
		System.out.println(list.get(0));
		
		System.out.println("Is node 50 present? -"+ list.checkNodeUsingRecursion(list.get(0), 50));
		
		System.out.println(list.getMiddleNode());
		
		System.out.println("Reversing List- ");
		
		list.reverseUsingRecursion(null, list.get(0));
		
		list.display();
		
		
	}
}
