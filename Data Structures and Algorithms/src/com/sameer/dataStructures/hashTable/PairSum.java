package com.sameer.dataStructures.hashTable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PairSum {

	public static void main(String args[]) {
		
		int arr[] = {2,4,6,8,3,7,5};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		Set<Integer> set = new HashSet<Integer>();
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
		//	System.out.print(arr[i]+" ");
			set.add(arr[i]);
		}
		
		System.out.println();
		
		
		
		
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j= i+1;j<arr.length;j++) {
				//System.out.println(arr[i]+arr[j]);
				
				if(set.contains(arr[i]+arr[j])) {
					System.out.print(arr[i]+" "+ arr[j]);
					System.out.println();
				}
			}
		}
		
		System.out.println("End.");
	}
}
