package mounika;
import java.util.*;
public class Sorting {
	public static void main(String[] args) {
		int a[]= {42,84,75,20,60,10,5,30};
		devide2(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}static void swap(int a,int b,int c[]) {
		int temp=c[a];
		c[a]=c[b];
		c[b]=temp;
	}
	static void bubble(int a[]) {
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[j]>a[i]) {
					swap(i,j,a);
				}
			}
		}System.out.println(Arrays.toString(a));
	}
	static void selection(int a[]) {
		for (int i=0;i<a.length;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}swap(i,min,a);
		}System.out.println(Arrays.toString(a));
	}
	static void insertion(int a[]) {
		for(int i=1;i<a.length;i++) {
			int k=a[i];
			int j=i-1;
			while(j>=0 && k<a[j]) {
				a[j+1]=a[j];
				j--;
			}a[j+1]=k;
		}System.out.println(Arrays.toString(a));
	}
	static void devide(int a[],int si,int ei) {
		if(si>=ei) {
			return;
		}
		int mid=(si+ei)/2;
		devide(a,si,mid);
		devide(a,mid+1,ei);
		merge(a,si,ei,mid);
	}
	static  void merge(int a[],int si,int ei,int mid) {
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
			System.out.println(Arrays.toString(merged));
		}while (index1<=mid) {
			merged[x++]=a[index1++];
			System.out.println(Arrays.toString(merged));
		}while (index2<=ei) {
			merged[x++]=a[index2++];
			System.out.println(Arrays.toString(merged));
		}System.out.println("prims"+Arrays.toString(merged));
		for(int i=0,j=si;i<merged.length;i++,j++) {
			a[j]=merged[i];
		}
	}static void devide2(int a[],int l,int h) {
		if(l<h) {
		int pi=partition(a,l,h);
		devide2(a,l,pi-1);
		devide2(a,pi+1,h);}
	}static int partition(int a[],int l,int h) {
		int pi=a[h];
		int i=l-1;
		for(int j=l;j<h;j++) {
			if(a[j]<pi) {
				i++;
				swap(i,j,a);
			}
		}swap(i+1,h,a);
		return i+1;
	}
}
