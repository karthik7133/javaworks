package practise;

public class longestcommonstring {
	public static void main(String[] args) {
		String a="karthik";
		String b="arthik";
		int c=lcs(a,b,a.length(),b.length());
		System.out.println(c);
	}
	static int lcs(String a,String b,int i,int j) {
		if(i==0 || j==0)return 0;
		if(a.charAt(i-1)==b.charAt(j-1))return 1+lcs(a,b,i-1,j-1);
		else return Math.max(lcs(a,b,i,j-1), lcs(a,b,i-1,j));
	}
}
