package com.sameer.interviewQuestions;

import java.util.Arrays;

public class BubbleSort {
    public static void main (String args[]){

        int size =6;
        int diffArr[] = new int[size];
        diffArr[0] = 7;
        diffArr[1] = 2;
        diffArr[2] = 9;
        diffArr[3] = 1;
        diffArr[4] = 6;
        diffArr[5] = 3;
        //sort difference by bubble sort
        for(int i=0;i<size;i++){
            for(int j=0;j<size-1-i;j++){
                //int maxIndex = j;
                if(diffArr[j]>diffArr[j+1]){
                    int temp = diffArr[j];
                    diffArr[j] = diffArr[j+1];
                    diffArr[j+1] = temp;
                }

            }
        }

        System.out.println(Arrays.toString(diffArr));
    }
}
