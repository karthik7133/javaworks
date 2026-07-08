package cat2_practise;
import java.util.*;
public class bfs {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int v=x.nextInt();
		int e=x.nextInt();
		List<List<Integer>>adj=new LinkedList<>();
		for(int i=0;i<v;i++)adj.add(new ArrayList<>());
		for(int i=0;i<e;i++) {
			int s=x.nextInt();
			int d=x.nextInt();
			adj.get(s).add(d);
			adj.get(d).add(s);
		}
		int s=x.nextInt();
		bfs(adj,v,s);
	}
	static void bfs(List<List<Integer>>adj,int v,int s) {
		boolean b[]= new boolean [v];
		b[s]=true;
		Queue<Integer> q = new LinkedList<>();
		q.add(s);
		while(!q.isEmpty()) {
			int cur=q.poll();
			System.out.println(cur);
			for(int  nb:adj.get(cur)) {
				if(!b[nb]) {b[nb]=true;
				q.offer(nb);}
			}
		}
	}
}
/*
5 4
0 1
0 2
1 3
2 4
0*/
