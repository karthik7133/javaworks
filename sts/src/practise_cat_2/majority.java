package practise_cat_2;
import java.util.*;
public class majority {
	public static void main(String ar[]) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the array size and input:");
		int n=x.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)a[i]=x.nextInt();
		int count=0,p=0;
		for(int i=1;i<n;i++) {
			int c=a[i];
			if(count==0)p=a[i-1];
			else if(p==c)count++;
			else count--;
		}count=0;
		for(int i=0;i<n;i++)if(a[i]==p)count++;
		if(count>n/2)System.out.println(p);
		else System.out.println("No majority element");
	}
}
