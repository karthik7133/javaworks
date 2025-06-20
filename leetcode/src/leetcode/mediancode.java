package leetcode;
import java.util.Arrays;

public class mediancode {
	public static void main(String[] args) {
		Solution c=new Solution();
		int [] a= {1,2};
		int [] b= {3,4};
		System.out.println(c.findMedianSortedArrays(a,b));
	}
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double c;
        int merged[]=Arrays.copyOf(nums1,nums1.length+nums2.length);
        System.arraycopy(nums2,0,merged,nums1.length,nums2.length);
        Arrays.sort(merged);
        System.out.println(Arrays.toString(merged));
        int n=merged.length-1;
        if(merged.length%2==0){
        	System.out.println(merged[n/2] +" "+merged[(n/2)+1] );
            c=((merged[n/2]+(merged[(n/2)+1])));
            c/=2;
            
        }else{
            c=merged[(n+1)/2];
        }
        return c;
        
    }
}
