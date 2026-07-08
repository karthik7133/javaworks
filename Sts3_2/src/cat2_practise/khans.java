package cat2_practise;
import java.util.*;
public class khans {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int v=x.nextInt();
		int e=x.nextInt();
		List<List<Integer>> adj=new LinkedList<>();
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<>());
		}
		for(int i=0;i<e;i++) {
			adj.get(x.nextInt()).add(x.nextInt());
		}
		k(adj,v);
	}
	static void k(List<List<Integer>>adj,int v) {
		int indeg[]= new int[v];
		for(int i=0;i<v;i++) {
			for(int nb:adj.get(i)) {
				indeg[nb]++;
			}
		}
		Queue<Integer>q = new LinkedList<>();
		for(int i=0;i<v;i++) {
			if(indeg[i]==0)q.add(i);
		}
		int c=0;
	
		while(!q.isEmpty()) {
			int cur=q.poll();
			System.out.print(cur+" ");
			c++;
			for(int nb:adj.get(cur)) {
				indeg[nb]--;
				if(indeg[nb]==0)q.add(nb);
			}
		}if(c!=v)System.out.println("loop exists");
	}
}
