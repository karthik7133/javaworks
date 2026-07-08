package fat;
import java.util.*;
public class kanpsack {
	public static void main(String[] args) {
		int w[]= {1,2,3};
		int p[]= {10,15,40};
		int W=5;
		int al=k(w.length-1,W,p,w);
		System.out.println(al);
	}

	private static int k(int l, int W, int[] p,int []w) {
		
		if(l==0) {
			if(w[0]<=W) return p[0];return 0;
		}
		int take=0;
		int notTake=k(l-1,W,p,w);
		if(W >=w[l])take=p[l]+k(l-1,W-w[l],p,w);
		return Math.max(take, notTake);
	}
}
