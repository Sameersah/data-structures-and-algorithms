package com.sameer.dataStructures.BinarySearchTree;

public class BinarySearchTree {

	/**
	 * Node class
	 */
	public class Node {
		private int data;
		Node left, right;

		public Node(int data) {
			this.setData(data);
			left = null;
			right = null;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}
	}


	/**
	 * head
	 */
	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}


	public BinarySearchTree() {
		head = null;
	}


	/**
	 * add node recursivly to binarySearch tree
	 * @param head
	 * @param data
	 * @return
	 */
	public Node addRecursively(Node head, int data) {
		if (head == null) {
			Node node = new Node(data);
			head = node;
		}

		else if (data == head.getData()) {
			return head;
		}

		else if (data < head.getData()) {
			if (head.left == null) {
				Node node = new Node(data);
				head.left = node;
			} else {
				head.left = addRecursively(head.left, data);
			}
		}

		else if (data > head.getData()) {
			if (head.right == null) {
				Node node = new Node(data);
				head.right = node;
			} else {
				head.right = addRecursively(head.right, data);
			}
		}

		return head;
	}


	/**
	 * In order traversal
	 * @param head
	 */
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


	/**
	 * search for a node
	 * @param head
	 * @param data
	 * @return
	 */
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

	/**
	 * get Min
	 * @param head
	 * @return
	 */
	public Node getMin(Node head) {
		if (head == null) {
			return head;
		}
		if (head.left != null) {
			return getMin(head.left);
		}
		return head;
	}

	/**
	 * Get max
	 * @param head
	 * @return
	 */
	public Node getMax(Node head) {
		if (head == null) {
			return head;
		} else if (head.right != null) {
			return getMax(head.right);
		} else {
			return head;
		}
	}

	/**
	 * Get Max
	 * @param head
	 * @return
	 */
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

	/**
	 * delete node
	 * @param head
	 * @param data
	 * @return
	 */
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


	/**
	 * getShortestDistance b/w
	 * @param head
	 * @param data1
	 * @param data2
	 * @return
	 */
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
	}

}
