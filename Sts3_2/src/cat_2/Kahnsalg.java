package cat_2;

import java.util.*;

public class Kahnsalg {

    static void topologicalSort(List<List<Integer>> adj, int v) {

        int[] indeg = new int[v];

        // Calculate indegree of each vertex
        for (int i = 0; i < v; i++) {
            for (int nb : adj.get(i)) {
                indeg[nb]++;
            }
        }

        Queue<Integer> q = new ArrayDeque<>();

        // Add vertices with indegree 0 to queue
        for (int i = 0; i < v; i++) {
            if (indeg[i] == 0) {
                q.add(i);
            }
        }

        int cnt = 0;

        while (!q.isEmpty()) {

            int value = q.poll();
            System.out.print(value + " ");
            cnt++;

            for (int nb : adj.get(value)) {

                indeg[nb]--;

                if (indeg[nb] == 0) {
                    q.add(nb);
                }
            }
        }

        if (cnt != v) {
            System.out.println("\nGraph has a cycle!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt(); // number of vertices
        int e = sc.nextInt(); // number of edges

        List<List<Integer>> adj = new ArrayList<>();

        // initialize adjacency list
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        // read edges
        for (int i = 0; i < e; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();

            adj.get(src).add(dest); // directed edge
        }

        topologicalSort(adj, v);

        sc.close();
    }
}