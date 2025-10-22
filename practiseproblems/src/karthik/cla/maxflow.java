package karthik.cla;
import java.util.*;
public class maxflow {
	
	static boolean bfs(int [] []c,int []p,int src ,int si,int n) {
		Queue<Integer>q = new LinkedList<>();
		boolean vi[]= new boolean[n];
		q.add(src);
		vi[src]=true;
		while(!q.isEmpty()) {
			int u=q.poll();
			for(int v=0;v<n;v++) {
				if(!vi[v]&& c[u][v]>0) {
					vi[v]=true;
					q.add(v);
					p[v]=u;
					if(v==si)return true;
				}
			}
		}
		return false ;
	}
	static int karp(int c[][],int src,int si,int n) {
		int max=0;
		int p[]= new int[n];
		while(bfs(c,p,src,si,n)) {
			int path=Integer.MAX_VALUE;
			for(int v=si;v!=src;v=p[v]) {
				int u=p[v];
				path=Math.min(path, c[u][v]);
			}
			for(int v=si;v!=src;v=p[v]) {
				int u=p[v];
				c[u][v]-=path;
				c[v][u]+=path;
			}max+=path;
		}return max;
	}
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		int n=x.nextInt();int m=x.nextInt();
		int c[][]=new int[n][n];
		for(int i=0;i<m;i++) {
			int u=x.nextInt();
			int v=x.nextInt();
			int ca=x.nextInt();
			c[u][v]+=ca;
		}
		int src=0,si=n-1;
		int max=karp(c,src,si,n);
		System.out.println(max);
	}
}
