package com.sameer.dynamicprogramming;

import java.util.Arrays;

//topDown
public class NoOfPathsInMatrix {

    static Integer solMatrix[][];
    public static void main(String args[]){

        int rows = 3;
        int cols = 3;

        solMatrix= new Integer[rows][cols];
        for(int i=0;i<solMatrix.length;i++)
        Arrays.fill(solMatrix[i],-1);
        System.out.println("No of ways to reach bottom right grid from top left grid is "+ getNoOfPaths(rows-1,cols-1));
    }

    private static int getNoOfPaths(int m, int n){
        if(m==0 || n==0){
            solMatrix[m][n] = 1;
            return  solMatrix[m][n];
        }else if(solMatrix[m][n] != -1){
            return  solMatrix[m][n];
        }
        else {
          //  return getNoOfPaths(m-1,n)+getNoOfPaths(m,n-1);
            solMatrix[m][n] = getNoOfPaths( m-1, n)+getNoOfPaths( m,n-1);
            return  solMatrix[m][n];
        }


    }
}

