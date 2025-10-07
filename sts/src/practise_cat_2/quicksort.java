package practise_cat_2;
import java.util.*;

public class quicksort {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n=x.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)a[i]=x.nextInt();
		divide(0,n-1,a);
		System.out.println(Arrays.toString(a));
	}
	static void divide(int l,int r,int a[]) {
		if(l>=r)return;
		int pi=sort(l,r,a);
		divide(l,pi-1,a);
		divide(pi+1,r,a);
	}
	static int sort(int l,int r,int a[]) {
		int i=l-1;int p=a[r];
		for(int j=l;j<r;j++) {
			if(a[j]<p) {
				i++;swap(i,j,a);
			}
		}swap(i+1,r,a);
		return i+1;
	}
	static void swap(int a,int b,int ar[]) {
		int t=ar[a];
		ar[a]=ar[b];
		ar[b]=t;
	}
	
}
