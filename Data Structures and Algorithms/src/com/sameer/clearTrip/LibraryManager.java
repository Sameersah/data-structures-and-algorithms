package com.sameer.clearTrip;





import java.util.*;
import java.util.logging.Logger;


public class LibraryManager {
   //better use set instead of List
   private  List<Student> studentList;
    private List<Book> bookList;
    private Set<Book> bookSet;

    private static final Logger LOG = Logger.getLogger(LibraryManager.class.getName());

    public LibraryManager(){
        studentList = new LinkedList<>();
        bookList = new LinkedList<>();
        bookSet = new TreeSet<Book>();
    }

    public boolean registerStudent(Student student){
       if(studentList.contains(student)){
           return  false;
       }else{
           studentList.add(student);
           LOG.info("info");
           LOG.warning("warning");
           return  true;
       }


    }

    public  synchronized  boolean addBook (Book book){
        System.out.println("add called");
        if(bookList.contains(book)){

            System.out.println("already available");
            return false;
        }else{
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){}
            bookList.add(book);
            System.out.println("added");
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

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Book> getBookList() {
        return bookList;
    }
}
