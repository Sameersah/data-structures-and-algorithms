package com.sameer.Threads;

public class CustomThread implements Runnable {
    Thread t;
    Printer printer;
    int startValue;
    int num;

    public CustomThread(int num, int startValue, Printer printer) {
        this.num = num;
        this.startValue = startValue;
        this.printer = printer;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        printer.print(num, startValue);
    }
}
