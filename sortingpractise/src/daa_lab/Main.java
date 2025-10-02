package daa_lab;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n=x.nextInt(),m=x.nextInt();
		List<List<Edge>>graph=new ArrayList<>();
		for(int i=0;i<n;i++) {
			graph.add(new ArrayList<>());
		}
		for(int i=0;i<m;i++) {
			int r1=x.nextInt();
			int r2=x.nextInt();
			int t =x.nextInt();
			graph.get(r1).add(new Edge(r2,t));
			graph.get(r2).add(new Edge(r1,t));
		}
		int src=x.nextInt();int des=x.nextInt();
		dijkstra(n,graph,src);
	}
	static class Edge{
		int to,time;
		public Edge(int t,int q) {
			this.to=t;this.time=q;
		}
	}
	public static void dijkstra(int n,List<List<Edge>>graph,int src) {
		int dis[]=new int[n];
		Arrays.fill(dis,Integer.MAX_VALUE);
		dis[src]=0;
		PriorityQueue<int []> pq=new PriorityQueue<>(Comparator.comparing(a->a[1]));
		pq.offer(new int[] {src,0});
		while(!pq.isEmpty()) {
			int [] curr=pq.poll();
			int node=curr[0],d=curr[1];
			if(d>dis[node])continue;
			for(Edge e:graph.get(node)) {
				int next=e.to,newd=d+e.time;
				if(newd<dis[next]) {
					dis[next]=newd;
					pq.offer(new int [] {next,newd});
				}
			}
		}for(int i=0;i<n;i++) {
			System.out.println(i+" "+dis[i]);
		}
	}
}
