package com.sameer.Threads;

public class Printer {


    volatile int monitor;

    synchronized void print(int n, int startValue) {

        while (n < 100) {

            while (monitor != startValue) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Interrupted exception caught");
                }
            }

            monitor = (monitor + 1) % 3;
            System.out.println("n: " + n);
            n = n + 3;
            notifyAll();
        }
    }

}
