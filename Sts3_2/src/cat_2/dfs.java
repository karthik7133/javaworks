package cat_2;
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
		dfs(adj,start,v);
	}
	static void dfs(List<List<Integer>>adj,int s,int v) {
		boolean b[] = new boolean[v];
		b[s]=true;
		System.out.println(s);
		for(int nb:adj.get(s)) {
			if(!b[nb]) {
				dfs(adj,nb,v);
			}
		}
	}
}
