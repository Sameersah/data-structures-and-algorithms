package com.sameer.dataStructures.hashTable;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;


public class NonRepeatingWords {

	public static void main(String args[]) {
		
		String a = "I have a blue pen";
		String b = "I got a new pen";
		
		String arr[] = a.split(" "); //O(n)
		
		Map<String,String> map = new HashMap<String, String>();
		
	//	Set<String> set = new HashSet<String>();
		for(int i=0;i<arr.length;i++) {     
		//	set.add(arr[i]);
			map.put(arr[i], "non-repeating");
		}
		
		String arr2[] = b.split(" ");
		
		List<String> list2 = new ArrayList<String>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr2[i])) {
				map.replace(arr2[i], "repeating");
			}
			else {
				list2.add(arr2[i]);
			}
		}
		
		List<String> list = new ArrayList<String>();
		for(Map.Entry<String,String> entry: map.entrySet()) {
			if(entry.getValue().equals("non-repeating")) {
				list.add(entry.getKey());
			}
		}
		
		List<String> list3 = new ArrayList<String>();
		
		list3.addAll(list);
		list3.addAll(list2);
		
		for(String s: list3) {
			System.out.print(s+" ");
		}
		
	}
}
