package com.sameer.heap;

import java.util.Arrays;

public class MinHeap {
    private int arr[];
    private int capacity;
    private int lastIndex;
    private int count;

    public MinHeap(int capacity){
        this.capacity = capacity;
        this.arr = new int[capacity];
        count = 0;
        this.lastIndex = -1;
    }

    public boolean add(int n){
        if(lastIndex==arr.length-1){
            return false;
        }else{
            lastIndex++;
            arr[lastIndex] = n;
            percolateUp(lastIndex);
            return true;
        }
    }

    public void percolateUp(int index){
        int parentIndex = getParentIndex(index);
        if(parentIndex<0){
            return;
        }
        if(arr[index]< arr[parentIndex]){
            swap(index,parentIndex);
            percolateUp(parentIndex);
        }
    }

    private int getParentIndex(int index){
        if(index==0){
            return -1;
        }
        return (index-1)/2;
    }

    private void swap(int i,int j){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }

    public String toString(){
        return Arrays.toString(arr);
    }

    public int getMin(){
        return arr[0];
    }

    public int delete(){
        int data = arr[0];
        arr[0] = arr[lastIndex];
        percolateDown(0);
        return data;
    }

    public void percolateDown(int index){
        System.out.println("Index: "+index);
        int leftChildIndex = getLeftChildIndex(index);
        int rightChildIndex = getRightChildIndex(index);

        if(leftChildIndex > arr.length-1 || rightChildIndex >arr.length-1){
            return;
        }
        else if(leftChildIndex < arr.length-1 && rightChildIndex >arr.length-1 && arr[leftChildIndex]<arr[index]){
            swap(index,leftChildIndex);
            percolateDown(leftChildIndex);
        }
        else if(leftChildIndex > arr.length-1 && rightChildIndex <arr.length-1 && arr[rightChildIndex]<arr[index]){
            swap(index,rightChildIndex);
            percolateDown(rightChildIndex);
        }else{
            int minChildIndex = arr[leftChildIndex]<arr[rightChildIndex]?leftChildIndex:rightChildIndex;
            if(arr[minChildIndex]<arr[index]){
                swap(index,minChildIndex);
                percolateDown(minChildIndex);
            }
        }
    }

    private int getLeftChildIndex(int index){
        return 2*index+1;
    }

    private int getRightChildIndex(int index){
        return 2*index+2;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
