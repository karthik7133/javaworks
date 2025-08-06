package classassignment;

import java.util.Arrays;

public class Mergesort {
	public static void main(String[] args) {
		int a[]= {10,2,30,9,7,19};
		int len=a.length;
		devide(a,0,len-1);
	}

	private static void devide(int[] a, int st, int end) {
		if(st<end) {
			int mid=st+(end-st)/2;
			devide(a,st,mid);
			devide(a,mid+1,end);
			merge(a,st,mid,end);
		}
	}

	private static void merge(int[] a, int st, int mid, int end) {
		int merged[]=new int[(end-st)+1];
		int index1=st;
		int index2=mid+1;
		int x=0;
		while(index1<=mid && index2<=end ) {
			if(a[index1]<=a[index2]) {
				merged[x++]=a[index1++];
			}else merged[x++]=a[index2++];
		}
		while(index1<=mid) {
			merged[x++]=a[index1++];
		}
		while(index2<=end) {
			merged[x++]=a[index2++];
		}
		for(int i=0,j=st;i<merged.length;i++,j++) {
			a[j]=merged[i];
		}
		System.out.println(Arrays.toString(a));
		
	}
}
