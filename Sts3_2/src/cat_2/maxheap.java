package cat_2;
import java.util.*;
public class maxheap {
	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		int n=x.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)a[i]=x.nextInt();
		heapsort(a);
		System.out.println(Arrays.toString(a));
	}
	static void heapsort(int a[]) {
		int n=a.length;
		for(int i=n/2-1;i>=0;i--) {
			heapfy(a,n,i);
		}
		for(int i=n-1;i>0;i--) {
			int t=a[i];
			a[i]=a[0];
			a[0]=t;
			heapfy(a,i,0);
		}
	}
	static void heapfy(int a[],int n,int l) {
		int largest=l;
		int left=2*l+1;
		int right=2*l+2;
		if(left<n && a[left]>a[largest]) {
			largest=left;
		}
		if(right<n && a[right]>a[largest]) {
			largest=right;
		}
		if(largest!=l) {
			int t=a[l];
			a[l]=a[largest];
			a[largest]=t;
			heapfy(a,n,largest);
		}
	}
}
