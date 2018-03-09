package com.sameer.dataStructures;

public class DoublyLinkedList {

	private class Node{
		int data;
		Node pre, next;
		
	public Node(int data){
		this.data = data;
		pre = null;
		next = null;
	}
	}
	
	private Node head;
	
	public DoublyLinkedList(){
		head = null;
		
	}
	
    public void add(int data){
		Node newNode = new Node(data);
		
		if(head==null){
			head = newNode;
			}
		else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			newNode.pre = temp;
			temp.next = newNode;
		}
	}

    public void display(){
    	if(head ==null){
    		return;
    	}
    	else{
    		Node temp = head;
    		while(temp!= null){
    			System.out.print(temp.data+" ");
    			temp = temp.next;
    		}
    		System.out.println();
    	}
    }

    public void remove(int data){
    	if(head == null){
    		return;
    	}
    	else if(head.data == data){
    		head.next.pre = null;
    		head = head.next;
    	}
    	else{
    		Node temp = head;
    		while(temp!= null && temp.data!= data){
    			temp = temp.next;
    		}
    		
    	   if(temp == null){
    		   return;
    	   }
    	   else{
    		   temp.pre.next = temp.next;
    		   temp.next.pre = temp.pre;
    	   }
    		
    	}
    }

    public void removeAtIndex(int index){
    	 if(head==null || index<0){
    		 return;
    	 }
    	 
    	 Node temp = head;
    	 if(index== 0){
    		 head = temp.next;
    		 
    	 }

    	 while(index>0){
    		 temp = temp.next;
    		 if(temp== null){
    			 return;
    		 }
    		 index--;
    	 }
    	 if(temp.pre != null){
    	 temp.pre.next = temp.next;
    	 }
    	 if(temp.next!= null){
    		 temp.next.pre = temp.pre;
    	 }
    	 
    	 
    }
    
    public void reverseUsingIteration(){
       
    		if(head ==null || head.next ==null){
    			return;
    		}
    		else{
    			Node temp = head;
    			Node temp2 = null;
    			while(temp.next != null){
    				temp2 = temp.next;
        			temp.next = temp.pre;
        			temp.pre = temp2;
        			temp = temp2;
    			}
    			temp.next = temp.pre;
    			temp.pre = null;
    			head = temp;
    		}
    	}
    
}
