package leetcode;

public class search_35 {
	public static void main(String[] args) {
		int a[]={1,3,5,6};
		System.out.println(searchInsert(a,2));
	}
	public static int searchInsert(int[] nums, int target) {
	    int st = 0;
	    int end = nums.length - 1;

	    while (st <= end) {
	        int mid = st + (end - st) / 2;

	        if (nums[mid] == target) {
	            return mid; 
	        }
	        if (nums[mid] < target) {
	            st = mid + 1; 
	        } else {
	            end = mid - 1; 
	        }
	    }
	    return st;
	}
}
