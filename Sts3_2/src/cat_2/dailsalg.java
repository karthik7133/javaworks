package cat_2;

import java.util.*;

public class dailsalg {

    static void dial(List<List<int[]>> adj, int src, int W, int v) {

        int[] dist = new int[v];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[src] = 0;

        List<ArrayDeque<Integer>> buckets = new ArrayList<>(W + 1);

        for (int i = 0; i <= W; i++)
            buckets.add(new ArrayDeque<>());

        buckets.get(0).add(src);

        int done = 0;
        int idx = 0;
        int d = 0;

        while (done < v) {

            while (buckets.get(idx).isEmpty()) {
                idx = (idx + 1) % (W + 1);
                d++;
            }

            int curr = buckets.get(idx).poll();

            if (dist[curr] < d)
                continue;

            done++;

            for (int[] edge : adj.get(curr)) {

                int n = edge[0];
                int w = edge[1];

                if (dist[curr] + w < dist[n]) {

                    dist[n] = dist[curr] + w;

                    buckets.get(dist[n] % (W + 1)).add(n);
                }
            }
        }

        for (int i = 0; i < v; i++) {
            System.out.println("Distance to " + i + " = " + dist[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt(); // number of vertices
        int e = sc.nextInt(); // number of edges

        List<List<int[]>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++)
            adj.add(new ArrayList<>());

        int W = 0;

        for (int i = 0; i < e; i++) {

            int src = sc.nextInt();
            int dest = sc.nextInt();
            int w = sc.nextInt();

            adj.get(src).add(new int[]{dest, w});
            adj.get(dest).add(new int[]{src, w}); // undirected graph

            if (w > W)
                W = w;
        }

        int start = sc.nextInt();

        dial(adj, start, W, v);

        sc.close();
    }
}