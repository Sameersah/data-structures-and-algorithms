package com.sameer.dynamicprogramming;


//top down approach
public class MinCostPath {

  //  static int minCostArr[][];
    public static void main(String args[]){
        int arr[][] = {{1,2,3},{4,8,2},{1,5,3}};
        System.out.println(getMinCostTo(arr, 2,2));
     //   minCostArr = new int[3][3];
    }

    private static int getMinCostTo(int arr[][], int i,int j){
        if(i<0 || j<0){
            return Integer.MAX_VALUE;
        }
        else if(i==0 && j==0){
            return arr[0][0];
        }else{
            return  arr[i][j]+ Math.min(Math.min(getMinCostTo(arr,i-1,j),getMinCostTo(arr,i,j-1)),getMinCostTo(arr,i-1,j-1));
        }


    }
}
