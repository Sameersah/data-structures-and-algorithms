package com.sameer.dynamicprogramming;

import java.util.Arrays;
//top down
public class GoldMineProblem {

    static int maxCost[][];
    public static void main(String args[]){
        int arr[][] = {{1,3,3},{2,1,4},{0,6,4}};
        int cost[] = new int[arr.length];
        maxCost = new int[3][3];
        for(int i=0;i<arr.length;i++)
        Arrays.fill(maxCost[i],-1);
        for(int i=0;i<arr.length;i++){
            cost[i] = getMaxGold(arr,i,0);
        }
        Arrays.sort(cost);
         System.out.println(cost[cost.length-1]);
    }

    private static  int  getMaxGold(int arr[][],int i,int j){
        if(j==arr[0].length-1){
            maxCost[i][j] = arr[i][j];

        }else if(maxCost[i][j] == -1){
            if(i==0){
                maxCost[i][j] = arr[i][j]+ Math.max(getMaxGold(arr,i,j+1),getMaxGold(arr,i+1,j+1));
            }else if(i== arr.length-1){
                maxCost[i][j] = arr[i][j]+ Math.max(getMaxGold(arr,i,j+1),getMaxGold(arr,i-1,j+1));
            }else{
                maxCost[i][j] = arr[i][j]+ Math.max(Math.max(getMaxGold(arr,i,j+1),getMaxGold(arr,i+1,j+1)),getMaxGold(arr,i-1,j+1));

            }

        }

        return  maxCost[i][j];
    }
}
