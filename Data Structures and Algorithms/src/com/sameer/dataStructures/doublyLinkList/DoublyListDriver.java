package com.sameer.dataStructures.doublyLinkList;

public class DoublyListDriver {

	public static void main(String args[]) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addInStart(40);
		list.addInStart(30);
		list.addInStart(20);
		
		list.print();
		
		list.addInEnd(50);
		list.print();
		list.addInEnd(60);
		list.print();
		
		/*list.addAt(4,45);
		list.print();
		list.addAt(4,42);
		list.print();
		list.addAt(1,10);
		list.print();
		list.addAt(10, 70);
		list.print();
		list.addAt(8, 70);
		list.print();
		list.addAt(9, 80);
		list.print();*/
		
		list.addAt(6, 55);
		list.print();
		
		list.deleteFromStart();
		list.print();
		
		list.deleteFromEnd();
		list.print();
		
		list.deleteFromEnd();
		list.print();
		
		
	}
}
