package classassignment;

import java.util.Arrays;

public class Mergesort {
	public static void main(String[] args) {
		int a[]= {23,54,10,2,30,9,7,19};
		int len=a.length;
		devide(a,0,len-1);
		System.out.println(Arrays.toString(a));
	}

	private static void devide(int[] a, int i, int j) {
		if(i<j) {
			int mid=i+(j-i)/2;
			devide(a,i,mid);
			devide(a,mid+1,j);
			merge(a,i,mid,j);
		}
		
	}

	private static void merge(int[] a, int i, int mid, int j) {
		int m[]=new int[j-i+1];
		int x=0,ind1=i,ind2=mid+1;
		while(ind1<=mid && ind2<=j) {
			if(a[ind1]<=a[ind2]) {
				m[x++]=a[ind1++];
			}else m[x++]=a[ind2++];
		}while(ind1<=mid) {
			m[x++]=a[ind1++];
		}while(ind2<=j) {
			m[x++]=a[ind2++];
		}
		for(int k=0;k<m.length;k++) {
			a[i++]=m[k];
		}
	}
	
}
