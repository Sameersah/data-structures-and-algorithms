package com.sameer.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class PassByReferenceTest {

  public static void main (String args[]) {

    List<Integer> list = new ArrayList<>();
    list.add(50);

int i= 10;

   System.out.println(method1(list));
  }

  private static List<Integer> method1(List<Integer> list){

    method2(list);
    return list;
  }

  private  static  List<Integer> method2 (List<Integer> list) {
    /*list = new ArrayList<>();
    list.add(10);
    list.add(20);*/

    list.add(60);

    return list;
  }
}
