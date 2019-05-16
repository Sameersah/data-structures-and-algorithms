package com.sameer.interviewQuestions;

import java.util.*;
import java.lang.*;
import java.io.*;
public class FindMissingAndRepeating {


        public static void main (String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t>0){
                int n = sc.nextInt();
                Set<Integer> set = new HashSet<Integer>();
                int a;
                int missingNumber=-1;
                int repeatingNumber= -1;
                boolean isRepeatingNumberNotFound = true;
                for(int i= 0;i<n;i++){
                    a = sc.nextInt();
                    System.out.print(a+" ");
                    boolean addedSuccessfully = set.add(a);
                    if(isRepeatingNumberNotFound && !addedSuccessfully){
                        repeatingNumber = a;
                        isRepeatingNumberNotFound = false;
                    }
                }

                for(int i=1;i<=n;i++){
                    if(!set.contains(i)){
                        missingNumber = i;
                        break;
                    }
                }

                System.out.println(repeatingNumber+" "+missingNumber);
                t--;
            }
            sc.close();
        }

}
