package com.sameer.java8;

import java.util.function.Consumer;

public class PrintNextConsumer implements Consumer<Integer> {

    public void accept(Integer i){
        System.out.println(i+1);
    }
}
