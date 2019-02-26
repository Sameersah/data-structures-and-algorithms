package com.sameer.dataStructures.Heap;

public class HeapSort {

	public static void main(String args[]) {
		
		int arr[] = {1,12,3,4,17,8,9,10,14,16,7};
		
		for(int j=0;j<arr.length-1;j++) {
			for(int i=0;i<arr.length-j;i++) {
				MaxHeap.maxHeapify(arr, i);
			}
			MaxHeap.swap(arr,0, arr.length-1-j);
		}

		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
}
