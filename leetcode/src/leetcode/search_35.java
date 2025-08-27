package leetcode;

public class search_35 {
	public static void main(String[] args) {
		int a[]={1,3,5,6};
		System.out.println(searchInsert(a,7));
	}
	public static int searchInsert(int[] nums, int target) {
	        int st=0;int end=nums.length;
	        int m=0;int mid=0;
	        while(st<end) {
	        	mid=st+(end-st)/2;
	        	if(nums[mid]==target) {
	        		System.out.println("Element found!");
	        		return mid;
	        	}
	        	if(nums[mid]<target) {
	        		st=mid+1;m=mid;
	        	}
	        	else {
	        		end=mid-1;m=mid;
	        	}
	        }
	        if(m>=mid)
	        return m+1;
	        else return m-1;
	}
}
