package com.sameer.dataStructures.hashTable;

import java.util.HashMap;
import java.util.Map;

/*
 * Check if a given array contains duplicate elements within k distance from each other
Given an unsorted array that may contain duplicates. Also given a number k which is smaller than size of array. 
Write a function that returns true if array contains duplicates within k distance.
 * */
/*time complexity - O(n) */
public class DuplicateWithinKDistance {

	public static void main(String args[]) {
		int k =6;
		int a[] = {2,3,4,6,7,1,2,4,5,2,5,3,1,7};
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++) {
			if(!map.containsKey(a[i])) {
				map.put(a[i],i);
			}
			else {
				int dis1 = map.get(a[i]);
				if(i-dis1<=k) {
					System.out.println("Yes "+a[i]+" is a duplicate element in the array that exist within k distance.");
				return;
				}
			}
		}
		
		System.out.println("There is no duplicate element in the array that exist within k distance.");
	}
}
