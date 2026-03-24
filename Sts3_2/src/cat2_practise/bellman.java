package cat2_practise;
import java.util.*;
public class bellman {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int v=x.nextInt();
		int e=x.nextInt();
		List<List<Integer>>adj=new LinkedList<>();
		for(int i=0;i<e;i++) {
			adj.add(Arrays.asList(x.nextInt(),x.nextInt(),x.nextInt()));
		}
		int src=x.nextInt();
		bel(adj,src,v);
	}
	static void bel(List<List<Integer>>adj,int src,int v) {
		int d[]= new int[v];
		Arrays.fill(d, Integer.MAX_VALUE);
		d[src]=0;
		for(int i=1;i<v;i++) {
			for(List<Integer>a:adj) {
				int s=a.get(0),des=a.get(1),w=a.get(2);
				if(d[s]!=Integer.MAX_VALUE && d[des]>d[s]+w) {
					d[des]=d[s]+w;
				}
			}
		}for(List<Integer>a:adj) {
			int s=a.get(0),des=a.get(1),w=a.get(2);
			if(d[s]!=Integer.MAX_VALUE && d[des]>d[s]+w) {
				System.out.println("loop is there");return;
			}
		}
		for(int i=0;i<v;i++) {
			if(d[i]==Integer.MAX_VALUE)System.out.println(i +" -> "+"INF");
			else System.out.println(i+" -> "+d[i]);
		}
	}
}
/*
5 8
0 1 -1
0 2 4
1 2 3
1 3 2
1 4 2
3 2 5
3 1 1
4 3 -3
0
*/
