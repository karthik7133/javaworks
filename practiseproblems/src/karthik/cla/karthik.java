package karthik.cla;
import java.util.*;
public class karthik {
	static boolean visited[];
	static Stack<Integer> stack;
	static int cmp[],n,m;
	static List<List<Integer>>graph,revgraph;
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n=x.nextInt();int m=x.nextInt();
		graph=new ArrayList<>();
		revgraph=new ArrayList<>();
		for(int i=0;i<n;i++) {
			graph.add(new ArrayList<>());
			revgraph.add(new ArrayList<>());
		}
		
		for(int i=0;i<m;i++) {
			int u=x.nextInt();int v=x.nextInt();
			graph.get(u).add(v);
			revgraph.get(v).add(u);
		}
		
		visited = new boolean[n+1];
		stack= new Stack<>();
		for(int i=1;i<=n;i++) {
			if(!visited[i]) {
				dfs1(i);
			}
		}
		cmp=new int[n+1];
		Arrays.fill(cmp, -1);
		int cid=0;
		visited=new boolean[n+1];
		while(!stack.empty()) {
			int u=stack.pop();
			if(!visited[u]) {
				dfs2(u,cid++);
			}
		}
		if(cid==1) {
			System.out.println(0);return;
		}
		
		int [] indeg=new int[cid];
		int [] outdeg=new int[cid];
		for(int u=1;u<=n;u++) {
			for(int v:graph.get(u)) {
				if(cmp[v]!=cmp[u]) {
					indeg[cmp[v]]++;
					outdeg[cmp[u]]++;
				}
			}
		}
		int sr=0,si=0;
		for(int i=0;i<cid;i++) {
			if(indeg[i]==0)sr++;
			if(outdeg[i]==0)si++;
		}
		System.out.println(Math.max(sr, si));
	}
	
	
}
