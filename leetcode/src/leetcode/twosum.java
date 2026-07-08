package leetcode;

public class twosum {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int t=10;
		System.out.println(sum(a,t,0));
		
	}
	static boolean sum(int a[],int t,int l) {
		if(t==0)return true;
		if(l==a.length && t!=0)return false;
		boolean nottake=sum(a,t,l+1);
		boolean take=false;
		if(t-a[l]>=0 || t==0)take=sum(a,t-a[l],l+1);
		return nottake|| take;
	}
}
