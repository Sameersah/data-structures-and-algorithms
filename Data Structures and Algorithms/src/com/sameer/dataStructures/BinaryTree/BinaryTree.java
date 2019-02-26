package com.sameer.dataStructures.BinaryTree;


/*
 * Insertion in a Binary Tree in level order 
 * Given a binary tree and a key, insert the key into the binary tree 
 * at first position available in level order.
 * */
public class BinaryTree {

	private class Node {
		int data;
		Node left,right;
		
		public Node(int data) {
		 this.data = data;
		 left = null;
		 right = null;
		}
		
	}
	
	private Node root;
	
	public BinaryTree() {
		root = null;
	}
	
	public static void main(String args[]) {
		
		int arr[] = {1,12,3,4,17,8,9,10,14,16,7};
		BinaryTree tree = new BinaryTree();
		
		
		for(int i=0;i<arr.length;i++) {
			if(tree.root==null) {
				
			}
		}
		
	}
	
	
}


