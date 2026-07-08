package cat2_practise;
import java.util.*;
public class maxheap {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n=x.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)a[i]=x.nextInt();
		heapsort(a);
		System.out.println(Arrays.toString(a));
	}
	static void heapsort(int a[]) {
		int n=a.length;
		for(int i=n/2-1;i>=0;i--) {
			heapify(a,n,i);
		}
		for(int i=n-1;i>0;i--) {
			int t=a[0];
			a[0]=a[i];
			a[i]=t;
			heapify(a,i,0);
		}
	}
	static void heapify(int[] a, int n, int i) {
		int largest=i;
		int left=2*i+1,right=2*i+2;
		if(left<n && a[left]>a[largest]) {
			largest=left;
		}
		if(right<n && a[right]>a[largest]) {
			largest=right;
		}
		if(largest!=i) {
			int t=a[i];
			a[i]=a[largest];
			a[largest]=t;
			heapify(a,n,largest);
		}
		
	}
	
}
