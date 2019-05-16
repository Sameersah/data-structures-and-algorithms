package com.sameer.interviewQuestions;

import java.util.*;

public class KthLargestInStream1 {
    public static void main (String args[]){
        int k = 4;
        List list = new ArrayList();
        list.add(5);
        list.add(4);
        list.add(1);
        list.add(8);
        list.add(10);
        list.add(12);
        System.out.println(getKthLargestElementList(k,list));

        List list2 = new ArrayList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        System.out.println(getKthLargestElementList(k,list2));

    }

    private static  List getKthLargestElementList(int k, List list){

        List output = new ArrayList();
        Object arr[];
        Set set = new TreeSet();
        for(int i=0;i<list.size();i++){
            set.add(list.get(i));
          //  System.out.println(set);
            if(set.size()<k){
                output.add(-1);
            }
            else{
                arr = set.toArray();
                System.out.println(Arrays.toString(arr));
              //  System.out.println(arr.length);
                output.add(arr[arr.length-1-(k-1)]);
            }
        }
        return  output;
    }
}
