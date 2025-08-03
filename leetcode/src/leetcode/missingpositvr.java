package leetcode;

import java.util.Arrays;

public class missingpositvr {
	public static void main(String[] args) {
		int a[]= {1,2,3,5};
		if (a.length == 0) {
            System.out.println(1);
            return;
        }
		Arrays.sort(a);
		int f = 0;
        while (f < a.length && a[f] <= 0) {
            f++;
        }
		if(f >= a.length || a[f] != 1) {
			System.out.println(1);
			return;
		}
		for(int i=1;i<a.length;i++) {
			if (a[i] == a[i-1]) {
                continue; 
            }
			if(a[i-1]+1!=a[i] && a[i-1]>0) {
				System.out.println(a[i-1]+1);
				break;
			}
		}
	}
}
