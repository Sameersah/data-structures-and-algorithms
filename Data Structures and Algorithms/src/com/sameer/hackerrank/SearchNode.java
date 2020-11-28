package com.sameer.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class SearchNode {

  public static  void main (String args[]){

    List<Integer> list = null;

    int recursiveStackNumber = 1;

    list = recursiveCall (list,recursiveStackNumber);
    System.out.println(list);

  }

  private static  List<Integer> recursiveCall(List<Integer> list, int recursiveStackNumber) {
    if(recursiveStackNumber == 0){
      list = new ArrayList<>();
      list.add(10);
      list.add(20);
      System.out.println(list.hashCode());
      return  list;
    }

    List<Integer> listFromBottomCall = recursiveCall(list,recursiveStackNumber-1);
    System.out.println("hashcode "+list.hashCode());
    System.out.println("parameter list size: "+list);
    System.out.println("listFromBottomCall:  "+listFromBottomCall.size());
    return listFromBottomCall;
  }
}
