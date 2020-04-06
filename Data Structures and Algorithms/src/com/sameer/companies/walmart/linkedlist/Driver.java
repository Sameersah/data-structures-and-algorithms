package com.sameer.companies.walmart.linkedlist;

public class Driver {

  public static void main (String args[]){

    LinkedList list = new LinkedList();
    list.add(5);
    list.add(10);
    list.add(20);
    list.add(25);
    list.display();
    list.remove(1);
    list.display();
  }
}
