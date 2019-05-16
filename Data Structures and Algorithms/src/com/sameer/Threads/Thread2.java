package com.sameer.Threads;

public class Thread2 implements  Runnable {

    Thread t;
    Printer printer;
    String threadName;
    Integer num;
    public Thread2(String name,int num){
        threadName= name;
        t = new Thread(this, name);
        printer = new Printer(num);
        this.num = num;
        t.start();
    }

public void run(){
    for(int i=0;i<10;i++)
       printer.print(threadName,num);
}
}
