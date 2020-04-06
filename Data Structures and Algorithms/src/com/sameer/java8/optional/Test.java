package com.sameer.java8.optional;

import java.util.Optional;

public class Test {

  /*testing optional usage

   */
  public static void main (String args[]) {

    //JAVA 7

    User user = new User();

    String name = user.getUserName();
    Address address = user.getAddress();

    System.out.println("name: "+name);
  //  System.out.println(" "+address.getCity());

    //JAVA 8

    User user2 = new User();
 //   User user3 = null;
//    Optional<User> userOpt2 = Optional.ofNullable(user3);
   // Optional<User> userOpt3 =  Optional.ofNullable(user3).orElseGet(()-> new User());

 //   userOpt2.ifPresent((u)-> System.out.println("name: "+u.getUserName()));

    Optional.ofNullable(user2).ifPresent(u-> Optional.ofNullable(u.getAddress()).ifPresent((add)-> System.out.println("city: "+add.getCity())));

    try {
      Optional.of(user2).orElseThrow(()-> new Exception());
    } catch (Exception e) {
      System.out.println("obj is null");
    }
  }
}
