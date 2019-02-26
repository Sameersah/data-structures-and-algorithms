package com.sameer.drivers;

import com.sameer.dataStructures.BinarySearchTree.BinarySearchTree;
import com.sameer.dataStructures.BinarySearchTree.BinarySearchTree.Node;

public class BinarySearchTreeDriver {

	public static void main(String args[]) {
		
		BinarySearchTree bst = new BinarySearchTree();
		
		int arr[] = {2,5,7,8,1,9,3,0};
		
		// adding nodes in the BST
		for(int i=0;i<arr.length;i++) {
			bst.setHead(bst.addRecursively(bst.getHead(), arr[i]));
		}
		
		//Traversal
		bst.inorderTraversal(bst.getHead());
		System.out.println();
		
		// searching
		int data = 9;
		System.out.println("Searching for "+data);
		Node node = bst.search(bst.getHead(), data);
		if(node != null) {
			System.out.println("found ");
		}
		else {
		 System.out.println("Not found!!");	
		}
		
		// search min
		Node minNode = bst.getMin(bst.getHead());
		if(minNode != null) {
			System.out.println("Min node value is "+minNode.getData());
		}
		
		//search max
		Node maxNode = bst.getMax(bst.getHead());
		if(maxNode != null) {
			System.out.println("Max node value is "+ maxNode.getData());
		}
		
		// search max using iteration
		Node maxNodeUsingIteration = bst.getMaxIteratively(bst.getHead());
		if(maxNodeUsingIteration != null) {
			System.out.println("max node using iteration is "+maxNodeUsingIteration.getData());
		}
		
		
		//delete
		bst.delete(bst.getHead(), 8);
		
		//Traversal
		System.out.println("After removal-");
				bst.inorderTraversal(bst.getHead());
				System.out.println();
		
		// ShortestDistance between two nodes
			int dis = bst.getShortestDistanceBetweenNodes(bst.getHead(), 9, 0);
		System.out.println("Distance between 9 and 0 is: "+dis);
		
		// getLowest common Parent
		Node node1 = bst.getLowestCommonParent(bst.getHead(), 9, 3);
		System.out.println("LCA node: "+node1.getData());
		
	}
}
