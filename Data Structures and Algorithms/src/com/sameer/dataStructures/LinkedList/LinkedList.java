package com.sameer.dataStructures.LinkedList;

public class LinkedList {


	
	private Integer size;

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public LinkedListNode getHead() {
		return head;
	}

	public void setHead(LinkedListNode head) {
		this.head = head;
	}

	private LinkedListNode head;
	
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
			 LinkedListNode temp = head;
			 
			 while(temp != null) {
				 System.out.print(temp.data+" ");
				 temp = temp.next;
			 }
			 System.out.println();
		 }
	}
	
	public LinkedListNode get(int index){
		if(index<0 || index >= size){
			return null;
		}
		else {
			LinkedListNode temp = head;
			for(int i=0;i<index;i++){
				temp =temp.next;
				
			}
			return temp;
		}
			
	
	}
	
	public void add(int data) {
		LinkedListNode newNode = new LinkedListNode(data);
		if(head==null) {
			head = newNode;
			size++;
		}
		else {
			LinkedListNode temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			
			temp.next = newNode;
			size++;
		}
	}

   public void remove(int index) {
	   LinkedListNode pre = null;
	   LinkedListNode curr = head;
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

	   LinkedListNode temp = head;
	   while(temp.next!=null) {
		   list = list+ temp.data+", ";
		   temp = temp.next;
	   }
	   
	   list = list+ temp.data+"]";
	   
	   return list;
   }

    public void swapNodesWithoutData(int data1, int data2){

		LinkedListNode preX = null;
		LinkedListNode currX = head;
		LinkedListNode preY = null;
		LinkedListNode currY = head;
    	
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

		LinkedListNode temp = currX.next;
    	currX.next = currY.next;
    	currY.next = temp;
    }

    public boolean checkNodeUsingRecursion(LinkedListNode node, int data){
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

    public LinkedListNode getMiddleNode(){
		LinkedListNode temp1 = head;
		LinkedListNode temp2 = head;
    	
    		while(temp1.next!=null && temp1.next.next !=null){
    			temp1 = temp1.next.next;
    			temp2 = temp2.next;	
    	}
    	return temp2;
    }
    
    public void reverseUsingRecursion(LinkedListNode pre, LinkedListNode curr){
    	if(curr==null){
    		head = pre;
    	}
    	else{
    		reverseUsingRecursion(curr, curr.next);
    		curr.next = pre;
    	}
    	
    }
    
    public boolean isCyclic (){
		LinkedListNode temp1 = head;
		LinkedListNode temp2 = head;
    	
    	while (temp2 != null && temp2.next != null ){
    		temp2 = temp2.next.next;
    		temp1 = temp1.next;
    		
    		if(temp1 == temp2){
    			return true;
    		}
    	}
    	
    	return false;
    }
}
