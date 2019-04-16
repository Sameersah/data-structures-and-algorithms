package com.sameer.interviewQuestions;

import com.sameer.dataStructures.BinaryTree.BinaryTree;
import com.sameer.dataStructures.BinaryTree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelOrderBinaryTree {


    public  static void main (String args[]){
        BinaryTree tree = new BinaryTree();
        Node root = new Node(10);
        Node left = new Node(20);
        Node right = new Node(30);
        root.setLeft(left);
        root.setRight(right);

        Node leftleft = new Node(40);
        Node rightLeft = new Node(50);

        left.setLeft(leftleft);
        left.setRight(rightLeft);

        Node rightRight = new Node(20);
           right.setRight(rightRight);
        tree.setRoot(root);

        printLevelOrderTraversal(tree.getRoot());
    }

    private static void  printLevelOrderTraversal(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        levelOrderTraversal(queue);
    }

    private static  void levelOrderTraversal(Queue<Node> queue){
        if(queue.isEmpty()){
            return;
        }
        Node node = queue.remove();
        System.out.println(node.getData());
        if(node.getLeft() != null){
            queue.add(node.getLeft());
        }
        if(node.getRight() !=null){
            queue.add(node.getRight());
        }

        levelOrderTraversal(queue);
    }
}
