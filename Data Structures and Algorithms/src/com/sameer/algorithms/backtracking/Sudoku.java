/*
package com.sameer.algorithms.backtracking;

public class Sudoku {
    private static  int sol[][];
    public  static  void main (String args[]){
        int arr[][] = {
                {3,0,6,5,0,8,4,0,0},
                {5,2,0,0,0,0,0,0,0},
                {0,8,7,0,0,0,0,3,1},
                {0,0,3,0,1,0,0,8,0},
                {9,0,0,8,6,3,0,0,5},
                {0,5,0,0,9,0,6,0,0},
                {1,3,0,0,0,0,2,5,0},
                {0,0,0,0,0,0,0,7,4},
                {0,0,5,2,0,6,3,0,0}
        };

        sol = new int[9][9];
        if(solveSudoko(arr,0,0)==false){
            System.out.println("No sol. exist.");
        }
    }

    private static boolean solveSudoko(int arr[][],int i,int j){
        if(i>arr[0].length-1 || j>arr.length-1){
            return false;
        }
        else if(arr[i][j] !=0){
            sol[i][j] = arr[i][j];
            return true;
        }
        else{

        }
    }

}
*/
