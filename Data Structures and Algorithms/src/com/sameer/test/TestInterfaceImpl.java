package com.sameer.test;

 public class TestInterfaceImpl implements TestInterface, DriverInterface {

     @Override
     public void method2() {
         System.out.println("TestInterfaceImpl default method");
         TestInterface.super.method2();
     }

     public void method1(){
        System.out.println("method1");
    }
}
