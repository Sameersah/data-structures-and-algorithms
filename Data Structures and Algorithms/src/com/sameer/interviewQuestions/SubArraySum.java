package com.sameer.interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class SubArraySum {

    public static void main(String args[]){
        int arr[] = {3,6,-1,4,7,2,-2};
        int k = 9;

        System.out.println(getSubArrays(arr,k));
    }

    private static List<ArrayList<Integer>> getSubArrays(int arr[],int k){
        List<ArrayList<Integer>>  list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
           /* for(int j=i;j<arr.length;j++){
                int sum = 0;
                for(int l=i;l<=j;l++){
                    sum = sum + arr[l];
                }
                if(sum == k){
                    ArrayList<Integer> subArrList = new ArrayList<>();
                    subArrList.add(i);
                    subArrList.add(j);
                    list.add(subArrList);
                }
            }*/

           int sum = 0;

           int j = i;
           while (j<arr.length){
               sum = sum + arr[j];
               if(sum == k){
                   ArrayList<Integer> subArrList = new ArrayList<>();
                   subArrList.add(i);
                   subArrList.add(j);
                   list.add(subArrList);

               }

               j++;
           }
       }
        return list;
    }
}
