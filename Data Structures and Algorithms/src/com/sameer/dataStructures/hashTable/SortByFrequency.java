package com.sameer.dataStructures.hashTable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


/*
 * Sort elements by frequency | Set 4 (Efficient approach using hash) 
 * Print the elements of an array in the decreasing frequency if 2 numbers 
 * have same frequency then print the one which came first.
 * */

public class SortByFrequency {

	public static void main(String args[]) {
		
		int arr[] = {1,1,3,2,7,2,4,8,7,2,8,4,8};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.replace(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		
		Set<Integer> set = new TreeSet<Integer>(Collections.reverseOrder());
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			set.add(entry.getValue());
		}
		
		List<Integer> list = new ArrayList<Integer>();
		for(int a:set) {
			for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
				if(entry.getValue()==a) {
					list.add(entry.getKey());
				}
			}
		}
		
		for(int a:list) {
			int freq = map.get(a);
			for(int i=0;i<freq;i++) {
				System.out.print(a+" ");
			}
		}
		
		
		
		
		
	}
}
