package com.sameer.dataStructures.Heap;

public class KthLargestElement {

	public static void main(String args[]) {
		
		int k = 4;
		int arr[] = {1,12,3,4,17,8,9,10,14,16,7};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		if(k>arr.length) {
			System.out.println("Not enough elements.");
			return;
		}
		int j=0;
		for( j=0;j<k;j++) {
			for(int i=0;i<arr.length-j;i++) {
				maxHeapify(arr,i);
			}
			if(j+1==k) {
				System.out.println("Kth largest element: "+arr[0]+" where k is "+(j+1));
				break;
			}
			
			swap(arr,0,arr.length-1-j);
		}
		
		/*for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();*/
		
	//	System.out.println("Kth largest element: "+arr[0]+" where k is "+k);
		
		 
	}
	
	private static void maxHeapify(int arr[], int i) {
		int parent = (i-1)/2;
		
		if(parent>=0 && arr[parent]<arr[i]) {
			swap(arr,i,parent);
			maxHeapify(arr,parent);
		}
	}
	
	private static void swap(int arr[], int i, int j ) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
