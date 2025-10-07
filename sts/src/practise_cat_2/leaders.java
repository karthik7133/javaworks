package practise_cat_2;
import java.util.*;
public class leaders {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n=x.nextInt();int a[] = new int[n];
		for(int i=0;i<n;i++)a[i]=x.nextInt();
		int max=Integer.MIN_VALUE;
		for(int i=n-1;i>=0;i--) {
			if(a[i]>max) {max=Math.max(max, a[i]);
			System.out.println(max);}
		}
	}
}
