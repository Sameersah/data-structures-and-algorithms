package com.sameer.algorithms.GreedyAlgorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.sameer.algorithms.Node.HuffmanNode;
import com.sameer.dataStructures.Heap.HuffmanMinHeap;

public class HuffmanEncoding {

	public static void main (String args[]) {
		
		Map<Integer,Integer> inputMap = new HashMap<Integer,Integer>();
		
		inputMap.put(1, 10);
		inputMap.put(3, 11);
		inputMap.put(2, 6);
		inputMap.put(4, 7);
		
		System.out.println(inputMap);
		
		//output a map with keys and their binary encoding representation
		
		//creating a list of HuffmanNodes
		
		List<HuffmanNode> nodeList = new ArrayList<HuffmanNode>();
	    HuffmanNode node = new HuffmanNode();
		for(Entry<Integer,Integer> entry: inputMap.entrySet()) {
			node.setFrequency(entry.getValue());
			node.setDigit(entry.getKey().toString());
			nodeList.add(node);
		}
		
		// creating a heap of the nodes
		HuffmanMinHeap heap = new HuffmanMinHeap();
		for(HuffmanNode listNode: nodeList) {
			heap.add(listNode);
		}
		
		//getMin and add and insert back
		while(heap.getNodeCount() >=2) {
			HuffmanNode leastFreq = heap.deleteMin();
			HuffmanNode secondLeastFreq = heap.deleteMin();
			HuffmanNode combinedNode = new HuffmanNode();
			combinedNode.setFrequency(leastFreq.getFrequency()+secondLeastFreq.getFrequency());
			combinedNode.setDigit(leastFreq.getDigit()+secondLeastFreq.getDigit());
			heap.add(combinedNode);
		//	addToBinaryTree(combinedNode,leastFreq, secondLeastFreq);
			
		}
		
		
	}
}
