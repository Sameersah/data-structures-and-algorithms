package com.sameer.dataStructures.bst;

import com.sameer.dataStructures.bst.core.Node;
import com.sameer.dataStructures.bst.core.BinarySearchTree;

public class MinValueFinder {

  public static void main (String args[] ) {
    BinarySearchTree  tree = new BinarySearchTree();
    tree.root = new Node(10);
    tree.root.left = new Node(7);
    tree.root.right = new Node(14);
    tree.root.left.left = new Node(6);
    tree.root.left.right = new Node(8);
    tree.root.right.left = new Node(12);
    tree.root.right.right = new Node(15);
    System.out.println(tree);

    Node node = minValue(tree.root);

    System.out.println("min value: "+node.data);
  }

  public static Node minValue (Node root) {
    if(root == null || root.left == null) {
      return root;
    } else {
      return minValue(root.left);
    }

  }
}
