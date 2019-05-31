package com.sameer.oopsconcepts;

import java.io.IOException;

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
    public ChildClass(int a,String b){}
    public ChildClass(String a, int b){}
    {
        System.out.println("child class initialisation block.");
    }

    public ParentClass childMethod1(){
        return null;
    }

    public void childMethod1(int a){

    }

    protected  ChildClass method1(int a ,String b){
return  null;
    }

    //covariant example -
    public ChildClass parentMethod1(){ return null;}

    //exception example
    public ParentClass parentMethod2() throws IOException {return null;}

    //paramenter no example - for overiding, parament no, types and sequence should be same
    public ParentClass parentMethod3(int a, String b){return  null;}


    public ChildClass makeClone() throws CloneNotSupportedException{
        ChildClass obj =   (ChildClass) super.clone();
        return  obj;
    }

}
