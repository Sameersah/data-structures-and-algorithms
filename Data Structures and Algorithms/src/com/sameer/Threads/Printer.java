package com.sameer.Threads;

public class Printer {

    int num;
    int monitor;
 public Printer(int num){
    this.num = num;
    monitor = 0;
}
    synchronized void print(String name, int num) {
    if( monitor == num){
       
        try {
            wait();
        }catch(InterruptedException e){}
        monitor =1;
        System.out.println(name);
         notifyAll();
    }
    if(monitor !=1 && monitor ==num){
        try {
            wait();
        }catch(InterruptedException e){}

        monitor = 0;
        System.out.println(name);
        notifyAll();
    }

    }
}
