package leetcode;

import java.util.Arrays;

public class rotate {
	public static void main(String[] args) {
		int nums []= {1,2,3,4,5,6,7};
		int n=nums.length;
		int k=3;
		k = k % n;
        if (k < 0) { 
            k += n;
        }
		int nums2[]=new int[nums.length];
		System.arraycopy(nums, n-k, nums2, 0, k);
		System.arraycopy(nums, 0, nums2, k,n-k);
		nums=nums2;
		System.out.println(Arrays.toString(nums));
	}
}
