package practise;
import java.util.*;
public class longestpalindrome {
	static int dp[][];
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String p=x.nextLine();
		dp=new int [p.length()+1][p.length()+1];
		int k=lps(p,0,p.length()-1);
		
		System.out.println(dp[0][p.length()-1]);
	}

	private static int lps(String p, int i, int j) {
		if(i>j)return 0;
		if(i==j)return 1;
		if(p.charAt(i)==p.charAt(j)) {
			return dp[i][j]=2+lps(p,i+1,j-1);
			}
		else return dp[i][j]=Math.max(lps(p,i+1,j),lps(p,i,j-1));
	}
}
