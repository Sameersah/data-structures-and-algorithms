package com.sameer.drivers;

import java.util.Scanner;

import com.sameer.algorithms.InFixToPostFix;
import com.sameer.algorithms.PostFixEvaluation;

public class InfixToPostFixDriver {

	public static void main(String args[]) {
		InFixToPostFix postFixConverter = new InFixToPostFix();
		PostFixEvaluation postFixEvaluator = new PostFixEvaluation();
		
		Scanner sc = new Scanner(System.in);
		String infix = sc.next();
		sc.close();
		
		
		String postfix = postFixConverter.convert(infix);
		
		System.out.println(postfix);
		
		String result = postFixEvaluator.evaluate(postfix);
		
		System.out.println("Result: "+result);
	}
}
