package com.sameer.recursion;

public class isArraySorted {

	public static void main(String args[]) {
		int arr[] = {0,3,4,5,7,8,9};
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
		System.out.println();
		System.out.println("Is the given array sorted? "+isGivenArraySorted(arr.length-1,arr));
	}
	
	private static boolean isGivenArraySorted(int endIndex, int arr[]) {
		if(endIndex<0) {
			System.out.println("array is empty");
			return false;
		}
		else if(endIndex==0) {
			return true;
		}
		else if(arr[endIndex]<arr[endIndex-1]) {
			return false;
		}
		else {
			return isGivenArraySorted(--endIndex,arr);
		}
	}
}
