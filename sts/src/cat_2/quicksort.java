package cat_2;
import java.util.*;
public class quicksort {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n=x.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)a[i]=x.nextInt();
		divide(a,0,n-1);
		System.out.println(Arrays.toString(a));
	}
	public static void divide(int a[] ,int l,int h) {
		if(l<h) {
			int p=pivot(a,l,h);
			divide(a,l,p-1);
			divide(a,p+1,h);
			System.out.println(Arrays.toString(a));
		}
	}
	private static int pivot(int[] a, int l, int h) {
		int i=l-1;
		int pivot=a[h];
		for(int j=l;j<h;j++) {
			if(a[j]<pivot) {
				i++;
				swap(a,i,j);
			}
		}swap(a,i+1,h);
		return i+1;
	}
	private static void swap(int[] a, int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}
}
