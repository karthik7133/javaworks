package dsa;
import java.util.*;
public class mergesort2 {
	public static void main(String[] args) {
		int a[]= {9,7,8,4,6,2};
		int n=a.length;
		divide(a,0,n-1);
		System.out.println(Arrays.toString(a));
	}
	static void divide(int a[],int si,int ei) {
		int mid=si+(ei-si)/2;
		if(si>=ei) {
			return;
		}
		divide(a,si,mid);
		divide(a,mid+1,ei);
		merge(a,si,mid,ei);
	}
	static void merge(int a[],int si,int mid,int ei){
		int merged[]=new int[ei-si+1];
		int index1=si;
		int index2=mid+1;
		int x=0;
		while(index1<=mid && index2<=ei) {
			if(a[index1]<=a[index2]) {
				merged[x++]=a[index1++];
			}else {
				merged[x++]=a[index2++];
			}
		}
		while(index1<=mid) {
			merged[x++]=a[index1++];
		}
		while(index2<=ei) {
			merged[x++]=a[index2++];
		}
		for(int i=0,j=si;i<merged.length;i++ ,j++) {
			a[j]=merged[i];
		}
	}
}
