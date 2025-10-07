package practise_cat_2;
import java.util.*;
public class max_eq_sum {
	public static void main(String[] args) {
		Scanner x = new Scanner (System.in);
		int n=x.nextInt();
		int a[] = new int[n];for(int i=0;i<n;i++)a[i]=x.nextInt();
		int i=0,j=n-1;
		int psum=a[i],ssum=a[j];
		int max=Integer.MIN_VALUE;
		while(i<=j) {
			if(psum==ssum)max=Math.max(max, psum);
			if(psum<ssum) {
				i++;psum+=a[i];
			}
			else {
				j--;ssum+=a[j];
			}
		}
		System.out.println(max);
	}
}
