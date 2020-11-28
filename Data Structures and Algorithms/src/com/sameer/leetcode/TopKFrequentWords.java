package com.sameer.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TopKFrequentWords {

  public static void main( String args[]) {
     int k = 3;
     String words[] = new String[5];
     words[0] = "this";
     words[1] = "is";
     words[2] = "an";
     words[3] = "orange";
     words[4] = "orange";

    topKFrequent(words,k);



  }


  public static List<String> topKFrequent(String[] words, int k) {

    Map<String,Integer> map = new HashMap<>();
    Set set = map.keySet();
    List<String> list = new ArrayList<>(set);
    System.out.println(list);

 return null;
  }






}
