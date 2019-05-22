package com.sameer.oopsconcepts;

public class ParentClass extends Object {
public ParentClass(){
    System.out.println("ParentClass constructor called.");
}
    protected  Object getValue(){
        return 0;
    }

    {
        System.out.println("parent class initialisation block.");
    }
}
