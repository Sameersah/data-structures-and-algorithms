package com.sameer.linkedlist;

public class LinkedList {

	private ListNode head;
	
	public LinkedList() {
	head = null;	
	}
	
	public LinkedList(ListNode head) {
		this.head = head;
	}

	public ListNode addInEnd(int data) {
		ListNode temp = new ListNode(data);
		if(head==null) {
			head = temp;
		}
		else {
			ListNode tempPointer = head;
			while(tempPointer.next != null) {
				tempPointer = tempPointer.next;
			}
			tempPointer.next = temp;
		}
		return head;
	}

	public void print() {
		ListNode temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println();
	}

	public void addInStart(int data) {
		ListNode node = new ListNode(data);
		if(head ==null) {
			head = node;
		}
		else {
			ListNode temp = head;
			head = node;
			node.next = temp;
		}
		
	}

	public void addAt(int pos, int data) {
		if(pos<1) {
			return;
		}
		else if(pos ==1) {
			ListNode node = new ListNode(data);
			ListNode temp = head;
			head = node;
			node.next = temp;
			
		}else {
			ListNode temp = head;
			for(int i= 0;i<pos-2;i++) {
				temp = temp.next;
			}
			ListNode node = new ListNode(data);
			ListNode temp2 = temp.next;
			temp.next = node;
			node.next = temp2;
		}
		
	}
	
	public void deleteFromStart() {
		head = head.next;
	}
	
	public void deleteFromEnd() {
		if(head ==null) {
			return;
		}
		else if(head.next==null) {
			head = head.next;
		}
		else {
			ListNode temp = head;
			ListNode temp2 = null;
			while(temp.next != null) {
				temp2 = temp;
				temp = temp.next;
			}
			temp = temp.next;
			temp2.next = null;
		}
		
	}

	public void deleteAt(int pos) {
		ListNode temp = head;
		
		
		if(pos == 1) {
			head = head.next;
		}else {
			for(int i=0;i<pos-2;i++) {
				if(temp.next == null) {
					System.out.println("Not enough nodes.");
					return;
				}
				temp = temp.next;
			}
			
			ListNode temp2 = temp.next;
			temp.next = temp2.next;
			temp2 = null;
		}
		
	}

	
}
