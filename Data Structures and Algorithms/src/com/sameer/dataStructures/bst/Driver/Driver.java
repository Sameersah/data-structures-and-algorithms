package com.sameer.dataStructures.bst.Driver;

import com.sameer.dataStructures.bst.core.BinarySearchTree;

public class Driver {
  public static void main (String args[]){
    System.out.println("Binary Search Tree Examples");

    //1. Create and print a binary search tree
    BinarySearchTree tree = new BinarySearchTree();
    tree.add(10);
    tree.add(20);
    tree.add(5);
    tree.add(40);
    tree.add(15);

    System.out.println(tree);



  }
}
