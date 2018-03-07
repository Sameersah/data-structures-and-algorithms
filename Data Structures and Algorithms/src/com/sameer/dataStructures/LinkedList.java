package com.sameer.dataStructures;

public class LinkedList {

	private class Node  {
		Integer data;
		Node next;
		
		public Node (Integer data) {
			this.data = data;
			this.next = null;
		}
		
		@Override
		public String toString(){
			return this.data.toString();
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
				 System.out.print(temp.data+" ");
				 temp = temp.next;
			 }
			 System.out.println();
		 }
	}
	
	public Node get(int index){
		if(index<0 || index >= size){
			return null;
		}
		else {
			Node temp = head;
			for(int i=0;i<index;i++){
				temp =temp.next;
				
			}
			return temp;
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
	   Node pre = null;
	   Node curr = head;
	   if(head == null){
		   return;
	   }
	   if(index==0){
		   head = head.next;
	   }
	   while(index >0){
		   pre = curr;
		   curr = curr.next;
		   index--;
	   }
	   pre.next = curr.next;
	   size--;
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

    public void swapNodesWithoutData(int data1, int data2){
    	
    	Node preX = null;
    	Node currX = head;
    	Node preY = null;
    	Node currY = head;
    	
    	while(currX!=null && currX.data!= data1){
    		preX= currX;
    		currX = currX.next;
    	}
    	
    	while(currY!=null && currY.data!= data2){
    		preY = currY;
    		currY = currY.next;
    	}
    	
    	if(currX==null || currY==null){
    		System.out.println("Nodes not found");
    		return;
    	}
    	
    	if(preX != null){
    		preX.next = currY;
    	}
    	else{
    		head = currY;
    	}
    	
    	if(preY !=null){
    		preY.next = currX;
    	}
    	else{
    		head = currX;
    	}
    	
    	Node temp = currX.next;
    	currX.next = currY.next;
    	currY.next = temp;
    }

    public boolean checkNodeUsingRecursion(Node node, int data){
    	if(node == null){
    		return false;
    	}
    	else if(node.data == data){
    		return true;
    	}
    	else {
    		return checkNodeUsingRecursion(node.next, data);
    	} 
    	
    }

    public Node getMiddleNode(){
    	Node temp1 = head;
		Node temp2 = head;
    	
    		while(temp1.next!=null && temp1.next.next !=null){
    			temp1 = temp1.next.next;
    			temp2 = temp2.next;	
    	}
    	return temp2;
    }
    
    public void reverseUsingRecursion(Node pre, Node curr){
    	if(curr==null){
    		head = pre;
    	}
    	else{
    		reverseUsingRecursion(curr, curr.next);
    		curr.next = pre;
    	}
    	
    }
}
