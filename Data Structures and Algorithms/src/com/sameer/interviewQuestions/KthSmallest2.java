package com.sameer.interviewQuestions;

import java.util.Arrays;

public class KthSmallest2 {

    public static void main(String args[]){
        int arr[] = {3,2,7,4,9};
        int k = 3;

        minHeapify(arr);
        for(int i=0;i<k;i++){

        }
        System.out.println(Arrays.toString(arr));
    }

    private static void minHeapify(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            if( arr[i]<arr[i/2]){
                minHeapifyUp(arr,i);
            }
        }
    }

    private static void minHeapifyUp(int arr[],int index){
        int parentIndex = index/2;
        swap(arr,index, parentIndex);
        if(arr[parentIndex] <arr[parentIndex/2]){
            minHeapifyUp(arr,parentIndex);
        }
    }

    private static void swap(int arr[],int index, int parentIndex){
        int temp = arr[index];
        arr[index] = arr[parentIndex];
        arr[parentIndex] = temp;
    }
}
