package com.sameer.dataStructures;

public class LinkedList {

	private class Node  {
		Integer data;
		Node next;
		
		public Node (Integer data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private Integer size;
	private Node head;
	
	public LinkedList() {
		this.size = 0;
		this.head = null;
	}
	
	public Integer size() {
		return this.size;
	}
	
	public void display() {
		 if(head==null) {
			 System.out.println("Empty list");
		 }
		 else {
			 Node temp = head;
			 
			 while(temp != null) {
				 System.out.println(temp.data);
				 temp = temp.next;
			 }
		 }
	}
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			size++;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			
			temp.next = newNode;
			size++;
		}
	}

   public void remove(int index) {
	   if(head==null) {
		   System.out.println("Empty list");
	   }
	   else if (index == 0) {
		   head = head.next;
	   }
	   else {
		   Node temp = head;
		   Node temp2 = head.next;
		  
		   for(int i=0;i<index-1;i++) {
			   if(temp2.next ==null) {
				   System.out.println("List too short");
			   }
			   else {
				   temp = temp.next;
				   temp2 = temp2.next;
			   }
		   }
		   
		   temp.next = temp2.next;
		   size--;
	   }
   }
    
   @Override
   public String toString() {
	   String list = "[";
	   
	   Node temp = head;
	   while(temp.next!=null) {
		   list = list+ temp.data+", ";
		   temp = temp.next;
	   }
	   
	   list = list+ temp.data+"]";
	   
	   return list;
   }

}
