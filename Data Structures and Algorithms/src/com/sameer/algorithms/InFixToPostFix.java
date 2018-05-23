package com.sameer.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;



public class InFixToPostFix {
	
	private Map<String,Integer> operatorMap;
	
	public InFixToPostFix() {
		operatorMap = new HashMap<String,Integer>();
		operatorMap.put("-", 1);
		operatorMap.put("+", 1);
		operatorMap.put("*", 2);
		operatorMap.put("/", 3);
		operatorMap.put("(", 4);
		operatorMap.put(")", 5);
		
	}
	public List<String> convert(String inFix) {
		
		List<String> postFix = new ArrayList<>();
		Stack<String> stack = new Stack<>();
		
		for(int i=0;i<inFix.length();i++) {
			String literal = String.valueOf(inFix.charAt(i));
			while(!(operatorMap.containsKey(String.valueOf(inFix.charAt(i)))) &&(i+1<inFix.length()) && !(operatorMap.containsKey(String.valueOf(inFix.charAt(i+1))))){
				literal = literal+String.valueOf(inFix.charAt(i+1));
				i++;
			}
			if(!operatorMap.containsKey(literal)) {
		
				postFix.add(literal);
			}
			else {
		
				if(stack.isEmpty()) {
					stack.push(literal);
					
					
				}
				else {
					String topLiteral = stack.peek();
					
					
					if(literal.equalsIgnoreCase(")")) {
						
						while(!topLiteral.equalsIgnoreCase(String.valueOf('('))) {
							if(stack.isEmpty()) {
							
								break;
							}
							postFix.add(stack.pop());
							if(stack.isEmpty()) {
								break;
							}
							topLiteral = stack.peek();	
						}
						if(!stack.isEmpty()) {
							stack.pop();
						}
						
					}
					else {
						
						while(operatorMap.get(topLiteral)>operatorMap.get(literal) && !topLiteral.equalsIgnoreCase("(")) {
						
							postFix.add(stack.pop());
							if(stack.isEmpty()) {
								break;
							}
							topLiteral = stack.peek();
						}
							stack.push(literal);
							
						
						
					}
					
					
				}
			}
			
		}
		
		while(!stack.isEmpty()) {
			postFix.add(stack.pop());
		}
		
		return postFix;
		
	}

}
