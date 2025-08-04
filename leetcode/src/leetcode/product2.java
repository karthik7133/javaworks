package leetcode;

import java.util.Arrays;

public class product2 {

	public static void main(String[] args) {
		int prfix=1,sufix=1;
		int a[]= {-1,1,0,-3,3};
		int result[]=new int [a.length];
		for(int i=0;i<a.length;i++) {
			result[i]=prfix;
			prfix*=a[i];
		}
		for(int i=a.length-1;i>=0;i--) {
			result[i]*=sufix;
			sufix*=a[i];
		}
		System.out.println(Arrays.toString(result));

	}

}
