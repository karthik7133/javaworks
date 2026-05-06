package fat;
import java.util.*;
public class longsequence {
	static int dp[][];
	public static void main(String[] args) {
		String a="karthik",b="arthik";
		dp=new int[a.length()+1][b.length()+1];
		for(int row[]:dp) {
		Arrays.fill(row, -1);}

		System.out.println(lcs(a,b,a.length(),b.length()));
	}

	private static int lcs(String a, String b, int i, int j) {
		if(i==0 || j==0)return 0;
		if(a==b)return i;
		if(dp[i][j]!=-1)return dp[i][j];
		if(a.charAt(i-1)==b.charAt(j-1))return dp[i][j]= 1+lcs(a,b,i-1,j-1);
		else return dp[i][j]= Math.max(lcs(a,b,i,j-1),lcs(a,b,i-1,j)); 
		
	}
}
