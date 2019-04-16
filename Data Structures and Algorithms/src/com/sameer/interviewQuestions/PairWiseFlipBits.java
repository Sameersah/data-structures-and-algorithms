package com.sameer.interviewQuestions;

public class PairWiseFlipBits {

    public static void main (String args[]){
        int input = 20;
        System.out.println(getPairwiseFlipBits(input));
    }

    private static int getPairwiseFlipBits(int input){
        int output=0;
        String binaryString = Integer.toBinaryString(input);
        if(binaryString.length()%2 !=0){
            binaryString = '0'+binaryString;
        }
        char arr[] = binaryString.toCharArray();
        for(int i=0;i<arr.length-1;i= i+2){
            char temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        for(int i= arr.length-1;i>=0;i--){
            double power = arr.length-i-1;
            output = output + Integer.valueOf(String.valueOf(arr[i]))*(int)Math.pow(2,power);
        }
        return output;
    }
}
