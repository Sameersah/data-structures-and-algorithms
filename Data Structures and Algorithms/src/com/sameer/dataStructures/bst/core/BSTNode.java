package com.sameer.dataStructures.bst.core;

public class BSTNode {
   int data;
  BSTNode left, right;

  public BSTNode(int data) {
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
