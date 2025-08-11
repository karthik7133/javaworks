package leetcode;

import java.util.Arrays;

public class PLUSone {
	public static void main(String[] args) {
		int a[]= {1,2,3};
		String sum="";
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		sum=String.valueOf(Integer.valueOf(sum)+1);
		int b[]=new int[sum.length()];
		for(int i=0;i<sum.length();i++) {
			b[i]=Integer.valueOf(String.valueOf(sum.charAt(i)));
		}
		System.out.println(Arrays.toString(b));
	}
}
