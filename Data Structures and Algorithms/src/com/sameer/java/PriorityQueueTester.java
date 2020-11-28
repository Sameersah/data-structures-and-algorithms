package com.sameer.java;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueTester {

  public static  void main (String args[]) {
    PriorityQueue queue = new PriorityQueue();
    queue.add(10);
    queue.add(20);
    queue.add(5);
    queue.add(100);
    queue.add(2);
    queue.add(7);
    queue.add(15);

    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println();

    PriorityQueue queue2 = new PriorityQueue(Collections.reverseOrder());

    queue2.add(10);
    queue2.add(20);
    queue2.add(5);
    queue2.add(100);
    queue2.add(2);
    queue2.add(7);
    queue2.add(15);

    System.out.println(queue2.poll());
    System.out.println(queue2.poll());
    System.out.println(queue2.poll());
    System.out.println(queue2.poll());
    System.out.println(queue2.poll());

  }
}
