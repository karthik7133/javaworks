package leetcode;

import java.util.Arrays;

public class mejority {
	public static void main(String[] args) {
		int[] nums1 = {4,4,4,4,5,3,5,3,2};
        System.out.println("Majority Element for nums1: " + findMajorityElementOptimal(nums1));

        
	}
	public static int findMajorityElementOptimal(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    }
}
