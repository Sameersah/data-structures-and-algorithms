package com.sameer.dataStructures.hashTable;

/*
 * Number of subarrays having sum exactly equal to k 
 * Given an unsorted array of integers, find number of subarrays having sum exactly equal to a given number k.
 * */

public class SubarrySum {

	public static void main(String args []) {
		
		int arr[] = {4,5,6,3,6,2};
		int k =9;
		int count =0;
		 for(int i=0;i<arr.length;i++) {
			 count = count+ subArraySum(i,arr,k);
		 }
	     
		System.out.println("Total sub array(s) with sum = "+k+" is/are " +count);
		
	}
	
	private static int subArraySum(int index, int arr[],int k) {
	//	System.out.println(index);
		if(index >arr.length-1) {
			return 0;
		}
		else if(arr[index]==k) {
			return 1;
		}
		else if (arr[index]>k) {
			return 0;
		}
		else {
			int temp = k- arr[index];
			return subArraySum(index+1,arr,temp);
		}
	}
	
}
