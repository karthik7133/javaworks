package Tree;

import java.util.Arrays;

public class Quick {
	public static void main(String[] args) {
		int a[]= {19,8,4,7,3,2,1};
		devide(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

	private static void devide(int[] a, int low, int high) {
		if(low<high) {
		int pi =partition(a,low,high);
		devide(a,low,pi-1);
		devide(a,pi+1,high);
		}
		
	}
	static void swap(int[] a,int i,int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	static int partition(int []a,int low,int high) {
		int pivot=a[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(a[j]<pivot) {
			i++;
			swap(a,i,j);
			}
		}      
		swap(a,i+1,high);
		
		return i+1;
	}
}
