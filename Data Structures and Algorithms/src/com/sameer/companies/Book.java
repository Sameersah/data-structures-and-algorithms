package com.sameer.companies;

import java.util.Objects;

public class Book {
    String name;
    String serialId;
    boolean isBorrowed;
    Student borrowedByStudent;

  //  public Book(){}
    public Book(String name,String serialId){
        this.name = name;
        this.serialId = serialId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return serialId == book.serialId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialId);
    }

  @Override
    public String toString(){
        return  name;
  }
}
