package com.sameer.companies;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student implements  Comparable<Student> {
    String name;
    int rollNo;
    int age;
    List<Book> bookList;

    public Student(){}

    public  Student(int rollNo, String name, int age){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        bookList = new ArrayList<>();
    }

    public int compareTo(Student student){
        return this.rollNo - student.rollNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student employee = (Student) o;
        return rollNo == employee.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public String toString(){
        return "name: "+name+ " BookList: "+ bookList;
    }
}
