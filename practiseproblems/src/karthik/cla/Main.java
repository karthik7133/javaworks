
package karthik.cla;
import java.util.*;

public class Main {
    static List<Integer>[] g, gr;
    static boolean[] vis;
    static Stack<Integer> st;

    static void dfs1(int u) {
        vis[u] = true;
        for (int v : g[u])
            if (!vis[v])
                dfs1(v);
        st.push(u);
    }

    static void dfs2(int u, List<Integer> comp) {
        vis[u] = true;
        comp.add(u);
        for (int v : gr[u])
            if (!vis[v])
                dfs2(v, comp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        g = new ArrayList[n + 1];
        gr = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            g[i] = new ArrayList<>();
            gr[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            g[u].add(v);
            gr[v].add(u);
        }

        vis = new boolean[n + 1];
        st = new Stack<>();
        for (int i = 1; i <= n; i++)
            if (!vis[i])
                dfs1(i);

        Arrays.fill(vis, false);
        List<List<Integer>> all = new ArrayList<>();
        while (!st.isEmpty()) {
            int u = st.pop();
            if (!vis[u]) {
                List<Integer> comp = new ArrayList<>();
                dfs2(u, comp);
                Collections.sort(comp);
                all.add(comp);
            }
        }
        all.sort(Comparator.comparingInt(a -> a.get(0)));

        System.out.println("Strongly Connected Components are:");
        for (List<Integer> c : all) {
            System.out.println(c.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}