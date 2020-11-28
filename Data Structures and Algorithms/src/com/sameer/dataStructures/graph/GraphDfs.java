package com.sameer.dataStructures.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class GraphDfs {

  public static void main (String args[]) {


    //int edges[][] = {{0,1},{1,2},{2,5},{2,4},{4,3},{3,0}};
    int edges[][] = {{0,1},{0,2},{0,4},{0,6},{1,3},{1,4},{1,5},{2,3}};


    int noOfVertices = 7;
    List<Integer> dfsList = dfs( noOfVertices, edges);
    System.out.println(dfsList);
  }


  private static List<Integer> dfs(int noOfVertices, int edges[][]) {

    //create a grph
    Map<Integer,List<Integer>> graph = new HashMap<>();
    for(int edge[]: edges) {
      int source = edge[0];
      int destination = edge[1];
      List<Integer> lst = graph.getOrDefault(source, new ArrayList<>());
      lst.add(destination);
      graph.put(source,lst);
    }

    //DFS
    Stack<Integer> stack = new Stack<>();

    boolean visited[] = new boolean[noOfVertices];
    List<Integer> ans = new ArrayList<>();


    //first node
    int curr = 0;
    stack.push(curr);
    visited[curr] = true;
    ans.add(curr);

    //traversal
    while(!stack.empty()) {
      curr = stack.peek();
      List<Integer> neighbours = graph.getOrDefault(curr, null);

      boolean hasUnvisitedNeighbour = false;
      if(neighbours != null) {
      for(Integer neighbour: neighbours) {
        if(!visited[neighbour]){
          hasUnvisitedNeighbour = true;
          stack.push(neighbour);
          visited[neighbour] = true;
          ans.add(neighbour);
          break;
        }
      }
      }

      if(!hasUnvisitedNeighbour){
        stack.pop();
      }
    }

    return ans;

  }
}
