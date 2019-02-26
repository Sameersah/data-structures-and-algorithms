package com.sameer.dataStructures.hashTable;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Find whether 2nd  array is subset of 1st array
 * input- 
 * 1st line -no. of elements in 1st array 
 * 2nd line -1st array elements
 *  3rd line -no. of elements in 2nd array
 *  4th line - 2nd array elements
 * */
public class ArraySubset {

	public static void main(String args[] ) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			set.add(sc.nextInt());
		}
		int m = sc.nextInt();
		
		for(int i=0;i<m;i++) {
			if(!set.contains(sc.nextInt())) {
				System.out.println("Array 2 is not subset of array 1.");
				return ;
			}
		}
		System.out.println("Array 2 is subset of array 1.");
		sc.close();
	}
	
	 
	
}
