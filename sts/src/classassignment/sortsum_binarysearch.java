package classassignment;

import java.util.Arrays;

public class sortsum_binarysearch {
	public static void main(String[] args) {
		int a[]= {2,3,15,24,41,50};
		
		int c=0;
		int b[]=new int[a.length];
		for(int k:a) {
			b[c++]=digitsum(k);
		}
		Arrays.sort(b);
		System.out.println(smallestindx(b,5));
		
	}
	public static int smallestindx(int a[],int target) {
		int l=0,r=a.length-1;
		int res=-1;
		while(l<=r) {
			int mid=l+(r-l)/2;
			if(digitsum(a[mid])==digitsum(target)) {
				res=mid;
				r=mid-1;
			}else if(digitsum(a[mid])>digitsum(target)){
				r=mid-1;
			}else l=mid+1;
		}
		if(res!=-1) {
			return a[res];
		}else return -1;
	}
	public static int digitsum(int a) {
		int digitsum=0;
		while(a>0) {
			digitsum+=a%10;
			a/=10;
		}
		return digitsum;
	}
}
