package classassignment;

import java.util.Arrays;
import java.util.Scanner;

public class binarysearch {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,54};
		Arrays.sort(a);
		Scanner x= new Scanner(System.in);
		int target= x.nextInt();
		int left=0,right=a.length-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(a[mid]==target) {
				System.out.println("found!");
				return;
			}if(a[mid]>target) {
				right=mid-1;
			}else {
				left=mid+1;
			}
		}
		System.out.println("NOt found!");
	}
}
