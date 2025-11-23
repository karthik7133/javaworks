package daa;
//You are using Java
	import java.util.*;
public class lab_6 {
	    public static void main(String ar[]){
	        Scanner x = new Scanner(System.in);
	        int n=x.nextInt();
	        int k[]=new int[n];
	        int f[]=new int[n];
	        int q[]= new int[n+1];
	        for(int i=0;i<n;i++){
	            k[i]=x.nextInt();
	        }
	        for(int i=0;i<n;i++)f[i]=x.nextInt();
	        for(int i=0;i<=n;i++)q[i]=x.nextInt();
	        
	        int c[][]= new int[n+1][n+1];
	        int w[][] = new int[n+1][n+1];
	        for(int i=0;i<=n;i++){
	            c[i][i]=q[i];
	            w[i][i]=q[i];
	        }
	        for(int l=1;l<=n;l++){
	            for(int i=0;i<=n-l;i++){
	                int j=i+l;
	                w[i][j]=w[i][j-1]+f[j-1]+q[j];
	                c[i][j]=Integer.MAX_VALUE;
	                for(int r=i+1;r<=j;r++){
	                    int cost=c[i][r-1]+c[r][j]+w[i][j];
	                    c[i][j]=Math.min(c[i][j],cost);
	                }
	            }
	        }
	        for(int i=0;i<=n;i++){
	            for(int j=i;j<=n;j++){
	                System.out.print(c[i][j]);
	                if(j<n)System.out.print(" ");
	            }System.out.println();
	        }
	    }
	
}
/*
 * // You are using Java
import java.util.*;
class Main{
    public static void main(String [] ar){
        Scanner x = new Scanner(System.in);
        int n=x.nextInt();
        int [] k=new int[n];
        int [] f= new int[n];
        for(int i=0;i<n;i++){
            k[i]=x.nextInt();
            f[i]=x.nextInt();
        }
        int m= x.nextInt();
        for(int i=0;i<n;i++){
            if(k[i]==m){
                System.out.print("Key "+m+" found in the OBST.");return;
            }
        }System.out.println("Key "+m+" not found in the OBST.");
    }
}*/
