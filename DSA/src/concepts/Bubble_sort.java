package concepts;

import java.util.Arrays;

public class Bubble_sort {
	public static void main(String[] args) {
		sort_bubble b= new sort_bubble();
		int a[]={3,2,4,5,0,-3};
		System.out.println(b.sort(a));
	}
}
class sort_bubble{
	public String sort(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					a[i]=a[i]^a[j];
					a[j]=a[j]^a[i];
					a[i]=a[i]^a[j];
				}
			}
		}return(Arrays.toString(a));
	}
}