package practise_cat_2;
import java.util.*;
public class selectionsort {
	public static void main(String[] args) {
		Scanner x = new Scanner (System.in);
		int n=x.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)a[i]=x.nextInt();
		for(int i=0;i<n;i++) {
			int small=i;
			for(int j=i+1;j<n;j++) {
				if(a[small]>a[j])small=j;
			}
			int t=a[i];
			a[i]=a[small];
			a[small]=t;
		}System.out.println(Arrays.toString(a));
	}
}
