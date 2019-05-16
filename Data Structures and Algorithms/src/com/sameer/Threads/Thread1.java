package com.sameer.Threads;

public class Thread1 implements  Runnable {

    Thread t;
    Printer printer;
    String threadName;
    Integer num;
     public Thread1(String threadName,int num){
        this.threadName = threadName;
         t = new Thread(this,threadName);
         printer = new Printer(num);
         this.num = num;
         t.start();
     }
    @Override
    public void run(){
         for(int i=0;i<10;i++)
        printer.print(threadName,num);
    }
}
