package practise_cat_2;
import java.util.*;

public class quicksort {
	public static void main(String[] args) {
		Scanner x =new Scanner(System.in);
		int n=x.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)a[i]=x.nextInt();
		div(a,0,n-1);
		System.out.println(Arrays.toString(a));
	}

	private static void div(int[] a, int l, int h) {
		if(l<h) {
			int pi=q(a,l,h);
			div(a,l,pi-1);
			div(a,pi+1,h);
		}
		
	}
	public static int q(int a[],int l,int h) {
		int i=l-1,p=a[h];
		for(int j=l;j<h;j++) {
			if(a[j]<p) {
				i++;swap(a,i,j);
			}
		}swap(a,i+1,h);
		return i+1;
	}
	public static void swap(int a[],int l,int h) {
		int temp=a[l];
		a[l]=a[h];
		a[h]=temp;
	}
}
