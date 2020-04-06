package com.sameer.dataStructures.doublyLinkList;

public class DoublyLinkedList {

	Node head;
	public DoublyLinkedList() {
		head = null;
	}
	
	public void addInStart(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
		}
		else {
			Node temp = head;
			head = node;
			node.next = temp;
		}
	}
	
	public void print() {
		Node temp = head;
		while(temp !=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println();
	}

	public void addInEnd(int data) {
		Node temp = head;
		while(temp.next !=null) {
			temp = temp.next;
		}
		Node node = new Node(data);
		temp.next = node;
		node.prev = temp;
		
		
	}

	public void addAt(int pos, int data) {
		if(pos<1 ) {
			return;
		}
		else if(pos == 1) {
			Node temp = head;
			Node node = new Node(data);
			head = node;
			head.next = temp;
			temp.prev = head;
		}else {
			Node temp = head;
			for(int i=0;i<pos-2;i++) {
				if(temp.next == null) {
					System.out.println("Not enough nodes.");
					return;
				}
				temp = temp.next;
				
			}
			Node node = new Node(data);
			Node temp2 = temp.next;
			temp.next = node;
			node.prev = temp;
			node.next = temp2;
			if(temp2 !=null)
			temp2.prev = node;
		}
		
		
	
	}

	public void deleteFromStart() {
		if(head == null) {
			return;
		}
		else {
			head = head.next;
			head.prev = null;
		}
	}

	public void deleteFromEnd() {
		if(head ==null) {
			return;
		}else if(head.next ==null) {
			head = null;
		}else {
			Node temp = head;
			while(temp.next != null && temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
		}
	}

	public void deleteAt(int pos) {
		
	}
}
