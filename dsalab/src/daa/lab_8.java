package daa;
import java.util.*;
public class lab_8 {
	    static List<Integer>[] g,rg;
	    static boolean visited[];
	    static Stack<Integer> st;
	    static void dfs1(int u){
	        visited[u]=true;
	        for(int v:g[u]){
	            if(!visited[v])
	                dfs1(v);
	        }st.push(u);
	    }
	    static void dfs2(int u,List<Integer> cmp){
	        visited[u]=true;
	        cmp.add(u);
	        for(int v:rg[u]){
	            if(!visited[v]){
	                dfs2(v,cmp);
	            }
	        }
	    }
	    public static void main(String ar[]){
	        Scanner x = new Scanner(System.in);
	        int n=x.nextInt();int m =x.nextInt();
	        g=new ArrayList[n+1];
	        rg=new ArrayList[n+1];
	        for(int i=1;i<=n;i++){
	            g[i]=(new ArrayList<>());
	            rg[i]=(new ArrayList<>());
	        }
	        for(int i=0;i<m;i++){
	            int u=x.nextInt();int v=x.nextInt();
	            g[u].add(v);
	            rg[v].add(u);
	        }
	        
	        visited = new boolean[n+1];
	        st=new Stack<>();
	        for(int i=1;i<=n;i++){
	            if(!visited[i]){
	                dfs1(i);
	            }
	        }
	        Arrays.fill(visited,false);
	        List<List<Integer>>all = new ArrayList<>();
	        while(!st.isEmpty()){
	            int u=st.pop();
	            if(!visited[u]){
	                List<Integer> cmp=new ArrayList<>();
	                dfs2(u,cmp);
	                Collections.sort(cmp);
	                all.add(cmp);
	            }
	        }
	        all.sort(Comparator.comparingInt(a->a.get(0)));
	        System.out.println("Strongly Connected Components are:");
	        for(List<Integer> c:all){
	            System.out.println(c.toString().replaceAll("[\\[\\],]",""));
	        }
	    }
	
}
/*
 * // You are using Java
import java.util.*;
class Main{
    static List<List<Integer>>g,rg;
    static boolean visited[];
    static int [] cmp;
    static Stack<Integer> st;
    static int n,m;
    static void dfs1(int u){
        visited[u]=true;
        for(int v:g.get(u)){
            if(!visited[v])dfs1(v);
        }st.push(u);
    }
    static void dfs2(int u,int cid){
        visited[u]=true;
        cmp[u]=cid;
        if(!visited[u])dfs2(u,cid);
    }
    public static void main(String ar[]){
        Scanner x = new Scanner(System.in);
        n=x.nextInt();
        m=x.nextInt();
        g=new ArrayList<>();
        rg= new ArrayList<>();
        for(int i=0;i<=n;i++){
            g.add(new ArrayList<>());
            rg.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            int u=x.nextInt();
            int v=x.nextInt();
            g.get(u).add(v);
            rg.get(v).add(u);
        }
        
        
        visited=new boolean[n+1];
        st=new Stack<>();
        for(int i=1;i<=n;i++){
            if(!visited[i])dfs1(i);
        }
        
        cmp=new int[n+1];
        visited=new boolean[n+1];
        int cid=0;
        while(!st.isEmpty()){
            int u=st.pop();
            if(!visited[u]){
                dfs2(u,cid++);
            }
        }
        
        if(cid==1){
            System.out.print(0);return;
        }
        
        Set<Integer>[] uc=new Set[cid];
        for(int i=0;i<cid;i++){
            uc[i]=new HashSet<>();
        }
        
        for(int u=1;u<n;u++){
            int cu=cmp[u];
            for(int v:g.get(u)){
                int cv=cmp[v];
                if(cu!=cv){
                    uc[cu].add(cv);
                }
            }
        }
        int[] in =new int[cid],out=new int[cid];
        for(int i=0;i<cid;i++){
            out[i]=uc[i].size();
            for(int j:uc[i]){
                in[j]++;
            }
        }
        
        // int indeg[]=new int[cid];
        // int outdeg[]=new int[cid];
        // for(int  u=0;u<=n;u++){
        //     for(int v:g.get(u)){
        //         if(cmp[u]!=cmp[v]){
        //             indeg[cmp[v]]++;
        //             outdeg[cmp[u]]++;
        //         }
        //     }
        // }
        int so=0,si=0;
        for(int i=0;i<cid;i++){
            if(in[i]==0)so++;
            if(out[i]==0)si++;
        }
        System.out.print(Math.max(si,so));
    }
}*/
