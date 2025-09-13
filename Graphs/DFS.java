package Graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Description:
 * This file implements Depth First Search (DFS) for a directed graph.
 * DFS explores as far as possible along each branch before backtracking.
 *
 * Time Complexity:
 * O(V + E), where V = number of vertices, E = number of edges.
 *
 * Space Complexity:
 * O(V), due to the recursion stack and visited array.
 *
 * Example:
 * Input Graph:
 * 0 -> 1, 2
 * 1 -> 2
 * 2 -> 0, 3
 *
 * DFS starting at node 2: 2 0 1 3
 */
public class DFS {
    public static void dfs(Integer node, List<List<Integer>> adj, List<Boolean> visited){
        System.out.print(node + " ");
        visited.set(node, true);

        for (int v : adj.get(node)) {
            if (!visited.get(v)) {
                dfs(v, adj, visited);
            }
        }
    }

    public static void main(String[] args) {
        Integer numberOfNodes = 4;

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numberOfNodes; i++){
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(0).add(2);

        adj.get(1).add(2);

        adj.get(2).add(0);
        adj.get(2).add(3);

        List<Boolean> visited = new ArrayList<Boolean>(Collections.nCopies(numberOfNodes, false));

        System.out.println("DFS starting from node 2:");
        dfs(2, adj, visited); // Output: 2 0 3 1
    }
}
