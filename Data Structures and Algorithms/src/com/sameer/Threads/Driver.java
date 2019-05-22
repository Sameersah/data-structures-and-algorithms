package com.sameer.Threads;

public class Driver {
    public static void main(String args[]) {
        Printer printer = new Printer();
        CustomThread thread1 = new CustomThread(1, 0, printer);
        CustomThread thread2 = new CustomThread(2, 1, printer);
        CustomThread thread3 = new CustomThread(3, 2, printer);
    }

}
