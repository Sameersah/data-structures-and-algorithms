package com.sameer.dataStructures.bst.core;

import java.util.ArrayList;
import java.util.List;

public class Traverser {

  public static List inorderTraversal(BinarySearchTree tree){
    return inorderTraversal(tree.getHead(), new ArrayList());
  }

  public static List inorderTraversal(BSTNode node, List list){
    if(node == null){
      return list;
    }
    if (node.left != null){
      list = inorderTraversal(node.left,list);
    }
     list.add(node.data);
    if( node.right != null){
     list =  inorderTraversal(node.right,list);
    }
    return list;
  }
}
