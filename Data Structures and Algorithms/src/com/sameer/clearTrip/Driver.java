package com.sameer.clearTrip;

import java.util.ArrayList;

public class Driver {

    public static void main(String args[]){
        LibraryManager manager = new LibraryManager();

        Student s1 = new Student();
        s1.rollNo =001;
        s1.age = 25;
        s1.name = "sameer";
        s1.bookList = new ArrayList<>();

        Student s2 = new Student(002,"deepak",25);

         // register student

        System.out.println("Student Registered: "+manager.registerStudent(s1));
        System.out.println("Student Registered: "+manager.registerStudent(s1));
        System.out.println("Student Registered: "+manager.registerStudent(s2));

        //add book

        Book book1 = new Book("The Alchemist", "AA01");
        Book book2 = new  Book("The subtle art","AA02");
        System.out.println("Book added: "+manager.addBook(book1));
        System.out.println("Book added: "+manager.addBook(book2));

        //lend book
         System.out.println("booke lent: "+manager.lendBook(s1,book1));
        System.out.println("book lent: "+manager.lendBook(s1,book2));

        // no. of books with S1
        System.out.println(s1);


    }
}

