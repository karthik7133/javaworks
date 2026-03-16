package cat_2;
import java.util.*;
public class dailsalg {
	public static void main(String[] args) {
		
	}
	static void alg(List<List<int []>>adj,int src,int w,int v) {
		int dis[] = new int[v];
		for(int i:dis)dis[i]=Integer.MAX_VALUE;
		List<ArrayDeque<Integer>>buckets = new ArrayList<>(w+1);
		for(int i=0;i<=w;i++) {
			buckets.add(new ArrayDeque<>());
		}
		buckets.get(0).add(src);
		dis[src]=0;
		int done=0;
		int idx=0;int d=0;
		while(done<v) {
			while(buckets.get(idx).isEmpty()) {
				idx=(idx+1)%(w+1);d++;
			}
			int cur=buckets.get(idx).poll();
			if(dis[cur]<d)continue;
			done++;
			for(int [] edge:adj.get(cur)) {
				int n=edge[0];
				int wi=edge[1];
				if(dis[cur]+w<dis[n]) {
					dis[n]=dis[cur]+w;
					buckets.get(dis[n]%(w+1)).add(n);
				}
				
			}
		}
		
	}
}
