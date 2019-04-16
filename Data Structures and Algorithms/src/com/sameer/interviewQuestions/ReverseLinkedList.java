package com.sameer.interviewQuestions;

import com.sameer.dataStructures.LinkedList.LinkedList;
import com.sameer.dataStructures.LinkedList.LinkedListNode;

public class ReverseLinkedList {

    public static  void main (String args[]){
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.display();

        reverse(list);
        list.display();
    }

    private static  void reverse(LinkedList list){
        LinkedListNode first = null;
        LinkedListNode second = list.getHead();

        while(second !=null){
            LinkedListNode temp = second.getNext();
            second.setNext(first);
            first = second;
            second = temp;
        }

         list.setHead(first);
    }
}
