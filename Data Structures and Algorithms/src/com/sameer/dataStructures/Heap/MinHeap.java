package com.sameer.dataStructures.Heap;

import java.util.ArrayList;
import java.util.List;

public class MinHeap {

	private List<Integer> list;
	
	public MinHeap() {
		list = new ArrayList<Integer>();
	}
	
	public void add(int data) {
	list.add(data);
	heapifyUp(list.size()-1);
	}
	
	public int getMin() {
		if(!list.isEmpty())
		return list.get(0);
		else {
			return 0;
		}
	}
	
	private void heapifyUp(int index) {
		if(index <1) {
			return;
		}
		int parentIndex = (index-1)/2;
		if(list.get(parentIndex)>list.get(index)) {
		swap(index, parentIndex);
		heapifyUp(parentIndex);
		}
	}
	
	private void swap(int index, int parentIndex) {
		int temp = list.get(parentIndex);
		list.set(parentIndex, list.get(index));
		list.set(index, temp);
	}
}
