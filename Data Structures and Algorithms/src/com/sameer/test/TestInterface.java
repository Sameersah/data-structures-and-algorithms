package com.sameer.test;

  public interface TestInterface {
     public static final int amount = 5;
     public void method1();
     default void method2(){
         System.out.println("testInterface default method");
     }

     default  void method3(){
         System.out.println("testInterface another default method.");
     }
}
