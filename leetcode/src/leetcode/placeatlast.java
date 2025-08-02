package leetcode;

import java.util.Arrays;

public class placeatlast {
	public static void main(String[] args) {
		int []nums1 = {1,2,3,0,0,0};
		int []nums2 = {1,2,3};
		int m=3;int n=3;
		System.out.println(Arrays.toString(merge(nums1,6,nums2,3)));
	}
	public static int [] merge(int[] nums1, int m, int[] nums2, int n) {
		
		for(int i=nums1.length-n;i<nums1.length;i++) {
			 nums1[i]=nums2[i-n];
		}Arrays.sort(nums1);
		return nums1;
    }
}
