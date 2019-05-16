package com.sameer.backtracking;

import java.util.ArrayList;
import java.util.List;

public class NLengthStringFromkBits {

	private static List<Integer> nList;
	private static int size;
	private static List<Integer> kList;
	private static int index;
	public static void main(String args[]) {
		nList = new ArrayList<Integer>();
		kList = new ArrayList<Integer>();
		kList.add(1);
		kList.add(2);
	//	kList.add(3);
	//	kList.add(4);
		 size = 3;
		 index = 0;
		getNLengthStringFromkBits();
	}
	
	private static void getNLengthStringFromkBits(){
		if(index > size-1) {
			System.out.println(nList);
			index =0;
		}else {
			System.out.println(index);
			nList.add(index,kList.get(0));
			index++;
			getNLengthStringFromkBits();
			nList.add(index,kList.get(1));
			index++;
			getNLengthStringFromkBits();
			/*nList.add(index,kList.get(2));
			getNLengthStringFromkBits(index+1);*/
		}
		
		
	}
}
