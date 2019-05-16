package com.sameer.test;

public class isArraySorted {

	public static void main(String args[]) {
		
		int arr[] = {2,3,4,5,6,7,8};
		
		System.out.println(isThisArraySorted(0,arr));
	}
	
	 static boolean isThisArraySorted(int index,int arr[]) {
		if(index == arr.length-1) {
			return true;
		}
		
		if(arr[index]<arr[index+1]) {
			return isThisArraySorted(index+1,arr);
		}
		else {
			return false;
		}
		
	}
}
