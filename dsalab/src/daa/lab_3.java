package daa;
import java.util.*;
public class lab_3 {
	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        int v=sc.nextInt(),g[][] = new int[v][v];
	        for(int i=0;i<v;i++){
	            for(int j=0;j<v;j++) g[i][j]=sc.nextInt();
	        }
	        int[] key=new int [v],parent=new int[v];
	        boolean[] vis=new boolean[v];
	        Arrays.fill(key,Integer.MAX_VALUE);
	        Arrays.fill(parent,-1);
	        key[0]=0;
	        for(int c=0;c<v-1;c++){
	            int u=-1;
	            for(int i=0;i<v;i++)
	            
	                if(!vis[i] && ((u==-1) || key[i]<key[u]))
	                
	                    u=i;
	            
	            
	            
	            if(u==-1)     break;
	            vis[u]=true;
	            for(int j=0;j<v;j++){
	                if(g[u][j]!=0 && !vis[j] && g[u][j] < key[j] ){
	                    key[j]=g[u][j];
	                    parent[j]=u;
	                }
	            }
	            
	            
	        }
	        System.out.println("Edge   Weight");
	        int tw=0;
	        for(int i=0;i<v;i++){
	            if(parent[i]!=-1){
	                System.out.println(parent[i]+" - "+i+"    "+g[i][parent[i]]);
	                tw+=g[i][parent[i]];
	            }
	        }
	        
	    }
	
}
/*
 * import java.util.*;

class Prims{
    static final int INF=9999;
    int n,g[][],s[][];
    
    Prims(int n){
        this.n=n;
        g=new int[n][n];
        s=new int[n][n];
    }
    
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        Prims p=new Prims(n);
        p.read(sc);
        int cost =p.Prim();
        p.printTree();
        System.out.println("Total Cost: "+cost);
    }
    void read(Scanner sc){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                g[i][j]=sc.nextInt();
                
            }
        }
    }
    int Prim(){
        int[] dist =new int[n],from =new int[n];
        boolean[] vis=new boolean[n];
        int[][] c=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                c[i][j]=g[i][j]==0?INF:g[i][j];
                s[i][j]=0;
            }
        }
        dist[0]=0;
        vis[0]=true;
        for(int i=1;i<n;i++){
            dist[i]=c[0][i];
            from[i]=0;
        }
        int cost =0,edges=n-1;
        while(edges-->0){
            int v=-1,min=INF;
            for(int i=1;i<n;i++){
                if(!vis[i] && dist[i] < min ){
                    v=i;
                    min=dist[i];
                }
            }
        int u=from[v];
        s[u][v]=s[v][u]=dist[v];
        vis[v]=true;
        cost +=c[u][v];
        for(int i=1;i<n;i++)
            if(!vis[i] && c[i][v] < dist[i]){
                dist[i]=c[i][v];
                from[i]=v;
            }
        
        }
        return cost;
        
        
    }
    
    void printTree(){
        
        System.out.println("Spanning Tree Matrix: ");
        for(int[] r:s ){
            for(int x:r){
                System.out.print(x+" ");
            }
            System.out.println();
        }    
    }   
}*/
