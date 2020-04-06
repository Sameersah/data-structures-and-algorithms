package com.sameer.companies.walmart.linkedlist;

public class LinkedList {
  private Node head;

  public LinkedList(){
    head = null;
  }

  public Node add(int data){
    Node newNode = new Node(data);
    if(head == null){
      head = newNode;
    }else{
      Node temp = head;
      while(temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
    }

    return  head;
  }

  public Node remove(int pos){
    if(head == null)
      return head;
    if(pos == 1){
      head = head.next;
      return head;
    }

    int length = 1;
    Node temp = head;
    while(temp.next != null){
      temp = temp.next;
      length++;
    }
    if(pos>length){
      return head;
    }else{
       temp = head;
      for(int i=0;i<pos-2;i++){
        temp = temp.next;
      }
      temp.next = temp.next.next;
      return head;
    }

  }

  public void display(){
    Node temp = head;
    while(temp != null){
      System.out.println(temp.data);
      temp = temp.next;
    }
    System.out.println("----");
  }
}
