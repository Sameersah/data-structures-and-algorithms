package com.sameer.interviewQuestions;

public class MaxArraySumWithNoAdjecent {

    public static void main (String args[]){
       int arr[] = {5,  5, 10, 100, 10, 5};



        /*int sum[] = {0,0,0,0,0,0};
        int inclSum[] = {5,0,0,0,0,0};
        int exclSum[] = {0,0,0,0,0,0};*/
        int inclSum=5,exclSum=0;
        for(int i=1;i<arr.length;i++){
            int temp = exclSum;
            exclSum = Math.max(inclSum,exclSum);
           inclSum = temp + arr[i];


        }

        System.out.println( Math.max(inclSum,exclSum));
    }


}
