package fat;
import java.util.*;
public class longestpalindrome {
	static int dp[][];
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String s ="aabbaa";
		dp=new int [s.length()+1][s.length()+1];
		for(int r[]:dp)Arrays.fill(r, -1);
		System.out.println(lps(s,0,s.length()-1));
	}

	private static int lps(String s, int i, int l) {
		if(i>l)return 0;
		if(i==l)return 1;
		if(dp[i][l]!=-1)return dp[i][l];
		if(s.charAt(i)==s.charAt(l))return dp[i][l]= 2+lps(s,i+1,l-1);
		else return dp[i][l]= Math.max(lps(s,i,l-1), lps(s,i+1,l));
	}
}
