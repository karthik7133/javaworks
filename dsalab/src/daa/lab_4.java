package daa;
import java.util.*;
public class lab_4 {
	public static void main(String [] ar){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt(),m=x.nextInt();
        List<List<Edge>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            int r1=x.nextInt();
            int r2=x.nextInt();
            int t=x.nextInt();
            graph.get(r1).add(new Edge(r2,t));
            graph.get(r2).add(new Edge(r1,t));
        }
        int src=x.nextInt(),des=x.nextInt();
        dijkstra(n,graph,src);
    }
    static class Edge{
        int to,time;
        public Edge(int t,int time){
            this.to=t;
            this.time=time;
        }
    }
    public static void dijkstra(int n,List<List<Edge>> graph,int src){
        int dis[]=new int[n];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[src]=0;
        PriorityQueue<int []> pq=new PriorityQueue<>(Comparator.comparing(a->a[1]));
        pq.offer(new int[]{src,0});
        while(!pq.isEmpty()){
            int curr[]=pq.poll();
            int node=curr[0],d=curr[1];
            if(d>dis[node])continue;
            for(Edge e:graph.get(node)){
                int next=e.to,newdis=d+e.time;
                if(newdis<dis[next]){
                    dis[next]=newdis;
                    pq.offer(new int[] {next,newdis});
                }
            }
        }for(int i=0;i<n;i++){
            System.out.println(i+" "+dis[i]);
        }
    }
}
/*
 * // You are using Java
import java.util.*;
class Main{
    public static void main(String []ar){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt(),m=x.nextInt();
        List<List<Edge>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            int r1=x.nextInt();
            int r2=x.nextInt();
            int t=x.nextInt();
            graph.get(r1).add(new Edge(r2,t));
            graph.get(r2).add(new Edge(r1,t));
        }int src=x.nextInt(),des=x.nextInt();
        dijkstra(n,graph,src);
    }
    static class Edge{
        int to,time;
        public Edge(int to,int time){
            this.to=to;
            this.time=time;
        }
    }
    public static void dijkstra(int n,List<List<Edge>>graph,int src){
        int dis[]=new int[n];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[src]=0;
        PriorityQueue<int []> pq=new PriorityQueue<>(Comparator.comparing(a->a[1]));
        pq.offer(new int[]{src,0});
        while(!pq.isEmpty()){
            int curr[]=pq.poll();
            int node=curr[0],d=curr[1];
            if(d>dis[node])continue;
            for(Edge e:graph.get(node)){
                int next=e.to,newdis=d+e.time;
                if(newdis<dis[next]){
                    dis[next]=newdis;
                    pq.offer(new int[]{next,newdis});
                }
            }
        }for(int i=0;i<n;i++){
            System.out.println(i+" "+dis[i]);
        }
    }
}*/
