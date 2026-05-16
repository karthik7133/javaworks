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
		 boolean b[]= new boolean [v];
	        dfs(adj,b,0);
	    }
	    static void dfs(List<List<Integer>> adj,boolean[] b,int src){
	        b[src]=true;
	        System.out.print(src+" ");
	        for(int nb:adj.get(src)){
	            if(!b[nb]){dfs(adj,b,nb);}
	        }
	    }
}
