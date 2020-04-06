package com.sameer.companies;

public class DemoThread implements Runnable {

    Thread t;
     LibraryManager manager;
     Book book;
    DemoThread(LibraryManager manager, Book book){
        this.manager = manager;
        this.book = book;
        t = new Thread(this);
        t.start();

    }
    @Override
    public void run(){
        System.out.println("run");

        manager.addBook(book);
     //   LibraryManager.addBook(book);
       // System.out.println(manager.getBookList().size());
    }
}
