package com.sameer.backtracking;

import java.util.Arrays;

public class Permutation {

    private static char arr[];

    public static void main(String args[]) {
        String s = "ABC";
        arr = new char[s.length()];
        printPermutations(s.length(), s);
    }

    private static void printPermutations(int n, String s) {
        if (n == 0) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int i = s.length()-1; i >0 ; i--) {
                arr[n - 1] = s.charAt(i);
                String temp = s.substring(0, i) + s.substring(i + 1);
                printPermutations(n - 1, temp);
            }

        }
    }
}
