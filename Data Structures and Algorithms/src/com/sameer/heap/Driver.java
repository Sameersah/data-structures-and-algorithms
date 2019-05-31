package com.sameer.heap;

import java.util.Arrays;

public class Driver {

    public static void main(String args[]){
        MinHeap heap = new MinHeap(10);
        heap.add(70);
        heap.add(20);
        heap.add(30);
        heap.add(5);
        heap.add(25);
        heap.add(12);
        heap.add(40);
        heap.add(50);
        heap.add(60);
        heap.add(13);

        heap.add(80);

        System.out.println(heap.toString());
        System.out.println(heap.getMin());

        int arr[] = {5,3,4,2,6,1,9,2};
         HeapSort heapSort = new HeapSort();
         heapSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
