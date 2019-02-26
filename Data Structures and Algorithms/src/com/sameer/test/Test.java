package com.sameer.test;

public class Test {

	
	
	public static void main(String args[]) {
	//	String a = "val1,val2,val3,\"val41\",\"val42\"";
		String a = "val1\",l\"val2+val3";
		String split[] = a.split("(?=,)(?=l)");
		for(int i=0;i<split.length;i++) {
			System.out.println(split[i]);
			System.out.println("----");
		}
	}
	
	
}
