package com.sameer.epi;

import java.util.Scanner;

/*
 * Write a program that takes a 64-bit word and returns the 64-bit word consisting of
the bits of the input word in reverse order. For example, if the input is alternating Is
and Os, i.e., (1010...10), the output should be alternating Os and Is, i.e., (0101...01).
 * */

public class ReverseBits {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s2 = "";
		for(int i= s.length()-1;i>=0;i--) {
			s2 = s2+s.charAt(i);
			System.out.print(s.charAt(i));
			
		}
		
		sc.close();
	}//Time complexity - O(n)
}


