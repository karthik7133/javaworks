package cat_2;
import java.util.*;
public class bfs {
	public static void main(String[] args) {
		int v,e;
		Scanner x = new Scanner(System.in);
		List<List<Integer>> adj= new ArrayList<>();
		v=x.nextInt();
		e=x.nextInt();
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<>());
		}
		for(int i=0;i<e;i++) {
			int s=x.nextInt();
			int d=x.nextInt();
			adj.get(s).add(d);
			adj.get(d).add(s);
		}
		int start=x.nextInt();
		bf(adj,start,v);
	}
	static void bf(List<List<Integer>>adj,int s,int v) {
		Queue<Integer> q = new LinkedList<>();
		boolean b[] = new boolean[v];
		b[s]=true;
		q.offer(s);
		while(!q.isEmpty()) {
			int node=q.poll();
			System.out.println(node+" ");
			for(int nb:adj.get(node)) {
				if(!b[nb]) {
				b[nb]=true;
				q.offer(nb);}
			}
		}
	}
}
