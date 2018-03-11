package com.sameer.dataStructures;

public class CircularLinkedList {

	private class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	private Node last;
	
	public CircularLinkedList() {
		last = null;
	}
	
	public void add(int data) {
		
		Node newNode = new Node(data);
		if(last == null) {
			last = newNode;
			newNode.next = last;
		}
		else {
			
			newNode.next = last.next;
			last.next = newNode;
			last = newNode;
		}
	}
	
	public void display() {
		Node temp = last;
		
		while(temp != null || temp != last) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
}
