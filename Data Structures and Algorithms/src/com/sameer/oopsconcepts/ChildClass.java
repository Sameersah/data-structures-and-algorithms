package com.sameer.oopsconcepts;

public class ChildClass extends ParentClass implements Cloneable {

    int a;
    public int b = 5;
    public String getValue(){
        System.out.println("value of a is "+a);
        System.out.println("value of b is "+b);
        return "value";
    }

    public ChildClass(){
        System.out.println("child class constructor.");
    }

    {
        System.out.println("child class initialisation block.");
    }


    public ChildClass makeClone() throws CloneNotSupportedException{
        ChildClass obj =   (ChildClass) super.clone();
        return  obj;
    }
}
