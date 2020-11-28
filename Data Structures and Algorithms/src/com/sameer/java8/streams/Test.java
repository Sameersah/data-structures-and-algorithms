package com.sameer.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


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


    System.out.println("---");

    /**
    * convert int[] into list using streams
    * */

    int arr[] = new int[6];
    arr[0] = 1;
    arr[1] = 10;
    arr[2] = 15;
    arr[3] = 15;
    arr[4] = 1;
    arr[5] = 1;



    IntStream intStream = Arrays.stream(arr);
    Stream<Integer> stream = intStream.boxed();

    Map<Integer,Integer> map = stream.collect(Collectors.toMap(x -> x,x->1, (x1,x2)->x1+1));

   int pairs =  map.values().stream().filter(x->x>1).map(x->((x*(x-1))/2)).reduce(Integer::sum).orElse(0);

    System.out.println(pairs);

    /**
     * Int stream operations
     */
    System.out.println("----");
    int extraCandies = 3;
    int candies[] = new int[5];
    candies[0] = 2;
    candies[1] = 3;
    candies[2] = 5;
    candies[3] = 1;
    candies[4] = 3;

    int greatest = Arrays.stream(candies).max().getAsInt();
    List<Boolean> output = Arrays.stream(candies).mapToObj(x -> {
      if(x+extraCandies >= greatest) {
        return true;
      } else {
        return false;
      }
    }).collect(Collectors.toList());

    System.out.println(output);




  }
}
