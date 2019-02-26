package com.sameer.epi;

import java.util.Scanner;

public class BitWiseOperators {
	
	public static void main (String args[]) {
	//	Scanner sc = new Scanner(System.in);
	//	int a = sc.nextInt();
		//System.out.println(a);
		
		int c = 6;
		int d = 1;
		System.out.println(" C:"+c);
		//OR operator
		int b = c | d;
		System.out.println("OR operation: -"+b);
		//sc.close();
		
		// AND operator
		b = c & d;
		System.out.println("AND operation:"+b);
		
		//left shift (multiply)
		b = c<<1;
		System.out.println(b);
		
		//right shift (divide)
		b = c>>1;
		System.out.println(b);
		
		
		//bitwise compliment
		
		b = ~c;
		System.out.println("bitwise complement: "+b);
		
		//getting -c 
		System.out.println("getting -c");
		b = ~c+1;
		System.out.println(b);
		
		//right shift operator
		c= -5;
		System.out.println("c: "+c);
		System.out.println("before shifting:"+Integer.toBinaryString(c));
		b= c>>1;
		System.out.println("right shift operator:"+b);
		System.out.println(Integer.toBinaryString(b));
		
		//signed right shift
		b = c>>>1;
		System.out.println(""+b);
		System.out.println(Integer.toBinaryString(b));
	}

}
