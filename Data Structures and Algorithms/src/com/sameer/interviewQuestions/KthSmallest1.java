package com.sameer.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;


import java.util.List;

//Time complexity - O(nlog(n))
public class KthSmallest1 {

    public static  void main (String args[]){
        int arr[] = {5,2,7,8,1};
        int k = 3;
        System.out.println(getKthSmallestElement(arr,k));
        List list = new ArrayList();
    }

    private static int getKthSmallestElement(int arr[], int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
}

