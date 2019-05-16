/*
package com.sameer.interviewQuestions;

import com.sameer.dataStructures.LinkedList.LinkedList;
import com.sameer.dataStructures.LinkedList.LinkedListNode;

public class KeepOnlyUniqueInList {
    public static  void  main (String args[]){
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(30);

        LinkedListNode head = keepOnlyUniqueInList(list.getHead());
        while(head != null){
            System.out.println(head.getData());
            head = head.getNext();
        }
    }

    private static  LinkedListNode keepOnlyUniqueInList(LinkedListNode head){
        if(head == null || head.getNext() == null){
            return  head;
        }
       */
/* LinkedListNode ptr1;
        LinkedListNode ptr2 = head;
        while(ptr2 !=null){
            if(ptr2.getNext() !=null && head.getData() == ptr2.getNext().getData()){
                head  = head.getNext();
                ptr2 = ptr2.getNext();
            }
            else if(ptr2.getNext() !=null && head.getData() != ptr2.getNext().getData()){
                ptr1 = head.getNext();
                ptr2 = ptr2.getNext();

            }

        }*//*


        LinkedListNode ptr2 = head;
       while(head.getData() != ptr2.getNext().getData()){
           head = head.getNext();
           ptr2 = ptr2.getNext();
       }
       head = ptr2.getNext();

    }
}
*/
