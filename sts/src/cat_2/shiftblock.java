package cat_2;
import java.util.*;
public class shiftblock {
	
	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		int n=x.nextInt();
		int [] a= new int [n];
		for(int i=0;i<n;i++)a[i]=x.nextInt();
		int r=x.nextInt();
		
		r=r%n;
		rev(0, r-1, a);    
		rev(r, n-1, a);  
		rev(0, n-1, a);
		/*right time;
		rev(0, n-1, a);
        rev(0, r-1, a);
        rev(r, n-1, a);*/
		System.out.println(Arrays.toString(a));
	}
	public static void rev(int l,int r,int[] ar) {
		while(l<r) {
			swap(l,r,ar);
			l++;r--;
		}
	}
	public static void swap(int a,int b,int ar[]) {
		int temp=ar[a];
		ar[a]=ar[b];
		ar[b]=temp;
	}
}
