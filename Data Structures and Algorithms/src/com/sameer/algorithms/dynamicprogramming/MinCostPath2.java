package com.sameer.algorithms.dynamicprogramming;

//bottom up approach
public class MinCostPath2 {

    static int minCostArr[][];
    public static void main(String args[]){
        int arr[][] = {{1,2,3},{4,8,2},{1,5,3}};
        minCostArr = new int[3][3];
        System.out.println(getMinCostTo(arr, 2,2));

    }

    private static int getMinCostTo(int arr[][], int k,int l){
        for(int i=0;i<=k;i++){
            for(int j=0;j<=l;j++){
                if(i==0 && j==0){
                  //  System.out.println(arr[0][0]);
                    minCostArr[i][j] = arr[0][0];

                }
                else if(i==0 && j!=0){
                    minCostArr[i][j]= arr[i][j] + minCostArr[i][j-1];
                }else if(i !=0 && j==0){
                    minCostArr[i][j] = arr[i][j]+ minCostArr[i-1][j];
                }else{
                    minCostArr[i][j] = arr[i][j]+Math.min(Math.min(minCostArr[i-1][j],minCostArr[i][j-1]),minCostArr[i-1][j-1]);
                }
            }
        }

        return minCostArr[k][l];
    }
}
