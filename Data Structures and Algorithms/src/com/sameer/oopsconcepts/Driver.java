package com.sameer.oopsconcepts;

public class Driver {
    public static void main(String args[]){
        ChildClass obj = new ChildClass();
        obj.b = 10;
        System.out.println("obj.b: "+obj.b);

        try {
            ChildClass obj2 = obj.makeClone();
            ChildClass obj3 = obj2.makeClone();
            System.out.println("obj2.b: "+obj2.b);
            System.out.println("obj3.b: "+obj3.b);

        }catch (CloneNotSupportedException e){
            System.out.println("CloneNotSupportedException");
        }




    }
}
