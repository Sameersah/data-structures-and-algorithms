package com.sameer.dynamicprogramming;

public class SubsetSum {

    public static void main(String args[]){
        int arr[]= {3,34,4,12,5,2};
        int sum = 8;
        System.out.println(isSubsetSumAvailable(arr,arr.length,sum));
    }

    private static boolean isSubsetSumAvailable(int arr[],int n,int sum){
        if(n==0 && sum >0){
            return false;

        }else if( sum==0){
            return true;
        }else if(arr[n-1]>sum){
            return  isSubsetSumAvailable(arr,n-1,sum);
        }
        else{
            return isSubsetSumAvailable(arr,n-1,sum-arr[n-1]) || isSubsetSumAvailable(arr,n-1,sum);
        }
    }
}
