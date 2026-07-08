package cat2_practise;
import java.util.*;
public class dfs {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int v,e;
		v=x.nextInt();
		e=x.nextInt();
		List<List<Integer>>adj= new ArrayList<>();
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
		boolean b[]= new boolean [v];
		dfs(adj,start,b);
	}
	static void dfs(List<List<Integer>>adj,int s,boolean []b) {
		
		b[s]=true;
		System.out.print(s+" ");
		for(int a:adj.get(s)) {
			if(!b[a])
			dfs(adj,a,b);
		}
	}
}
