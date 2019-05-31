package com.sameer.heap;

public class HeapSort {

    MinHeap heap;
    public void sort(int arr[]){
        buildHeap(arr);
        for(int i=0;i<(arr.length-1)/2;i++){

        }
    }

    private void buildHeap(int arr[]){
       heap = new MinHeap(arr.length);
       heap.setArr(arr);
       for(int i=(arr.length-1)/2;i>=0;i--){
           heap.percolateUp(i);
       }
    }
}
