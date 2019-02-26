package com.sameer.dataStructures.Heap;

import java.util.ArrayList;
import java.util.List;

import com.sameer.algorithms.Node.HuffmanNode;

public class HuffmanMinHeap {

	private List<HuffmanNode> list;
	
	public HuffmanMinHeap() {
		list = new ArrayList<HuffmanNode>();
	}
	
	public void add(HuffmanNode node) {
		list.add(node);
		heapifyUp(list.size()-1);
	}
	
	public HuffmanNode getMin() {
		if(list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}
	
	public int getNodeCount() {
		return list.size()-1;
	}
	
	public HuffmanNode deleteMin() {
		if(list.isEmpty()) {
			return null;
		}
		HuffmanNode minNode = list.get(0);
		HuffmanNode maxNode = list.get(list.size()-1);
		list.remove(list.size()-1);
		list.set(0, maxNode);
		heapifyDown(0);
		return minNode;
	}
	
	private void heapifyDown(int index) {
		int leftChildIndex = 2*index+1;
		int rightChildIndex = 2*index+2;
		int maxIndex = index;
		if(list.get(index).getFrequency() <list.get(leftChildIndex).getFrequency()) {
			maxIndex = leftChildIndex;
		}
		if(list.get(maxIndex).getFrequency()<list.get(rightChildIndex).getFrequency()) {
			maxIndex = rightChildIndex;
		}
		if(maxIndex != index) {
			swap(index, maxIndex);
			heapifyDown(maxIndex);
		}
	}
	private void heapifyUp(int index) {
		if(index <1) {
			return;
		}
		
		int parentIndex = (index-1)/2;
		if(list.get(index).getFrequency()< list.get(parentIndex).getFrequency()) {
			swap(index,parentIndex);
		}
	}
	
	private void swap(int index, int parentIndex) {
		HuffmanNode temp = list.get(index);
		list.set(index, list.get(parentIndex));
		list.set(parentIndex, temp);
	}
}
