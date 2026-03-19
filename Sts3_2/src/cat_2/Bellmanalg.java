package cat_2;
import java.util.*;
public class Bellmanalg {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int v =x.nextInt();
		int e = x.nextInt();
		List<List<Integer>>adj= new ArrayList<>();
		for(int i=0;i<e;i++) {
			int s=x.nextInt();
			int d=x.nextInt();
			int w=x.nextInt();
			adj.add(Arrays.asList(s,d,w));
		}
		int s=x.nextInt();
		bell(adj,v,s);
	}
	static void bell(List<List<Integer>>adj,int v,int s) {
		int d[] = new int[v];
		Arrays.fill(d, Integer.MAX_VALUE);
		d[s]=0;
		for(int i=1;i<v;i++) {
			for(List<Integer>a:adj) {
				int src=a.get(0),dest=a.get(1),w=a.get(2);
				if(d[src]!=Integer.MAX_VALUE && d[src]+w<d[dest]) {
					d[dest]=d[src]+w;
				}
			}
		}
		for(List<Integer>a:adj) {
			int src=a.get(0),dest=a.get(1),w=a.get(2);
			if(d[src]!=Integer.MAX_VALUE && d[src]+w<d[dest]) {
				System.out.println("Graph contains a negative weight cycle!");
				return;
			}
		}
		// Print shortest distances
        for (int i = 0; i < v; i++) {
            if (d[i] == Integer.MAX_VALUE)
                System.out.println(i + " -> INF");
            else
                System.out.println(i + " -> " + d[i]);
        }
	}
}
