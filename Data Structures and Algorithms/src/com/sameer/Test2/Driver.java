package com.sameer.Test2;


import com.sameer.test.TestInterface;
import com.sameer.test.TestInterfaceImpl;

public class Driver {
    public static void  main(String args[]){
        TestInterface obj = new TestInterfaceImpl();
        obj.method2();
        int a  = TestInterface.amount;
        obj.method3();
    }
}
