package com.sameer.drivers;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String args[]) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		
		System.out.println(list);
		
		list.add(0, 5);
		System.out.println(list);
		
		
	}
}
