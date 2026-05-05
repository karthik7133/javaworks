package fat;
import java.util.*;
public class longincsequence {
	static int dp[][];
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int a[]= {1,2,3,4,0,4};
		dp=new int[a.length][a.length+1];
		for(int r[] :dp)Arrays.fill(r, -1);
		System.out.println(lis(a,0,-1));
	}

	private static int lis(int[] a, int i, int j) {
		if(i==a.length)return 0;
		int take=0;
		int nottake=lis(a,i+1,j);
		if(dp[i][j+1]!=-1)return dp[i][j+1];
		if(j==-1 || a[j]<a[i])take= 1+lis(a,i+1,i);
		return dp[i][j+1]=Math.max(take, nottake);
	}
}
