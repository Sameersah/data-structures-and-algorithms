package com.sameer.drivers;

import com.sameer.dataStructures.Heap.MinHeap;

public class MinHeapDriver {

	public static void main (String args[]) {
		MinHeap heap = new MinHeap();
		heap.add(10);
		heap.add(5);
		heap.add(15);
		heap.add(30);
		heap.add(20);
		heap.add(35);
		
		System.out.println(heap.getMin());
	}
}
