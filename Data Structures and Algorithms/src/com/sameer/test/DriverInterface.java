package com.sameer.test;

public interface DriverInterface {
    public void method1();
    default  void method2(){
        System.out.println("driverInterface default method");

    }
}
