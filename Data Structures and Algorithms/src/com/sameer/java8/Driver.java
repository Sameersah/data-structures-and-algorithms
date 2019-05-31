package com.sameer.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

//forEach in iterator Interface
public class Driver {
    public static  void main(String args[]){

        //forEach

    List<Integer> list = new ArrayList<>();
    for(int i=0;i<10;i++)
        list.add(i);

    list.forEach(new Consumer<Integer>(){
        public void accept(Integer i){
            System.out.println(i);
        }
    });

        System.out.println();

    PrintNextConsumer consumer = new PrintNextConsumer();
    list.forEach(consumer);

    }


}
