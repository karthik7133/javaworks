package daa_lab;
import java.util.*;
public class dijkstra {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n= x.nextInt(),m=x.nextInt();
		List<List<Edge>>graph= new ArrayList<>();
		for(int i=0;i<n;i++)graph.add(new ArrayList<>());
		for(int i=0;i<m;i++) {
			int r1=x.nextInt();
			int r2=x.nextInt();
			int t=x.nextInt();
			graph.get(r1).add(new Edge(r2,t));
			graph.get(r2).add(new Edge(r1,t));
		}
		int src=x.nextInt(),des=x.nextInt();
		dijkstra(n,graph,src);
	}
	static class Edge{
		int to,time;
		public Edge(int t,int ti) {
			to=t;
			time=ti;
		}
	}
	public static void dijkstra(int n,List<List<Edge>> graph,int src) {
		int dis[]=new int[n];
		Arrays.fill(dis, Integer.MAX_VALUE);
		dis[src]=0;
		PriorityQueue<int [] > p=new PriorityQueue<>(Comparator.comparing(a->a[1]));
		p.offer(new int[] {src,0});
		while(!p.isEmpty()) {
			int cur[] = p.poll();
			int node=cur[0],d=cur[1];
			if(d>dis[node])continue;
			for(Edge e:graph.get(node)) {
				int next=e.to,newd=e.time+d;
				if(newd<dis[node]) {
					dis[next]=newd;
					p.offer(new int[] {next,newd});
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(i+" "+dis[i]);
		}
	}
}
