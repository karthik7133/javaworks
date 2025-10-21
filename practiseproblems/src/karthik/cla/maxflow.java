package karthik.cla;
import java.util.*;
public class maxflow {
	static boolean bfs(int c[][],int p[],int src,int sink,int n) {
		boolean vi[]=new boolean[n];
		Queue<Integer>q=new LinkedList<>();
		vi[src]=true;
		q.add(src);
		while(!q.isEmpty()) {
			int u=q.poll();
			for(int v=0;v<n;v++) {
				if(!vi[v]&&c[u][v]>0) {
					q.add(v);
					vi[v]=true;
					p[v]=u;
					if(v==sink)return true;
				}
			}
		}
		return false;
	}
	static int karp(int c[][],int src,int sink,int n) {
		int max=0;
		int p[] = new int[n];
		while(bfs(c,p,src,sink,n)) {
			int pathflow=Integer.MAX_VALUE;
			for(int v=sink;v!=src;v=p[v]) {
				int u=p[v];
				pathflow=Math.min(pathflow, c[u][v]);
			}
			for(int v=sink;v!=src;v=p[v]) {
				int u=p[v];
				c[u][v]-=pathflow;
				c[v][u]+=pathflow;
			}
			max+=pathflow;
		}return max;
	}
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n=x.nextInt(),m=x.nextInt();
		int c[][]=new int[n][n];
		for(int i=0;i<m;i++) {
			int u=x.nextInt();int v=x.nextInt();
			int ca=x.nextInt();
			c[u][v]+=ca;
		}
		int src=0,sink=n-1;
		int max=karp(c,src,sink,n);
		System.out.println(max);
	}
}
