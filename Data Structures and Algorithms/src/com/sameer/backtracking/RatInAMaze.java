package com.sameer.backtracking;

import java.util.Arrays;

//https://www.geeksforgeeks.org/rat-in-a-maze-backtracking-2/

public class RatInAMaze {

    static int sol[][];

    public static  void main(String args[]){
        int arr[][] = {{1, 0, 0, 0},{1, 1, 0, 1},{0, 1, 0, 0},{1, 1, 1, 1}};
        sol = new int[4][4];
        if(solveMaze(arr,0,0)==false){
            System.out.println("No path exist");
        }
    }

    private static boolean solveMaze(int arr[][],int i,int j){
        if(i>arr[0].length-1 || j>arr.length-1){
            return  false;
        }
        if(i==j && j== arr.length-1){
            for(int k=0;k<arr.length;k++)
            System.out.println(Arrays.toString(sol[k]));
            return true;
        }
        if(arr[i][j]==0){
            return false;
        }

        sol[i][j]=1;
        if(solveMaze(arr,i+1,j)==true || solveMaze(arr,i,j+1)==true)
        return  true;
        return false;
    }
}
