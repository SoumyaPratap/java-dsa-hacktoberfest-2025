/**
 * BFS on adjacency list
 * Time Complexity: O(V + E)
 */
package Graphs;
import java.util.*;

public class BFS {
    public static void bfs(int n, List<List<Integer>> adj, int start) {
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int v : adj.get(u)) {
                if (!visited[v]) { visited[v] = true; q.add(v); }
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        adj.get(0).add(1); adj.get(0).add(2);
        adj.get(1).add(2);
        adj.get(2).add(0); adj.get(2).add(3);
        bfs(n, adj, 2); // Output: 2 0 3 1
    }
}
