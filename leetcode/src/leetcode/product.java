package leetcode;

import java.util.Arrays;

public class product {
	public static void main(String[] args) {
		int a[]= {-1,1,0,-3,3};
		int p=1;
		boolean ifzero=false;
		for(int i:a) {
			if(i!=0) {
				p*=i;
			}else {
				ifzero=true;
			}
		}
		if(ifzero) {
			for(int i=0;i<a.length;i++) {
				if(a[i]==0)a[i]=p;
				else {
					a[i]=0;
				}
			}System.out.println(Arrays.toString(a));
			return;
		}
		for(int j=0;j<a.length;j++) {
			a[j]=p/a[j];
		}System.out.println(Arrays.toString(a));
	}
}
