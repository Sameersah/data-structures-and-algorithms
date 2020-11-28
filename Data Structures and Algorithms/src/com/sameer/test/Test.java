package com.sameer.test;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Test {

	static int count = 0;
	int count2 = 5;

	public Test(){
	count = 5;
	}

	public void setDefault(){
		count = 1;
	}

	public void setDefault2(){
		count = 2;
	}


	public static void main(String args[]) {

   // new Test();
	/*	System.out.println(Test.count);
		new Test().setDefault();
		System.out.println(Test.count);
		new Test().setDefault2();
		System.out.println(Test.count);*/

		Set<Integer> integerSet = new HashSet<>();
		integerSet.add(3);
		integerSet.add(5);

		int a =9;
		int b = 5;
		System.out.println(integerSet.contains(b));


		String str = "right";

		switch(str) {
			case "right" :
			{
				System.out.println("right");
				break;
			}
			case  "left":
			{
				System.out.println("left");
        break;
			}
			 default: {
				 System.out.println("default");
			 }
		}
	}
}

	
	

