package com.sameer.algorithms.backtracking;

import java.util.ArrayList;
import java.util.List;

public class AllStringsOfNbits {

	private static List<Integer> list;
	 
	public static void main(String args[]) {
		list = new ArrayList<Integer>();
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		
		getAllStringsOfNbits(list.size()-1);
	}
	
	private static void getAllStringsOfNbits(int index) {
		if(index <0) {
			System.out.println(list);
		}else {
			list.set(index, 0);
			getAllStringsOfNbits(index-1);
			list.set(index, 1);
			getAllStringsOfNbits(index-1);
		}
		
	}
	
}
