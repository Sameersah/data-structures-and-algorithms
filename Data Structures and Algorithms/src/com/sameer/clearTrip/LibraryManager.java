package com.sameer.clearTrip;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LibraryManager {
   //better use set instead of List
   private  List<Student> studentList;
    private List<Book> bookList;

    public LibraryManager(){
        studentList = new LinkedList<>();
        bookList = new LinkedList<>();
    }

    public boolean registerStudent(Student student){
       if(studentList.contains(student)){
           return  false;
       }else{
           studentList.add(student);
           return  true;
       }


    }

    public boolean addBook(Book book){
        if(bookList.contains(book)){
            return false;
        }else{
            bookList.add(book);
            return  true;
        }
    }

    public boolean lendBook(Student student, Book book){
        if(!bookList.contains(book) || book.isBorrowed){
            return  false;
        }else{
            student.bookList.add(book);
            book.borrowedByStudent = student;
            book.isBorrowed = true;
            return  true;
        }
    }




}
