package leetcode;

import java.util.Arrays;

public class sorttwoarrays {
	public static void main(String[] args) {
		int a[]= {1,2,3,0,0,0};int b[]= {2,4,5};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				a[i]=b[count];
				count++;
			}
		}Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
}
