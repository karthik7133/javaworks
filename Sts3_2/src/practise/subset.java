package practise;

public class subset {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		System.out.println(s(a,a.length-1,10));
	}
	static boolean s(int a[],int i,int t) {
		if(t==0)return true;
		if(i==0)return t==a[0];
		boolean take=false;
		boolean notTake=s(a,i-1,t);
		if(a[i]<=t)take =s(a,i-1,t-a[i]);
		return take||notTake;
	}
}
