package com.sameer.oopsconcepts;

import java.io.IOException;

public class ParentClass extends Object {
public ParentClass(){
    System.out.println("ParentClass constructor called.");
}


    {
        System.out.println("parent class initialisation block.");
    }



    //covariant example
    public ParentClass parentMethod1(){ return null; }

    //exception example
    public ParentClass parentMethod2() throws Exception {return null;}

    public ParentClass parentMethod3(int a,String b){return null;}
}
