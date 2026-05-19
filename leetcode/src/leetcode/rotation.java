package leetcode;

import java.util.Arrays;

public class rotation {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		int k=3;
		if(k>a.length)k=a.length%3;
		r(a,0,a.length-1);
		r(a,0,k-1);
		r(a,k,a.length-1);
		System.out.println(Arrays.toString(a));
	}
	static void r(int a[],int l,int r) {
		while(l<r) {
		int t=a[l];
		a[l]=a[r];
		a[r]=t;
		l++;r--;
		}
	}
}
