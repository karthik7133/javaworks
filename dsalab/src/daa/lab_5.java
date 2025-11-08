package daa;
// You are using Java
import java.util.*;
public class lab_5 {

	class Main{
	    static int [] [] dp,split;
	    static int [] p;
	    public static void main(String ar[]){
	        Scanner x= new Scanner(System.in);
	        int n=x.nextInt();
	        p= new int [n];
	        for(int i=0;i<n;i++)p[i]=x.nextInt();
	        dp=new int [n][n];
	        split=new int[n][n];
	        for(int row[] :dp)Arrays.fill(row,-1);
	        System.out.println(solve(1,n-1));
	        System.out.println(build(1,n-1));
	    }
	    static String build(int i,int j){
	        if(i==j)return "M"+i;
	        int k=split[i][j];
	        return "("+build(i,k)+build(k+1,j)+")";
	    }
	    static int solve(int i,int j){
	        if(i==j)return 0;
	        if(dp[i][j]!=-1)return dp[i][j];
	        int min=Integer.MAX_VALUE,idx=-1;
	        for(int k=i;k<j;k++){
	            int cost=solve(i,k)+solve(k+1,j)+p[i-1]*p[k]*p[j];
	            if(cost<min){
	                min =cost;
	                idx=k;
	            }
	        }split[i][j]=idx;
	        return dp[i][j]=min;
	    }
	}
}
/*
 * // You are using Java
import java.util.*;
class Main{
    static int[] [] dp,split;
    static int[] p;
    public static void main(String ar[]){
        Scanner x= new Scanner(System.in);
        int n= x.nextInt();
        p= new int[n];
        for(int i=0;i<n;i++)p[i]=x.nextInt();
        dp= new int[n][n];
        split= new int[n][n];
        for(int [] row :dp)Arrays.fill(row,-1);
        System.out.println(solve(1,n-1));
        System.out.println(build(1,n-1));
    }
    static String build(int i,int j){
        if(i==j)return "M"+i;
        int k= split[i][j];
        return "("+build(i,k)+build(k+1,j)+")";
    }
    static int solve(int i,int j){
        if(i==j)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int min=Integer.MAX_VALUE,idx=-1;
        for(int k=i;k<j;k++){
            int cost= solve(i,k)+solve(k+1,j)+p[i-1]*p[j]*p[k];
            if(cost<min){
                min =cost;
                idx=k;
            }
        }split[i][j]=idx;
        return dp[i][j]=min;
    }
}*/
