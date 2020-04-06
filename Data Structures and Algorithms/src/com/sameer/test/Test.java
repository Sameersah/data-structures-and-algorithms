package com.sameer.test;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
		System.out.println(Test.count);
		new Test().setDefault();
		System.out.println(Test.count);
		new Test().setDefault2();
		System.out.println(Test.count);

	}
}

	
	

