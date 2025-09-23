package cat_2;
import java.util.*;
public class selection_sort {
	public static void main(String[] args) {
		Scanner x =new Scanner(System.in);
		int n=x.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)a[i]=x.nextInt();
		for(int j=0;j<n;j++) {
			int small=j;
			for(int i=j+1;i<n;i++) {
				if(a[small]>a[i]) {
					small=i;
				}
				
			}if(small!=j) {
				a[j]^=a[small];
				a[small]^=a[j];
				a[j]^=a[small];
			}
		}System.out.print(Arrays.toString(a));
	}
}
