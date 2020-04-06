package com.sameer.algorithms.backtracking;

import java.util.Arrays;

public class NlengthStringFromKbits {

    private static int arr[];
    public static  void main(String args[]){

         arr = new int[3];

        print(3,5);

    }

    private static void print(int n,int k){
 if(n<1){
     System.out.println(Arrays.toString(arr));
 }else{
     for(int i=0;i<k;i++){
         arr[n-1] = i;
         print(n-1,k);
     }
 }
    }
}
