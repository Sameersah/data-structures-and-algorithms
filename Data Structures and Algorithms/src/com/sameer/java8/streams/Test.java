package com.sameer.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Test {

  public static void main (String args[]){

    List<Integer> list = new ArrayList<>();
    list.add(91);
    list.add(45);
    list.add(38);
    list.add(2);
    list.add(72);
    list.add(28);
    list.add(50);
    list.add(53);

    /**
     * Find the first number which is divisible by 5 and is even number from the given list
     */

    list.stream()
      .filter(x-> x%2==0)
      .filter(x->x%5==0)
      .findFirst()
      .ifPresent(x-> System.out.println(x));

    /**
     * find the list of sub set whose square is divisible by first single digit element in the list
     */

    Optional<Integer> firstSingleDigit = list.stream().filter(x -> x>0 && x<10).findFirst();
    firstSingleDigit.ifPresent(y-> {
      System.out.println("first single digit: "+y);
     List<Integer> newList =  list.stream().filter(x->(x*x)%y==0).collect(Collectors.toList());

     newList.stream().forEach(x-> System.out.println(x));
    });




  }
}
