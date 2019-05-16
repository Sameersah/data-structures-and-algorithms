package com.sameer.interviewQuestions;

import com.sameer.dataStructures.LinkedList.LinkedList;
import com.sameer.dataStructures.LinkedList.LinkedListNode;

public class DeleteDuplicateFromList {
    public static  void main (String args[]){
        LinkedList list = new LinkedList();
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(40);
        list.add(50);

         LinkedListNode head = deleteDuplicate(list.getHead());
        while(head != null){
            System.out.println(head.getData());
            head = head.getNext();
        }
    }

    private static LinkedListNode deleteDuplicate(LinkedListNode head){
        LinkedListNode ptr1 = head;
        LinkedListNode ptr2 = head;

        while(ptr2 !=null){
            if(ptr2.getNext()!= null && ptr2.getNext().getData() == ptr1.getData()){
                LinkedListNode ptr3 = ptr2.getNext();
                ptr2.setNext(null);
                ptr2 = ptr3;
            }
            else if(ptr2.getNext()!= null && ptr2.getNext().getData() != ptr1.getData()){
                ptr1.setNext(ptr2.getNext());
                ptr1 = ptr2.getNext();

            }
            else if(ptr2.getNext() == null){
                ptr1.setNext(ptr2.getNext());
            }
            ptr2 = ptr2.getNext();
        }
        return  head;
    }
}
