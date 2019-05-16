package com.sameer.interviewQuestions;

import com.sameer.dataStructures.LinkedList.LinkedList;
import com.sameer.dataStructures.LinkedList.LinkedListNode;

public class IsListPalindrome {

    static  LinkedListNode temp;
//    static LinkedListNode ptr;

    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.add(70);
        list.add(90);
        list.add(40);
        list.add(10);
        list.add(80);
        list.add(10);
        list.add(40);
        list.add(90);
        list.add(70);
        System.out.println(list);

        System.out.println(isPalindrome(list));
    }

    private static int isPalindrome(LinkedList list) {
        int index;
        if (list.size() % 2 == 0) {
            index = list.size() / 2;
            System.out.println("Even length list. Index is "+index);
        } else {
            index = list.size() / 2 + 1;
            System.out.println("Odd length list. Index is "+index);
        }

        LinkedListNode ptr = list.get(index);
        System.out.println("2nd half pointer is at: "+ptr.getData());
          temp = list.getHead();
        System.out.println("1st Half ptr is at: "+temp.getData());
        boolean isPalindrome = compareRecursivly(ptr);

        if (isPalindrome) {
            return 1;
        } else {
            return 0;
        }
    }

    private static boolean compareRecursivly(LinkedListNode ptr) {
        if (ptr.getNext() == null) {
            if (ptr.getData() != temp.getData()) {
                temp = temp.getNext();
                return false;
            } else {
                System.out.println("ptr.getData()"+ptr.getData());
                System.out.println("temp.getData()"+temp.getData());
                System.out.println("ptr.getData() == temp.getData()"+(ptr.getData() == temp.getData()));
                temp = temp.getNext();
                return true;
            }
        }
        if(compareRecursivly(ptr.getNext())){
            System.out.println("temp data is"+temp.getData());
            System.out.println("ptr data is"+ptr.getData());

            if  (temp.getData() == ptr.getData()){
                temp = temp.getNext();
                return  true;
            }
        }
        return false;
    }
}
