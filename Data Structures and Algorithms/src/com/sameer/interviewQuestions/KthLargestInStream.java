package com.sameer.interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthLargestInStream {

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
        List temp = new ArrayList();
        List output = new ArrayList();

        for(int i=0;i<list.size();i++){
            temp.add(list.get(i));
            if(temp.size()<k){
                output.add(-1);
            }
            else {
                Collections.sort(temp);
           //     System.out.println(temp);
                output.add(temp.get(temp.size() -1- (k-1)));
            }
        }
        return  output;
    }
}
