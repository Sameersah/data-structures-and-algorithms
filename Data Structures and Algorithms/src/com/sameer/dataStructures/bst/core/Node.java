package com.sameer.dataStructures.bst.core;

public class Node {
  public int data;
  public Node left, right;

  public Node(int data) {
    this.setData(data);
    left = null;
    right = null;
  }

  public int getData() {
    return data;
  }

  protected void setData(int data) {
    this.data = data;
  }
}
