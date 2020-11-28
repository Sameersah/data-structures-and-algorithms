package com.sameer.dataStructures.bst.Driver;

import com.sameer.dataStructures.bst.core.BinarySearchTree;

import java.util.Optional;

public class Driver {
  public static void main (String args[]){
    System.out.println("Binary Search Tree Examples");

    //1. Create and print a binary search bst
    BinarySearchTree bst = new BinarySearchTree();
    bst.add(10);
    bst.add(20);
    bst.add(5);
    bst.add(40);
    bst.add(15);

    System.out.println(bst);
    //2. Search for a node

    Optional.ofNullable(bst.search(41)).ifPresent(bstNode -> System.out.println("found!: "+bstNode.getData()));


    System.out.println("sameer".equalsIgnoreCase(null));

  }
}
