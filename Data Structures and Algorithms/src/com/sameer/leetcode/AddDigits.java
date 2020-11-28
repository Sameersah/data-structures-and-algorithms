package com.sameer.leetcode;

/**
 * https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/547/week-4-july-22nd-july-28th/3402/
 */
public class AddDigits {
  public static void main (String args[]) {
    int n = 38;
    int result = addDigits(n);
    System.out.println("result: "+result);
  }

  private static int addDigits(int n) {
    System.out.println(n);
    if (n < 9) {
      return n;
    }
    do {
    System.out.println("n: "+n);
    int sum = 0;
      while (n > 0) {
        int rem = n % 10;
        sum = sum + rem;
        n = n / 10;
      }
      n = sum;
    //System.out.println("string value of"+String.valueOf(n));
      } while (String.valueOf(n).length() > 1);

    return n;
  }
}
