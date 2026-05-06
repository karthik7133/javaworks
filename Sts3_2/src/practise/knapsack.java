package practise;

public class knapsack {
	public static void main(String[] args) {
		int w[]= {2,4,5};
		int p[]= {70,30,40};
		int W=10;
		int g=k(w,p,W,w.length-1);
		System.out.println(g);
	}
	static int k(int w[],int p[],int W,int n) {
		if(n==0) {
			if(W>=w[n])return p[n];
			return 0;
		}
		int take=0;
		int notTake=k(w,p,W,n-1);
		if(W>=w[n])take=p[n]+k(w,p,W-w[n],n-1);
		return Math.max(take, notTake);
		
	}
}
