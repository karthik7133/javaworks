package practise;
import java.util.*;
public class longincsequence {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int a[]= {1,2,3,4,0,2};
		System.out.println(lis(a,0,-1));
	}
	static int lis(int a[],int n,int p) {
		if(n==a.length)return 0;
		int take =0;
		int notTake= lis(a,n+1,p);
		if(p==-1 || a[p]<a[n])take=1+lis(a,n+1,n);
		return Math.max(take, notTake);
	}
}
