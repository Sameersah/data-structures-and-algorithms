package com.sameer.hackerrank;

/**
 * https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SockMerchant {

  // Complete the sockMerchant function below.
  static int sockMerchant(int n, int[] ar) {

    //JAVA 7
   /* Map<Integer,Integer> map = new HashMap<Integer, Integer>();
    for(int i: ar){
      if(map.containsKey(i)){
        int count = map.get(i)+1;
        map.put(i,count);
      }
      else {
        map.put(i,1);
      }
    }
    int pairs = 0;
    for( Map.Entry<Integer,Integer> entry: map.entrySet()) {
      pairs = pairs+ entry.getValue()/2;
    }

    return pairs;*/

   //JAVA8

    /*return Arrays.stream(ar).boxed()
      .collect(Collectors
        .toMap(x->x, x-> 1, (a, b)->a+b))
      .entrySet().stream()
      .map(x->x.getValue()/2)
      .reduce(0,(a,b)->a+b);*/



    return Math.toIntExact(Arrays.stream(ar).boxed()
      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
      .entrySet().stream().map(x -> x.getValue() / 2).reduce((long) 0, (a, b) -> a + b));









  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {

    int n= 10;
    int ar[] = {2,6,5,3,5,2,4,2,9,9};

    int result = sockMerchant(n, ar);

    System.out.println(result);
  }
}

