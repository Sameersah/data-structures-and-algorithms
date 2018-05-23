package com.sameer.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostFixEvaluation {
	
	List<String> operatorList;
	
	public PostFixEvaluation() {
		operatorList = new ArrayList<String>();
		operatorList.add("+");
		operatorList.add("-");
		operatorList.add("*");
		operatorList.add("/");
		
		
	}
	
	public String evaluate (String postFix) {
		String output ="";
		Stack<String> stack = new Stack<>();
		
		for(int i=0;i<postFix.length();i++) {
			String literal = String.valueOf(postFix.charAt(i));
			if(!operatorList.contains(literal)) {
				stack.push(literal);
			}
			else if(literal.equalsIgnoreCase("-")) {
				String operand1 = stack.pop();
				String operand2 = stack.pop();
				int result = Integer.valueOf(operand2)-Integer.valueOf(operand1);
				stack.push(String.valueOf(result));
			}
			else if(literal.equalsIgnoreCase("+")) {
				String operand1 = stack.pop();
				String operand2 = stack.pop();
				int result = Integer.valueOf(operand2)+Integer.valueOf(operand1);
				stack.push(String.valueOf(result));
			}
			else if(literal.equalsIgnoreCase("*")) {
				String operand1 = stack.pop();
				String operand2 = stack.pop();
				int result = Integer.valueOf(operand2)*Integer.valueOf(operand1);
				stack.push(String.valueOf(result));
			}
			else if(literal.equalsIgnoreCase("/")) {
				String operand1 = stack.pop();
				String operand2 = stack.pop();
				int result = Integer.valueOf(operand2)/Integer.valueOf(operand1);
				stack.push(String.valueOf(result));
			}
			
			
		}
		
		output = stack.pop();
		if(!stack.isEmpty()) {
		 System.out.println("Error while evaluation.");
		}
		
		
		return output;
	}
	
	

}
