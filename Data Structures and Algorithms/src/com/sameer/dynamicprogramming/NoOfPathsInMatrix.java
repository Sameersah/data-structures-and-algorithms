package com.sameer.dynamicprogramming;

public class NoOfPathsInMatrix {

    public static void main(String args[]){

        int rows = 2;
        int cols = 3;


        System.out.println("No of ways to reach bottom right grid from top left grid is "+ getNoOfPaths(rows-1,cols-1));
    }

    private static int getNoOfPaths(int m, int n){
        if(m==0 || n==0){
            return 1;
        }
        else{
            return getNoOfPaths(m-1,n)+getNoOfPaths(m,n-1);
        }
    }
}

