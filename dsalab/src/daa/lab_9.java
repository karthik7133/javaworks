package daa;
// You are using Java
import java.util.*;
public class lab_9 {

	    public static void main(String [] ar){
	        Scanner x = new Scanner (System.in);
	        int n =x.nextInt(),m=x.nextInt();
	        List<List<Edge>> graph=new ArrayList<>();
	        for(int i=0;i<n;i++){
	            graph.add(new ArrayList<>());
	        }
	        for(int i=0;i<m;i++){
	            int r1=x.nextInt();
	            int r2=x.nextInt();
	            int t =x.nextInt();
	            graph.get(r1).add(new Edge(r2,t));
	            graph.get(r2).add(new Edge(r1,t));
	        }
	        int src =x.nextInt(),des=x.nextInt();
	        dijkstra(n,graph,src);
	    }
	    static class Edge{
	        int to,time;
	        public Edge(int t,int ti){
	            to=t;
	            time=ti;
	        }
	    }
	    public static void dijkstra(int n,List<List<Edge>>graph,int src){
	        int dis[]=new int[n];
	        Arrays.fill(dis,Integer.MAX_VALUE);
	        dis[src]=0;
	        PriorityQueue<int [] > p= new PriorityQueue<>(Comparator.comparing(a->a[1]));
	        p.offer(new int []{src,0});
	        while(!p.isEmpty()){
	            int [] cur=p.poll();
	            int node=cur[0],d=cur[1];
	            if(d>dis[node])continue;
	            for(Edge e:graph.get(node)){
	                if(dis[e.to]>dis[node]+e.time){
	                    dis[e.to]=dis[node]+e.time;
	                    p.offer(new int[] {e.to,dis[e.to]});
	                }
	            }
	        }
	        for(int i=0;i<n;i++){
	            if(dis[i]==Integer.MAX_VALUE)System.out.print(i+" "+-1);
	            else System.out.print(i+" "+dis[i]);
	        }
	    }
	
}
/*
 * // You are using Java
import java.util.*;
class Main{
    static final int INF=1000000;
    public static void main(String ar[]){
        Scanner x = new Scanner(System.in);
        int n=x.nextInt();int m=x.nextInt();
        int d[][]=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(d[i],INF);
            d[i][i]=0;
        }
        for(int i=0;i<m;i++){
            int u=x.nextInt();
            int v=x.nextInt();
            int w=x.nextInt();
            d[u][v]=w;
            d[v][u]=w;
            
        }
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    d[i][j]=Math.min(d[i][j],d[i][k]+d[k][j]);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(d[i][j]>=INF)System.out.print("INF");
                else System.out.print(d[i][j]+" ");
            }System.out.println();
        }
    }
}*/
