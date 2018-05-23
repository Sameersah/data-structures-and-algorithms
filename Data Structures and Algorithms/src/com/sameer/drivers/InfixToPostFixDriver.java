package com.sameer.drivers;

import java.util.Scanner;

import com.sameer.algorithms.InFixToPostFix;

public class InfixToPostFixDriver {

	public static void main(String args[]) {
		InFixToPostFix postFixConverter = new InFixToPostFix();
		
		
		Scanner sc = new Scanner(System.in);
		String infix = sc.next();
		sc.close();
		
		
		String postfix = postFixConverter.convert(infix);
	
		System.out.println(postfix);
	}
}
