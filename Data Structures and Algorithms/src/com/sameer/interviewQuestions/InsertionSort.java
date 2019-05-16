package com.sameer.interviewQuestions;

import java.util.Arrays;

public class InsertionSort {
    public static void main (String args[]){
        int arr[] = {3,6,1,8,6,9,4,7};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int arr[]){
        for(int i=1;i<=arr.length-1;i++){
            int j = i;
            int temp = arr[j];
            while(j>0 && temp < arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;

        }
    }
}
