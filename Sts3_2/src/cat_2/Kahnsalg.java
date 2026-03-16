package cat_2;
import java.util.*;
public class Kahnsalg {
	public static void main(String[] args) {
		
	}
	static void topsort(List<List<Integer>>adj,int v) {
		int indeg[] = new int[v];
		for(int i=0;i<v;i++) {
			for(int nb:adj.get(i)) {
				indeg[nb]++;
			}
		}
		Queue<Integer> q = new ArrayDeque<>();
		for(int i=0;i<v;i++) {
			if(indeg[i]==0)q.add(i);
		}
		int c=0;
		while(!q.isEmpty()) {
			int value=q.poll();
			System.out.println(value+" ");
			
			c++;
			for(int nb:adj.get(value)) {
				if(--indeg[nb]==0)q.add(nb);
			}
		}
		if(v!=c)System.out.println("graph has a cycle");
	}
}
