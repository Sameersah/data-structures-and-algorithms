package com.sameer.dataStructures.Heap;

public class MaxHeap {

	public static void main (String args[]) {
		int arr[] = {1,2,3,4,7,8,9,10,14,16};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			maxHeapify(arr,i);
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void maxHeapify(int arr[], int i) {
		
		int parent = (i-1)/2;
		
		if(parent>=0 && arr[parent]< arr[i]) {
			swap(arr,i,parent);
			maxHeapify(arr,parent);
		}
		
		
	}
	
	public static void swap(int arr[],int i, int j) {
		int temp = arr[i];
		arr[i]= arr[j];
		arr[j] = temp;
	}
}
