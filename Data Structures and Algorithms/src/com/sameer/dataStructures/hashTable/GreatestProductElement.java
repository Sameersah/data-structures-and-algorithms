package com.sameer.dataStructures.hashTable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/*
 * given an array find the element which is a product of other element. If multiple, return the max.
 * If no such element, return -1
 * */

public class GreatestProductElement {
	
	public static void main(String args[]) {
		
		int arr[] = {10, 2, 2, 4, 30, 35};
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		
		 Arrays.sort(arr);
		
		 int maxProduct = -1;
		 for(int i= arr.length-1;i>=0;i--) {
			 int temp = arr[i];
			 int j = i-1;
			 
			 while(j>=0 && arr[j]>= Math.sqrt(temp)) {
				 if(temp%arr[j]==0) {
					 int temp2 = temp/arr[j];
					 if(set.contains(temp2)) {
						 maxProduct = temp;
						 break;
					 }
				 }
				 j--;
			 }	 
			 
		 }
		 System.out.println(maxProduct);
		 
		
		
		
		
		
	}

}
