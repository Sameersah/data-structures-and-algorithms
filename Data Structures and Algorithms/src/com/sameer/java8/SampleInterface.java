package com.sameer.java8;

public interface SampleInterface {

    public void method1();

    default void method2(){
        System.out.println("method2,SampleInterface");
    }
}
