package practise_cat_2;
import java.util.*;
public class maxprodsubarray {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n=x.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)a[i]=x.nextInt();
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int p=1;
			for(int j=i;j<n;j++) {
				 p*=a[j];max=Math.max(max, p);
				
			}
		}System.out.println(max);
	}
}
