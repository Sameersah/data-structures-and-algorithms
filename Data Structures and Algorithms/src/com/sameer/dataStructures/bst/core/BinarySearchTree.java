package com.sameer.dataStructures.bst.core;

public class BinarySearchTree {



	private BSTNode head;

	public BSTNode getHead() {
		return head;
	}

	public BinarySearchTree() {
		head = null;
	}


	/**
	 * add node in binarySearch tree
	 * @param data
	 * @return
	 */
	public boolean add (int data){
		if(head == null){
			head = new BSTNode(data);
		} else if (data ==head.data){
			return false;
		} else if (data < head.data){
			head.left = add(head.left,data);
		} else {
			head.right = add(head.right,data);
		}
		return true;
	}

	/**
	 * overloaded add method
	 * @param node
	 * @param data
	 * @return
	 */
	private BSTNode add(BSTNode node, int data){
		if(node == null){
			node = new BSTNode(data);
			return node;
		} else if (data ==node.data){
			return node;
		} else if(data < node.data){
			node.left =  add(node.left,data);
		}else {
			node.right = add(node.right,data);
		}
		return node;
	}

	@Override
	public String toString(){
		return Traverser.inorderTraversal(this).toString();
	}


	/**
	 * Search
	 */

	public BSTNode search (int data){
		BSTNode node = head;
		while(node != null){
			if (data == node.data) {
				return node;
			} else if (data < node.data) {
				node = node.left;
			} else {
				node = node.right;
			}
		}
		return null;
	}

	/**
	 * In order traversal
	 * @param head
	 *//*
	public void inorderTraversal(Node head) {

		if (head == null) {

			return;
		} else if (head.left != null) {

			inorderTraversal(head.left);
		}

		System.out.print(head.getData() + " ");

		if (head.right != null) {
			inorderTraversal(head.right);
		}
	}


	*//**
	 * search for a node
	 * @param head
	 * @param data
	 * @return
	 *//*
	public Node search(Node head, int data) {
		if (head == null) {
			return head;
		} else if (data < head.getData()) {
			return search(head.left, data);
		} else if (data > head.getData()) {
			return search(head.right, data);
		} else {
			return head;
		}
	}

	*//**
	 * get Min
	 * @param head
	 * @return
	 *//*
	public Node getMin(Node head) {
		if (head == null) {
			return head;
		}
		if (head.left != null) {
			return getMin(head.left);
		}
		return head;
	}

	*//**
	 * Get max
	 * @param head
	 * @return
	 *//*
	public Node getMax(Node head) {
		if (head == null) {
			return head;
		} else if (head.right != null) {
			return getMax(head.right);
		} else {
			return head;
		}
	}

	*//**
	 * Get Max
	 * @param head
	 * @return
	 *//*
	public Node getMaxIteratively(Node head) {
		if (head == null) {
			return head;
		} else {
			while (head.right != null) {
				head = head.right;
			}

			return head;
		}
	}

	*//**
	 * delete node
	 * @param head
	 * @param data
	 * @return
	 *//*
	public Node delete(Node head, int data) {
		if (head == null) {
			return head;
		} else if (data < head.data) {
			head.left = delete(head.left, data);
		} else if (data > head.data) {
			head.right = delete(head.right, data);
		} else {
			if (head.left == null && head.right != null) {
				head = head.right;
			} else if (head.left != null && head.right == null) {
				head = head.left;
			} else if (head.left == null && head.right == null) {
				return null;
			} else {
				Node temp = getMax(head.left);
				head.data = temp.data;
			}
		}

		return head;

	}


	*//**
	 * getShortestDistance b/w
	 * @param head
	 * @param data1
	 * @param data2
	 * @return
	 *//*
	public int getShortestDistanceBetweenNodes(Node head, int data1, int data2) {
		if (head == null) {
			return 0;
		}
		if (data1 < head.data && data2 < head.data) {
			return getShortestDistanceBetweenNodes(head.left, data1, data2);
		} else if (data1 > head.data && data2 > head.data) {
			return getShortestDistanceBetweenNodes(head.right, data1, data2);
		} else {
			int dis1 = getDistanceFromParentNode(head, data1);
			int dis2 = getDistanceFromParentNode(head, data2);
			return dis1 + dis2;
		}
	}


	private int getDistanceFromParentNode(Node head, int data) {
		if (head == null) {
			return 0;
		}
		if (data < head.data) {
			return 1 + getDistanceFromParentNode(head.left, data);
		} else if (data > head.data) {
			return 1 + getDistanceFromParentNode(head.right, data);
		} else {
			return 0;
		}
	}

	public Node getLowestCommonParent(Node head, int data1, int data2) {
		if(data1 < head.data && data2 <head.data ) {
			return getLowestCommonParent(head.left, data1, data2);
		}
		else if (data1 > head.data && data2 > head.data) {
			return getLowestCommonParent(head.right, data1, data2);
		}
		else { 
			return head;
		}
	}*/

}
