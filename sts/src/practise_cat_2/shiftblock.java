package practise_cat_2;
import java.util.*;
public class shiftblock {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n=x.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)a[i]=x.nextInt();
		int r=x.nextInt();
		r=n-(r%n);
		rev(0,r-1,a);
		rev(r,n-1,a);
		rev(0,n-1,a);
		System.out.println(Arrays.toString(a));
	}
	static void rev(int l,int r,int a[]) {
		while(l<r) {
			swap(l,r,a);l++;r--;
		}
	}
	static void swap(int l,int r,int a[]) {
		int temp=a[l];
		a[l]=a[r];
		a[r]=temp;
	}
	
	
}
