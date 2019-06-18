package com.sameer.test;

public class Driver {

    public  static void main(String args[]) {
        String s = "12343434";

        long num = s.codePoints().filter(i->i=='4').count();
        System.out.println(num);
    }


}
