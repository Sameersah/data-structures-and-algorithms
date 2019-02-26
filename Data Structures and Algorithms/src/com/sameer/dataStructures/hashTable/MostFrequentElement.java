package com.sameer.dataStructures.hashTable;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Given an array, find the most frequent element in it. 
 * If there are multiple elements that appear maximum number of times, print any one of them.
 * */
public class MostFrequentElement {

	public static void main(String args[]) {
		
		int a[] = {1,1,1,1,2,3,4,4,4,5,6,6,6,6,3,3,3,5,5,1,9,1,3};
		
		int maxKey = a[0];
		int maxValue = 1;
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++) {
			if(!map.containsKey(a[i])) {
				map.put(a[i], 1);
			}
			else {
				int value = map.get(a[i]);
				value++;
				if(value>maxValue) {
					maxValue = value;
					maxKey = a[i];
				}
				map.replace(a[i], value);
			}
		}
		
		System.out.println(maxKey+ " appeared for the max. no. of times: "+maxValue);
		System.out.println(map);
	}
}
