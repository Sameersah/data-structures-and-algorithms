package com.sameer.dataStructures.LinkedList;

public class LinkedListNode {
    Integer data;
    LinkedListNode next;

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    public LinkedListNode (Integer data) {
        this.data = data;
        this.next = null;
    }

}
