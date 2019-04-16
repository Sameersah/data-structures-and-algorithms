package com.sameer.interviewQuestions;

public class CountSetBits {

    public static void main (String args[]){

        int num = 7;
        System.out.println(getSetBits(num));
    }

    private static int getSetBits(int num){
        int count =0;
        int rem;
        while(num>0){
            rem = num%2;
            num = num/2;
            if(rem==1){
                count++;
            }
        }
        return count;
    }
}
