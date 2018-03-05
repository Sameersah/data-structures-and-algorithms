package com.sameer.drivers;

import java.util.LinkedList;
import java.util.List;

public class Driver2 {

	public static void main (String args[]) {
		
		List list = new LinkedList();
		
		list.add(10);
		list.add(20);
		System.out.println(list);
		int size = list.size();
		System.out.println("size: "+size);
		
		list.remove(1);
		System.out.println(list);
		
	}
}
