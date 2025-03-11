/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsafeb2025;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author manis
 */
// Class to represent a graph using adjacency list
 class Graph {
    
     int vertices;
     LinkedList<Integer>[] adjList;
     
     Graph(int vertices){
         this.vertices = vertices;
         adjList = new LinkedList[vertices];
         for(int i=0; i<vertices; i++){
             adjList[i] = new LinkedList<>();
         }
     }
     // Function to add an edge to the graph 
     void addEdge(int u, int v){
         adjList[u].add(v);
     }
     
     //Function to perform Breadth First Search on gdrqaph 
     // represented using adjacency list
     void bfs(int startNode){
         //Create a queue for BFS
         Queue<Integer> queue = new LinkedList<>();
         boolean[] visited = new boolean[vertices];
         
         // Mark the current node as visited and  enqueue it 
         visited[startNode] = true;
         queue.add(startNode);
         
         // Iterate over the queue 
         while(!queue.isEmpty()){
             // Dequeue a vertex from queue and print it 
             int currentNode = queue.poll();
             System.out.println(currentNode+" ");//0
             
             //Get all adjacent vertices of the dequeued 
             // vertex curretNode if an adjacent has not been visited, then mark it visited and enqueue it
             
             for(int neighbor : adjList[currentNode]){
                 if(!visited[neighbor]){
                     visited[neighbor] = true;
                     queue.add(neighbor);
                 
                 }
             }
         }
     }
     
}

class Main {
    public static void main(String[] args) {
        // Number of vertices in the graph 
        int vertices = 5;
        
        // Create a graph 
        Graph  graph = new Graph(vertices);
        
        // Add edges to the grph 
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        
        // perform BFS traversal from vertex 0
        System.out.println("Breadth First Traversal starting from vertex 0 : ");
        graph.bfs(0);
    }
}
