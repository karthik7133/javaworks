package classassignment;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
      
        devide(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
	}
	public static void devide(int a[],int low ,int high) {
		if(low>=high)return;
		int pi=pivot(a,low,high);
		devide(a,low,pi-1);
		devide(a,pi+1,high);
	}
	private static int pivot(int[] a, int low, int high) {
		int i=low-1;
		int pivot=a[high];
		for(int j=low ;j<high;j++) {
			
			if(a[j]<pivot) {
				i++;
				swap(a,i,j);
				}
		}swap(a,i+1,high);
		return i+1;
	}
	public static void swap(int a[],int i,int j) {
		a[i]^=a[j];
		a[j]^=a[i];
		a[i]^=a[j];
	}
}

