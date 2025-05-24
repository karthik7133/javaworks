package dsa;

import java.util.Arrays;

public class mergesort {
	public static void main(String[] args) {
		int arr[]= {8,9,7,5,4,6};
		int n=arr.length;
		devide(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
	}
	 static void devide(int a[],int si,int ei) {
		if(si>=ei) {
			return;
		}
		int mid=si+(ei-si)/2;
		devide(a,si,mid);
		devide(a,mid+1,ei); 	
		merge(a,si,mid,ei);
	}
	static void merge(int a[],int si,int mid,int ei) {
		int merged[]=new int[ei-si+1];
		int indx1=si;
		int indx2=mid+1;
		int x=0;
		while(indx1<=mid && indx2<=ei) {
			if(a[indx1]<=a[indx2]) {
				merged[x++]=a[indx1++];
			}else {
				merged[x++]=a[indx2++];
			}
		}
		while(indx1<=mid){
			merged[x++]=a[indx1++];
		}
		while(indx2<=ei) {
			merged[x++]=a[indx2++];
		}
		for(int i=0,j=si;i<merged.length;i++,j++) {
			a[j]=merged[i];
		}
	}
}
