/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manis
 */
import java.io.*;
import java.util.*;

// This class represent a directed graph using adjacency list representation
class Graph {

    private int V;

    // Array of list for Adjacency List Representation
    private LinkedList<Integer> adj[];

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();

        }
    }

    //Function to add an edge into the graph 
    void addEdge(int v, int w) {
        // Add  w to v's list.
        adj[v].add(w);
    }

    // A function  used by  DFS
    void DFSUtil(int v, boolean visited[]) {
        // Mark the current node as visited and print it 
        visited[v] = true;
        System.out.println(v + " ");//0======>
        // Recur for all the vertices adjacent to this 
        // vertex 
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    // The function to do DFS traversal.
    // it uses recursive DFSUtil()
    void DFS(int v) {
        // Mark all the vertices as not visited (set as false by default in java)
        boolean visited[] = new boolean[V];
        // call the recursive helper 
        // function to print DFS  traversal
        DFSUtil(v, visited);

    }

    // Driver Code
    public static void main(String args[]) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        System.out.println(
                "Following is Depth First Traversal "
                + "(starting from vertex 0)");
        // Function call
        g.DFS(0);
    }
}
