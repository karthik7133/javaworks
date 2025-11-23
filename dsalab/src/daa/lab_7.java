package daa;
//You are using Java
import java.util.*;
public class lab_7 {
	
	
	    public static void main(String ar[]){
	        Scanner x = new Scanner(System.in);
	        String a=x.next();
	        System.out.print(lps(a));
	    }
	    public static int lps(String a){
	        int n=a.length();
	        int dp[][]= new int[n][n];
	        for(int i=n-1;i>=0;i--){
	            dp[i][i]=1;
	            for(int j=i+1;j<n;j++){
	                if(a.charAt(i)==a.charAt(j))dp[i][j]=2+dp[i+1][j-1];
	                else dp[i][j]=Math.max(dp[i][j-1],dp[i+1][j]);
	            }
	        }
	        return dp[0][n-1];
	    }
	
}
/*
 * // You are using Java
import java.util.*;
class Main{
    public static void main(String ar[]){
        Scanner x =  new Scanner(System.in);
        int t=x.nextInt();
        while(t-- >0){
            int n=x.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)a[i]=x.nextInt();
            System.out.println(lis(a));
        }
    }
    public static int lis(int a[]){
        ArrayList<Integer> lis= new ArrayList<>();
        for(int n:a){
            int pos=Collections.binarySearch(lis,n);
            if(pos<0)pos=-(pos+1);
            if(pos==lis.size())lis.add(n);
            else lis.set(pos,n);
        }
        return lis.size();
    }
}*/
