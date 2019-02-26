package com.sameer.dataStructures.hashTable;

public class SubArraySumZero {

	public static void main(String args[]) {
		int arr[] = {2,5,-5,-2,8};
		boolean flag = false;
		for(int i=0;i<arr.length;i++) {
			int sum = arr[i];
			
			if(sum==0) {
				System.out.println(true);;
			}
			for(int j=i+1;j<arr.length;j++) {
				
				sum+= arr[j];
				if(sum==0) {
					flag = true;
					System.out.println(true);
					break;
				}
				
			}
			if(flag == true) {
				break;
			}
		}
		if(flag==false) {
			System.out.println(false);
		}
	}
}
