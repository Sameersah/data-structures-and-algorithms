package com.sameer.interviewQuestions;

public class CountSetBits2 {

    public  static  void  main (String args[]){
        int num = 7;
        System.out.println("setBits: "+getSetBits(num));
    }

    private static int getSetBits(int num){
        int count =0;
      while(num>0){
          count = count+ (num &1);
          num = num>>1;

      }
      return count;
    }
}
