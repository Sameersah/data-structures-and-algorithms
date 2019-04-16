package com.sameer.interviewQuestions;

public class PairWiseFlipBits1 {
    public static  void  main (String args[]){
        int input = 4;
        System.out.println(getPairwiseFlipBits(input));
    }

    private static int getPairwiseFlipBits(int input){
        int output =0;
        String binaryString = Integer.toBinaryString(input);
        if(binaryString.length() %2 !=0){
            binaryString = "0"+binaryString;
        }
        char arr[] = binaryString.toCharArray();
        for(int i=0;i<arr.length;i= i+2){
            char temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        String flipedString  = String.valueOf(arr);
        output = Integer.parseInt(flipedString,2);
        return output;
    }
}
